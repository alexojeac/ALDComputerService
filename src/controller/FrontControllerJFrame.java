package controller;

import controller.ComputerManagement.ComputerManagementController;
import controller.alarm.AlarmController;
import controller.aldComputerService.AldComputerServiceController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.aldComputerServices.AldComputerService;
import view.dataManagement.DataManagementCSDialog;
import view.MainJFrame;
import view.alarm.AlarmNotificationsDialog;
import view.computerManagement.ComputerManagementDialog;

public class FrontControllerJFrame {

    private MainJFrame view;
    private AldComputerService model;

    public FrontControllerJFrame(MainJFrame view, AldComputerService model) {
        this.view = view;
        this.model = model;
        this.view.addQuitMenuItemListener(this.setQuitMenuItemActionListener());
        this.view.addComputerServiceMenuItemListener(this.setComputerServiceMenuItemActionListener());
        this.view.addManageComputersMenuItemListener(this.setManageComputersMenuItemActionListener());
        this.view.addNotificationsMenuItemListener(this.setNotificationsMenuItemActionListener());
    }

    private ActionListener setQuitMenuItemActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                System.exit(0);
            }
        };
        return al;
    }

    private ActionListener setComputerServiceMenuItemActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataManagementCSDialog dmcsdView = new DataManagementCSDialog(view, true);
                AldComputerServiceController controller = new AldComputerServiceController(dmcsdView, model);
                dmcsdView.setVisible(true);
            }
        };
        return al;
    }
    
    private ActionListener setManageComputersMenuItemActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComputerManagementDialog cmd = new ComputerManagementDialog(view, true);
                ComputerManagementController controller = new ComputerManagementController(cmd, model);
                cmd.setVisible(true);
            }
        };
        return al;
    }
    
    private ActionListener setNotificationsMenuItemActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlarmNotificationsDialog alarmView = new AlarmNotificationsDialog(view, true);
                AlarmController alarmController = new AlarmController(alarmView, view);
                alarmView.setVisible(true);
            }
        };
        return al;
    }
}
