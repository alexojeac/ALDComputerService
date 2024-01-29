package view.dataManagement;

import java.awt.event.ActionListener;

public class DataManagementCSDialog extends javax.swing.JDialog {

    public DataManagementCSDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telephoneLabel = new javax.swing.JLabel();
        telephoneTextField = new javax.swing.JTextField();
        employeesLabel = new javax.swing.JLabel();
        employeesSpinner = new javax.swing.JSpinner();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        actionButtonsPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        buttonsSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        telephoneLabel.setText("Telephone:");

        telephoneTextField.setToolTipText("Enterprise phone");

        employeesLabel.setText("Employees:");

        employeesSpinner.setToolTipText("Enterprise number of employees");

        nameLabel.setText("Name: ");

        nameTextField.setToolTipText("Enterprise name");

        addressLabel.setText("Address:");

        addressTextField.setToolTipText("Enterprise address");

        actionButtonsPanel.setBackground(new java.awt.Color(153, 204, 255));

        cancelButton.setBackground(new java.awt.Color(255, 153, 51));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/cancel_16.png"))); // NOI18N
        cancelButton.setText("Cancel");

        editButton.setBackground(new java.awt.Color(255, 153, 51));
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/edit_16.png"))); // NOI18N
        editButton.setText("Edit");

        saveButton.setBackground(new java.awt.Color(255, 153, 51));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/save_16.png"))); // NOI18N
        saveButton.setText("Save");

        buttonsSeparator.setBackground(new java.awt.Color(0, 0, 0));
        buttonsSeparator.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout actionButtonsPanelLayout = new javax.swing.GroupLayout(actionButtonsPanel);
        actionButtonsPanel.setLayout(actionButtonsPanelLayout);
        actionButtonsPanelLayout.setHorizontalGroup(
            actionButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap())
            .addComponent(buttonsSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        actionButtonsPanelLayout.setVerticalGroup(
            actionButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionButtonsPanelLayout.createSequentialGroup()
                .addComponent(buttonsSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(editButton)
                    .addComponent(saveButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(telephoneLabel)
                            .addGap(18, 18, 18)
                            .addComponent(telephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(employeesLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(employeesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel)
                            .addComponent(nameLabel))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneLabel)
                    .addComponent(telephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeesLabel)
                    .addComponent(employeesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(actionButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setNameEnable(Boolean enable) {
        if(enable) {
            this.nameTextField.setEnabled(true);
        } else {
            this.nameTextField.setEnabled(false);
        }
    }
    
    public void setAddressEnable(Boolean enable) {
        if(enable) {
            this.addressTextField.setEnabled(true);
        } else {
            this.addressTextField.setEnabled(false);
        }
    }
    
    public void setTelephoneEnable(Boolean enable) {
        if(enable) {
            this.telephoneTextField.setEnabled(true);
        } else {
            this.telephoneTextField.setEnabled(false);
        }
    }
    
    public void setEmployeesEnable(Boolean enable) {
        if(enable) {
            this.employeesSpinner.setEnabled(true);
        } else {
            this.employeesSpinner.setEnabled(false);
        }
    }
    
    public void setSaveEnable(Boolean enable) {
        if(enable) {
            this.saveButton.setEnabled(true);
        } else {
            this.saveButton.setEnabled(false);
        }
    }
    
    public void setEditEnable(Boolean enable) {
        if(enable) {
            this.editButton.setEnabled(true);
        } else {
            this.editButton.setEnabled(false);
        }
    }
    
    public void setName(String name) {
        this.nameTextField.setText(name);
    }
    
    public String getName() {
        return this.nameTextField.getText();
    }
    
    public void setAddress(String address) {
        this.addressTextField.setText(address);
    }
    
    public String getAddress() {
        return this.addressTextField.getText();
    }
    
    public void setTelephone(String telephone) {
        this.telephoneTextField.setText(telephone);
    }
    
    public String getTelephone() {
        return this.telephoneTextField.getText();
    }
    
    public void setEmployees(int employees) {
        this.employeesSpinner.setValue(employees);
    }
    
    public int getEmployyes() {
        return (int) this.employeesSpinner.getValue();
    }
    
    public void addSaveButtonListener(ActionListener listener) {
        this.saveButton.addActionListener(listener);
    }
    
    public void addEditButtonListener(ActionListener listener) {
        this.editButton.addActionListener(listener);
    }
    
    public void addCancelButtonListener(ActionListener listener) {
        this.cancelButton.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionButtonsPanel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JSeparator buttonsSeparator;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel employeesLabel;
    private javax.swing.JSpinner employeesSpinner;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JTextField telephoneTextField;
    // End of variables declaration//GEN-END:variables
}
