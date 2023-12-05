package view;

import clock.IAlarmListener;
import java.awt.event.ActionListener;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alarmClock = new clock.ClockBean();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        computerServicesMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        computersMenu = new javax.swing.JMenu();
        manageComputersMenuItem = new javax.swing.JMenuItem();
        alarmMenu = new javax.swing.JMenu();
        notificationsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setText("File");

        computerServicesMenuItem.setText("Computer Services");
        fileMenu.add(computerServicesMenuItem);

        quitMenuItem.setText("Quit");
        fileMenu.add(quitMenuItem);

        menuBar.add(fileMenu);

        computersMenu.setText("Computers");

        manageComputersMenuItem.setText("Manage computers");
        computersMenu.add(manageComputersMenuItem);

        menuBar.add(computersMenu);

        alarmMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/alarm.png"))); // NOI18N

        notificationsMenuItem.setText("Notifications");
        alarmMenu.add(notificationsMenuItem);

        menuBar.add(alarmMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(alarmClock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(alarmClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addQuitMenuItemListener(ActionListener listener) {
        this.quitMenuItem.addActionListener(listener);
    }

    public void addComputerServiceMenuItemListener(ActionListener listener) {
        this.computerServicesMenuItem.addActionListener(listener);
    }

    public void addManageComputersMenuItemListener(ActionListener listener) {
        this.manageComputersMenuItem.addActionListener(listener);
    }

    public void addNotificationsMenuItemListener(ActionListener listener) {
        this.notificationsMenuItem.addActionListener(listener);
    }

    public boolean isMode24() {
        return this.alarmClock.isMode24();
    }

    public void setMode24(boolean mode24) {
        this.alarmClock.setMode24(mode24);
    }

    public void setEnableAlarm(boolean enable) {
        this.alarmClock.setEnableAlarm(enable);
    }

    public boolean isEnableAlarm() {
        return this.alarmClock.isEnableAlarm();
    }

    public void setMinutesAlarm(int minutesAlarm) {
        this.alarmClock.setMinutesAlarm(minutesAlarm);
    }

    public int getMinutesAlarm() {
        return this.alarmClock.getMinutesAlarm();
    }

    public void setHourAlarm(int hourAlarm) {
        this.alarmClock.setHourAlarm(hourAlarm);
    }

    public int getHourAlarm() {
        return this.alarmClock.getHourAlarm();
    }

    public void setMessage(String message) {
        this.alarmClock.setMessage(message);
    }

    public String getMessage() {
        return this.alarmClock.getMessage();
    }

    public void addAlarmClockListener(IAlarmListener receptor) {
        this.alarmClock.addAlarmListener(receptor);
    }
    
    public void removeAlarmClockListener(IAlarmListener receptor){
        this.alarmClock.removeAlarmListener(receptor);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clock.ClockBean alarmClock;
    private javax.swing.JMenu alarmMenu;
    private javax.swing.JMenuItem computerServicesMenuItem;
    private javax.swing.JMenu computersMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem manageComputersMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem notificationsMenuItem;
    private javax.swing.JMenuItem quitMenuItem;
    // End of variables declaration//GEN-END:variables
}
