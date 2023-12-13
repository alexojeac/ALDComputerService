package view.computerManagement;

import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ComputerManagementDialog extends javax.swing.JDialog {

    public ComputerManagementDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageComputersTabbedPane = new javax.swing.JTabbedPane();
        manageComputersPanel = new javax.swing.JPanel();
        computersDataScrollPane = new javax.swing.JScrollPane();
        computersDataTable = new javax.swing.JTable();
        typeLabel = new javax.swing.JLabel();
        serialNumberLabel = new javax.swing.JLabel();
        brandLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        serialNumberTextField = new javax.swing.JTextField();
        brandTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        batteryLifeLabel = new javax.swing.JLabel();
        batteryLifeSpinner = new javax.swing.JSpinner();
        formFactorLabel = new javax.swing.JLabel();
        inchesLabel = new javax.swing.JLabel();
        inchesSpinner = new javax.swing.JSpinner();
        formFactorComboBox = new javax.swing.JComboBox<>();
        actionButtonsPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveCancelButtonsPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        computersDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Brand", "Model", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        computersDataScrollPane.setViewportView(computersDataTable);

        typeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typeLabel.setText("Type");

        serialNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        serialNumberLabel.setText("S/N");

        brandLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        brandLabel.setText("Brand");

        modelLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modelLabel.setText("Model");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop Computer", "Single Board" }));
        typeComboBox.setSelectedIndex(-1);
        typeComboBox.setToolTipText("Indicate the type of computer");

        serialNumberTextField.setToolTipText("Computer Serial Number");

        brandTextField.setToolTipText("Computer brand");

        modelTextField.setToolTipText("Computer model");

        batteryLifeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        batteryLifeLabel.setText("Battery Life");

        batteryLifeSpinner.setToolTipText("Laptop battery life in days");

        formFactorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        formFactorLabel.setText("Form factor");

        inchesLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inchesLabel.setText("Inches");

        inchesSpinner.setToolTipText("Single board inches");

        formFactorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATX", "Mini-ATX", "Micro-ATX", "ITX", "Mini-ITX", "Micro-ITX", "WTX", "BXT", "AT", "XT" }));
        formFactorComboBox.setToolTipText("Motherboard form factor");

        actionButtonsPanel.setBackground(new java.awt.Color(153, 204, 255));

        addButton.setBackground(new java.awt.Color(255, 153, 51));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/add_16.png"))); // NOI18N
        addButton.setText("Add");

        editButton.setBackground(new java.awt.Color(255, 153, 0));
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/edit_16.png"))); // NOI18N
        editButton.setText("Edit");

        deleteButton.setBackground(new java.awt.Color(255, 153, 0));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/paperBin_16.png"))); // NOI18N
        deleteButton.setText("Delete");

        javax.swing.GroupLayout actionButtonsPanelLayout = new javax.swing.GroupLayout(actionButtonsPanel);
        actionButtonsPanel.setLayout(actionButtonsPanelLayout);
        actionButtonsPanelLayout.setHorizontalGroup(
            actionButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(editButton)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addContainerGap())
        );
        actionButtonsPanelLayout.setVerticalGroup(
            actionButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveCancelButtonsPanel.setBackground(new java.awt.Color(153, 204, 255));

        saveButton.setBackground(new java.awt.Color(255, 153, 51));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/save_16.png"))); // NOI18N
        saveButton.setText("Save");

        cancelButton.setBackground(new java.awt.Color(255, 153, 51));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectIcons/cancel_16.png"))); // NOI18N
        cancelButton.setText("Cancel");

        javax.swing.GroupLayout saveCancelButtonsPanelLayout = new javax.swing.GroupLayout(saveCancelButtonsPanel);
        saveCancelButtonsPanel.setLayout(saveCancelButtonsPanelLayout);
        saveCancelButtonsPanelLayout.setHorizontalGroup(
            saveCancelButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveCancelButtonsPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(cancelButton)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        saveCancelButtonsPanelLayout.setVerticalGroup(
            saveCancelButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveCancelButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saveCancelButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout manageComputersPanelLayout = new javax.swing.GroupLayout(manageComputersPanel);
        manageComputersPanel.setLayout(manageComputersPanelLayout);
        manageComputersPanelLayout.setHorizontalGroup(
            manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(manageComputersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computersDataScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(manageComputersPanelLayout.createSequentialGroup()
                        .addComponent(inchesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formFactorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batteryLifeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inchesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formFactorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batteryLifeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(manageComputersPanelLayout.createSequentialGroup()
                            .addComponent(modelLabel)
                            .addGap(18, 18, 18)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(manageComputersPanelLayout.createSequentialGroup()
                            .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(typeLabel)
                                .addComponent(serialNumberLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(serialNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(typeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(manageComputersPanelLayout.createSequentialGroup()
                            .addComponent(brandLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(saveCancelButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manageComputersPanelLayout.setVerticalGroup(
            manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageComputersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(computersDataScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialNumberLabel)
                    .addComponent(serialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandLabel)
                    .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelLabel)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageComputersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inchesLabel)
                    .addComponent(formFactorLabel)
                    .addComponent(batteryLifeLabel)
                    .addComponent(inchesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batteryLifeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formFactorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(saveCancelButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        manageComputersTabbedPane.addTab("Computers", manageComputersPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageComputersTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageComputersTabbedPane))
        );

        manageComputersTabbedPane.getAccessibleContext().setAccessibleName("Computers");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void componentsSetVisible(boolean visible) {
        typeLabel.setVisible(visible);
        typeComboBox.setVisible(visible);
        serialNumberLabel.setVisible(visible);
        serialNumberTextField.setVisible(visible);
        modelLabel.setVisible(visible);
        modelTextField.setVisible(visible);
        brandLabel.setVisible(visible);
        brandTextField.setVisible(visible);
        saveButton.setVisible(visible);
        cancelButton.setVisible(visible);
        saveCancelButtonsPanel.setVisible(visible);
        batteryLifeLabel.setVisible(false);
        batteryLifeSpinner.setVisible(false);
        formFactorLabel.setVisible(false);
        formFactorComboBox.setVisible(false);
        inchesLabel.setVisible(false);
        inchesSpinner.setVisible(false);
    }

    public void specificAttributeSetVisible(String computer) {
        switch (computer) {
            case "Laptop":
                batteryLifeLabel.setVisible(true);
                batteryLifeSpinner.setVisible(true);
                formFactorLabel.setVisible(false);
                formFactorComboBox.setVisible(false);
                inchesLabel.setVisible(false);
                inchesSpinner.setVisible(false);
                break;
            case "Desktop Computer":
                batteryLifeLabel.setVisible(false);
                batteryLifeSpinner.setVisible(false);
                formFactorLabel.setVisible(true);
                formFactorComboBox.setVisible(true);
                inchesLabel.setVisible(false);
                inchesSpinner.setVisible(false);
                break;
            case "Single Board":
                batteryLifeLabel.setVisible(false);
                batteryLifeSpinner.setVisible(false);
                formFactorLabel.setVisible(false);
                formFactorComboBox.setVisible(false);
                inchesLabel.setVisible(true);
                inchesSpinner.setVisible(true);
                break;
            default:
                batteryLifeLabel.setVisible(false);
                batteryLifeSpinner.setVisible(false);
                formFactorLabel.setVisible(false);
                formFactorComboBox.setVisible(false);
                inchesLabel.setVisible(false);
                inchesSpinner.setVisible(false);
                break;
        }
    }

    public String getSerialNumberSelectedComputer() {
        String serialNumber = "";
        int row = this.computersDataTable.getSelectedRow();
        int col = this.computersDataTable.getSelectedColumn();
        if (col >= 0 && row >= 0) {
            serialNumber = this.computersDataTable.getModel().getValueAt(row, 0).toString();
        }
        return serialNumber;
    }

    public void removeDataTable() {
        DefaultTableModel model = (DefaultTableModel) this.computersDataTable.getModel();
        model.setRowCount(0);
        computersDataTable.clearSelection();
        computersDataTable.revalidate();
        computersDataTable.repaint();
    }
    
    public void setTableEnable(boolean enable) {
        this.computersDataTable.setEnabled(enable);
    }

    public void addRowTable(Vector row) {
        DefaultTableModel model = (DefaultTableModel) this.computersDataTable.getModel();
        model.addRow(row);
    }

    public void deleteRow() {
        DefaultTableModel model = (DefaultTableModel) this.computersDataTable.getModel();
        model.removeRow(getSelectedRow());
    }

    public int getSelectedRow() {
        return this.computersDataTable.getSelectedRow();
    }

    public String getSerialNumber() {
        return this.serialNumberTextField.getText();
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumberTextField.setText(serialNumber);
    }

    public void setSelectedComputer(String typeComputer) {
        this.typeComboBox.setSelectedItem(typeComputer);
    }
    
    public String getSelectedComputer() {
        return String.valueOf(typeComboBox.getSelectedItem());
    }

    public String getBrand() {
        return this.brandTextField.getText();
    }

    public void setBrand(String brand) {
        this.brandTextField.setText(brand);
    }

    public String getModel() {
        return this.modelTextField.getText();
    }

    public void setModel(String model) {
        this.modelTextField.setText(model);
    }

    public int getBatteryLife() {
        return (int) this.batteryLifeSpinner.getValue();
    }
    
    public void setBatteryLife(int batteryLife) {
        this.batteryLifeSpinner.setValue(batteryLife);
    }

    public String getFormFactor() {
        return String.valueOf(this.formFactorComboBox.getSelectedItem());
    }
    
    public void setFormFactor(String formFactor) {
        this.formFactorComboBox.setSelectedItem(formFactor);
    }
    
    public void setInches(int inches) {
        this.inchesSpinner.setValue(inches);
    }

    public int getInches() {
        return (int) this.inchesSpinner.getValue();
    }

    public void setDefault() {
        typeComboBox.setSelectedIndex(-1);
        serialNumberTextField.setText("");
        brandTextField.setText("");
        modelTextField.setText("");
        batteryLifeSpinner.setValue(0);
        inchesSpinner.setValue(0);
    }
    
    public void setButtonsEnable(boolean enable) {
        this.editButton.setEnabled(enable);
        this.addButton.setEnabled(enable);
        this.deleteButton.setEnabled(enable);
    }

    public void addAddButtonListener(ActionListener listener) {
        this.addButton.addActionListener(listener);
    }

    public void addEditButtonListener(ActionListener listener) {
        this.editButton.addActionListener(listener);
    }

    public void addDeleteButtonListener(ActionListener listener) {
        this.deleteButton.addActionListener(listener);
    }

    public void addSaveButtonListener(ActionListener listener) {
        this.saveButton.addActionListener(listener);
    }

    public void addCancelButtonListener(ActionListener listener) {
        this.cancelButton.addActionListener(listener);
    }

    public void addtypeComboBoxListener(ActionListener listener) {
        this.typeComboBox.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionButtonsPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel batteryLifeLabel;
    private javax.swing.JSpinner batteryLifeSpinner;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JTextField brandTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane computersDataScrollPane;
    private javax.swing.JTable computersDataTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> formFactorComboBox;
    private javax.swing.JLabel formFactorLabel;
    private javax.swing.JLabel inchesLabel;
    private javax.swing.JSpinner inchesSpinner;
    private javax.swing.JPanel manageComputersPanel;
    private javax.swing.JTabbedPane manageComputersTabbedPane;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel saveCancelButtonsPanel;
    private javax.swing.JLabel serialNumberLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
