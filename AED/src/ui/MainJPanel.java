/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.admin.AdminJPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import model.Uber;

/**
 *
 * @author akshatajadhav
 */
public class MainJPanel extends javax.swing.JPanel {
    
    private JPanel mainUIPanel;
    private Uber uber;

    /**
     * Creates new form MainJFrame
     */
    public MainJPanel(JPanel mainUIPanel, Uber uber) {
        initComponents();
        this.mainUIPanel=mainUIPanel;
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

        jPanelTitle = new javax.swing.JPanel();
        jTextFieldTitle = new javax.swing.JTextField();
        jPanelOptions = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        jPanelTitle.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldTitle.setEditable(false);
        jTextFieldTitle.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jTextFieldTitle.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitle.setText("UBER");
        jTextFieldTitle.setBorder(null);
        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldTitle)
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        jPanelOptions.setBackground(new java.awt.Color(255, 255, 255));

        btnAdmin.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnAdmin.setText("ADMIN");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOptionsLayout = new javax.swing.GroupLayout(jPanelOptions);
        jPanelOptions.setLayout(jPanelOptionsLayout);
        jPanelOptionsLayout.setHorizontalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOptionsLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView))
                .addGap(175, 175, 175))
        );

        jPanelOptionsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnSearch, btnView});

        jPanelOptionsLayout.setVerticalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionsLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jPanelOptionsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdmin, btnSearch, btnView});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SearchJPanel searchJPanel = new SearchJPanel(mainUIPanel, this, uber);
        mainUIPanel.add("SearchJPanel",searchJPanel);
        CardLayout card = (CardLayout) mainUIPanel.getLayout();
        card.next(mainUIPanel);
        JFrame f = (JFrame)SwingUtilities.getRoot(mainUIPanel);
        f.pack();
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        AdminJPanel adminJPanel = new AdminJPanel(mainUIPanel, this, uber);
        mainUIPanel.add("AdminJPanel",adminJPanel);
        CardLayout card = (CardLayout) mainUIPanel.getLayout();
        card.next(mainUIPanel);
        JFrame f = (JFrame)SwingUtilities.getRoot(mainUIPanel);
        f.pack();
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        ViewJPanel viewJPanel = new ViewJPanel(mainUIPanel, this, uber);
        mainUIPanel.add("ViewJPanel",viewJPanel);
        CardLayout card = (CardLayout) mainUIPanel.getLayout();
        card.next(mainUIPanel);
        JFrame f = (JFrame)SwingUtilities.getRoot(mainUIPanel);
        f.pack();
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnViewActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
