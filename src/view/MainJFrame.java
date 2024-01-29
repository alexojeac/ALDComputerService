package view;

import clock.IAlarmListener;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        alarmClock = new clock.ClockBean();
        logoLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        computerServicesMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        computersMenu = new javax.swing.JMenu();
        manageComputersMenuItem = new javax.swing.JMenuItem();
        reportsMenu = new javax.swing.JMenu();
        incomeReportsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();
        alarmMenu = new javax.swing.JMenu();
        notificationsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALDComputerService");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setName(""); // NOI18N

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/aldComputerServices_logo.png"))); // NOI18N

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alarmClock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(logoLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(alarmClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fileMenu.setText("File");

        computerServicesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        computerServicesMenuItem.setText("Computer Services...");
        fileMenu.add(computerServicesMenuItem);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        quitMenuItem.setText("Quit");
        fileMenu.add(quitMenuItem);

        menuBar.add(fileMenu);

        computersMenu.setText("Computers");

        manageComputersMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        manageComputersMenuItem.setText("Manage computers...");
        computersMenu.add(manageComputersMenuItem);

        menuBar.add(computersMenu);

        reportsMenu.setText("Reports");

        incomeReportsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        incomeReportsMenuItem.setText("Income Report...");
        reportsMenu.add(incomeReportsMenuItem);

        menuBar.add(reportsMenu);

        helpMenu.setText("Help");

        helpMenuItem.setText("Show Help...");
        helpMenu.add(helpMenuItem);

        menuBar.add(helpMenu);

        alarmMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/alarm_16.png"))); // NOI18N
        alarmMenu.setToolTipText("Notifications Dialog");

        notificationsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        notificationsMenuItem.setText("Notifications...");
        alarmMenu.add(notificationsMenuItem);

        menuBar.add(alarmMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    public void addIncomeReportMenuItemListener(ActionListener listener) {
        this.incomeReportsMenuItem.addActionListener(listener);
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
    
    public void setBackgroundFocusable(Boolean focusable) {
        backgroundPanel.setFocusable(focusable);
    }
    
    public JMenuItem getHelpMenuItem() {
        return this.helpMenuItem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clock.ClockBean alarmClock;
    private javax.swing.JMenu alarmMenu;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JMenuItem computerServicesMenuItem;
    private javax.swing.JMenu computersMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JMenuItem incomeReportsMenuItem;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JMenuItem manageComputersMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem notificationsMenuItem;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenu reportsMenu;
    // End of variables declaration//GEN-END:variables
}
