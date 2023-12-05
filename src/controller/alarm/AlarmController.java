package controller.alarm;

import clock.AlarmEvent;
import clock.IAlarmListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.MainJFrame;
import view.alarm.AlarmNotificationsDialog;

public class AlarmController {

    private AlarmNotificationsDialog view;
    private MainJFrame mainView;

    public AlarmController(AlarmNotificationsDialog view, MainJFrame mainView) {
        this.view = view;
        this.mainView = mainView;
        this.setDataClock();
        view.addDisableEnableAlarmButtonListener(this.getDisableEnableAlarmButtonActionListener());
        view.addSetClockButtonListener(this.getSetClockButtonActionListener());
        mainView.addAlarmClockListener(this.getAlarmClockAlarmListener());
    }

    private ActionListener getSetClockButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setClock();
            }
        };
        return al;
    }

    private ActionListener getDisableEnableAlarmButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setTextDisableEnableButton(mainView.isEnableAlarm() ? "Enable Alarm" : "Disable Alarm");
                mainView.setEnableAlarm(!mainView.isEnableAlarm());
                setClock();
            }
        };
        return al;
    }

    private IAlarmListener getAlarmClockAlarmListener() {
        IAlarmListener al = new IAlarmListener() {
            @Override
            public void captureAlarm(AlarmEvent ev) {
                JOptionPane.showMessageDialog(mainView, mainView.getMessage());
                mainView.setEnableAlarm(false);
                view.setTextDisableEnableButton("Enable Alarm");
            }
        };
        return al;
    }

    private void setDataClock() {
        view.setMode24(mainView.isMode24());
        view.setHour(mainView.getHourAlarm(), mainView.getMinutesAlarm());
        view.setMessage(mainView.getMessage());
        if (mainView.isEnableAlarm()) {
            view.setTextDisableEnableButton("Disable Alarm");
        } else {
            view.setTextDisableEnableButton("Enable Alarm");
        }
    }

    private void setClock() {
        mainView.setMode24(view.isMode24());
        mainView.setHourAlarm(view.getHourAlarm());
        mainView.setMinutesAlarm(view.getMinuteAlarm());
        mainView.setMessage(view.getMessage());
    }

}
