package controller;

import controller.ComputerManagement.ComputerManagementController;
import controller.alarm.AlarmController;
import controller.aldComputerService.AldComputerServiceController;
import controller.reports.IncomeReportController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import model.aldComputerServices.AldComputerService;
import view.dataManagement.DataManagementCSDialog;
import view.MainJFrame;
import view.alarm.AlarmNotificationsDialog;
import view.computerManagement.ComputerManagementDialog;
import view.reports.IncomeReportDialog;
import javax.help.*;
import java.net.*;

public class FrontControllerJFrame {

    private final MainJFrame view;
    private final AldComputerService model;

    public FrontControllerJFrame(MainJFrame view, AldComputerService model) throws MalformedURLException, HelpSetException {
        this.view = view;
        this.model = model;
        this.view.setBackgroundFocusable(true);
        this.view.addQuitMenuItemListener(this.getQuitMenuItemActionListener());
        this.view.addComputerServiceMenuItemListener(this.getComputerServiceMenuItemActionListener());
        this.view.addManageComputersMenuItemListener(this.getManageComputersMenuItemActionListener());
        this.view.addNotificationsMenuItemListener(this.getNotificationsMenuItemActionListener());
        this.view.addIncomeReportMenuItemListener(this.getIncomeReportsMenuItemActionListener());
        initHelp();
    }

    private ActionListener getQuitMenuItemActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                System.exit(0);
            }
        };
        return al;
    }

    private ActionListener getComputerServiceMenuItemActionListener() {
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

    private ActionListener getManageComputersMenuItemActionListener() {
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

    private ActionListener getNotificationsMenuItemActionListener() {
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

    private ActionListener getIncomeReportsMenuItemActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IncomeReportDialog reportsView = new IncomeReportDialog(view, true);
                IncomeReportController reportsController = new IncomeReportController(reportsView);
                reportsView.setVisible(true);
            }
        };
        return al;
    }

    private void initHelp() throws MalformedURLException, HelpSetException {
        File helpFile = new File("help/help_set.hs");
        URL hsURL = helpFile.toURI().toURL();
        HelpSet helpSet = new HelpSet(getClass().getClassLoader(), hsURL);
        HelpBroker hb = helpSet.createHelpBroker();
        hb.enableHelpKey(view.getContentPane(), "app", helpSet);
        hb.enableHelpOnButton(view.getHelpMenuItem(), "app", helpSet);
    }

}
