package controller.ComputerManagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.aldComputerServices.AldComputerService;
import model.computers.Computer;
import model.computers.ComputerDesktop;
import model.computers.Laptop;
import model.computers.SingleBoard;
import view.computerManagement.ComputerManagementDialog;

public final class ComputerManagementController {

    private final ComputerManagementDialog view;
    private final AldComputerService model;
    private HashMap<String, Computer> computers;
    private Computer computer;
    private boolean editComputer;

    public ComputerManagementController(ComputerManagementDialog view, AldComputerService model) {
        this.view = view;
        this.model = model;
        this.editComputer = false;
        view.componentsSetVisible(false);
        this.view.addAddButtonListener(this.setAddButtonActionListener());
        this.view.addEditButtonListener(this.setEditButtonActionListener());
        this.view.addDeleteButtonListener(this.setDeleteButtonActionListener());
        this.view.addSaveButtonListener(this.setSaveButtonActionListener());
        this.view.addCancelButtonListener(this.setCancelButtonActionListener());
        this.view.addtypeComboBoxListener(this.setTypeComboBoxActionListener());
        repaintTable();
    }

    private ActionListener setAddButtonActionListener() {
        ActionListener al = (ActionEvent e) -> {
            view.componentsSetVisible(true);
            view.setTableEnable(false);
            view.setButtonsEnable(false);
        };
        return al;
    }

    private ActionListener setEditButtonActionListener() {
        ActionListener al = (ActionEvent e) -> {
            editComputer = true;
            view.componentsSetVisible(true);
            view.setTableEnable(false);
            Computer editedComputer = model.getComputer(view.getSerialNumberSelectedComputer());
            setDataComputer(editedComputer);
            view.setButtonsEnable(false);
        };
        return al;
    }

    private ActionListener setDeleteButtonActionListener() {
        ActionListener al = (ActionEvent e) -> {
            model.removeComputer(view.getSerialNumberSelectedComputer());
            repaintTable();
        };
        return al;
    }

    private ActionListener setSaveButtonActionListener() {
        ActionListener al = (ActionEvent e) -> {
            switch (view.getSelectedComputer()) {
                case "Laptop":
                    computer = newLaptop();
                    addComputerToTable(computer);
                    break;
                case "Desktop Computer":
                    computer = newComputerDesktop();
                    addComputerToTable(computer);
                    break;
                case "Single Board":
                    computer = newSingleBoard();
                    addComputerToTable(computer);
                    break;
            }

            repaintTable();
            view.componentsSetVisible(false);
            view.setDefault();
            view.setTableEnable(true);
            view.setButtonsEnable(true);
        };
        return al;
    }

    private ActionListener setCancelButtonActionListener() {
        ActionListener al = (ActionEvent e) -> {
            view.componentsSetVisible(false);
            view.setDefault();
            view.setTableEnable(true);
            editComputer = false;
            view.setButtonsEnable(true);
        };
        return al;
    }

    private ActionListener setTypeComboBoxActionListener() {
        ActionListener al = (ActionEvent e) -> {
            view.specificAttributeSetVisible(view.getSelectedComputer());
        };
        return al;
    }

    private Laptop newLaptop() {
        Laptop laptop = new Laptop();
        laptop.setSerialNumber(view.getSerialNumber());
        laptop.setModel(view.getModel());
        laptop.setBrand(view.getBrand());
        laptop.setBatteryLife(view.getBatteryLife());

        return laptop;
    }

    private ComputerDesktop newComputerDesktop() {
        ComputerDesktop desktop = new ComputerDesktop();
        desktop.setSerialNumber(view.getSerialNumber());
        desktop.setModel(view.getModel());
        desktop.setBrand(view.getBrand());
        desktop.setFormFactor(view.getFormFactor());

        return desktop;
    }

    private SingleBoard newSingleBoard() {
        SingleBoard singleBoard = new SingleBoard();
        singleBoard.setSerialNumber(view.getSerialNumber());
        singleBoard.setModel(view.getModel());
        singleBoard.setBrand(view.getBrand());
        singleBoard.setInches(view.getInches());

        return singleBoard;
    }

    private void addComputerToTable(Computer newComputer) {
        if (model.isComputer(newComputer.getSerialNumber())) {
            JOptionPane.showMessageDialog(view, "A computer with the entered serial number already exists");
        } else {
            model.addComputer(newComputer);
            if (editComputer) {
                model.removeComputer(view.getSerialNumberSelectedComputer());
            }
        }
    }

    private void repaintTable() {
        view.removeDataTable();
        computers = model.getComputers();

        for (Computer c : computers.values()) {
            Vector row = new Vector();
            row.add(c.getSerialNumber());
            row.add(c.getBrand());
            row.add(c.getModel());
            if (c instanceof Laptop) {
                row.add("Laptop");
            } else if (c instanceof ComputerDesktop) {
                row.add("Desktop");
            } else if (c instanceof SingleBoard) {
                row.add("Single Board");
            }

            view.addRowTable(row);
        }

    }

    private void setDataComputer(Computer computer) {
        view.setSerialNumber(computer.getSerialNumber());
        view.setBrand(computer.getBrand());
        view.setModel(computer.getModel());
        if (computer instanceof Laptop) {
            view.setSelectedComputer("Laptop");
            view.setBatteryLife(((Laptop) computer).getBatteryLife());
        } else if (computer instanceof ComputerDesktop) {
            view.setSelectedComputer("Desktop Computer");
            view.setFormFactor(((ComputerDesktop) computer).getFormFactor());
        } else if (computer instanceof SingleBoard) {
            view.setSelectedComputer("Single Board");
            view.setInches(((SingleBoard) computer).getInches());
        }
    }

}
