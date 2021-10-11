/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

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
import javax.swing.SwingUtilities;
import model.Car;
import model.Uber;
import ui.MainJPanel;

/**
 *
 * @author akshatajadhav
 */
public class AdminAddCarJPanel extends javax.swing.JPanel {

    private JPanel mainUIPanel;
    private MainJPanel mjp;
    private Uber uber;
   

    /**
     * Creates new form AdminJPanel
     */
    public AdminAddCarJPanel(JPanel mainUIPanel, MainJPanel mjp, Uber uber) {
        initComponents();
        radioButtonGroup.add(jRadioButtonPassenger);
        radioButtonGroup.add(jRadioButtonRental);
        this.mainUIPanel = mainUIPanel;
        this.mjp = mjp;
        this.uber = uber;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        jPanelTitle = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanelAddOptions = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backToMainMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCarType = new javax.swing.JLabel();
        lblMyear = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblCertificate = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblSnumber = new javax.swing.JLabel();
        lblMnumber = new javax.swing.JLabel();
        lblMake = new javax.swing.JLabel();
        jRadioButtonPassenger = new javax.swing.JRadioButton();
        jRadioButtonRental = new javax.swing.JRadioButton();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtCarMake = new javax.swing.JTextField();
        txtManufactureYear = new javax.swing.JTextField();
        txtExpiryDate = new javax.swing.JTextField();
        jCheckBoxAvailability = new javax.swing.JCheckBox();
        jComboBoxCity = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jSpinnerSeat = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitle.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("UBER ADMIN");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAddOptions.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setText("ADD CAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ADD MULTIPLE CARS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        backToMainMenu.setText("MAIN MENU");
        backToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddOptionsLayout = new javax.swing.GroupLayout(jPanelAddOptions);
        jPanelAddOptions.setLayout(jPanelAddOptionsLayout);
        jPanelAddOptionsLayout.setHorizontalGroup(
            jPanelAddOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddOptionsLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanelAddOptionsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanelAddOptionsLayout.setVerticalGroup(
            jPanelAddOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddOptionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(backToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanelAddOptionsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCarType.setText("CAR TYPE : ");

        lblMyear.setText("MANUFACTURED YEAR : ");

        lblSeats.setText("SEATS CAPACITY : ");

        lblCertificate.setText("EXPIRY OF MAINTENANCE CERTIFICATE : ");

        lblCity.setText("CITY : ");

        lblAvailability.setText("AVAILABILITY : ");

        lblSnumber.setText("SERIAL NUMBER : ");

        lblMnumber.setText("MODEL NUMBER : ");

        lblMake.setText("CAR MAKE : ");

        jRadioButtonPassenger.setText("PASSENGER");
        jRadioButtonPassenger.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonPassengerStateChanged(evt);
            }
        });
        jRadioButtonPassenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonPassengerMouseClicked(evt);
            }
        });
        jRadioButtonPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPassengerActionPerformed(evt);
            }
        });

        jRadioButtonRental.setText("RENTAL");
        jRadioButtonRental.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButtonRentalStateChanged(evt);
            }
        });
        jRadioButtonRental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonRentalMouseClicked(evt);
            }
        });
        jRadioButtonRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRentalActionPerformed(evt);
            }
        });

        txtCarMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarMakeActionPerformed(evt);
            }
        });

        txtExpiryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpiryDateActionPerformed(evt);
            }
        });

        jCheckBoxAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAvailabilityActionPerformed(evt);
            }
        });

        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "New York", "Los Angeles", "Chicago", "Miami", "Dallas", "Philadelphia", "Houston", "Atlanta", "Washington", "Boston", "Phoenix", "Seattle", "San Francisco", "Detroit" }));
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jSpinnerSeat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMyear)
                    .addComponent(lblMake)
                    .addComponent(lblMnumber)
                    .addComponent(lblCarType)
                    .addComponent(lblSnumber)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCertificate)
                        .addComponent(lblSeats, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAvailability, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonPassenger)
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButtonRental))
                    .addComponent(txtSerialNumber)
                    .addComponent(txtModelNumber)
                    .addComponent(txtCarMake)
                    .addComponent(txtManufactureYear)
                    .addComponent(txtExpiryDate)
                    .addComponent(jCheckBoxAvailability)
                    .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerSeat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarType)
                    .addComponent(jRadioButtonPassenger)
                    .addComponent(jRadioButtonRental))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSnumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMnumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMake)
                    .addComponent(txtCarMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyear)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(jSpinnerSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificate)
                    .addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailability)
                    .addComponent(jCheckBoxAvailability))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAddOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelAddOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPassengerActionPerformed
        if (jRadioButtonPassenger.isSelected()) {
            type = "Passenger";
        }
    }//GEN-LAST:event_jRadioButtonPassengerActionPerformed

    private void jCheckBoxAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAvailabilityActionPerformed

    private void txtCarMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarMakeActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCityActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Long sn = null;
        Integer my = null;
        String mk = null;
        SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
        f.setLenient(false);
        Date emc = null;
        List<String> message = new ArrayList<String>();
        try {
            sn = Long.parseLong(txtSerialNumber.getText());
            my = Integer.parseInt(txtManufactureYear.getText());
            emc = f.parse(txtExpiryDate.getText());
           
        } catch (Exception e) {
            if (emc == null) {
                message.add("Please provide Expire Date of Maintaince Certificate in \"MM/dd/yyyy\" format");
            }
            if (my == null) {
                message.add("Please provide Manufacture Year in number format");
            }
            if (sn == null) {
                message.add("Please provide Serial Number in number format");
            }
            JOptionPane.showMessageDialog(this, String.join("\n", message), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (uber.getSerialNumbers() != null && uber.getSerialNumbers().contains(sn)) {
            JOptionPane.showMessageDialog(this, "Serial Number Already Exists!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (sn < 10000) {
            message.add("Serial number should be atleat 5 digits");
        }
        if (my < 1996) {
            message.add("Manufacture year should be higher than 1996");
        }
        if (my > LocalDate.now().getYear()) {
            message.add("Manufacture year cannot be greater than current year");
        }
        Date d = new Date();
 
        if (emc.before(d)) {
            message.add("Expiry Date should be after " + (new SimpleDateFormat("MM/dd/yyyy")).format(d));
        }
//        Date afterYear = Date.from(LocalDate.now().plusYears(1).atStartOfDay()
//                .atZone(ZoneId.systemDefault()).toInstant());
//        if (!emc.after(afterYear)) {
//            message.add("Expiry Date should be after " + (new SimpleDateFormat("MM/dd/yyyy")).format(afterYear));
//        }
        if((int) jSpinnerSeat.getValue()==0){
            message.add("Seats in a car cannot be 0");
        }

        Car car = new Car();
        car.setAvailability(jCheckBoxAvailability.isSelected());
        car.setType(type);  
        car.setSerialNumber(sn); //Done
        car.setModelNumber(txtModelNumber.getText()); 
       
        car.setMake(txtCarMake.getText()); 
     
        car.setManufacturedYear(my); 
        car.setSeats((int) jSpinnerSeat.getValue()); 
        car.setMaintenanceCertificateDate(emc); 
        car.setCity(String.valueOf(jComboBoxCity.getSelectedItem())); 
        
        if(car.getType()==null){
            message.add("Please select type of the car");
        }
        if(car.getModelNumber().equals("")){
            message.add("Please provide correct Model Number");
        }
        if(car.getMake().equals("")){
            message.add("Please provide correct make");
        }
        if(car.getCity().equalsIgnoreCase("Select")){
            message.add("Please select correct city");
        }
        
        if (!message.isEmpty()) {
            JOptionPane.showMessageDialog(this, String.join("\n", message), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        uber.addCarToFleet(car);
        JOptionPane.showMessageDialog(this, "Car added to fleet!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(uber);
        emptyAllTextBox();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void jRadioButtonPassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonPassengerMouseClicked

    }//GEN-LAST:event_jRadioButtonPassengerMouseClicked

    private void jRadioButtonRentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonRentalMouseClicked

    }//GEN-LAST:event_jRadioButtonRentalMouseClicked

    private void jRadioButtonPassengerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonPassengerStateChanged

    }//GEN-LAST:event_jRadioButtonPassengerStateChanged

    private void jRadioButtonRentalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButtonRentalStateChanged

    }//GEN-LAST:event_jRadioButtonRentalStateChanged

    private void jRadioButtonRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRentalActionPerformed
        if (jRadioButtonRental.isSelected()) {
            type = "Rental";
        }
    }//GEN-LAST:event_jRadioButtonRentalActionPerformed

    private void backToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainMenuActionPerformed
        JFrame f = (JFrame) SwingUtilities.getRoot(mainUIPanel);
        mainUIPanel.removeAll();
        mainUIPanel.add("MainJPanel", mjp);
        CardLayout card = (CardLayout) mainUIPanel.getLayout();
        card.next(mainUIPanel);
        f.pack();
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_backToMainMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame f = (JFrame) SwingUtilities.getRoot(mainUIPanel);
        //f.setSize(0, 0);
        AdminAddMultipleCarsJPanel adminAddMultipleCarJPanel = new AdminAddMultipleCarsJPanel(mainUIPanel, mjp, uber);
        mainUIPanel.removeAll();
        mainUIPanel.add("AdminAddMultipleCarJPanel", adminAddMultipleCarJPanel);
        CardLayout card = (CardLayout) mainUIPanel.getLayout();
        card.next(mainUIPanel);
        f.pack();
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtExpiryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpiryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpiryDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMainMenu;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxAvailability;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAddOptions;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JRadioButton jRadioButtonPassenger;
    private javax.swing.JRadioButton jRadioButtonRental;
    private javax.swing.JSpinner jSpinnerSeat;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCarType;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblMnumber;
    private javax.swing.JLabel lblMyear;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSnumber;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JTextField txtCarMake;
    private javax.swing.JTextField txtExpiryDate;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
    private String type = null;
   

    private void emptyAllTextBox() {
//        jRadioButtonPassenger.setSelected(false);
//        jRadioButtonRental.setSelected(false);
        radioButtonGroup.clearSelection();
        txtSerialNumber.setText("");
        txtModelNumber.setText("");
        txtCarMake.setText("");
        txtManufactureYear.setText("");
        jSpinnerSeat.setValue(0);
        txtManufactureYear.setText("");
        jComboBoxCity.setSelectedIndex(0);
        jCheckBoxAvailability.setSelected(false);
        txtExpiryDate.setText("");
    }
}
