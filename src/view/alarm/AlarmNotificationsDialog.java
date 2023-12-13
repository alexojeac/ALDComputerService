package view.alarm;

import java.awt.event.ActionListener;

public class AlarmNotificationsDialog extends javax.swing.JDialog {

    public AlarmNotificationsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clockModebuttonGroup = new javax.swing.ButtonGroup();
        hourSpinner = new javax.swing.JSpinner();
        minuteSpinner = new javax.swing.JSpinner();
        messageLabel = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        setClockButton = new javax.swing.JButton();
        disableEnableAlarmButton = new javax.swing.JButton();
        clockModeLabel = new javax.swing.JLabel();
        twentyFourHoursModeRadioButton = new javax.swing.JRadioButton();
        twelveHoursModeRadioButton = new javax.swing.JRadioButton();
        alertTimeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hourSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        hourSpinner.setToolTipText("Alarm Hour");

        minuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        minuteSpinner.setToolTipText("Alarm Minute");

        messageLabel.setText("Message:");

        messageTextField.setToolTipText("Message that will display the alarm");

        setClockButton.setText("Set Clock");

        disableEnableAlarmButton.setText("Enable Alarm");

        clockModeLabel.setText("Clock Mode:");

        clockModebuttonGroup.add(twentyFourHoursModeRadioButton);
        twentyFourHoursModeRadioButton.setText("24H");
        twentyFourHoursModeRadioButton.setToolTipText("Alarm is 24 or 12 hour mode");

        clockModebuttonGroup.add(twelveHoursModeRadioButton);
        twelveHoursModeRadioButton.setText("12H");
        twelveHoursModeRadioButton.setToolTipText("Alarm is 24 or 12 hour mode");

        alertTimeLabel.setText("Alert Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disableEnableAlarmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setClockButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(messageLabel)
                                .addGap(18, 18, 18)
                                .addComponent(messageTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clockModeLabel)
                                        .addGap(40, 40, 40)
                                        .addComponent(twentyFourHoursModeRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(alertTimeLabel)
                                        .addGap(38, 38, 38)
                                        .addComponent(hourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(twelveHoursModeRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(minuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clockModeLabel)
                    .addComponent(twentyFourHoursModeRadioButton)
                    .addComponent(twelveHoursModeRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alertTimeLabel)
                    .addComponent(hourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageLabel)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setClockButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disableEnableAlarmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isMode24() {
        if (this.twentyFourHoursModeRadioButton.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public void setMode24(boolean mode24) {
        if (mode24) {
            this.twentyFourHoursModeRadioButton.setSelected(true);
        } else {
            this.twelveHoursModeRadioButton.setSelected(true);
        }
    }

    public void setHour(int hour, int min) {
        this.hourSpinner.setValue(hour);
        this.minuteSpinner.setValue(min);
    }

    public int getHourAlarm() {
        return (int) this.hourSpinner.getValue();
    }

    public int getMinuteAlarm() {
        return (int) this.minuteSpinner.getValue();
    }

    public String getMessage() {
        return this.messageTextField.getText();
    }

    public void setMessage(String message) {
        this.messageTextField.setText(message);
    }

    public String getTextDisableEnableButton() {
        return this.disableEnableAlarmButton.getText();
    }

    public void setTextDisableEnableButton(String text) {
        this.disableEnableAlarmButton.setText(text);
    }

    public void addSetClockButtonListener(ActionListener listener) {
        this.setClockButton.addActionListener(listener);
    }

    public void addDisableEnableAlarmButtonListener(ActionListener listener) {
        this.disableEnableAlarmButton.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertTimeLabel;
    private javax.swing.JLabel clockModeLabel;
    private javax.swing.ButtonGroup clockModebuttonGroup;
    private javax.swing.JButton disableEnableAlarmButton;
    private javax.swing.JSpinner hourSpinner;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JSpinner minuteSpinner;
    private javax.swing.JButton setClockButton;
    private javax.swing.JRadioButton twelveHoursModeRadioButton;
    private javax.swing.JRadioButton twentyFourHoursModeRadioButton;
    // End of variables declaration//GEN-END:variables
}
