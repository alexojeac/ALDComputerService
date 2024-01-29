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
        this.view.setNormalSize(true);
        this.view.dateComputerEnable(false);
        repaintTable();
    }

    private ActionListener setAddButtonActionListener() {
        ActionListener al = (ActionEvent e) -> {
            view.componentsSetVisible(true);
            view.setTableEnable(false);
            view.setButtonsEnable(false);
            view.setNormalSize(false);
        };
        return al;
    }

    private ActionListener setEditButtonActionListener() {
        ActionListener al = (ActionEvent e) -> {
            Computer editedComputer = model.getComputer(view.getSerialNumberSelectedComputer());
            if (editedComputer != null) {
                editComputer = true;
                view.componentsSetVisible(true);
                view.setTableEnable(false);
                setDataComputer(editedComputer);
                view.setButtonsEnable(false);
                view.setNormalSize(false);
            } else {
                JOptionPane.showMessageDialog(view, "Select a computer to edit it");
            }

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
            switch (view.getSelectedComputerType()) {
                case "Laptop":
                    computer = newLaptop();
                    if (addComputerToTable(computer)) {
                        view.setSerialNumberError(false);
                        resetView();
                    } else {
                        view.setSerialNumberError(true);
                    }
                    break;
                case "Desktop Computer":
                    computer = newComputerDesktop();
                    if (addComputerToTable(computer)) {
                        view.setSerialNumberError(false);
                        resetView();
                    } else {
                        view.setSerialNumberError(true);
                    }
                    break;
                case "Single Board":
                    computer = newSingleBoard();
                    if (addComputerToTable(computer)) {
                        view.setSerialNumberError(false);
                        resetView();
                    } else {
                        view.setSerialNumberError(true);
                    }
                    break;
            }
            repaintTable();
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
            view.setNormalSize(true);
        };
        return al;
    }

    private ActionListener setTypeComboBoxActionListener() {
        ActionListener al = (ActionEvent e) -> {
            view.specificAttributeSetVisible(view.getSelectedComputerType());
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

    private boolean addComputerToTable(Computer newComputer) {
        if (editComputer) {
            model.removeComputer(view.getSerialNumberSelectedComputer());
        }
        if (model.isComputer(newComputer.getSerialNumber())) {
            JOptionPane.showMessageDialog(view, "A computer with the entered serial number already exists");
            return false;
        } else {
            if (!computer.getSerialNumber().equals("")) {
                model.addComputer(computer);
                return true;
            } else {
                JOptionPane.showMessageDialog(view, "To introduce a new computer, it must have a serial number");
                return false;
            }

        }
    }

    private void repaintTable() {
        view.removeComputersDataTable();
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

            view.addRowComputersTable(row);
        }

    }

    private void setDataComputer(Computer computer) {
        view.setSerialNumber(computer.getSerialNumber());
        view.setBrand(computer.getBrand());
        view.setModel(computer.getModel());
        if (computer instanceof Laptop) {
            view.setSelectedComputerType("Laptop");
            view.setBatteryLife(((Laptop) computer).getBatteryLife());
        } else if (computer instanceof ComputerDesktop) {
            view.setSelectedComputerType("Desktop Computer");
            view.setFormFactor(((ComputerDesktop) computer).getFormFactor());
        } else if (computer instanceof SingleBoard) {
            view.setSelectedComputerType("Single Board");
            view.setInches(((SingleBoard) computer).getInches());
        }
    }

    public void resetView() {
        view.componentsSetVisible(false);
        view.setDefault();
        view.setTableEnable(true);
        view.setButtonsEnable(true);
        view.setNormalSize(true);
    }

}
