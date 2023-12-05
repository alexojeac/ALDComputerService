package controller.aldComputerService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.aldComputerServices.AldComputerService;
import view.dataManagement.DataManagementCSDialog;

public class AldComputerServiceController {

    private final DataManagementCSDialog view;
    private AldComputerService model;

    public AldComputerServiceController(DataManagementCSDialog view, AldComputerService model) {
        this.view = view;
        this.model = model;
        this.view.addSaveButtonListener(this.setSaveButtonActionListener());
        this.view.addEditButtonListener(this.setEditButtonActionListener());
        this.view.addCancelButtonListener(this.setCancelButtonActionListener());
        completeData();
    }

    private void completeData() {
        if (model.getName().equals("")) {
            view.setEditEnable(false);
        } else {
            view.setSaveEnable(false);
            view.setName(model.getName());
            view.setAddress(model.getAddress());
            view.setTelephone(model.getTelephoneNumber());
            view.setEmployees(model.getEmployees());
            setEnable(false);
        }
    }

    private ActionListener setSaveButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (serviceIsEmpty()) {
                    JOptionPane.showMessageDialog(null, "You must complete all fields in order to save", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    setEnable(false);
                    model.setName(view.getName());
                    model.setAddress(view.getAddress());
                    model.setTelephoneNumber(view.getTelephone());
                    model.setEmployees(view.getEmployyes());
                    view.setSaveEnable(false);
                    view.setEditEnable(true);
                }
            }
        };
        return al;
    }

    private ActionListener setEditButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnable(true);
                view.setSaveEnable(true);
                view.setEditEnable(false);
            }
        };
        return al;
    }

    private ActionListener setCancelButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
            }
        };
        return al;
    }

    private void setEnable(Boolean enabled) {
        this.view.setNameEnable(enabled);
        this.view.setAddressEnable(enabled);
        this.view.setTelephoneEnable(enabled);
        this.view.setEmployeesEnable(enabled);
    }

    private Boolean serviceIsEmpty() {
        if (view.getName().equals("") || view.getAddress().equals("") || view.getTelephone().equals("")) {
            return true;
        } else {
            return false;
        }
    }

}