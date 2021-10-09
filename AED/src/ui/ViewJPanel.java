/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.Uber;

/**
 *
 * @author akshatajadhav
 */
public class ViewJPanel extends javax.swing.JPanel {

    private JPanel mainUIPanel;
    private MainJPanel mjp;
    private Uber uber;
    private String currentPanel;
    private String type;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(JPanel mainUIPanel, MainJPanel mjp, Uber uber) {
        initComponents();
        displayPanel(layeredBlankPanel);
        this.mainUIPanel = mainUIPanel;
        this.mjp = mjp;
        this.uber = uber;
        updateTable();
        currentPanel = null;
        modifyButtonGroup.add(jRadioButtonModifyPassenger);
        modifyButtonGroup.add(jRadioButtonModifyRental);
        resetModify();
    }

    public void displayPanel(JPanel panel) {
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        modifyButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelAddOptions = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnModifyDetails = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jPanelTitle = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        layeredPane = new javax.swing.JLayeredPane();
        layeredViewPanel = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        lblSnumber = new javax.swing.JLabel();
        txtCarMake = new javax.swing.JTextField();
        lblMnumber = new javax.swing.JLabel();
        txtManufactureYear = new javax.swing.JTextField();
        lblMake = new javax.swing.JLabel();
        txtExpiryDate = new javax.swing.JTextField();
        lblCarType = new javax.swing.JLabel();
        jCheckBoxAvailability = new javax.swing.JCheckBox();
        lblMyear = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblCertificate = new javax.swing.JLabel();
        txtSeatCapacity = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        layeredModifyPanel = new javax.swing.JPanel();
        jComboBoxModifyCity = new javax.swing.JComboBox<>();
        lblCity1 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        lblAvailability1 = new javax.swing.JLabel();
        jRadioButtonModifyPassenger = new javax.swing.JRadioButton();
        jRadioButtonModifyRental = new javax.swing.JRadioButton();
        txtModifySerialNumber = new javax.swing.JTextField();
        lblCarType1 = new javax.swing.JLabel();
        jCheckBoxModifyAvailability = new javax.swing.JCheckBox();
        lblCertificate1 = new javax.swing.JLabel();
        txtModifyExpiryDate = new javax.swing.JTextField();
        lblCarType2 = new javax.swing.JLabel();
        layeredBlankPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(700, 700));

        jPanelAddOptions.setBackground(new java.awt.Color(0, 0, 0));

        btnView.setText("VIEW DETAILS");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnModifyDetails.setText("MODIFY DETAILS");
        btnModifyDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDetailsActionPerformed(evt);
            }
        });

        btnMenu.setText("MAIN MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddOptionsLayout = new javax.swing.GroupLayout(jPanelAddOptions);
        jPanelAddOptions.setLayout(jPanelAddOptionsLayout);
        jPanelAddOptionsLayout.setHorizontalGroup(
            jPanelAddOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOptionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnModifyDetails)
                .addGap(34, 34, 34)
                .addComponent(btnMenu)
                .addGap(102, 102, 102))
        );

        jPanelAddOptionsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMenu, btnModifyDetails, btnView});

        jPanelAddOptionsLayout.setVerticalGroup(
            jPanelAddOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddOptionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyDetails)
                    .addComponent(btnMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAddOptionsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMenu, btnModifyDetails, btnView});

        jPanelTitle.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("UBER VIEW");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelAddOptions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelAddOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SERIAL NUMBER", "MAKE", "SEATS CAPACITY", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewTable);

        layeredPane.setLayout(new java.awt.CardLayout());

        layeredViewPanel.setBackground(new java.awt.Color(255, 255, 255));
        layeredViewPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        lblCity.setText("CITY : ");

        txtSerialNumber.setEditable(false);

        lblAvailability.setText("AVAILABILITY : ");

        txtModelNumber.setEditable(false);

        lblSnumber.setText("SERIAL NUMBER : ");

        txtCarMake.setEditable(false);
        txtCarMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarMakeActionPerformed(evt);
            }
        });

        lblMnumber.setText("MODEL NUMBER : ");

        txtManufactureYear.setEditable(false);

        lblMake.setText("CAR MAKE : ");

        txtExpiryDate.setEditable(false);

        lblCarType.setText("CAR TYPE : ");

        jCheckBoxAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAvailabilityActionPerformed(evt);
            }
        });

        lblMyear.setText("MANUFACTURED YEAR : ");

        lblSeats.setText("SEATS CAPACITY : ");

        lblCertificate.setText("EXPIRY OF MAINTENANCE CERTIFICATE : ");

        txtSeatCapacity.setEditable(false);

        txtCity.setEditable(false);

        txtType.setEditable(false);

        javax.swing.GroupLayout layeredViewPanelLayout = new javax.swing.GroupLayout(layeredViewPanel);
        layeredViewPanel.setLayout(layeredViewPanelLayout);
        layeredViewPanelLayout.setHorizontalGroup(
            layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredViewPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMyear)
                    .addComponent(lblMake)
                    .addComponent(lblMnumber)
                    .addGroup(layeredViewPanelLayout.createSequentialGroup()
                        .addComponent(lblAvailability)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxAvailability)
                        .addGap(18, 18, 18)
                        .addComponent(lblCarType))
                    .addComponent(lblSnumber)
                    .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCertificate)
                        .addComponent(lblSeats, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(txtModelNumber)
                    .addComponent(txtCarMake)
                    .addComponent(txtManufactureYear)
                    .addComponent(txtExpiryDate)
                    .addComponent(txtSeatCapacity)
                    .addComponent(txtCity)
                    .addComponent(txtType, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layeredViewPanelLayout.setVerticalGroup(
            layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCarType)
                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxAvailability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAvailability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSnumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMnumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMake)
                    .addComponent(txtCarMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyear)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeatCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificate)
                    .addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        layeredPane.add(layeredViewPanel, "card2");

        layeredModifyPanel.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxModifyCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "New York", "Los Angeles", "Chicago", "Miami", "Dallas", "Philadelphia", "Houston", "Atlanta", "Washington", "Boston", "Phoenix", "Seattle", "San Francisco", "Detroit" }));
        jComboBoxModifyCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModifyCityActionPerformed(evt);
            }
        });

        lblCity1.setText("CITY : ");

        btnModify.setText("MODIFY");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        lblAvailability1.setText("AVAILABILITY : ");

        jRadioButtonModifyPassenger.setText("PASSENGER");
        jRadioButtonModifyPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonModifyPassengerActionPerformed(evt);
            }
        });

        jRadioButtonModifyRental.setText("RENTAL");
        jRadioButtonModifyRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonModifyRentalActionPerformed(evt);
            }
        });

        txtModifySerialNumber.setEditable(false);

        lblCarType1.setText("SERIAL NUMBER:");

        jCheckBoxModifyAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModifyAvailabilityActionPerformed(evt);
            }
        });

        lblCertificate1.setText("EXPIRY OF MAINTENANCE CERTIFICATE : ");

        lblCarType2.setText("CAR TYPE : ");

        javax.swing.GroupLayout layeredModifyPanelLayout = new javax.swing.GroupLayout(layeredModifyPanel);
        layeredModifyPanel.setLayout(layeredModifyPanelLayout);
        layeredModifyPanelLayout.setHorizontalGroup(
            layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredModifyPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCarType1)
                    .addComponent(lblCertificate1)
                    .addComponent(lblCity1)
                    .addComponent(lblAvailability1)
                    .addComponent(lblCarType2))
                .addGap(18, 18, 18)
                .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModify)
                    .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtModifySerialNumber)
                        .addComponent(jCheckBoxModifyAvailability)
                        .addComponent(jComboBoxModifyCity, 0, 245, Short.MAX_VALUE)
                        .addGroup(layeredModifyPanelLayout.createSequentialGroup()
                            .addComponent(jRadioButtonModifyPassenger)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonModifyRental))
                        .addComponent(txtModifyExpiryDate)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layeredModifyPanelLayout.setVerticalGroup(
            layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredModifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifySerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarType1))
                .addGap(18, 18, 18)
                .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonModifyPassenger)
                    .addComponent(jRadioButtonModifyRental)
                    .addComponent(lblCarType2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCertificate1))
                .addGap(18, 18, 18)
                .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxModifyCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity1))
                .addGap(18, 18, 18)
                .addGroup(layeredModifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailability1)
                    .addComponent(jCheckBoxModifyAvailability))
                .addGap(18, 18, 18)
                .addComponent(btnModify)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        layeredPane.add(layeredModifyPanel, "card3");

        layeredBlankPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layeredBlankPanelLayout = new javax.swing.GroupLayout(layeredBlankPanel);
        layeredBlankPanel.setLayout(layeredBlankPanelLayout);
        layeredBlankPanelLayout.setHorizontalGroup(
            layeredBlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        layeredBlankPanelLayout.setVerticalGroup(
            layeredBlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        layeredPane.add(layeredBlankPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(layeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarMakeActionPerformed

    private void jCheckBoxAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAvailabilityActionPerformed

    private void jComboBoxModifyCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModifyCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxModifyCityActionPerformed

    private void jRadioButtonModifyPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonModifyPassengerActionPerformed
        if (jRadioButtonModifyPassenger.isSelected()) {
            type = "Passenger";
        }
    }//GEN-LAST:event_jRadioButtonModifyPassengerActionPerformed

    private void jCheckBoxModifyAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModifyAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxModifyAvailabilityActionPerformed

    private void btnModifyDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDetailsActionPerformed
        displayPanel(layeredModifyPanel);
        currentPanel = "ModifyPanel";
        resetView();
        resetModify();
    }//GEN-LAST:event_btnModifyDetailsActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        JFrame f = (JFrame) SwingUtilities.getRoot(mainUIPanel);
        mainUIPanel.removeAll();
        mainUIPanel.add("MainJPanel", mjp);
        CardLayout card = (CardLayout) mainUIPanel.getLayout();
        card.next(mainUIPanel);
        f.pack();
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        displayPanel(layeredViewPanel);
        currentPanel = "ViewPanel";
        resetView();
        resetModify();
    }//GEN-LAST:event_btnViewActionPerformed

    private void viewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTableMouseClicked
        Car car = new Car();
        int row = viewTable.rowAtPoint(evt.getPoint());
        Long serialNumber = (Long) viewTable.getModel().getValueAt(row, 0);
        for (Car c : uber.getCars()) {
            if (c.getSerialNumber() == serialNumber) {
                car = c;
                break;
            }
        }
        if (car != null) {
            if (currentPanel!=null && currentPanel.equals("ViewPanel")) {
                populateView(car);
            }
            if (currentPanel!=null && currentPanel.equals("ModifyPanel")) {
                populateModify(car);
            }
        }
    }//GEN-LAST:event_viewTableMouseClicked

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        if(!txtModifySerialNumber.getText().contains("")){
            JOptionPane.showMessageDialog(this, "No car selected", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date emc = null;
        SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
        f.setLenient(false);
        List<String> message = new ArrayList<String>();
        try {
            emc = f.parse(txtModifyExpiryDate.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Provide the correct date", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date afterYear = Date.from(LocalDate.now().plusYears(1).atStartOfDay()
                .atZone(ZoneId.systemDefault()).toInstant());
        if (!emc.after(afterYear)) {
            message.add("Expiry Date should be after " + (new SimpleDateFormat("MM/dd/yyyy")).format(afterYear));
        }
        
        if(((String)jComboBoxModifyCity.getSelectedItem()).equalsIgnoreCase("Select")){
            message.add("Please select correct city");
        }
        if(type==null){
            if(jRadioButtonModifyPassenger.isSelected()){
                type = "Passenger";
            }
            if(jRadioButtonModifyRental.isSelected()){
                type = "Rental";
            }
        }
        if (!message.isEmpty()) {
            JOptionPane.showMessageDialog(this, String.join("\n", message), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(int i=0;i<uber.getCars().size();i++){
            if(uber.getCars().get(i).getSerialNumber() == Long.parseLong(txtModifySerialNumber.getText())){
                uber.getCars().get(i).setAvailability(jCheckBoxModifyAvailability.isSelected());
                uber.getCars().get(i).setType(type);
                uber.getCars().get(i).setMaintenanceCertificateDate(emc);
                uber.getCars().get(i).setCity((String) jComboBoxModifyCity.getSelectedItem());
                break;
            }
        }
        
        updateTable();
        JOptionPane.showMessageDialog(this, "Car details modified successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        resetModify();
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void jRadioButtonModifyRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonModifyRentalActionPerformed
        if (jRadioButtonModifyRental.isSelected()) {
            type = "Rental";
        }
    }//GEN-LAST:event_jRadioButtonModifyRentalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnModifyDetails;
    private javax.swing.JButton btnView;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBoxAvailability;
    private javax.swing.JCheckBox jCheckBoxModifyAvailability;
    private javax.swing.JComboBox<String> jComboBoxModifyCity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAddOptions;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JRadioButton jRadioButtonModifyPassenger;
    private javax.swing.JRadioButton jRadioButtonModifyRental;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel layeredBlankPanel;
    private javax.swing.JPanel layeredModifyPanel;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JPanel layeredViewPanel;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblAvailability1;
    private javax.swing.JLabel lblCarType;
    private javax.swing.JLabel lblCarType1;
    private javax.swing.JLabel lblCarType2;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCertificate1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblMnumber;
    private javax.swing.JLabel lblMyear;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSnumber;
    private javax.swing.ButtonGroup modifyButtonGroup;
    private javax.swing.JTextField txtCarMake;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpiryDate;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtModifyExpiryDate;
    private javax.swing.JTextField txtModifySerialNumber;
    private javax.swing.JTextField txtSeatCapacity;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtType;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
    private void updateTable() {
        int rowCount = viewTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Car c : uber.getCars()) {
            Object row[] = new Object[4];
            row[0] = c.getSerialNumber();
            row[1] = c.getMake();
            row[2] = c.getSeats();
            row[3] = c.getCity();
            model.addRow(row);
        }
    }

    private void populateView(Car car) {
        jCheckBoxAvailability.setSelected(car.isAvailability());
        txtType.setText(car.getType());
        txtSerialNumber.setText(String.valueOf(car.getSerialNumber()));
        txtModelNumber.setText(car.getModelNumber());
        txtCarMake.setText(car.getMake());
        txtManufactureYear.setText(String.valueOf(car.getManufacturedYear()));
        txtSeatCapacity.setText(String.valueOf(car.getSeats()));
        txtExpiryDate.setText((new SimpleDateFormat("MM/dd/yyyy")).format(car.getMaintenanceCertificateDate()));
        txtCity.setText(car.getCity());
    }

    private void populateModify(Car car) {
        txtModifySerialNumber.setText(String.valueOf(car.getSerialNumber()));
        if (car.getType().equalsIgnoreCase("Passenger")) {
            jRadioButtonModifyPassenger.setSelected(true);
            jRadioButtonModifyRental.setSelected(false);
        } else {
            jRadioButtonModifyPassenger.setSelected(false);
            jRadioButtonModifyRental.setSelected(true);
        }
        txtModifyExpiryDate.setText((new SimpleDateFormat("MM/dd/yyyy")).format(car.getMaintenanceCertificateDate()));
        jComboBoxModifyCity.setSelectedItem(car.getCity());
        jCheckBoxModifyAvailability.setSelected(car.isAvailability());
        editiableModifyForm(true);
    }

    private void resetModify() {
        txtModifySerialNumber.setText("");
        jRadioButtonModifyPassenger.setSelected(false);
        jRadioButtonModifyRental.setSelected(false);
        txtModifyExpiryDate.setText("");
        jComboBoxModifyCity.setSelectedIndex(0);
        jCheckBoxModifyAvailability.setSelected(false);
        editiableModifyForm(false);
    }

    private void editiableModifyForm(boolean b) {
        jRadioButtonModifyPassenger.setEnabled(b);
        jRadioButtonModifyRental.setEnabled(b);
        txtModifyExpiryDate.setEditable(b);
        jComboBoxModifyCity.setEditable(b);
        jCheckBoxModifyAvailability.setEnabled(b);
    }
    
    private void resetView() {
        txtSerialNumber.setText("");
        txtType.setText("");
        txtExpiryDate.setText("");
        txtCity.setText("");
        jCheckBoxAvailability.setSelected(false);
        txtSeatCapacity.setText("");
        txtManufactureYear.setText("");
        txtCarMake.setText("");
        txtModelNumber.setText("");
    }
}
