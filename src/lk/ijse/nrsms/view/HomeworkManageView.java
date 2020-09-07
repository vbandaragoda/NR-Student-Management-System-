/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.nrsms.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.nrsms.controller.HomeworkController;
import lk.ijse.nrsms.model.Homework;

/**
 *
 * @author vimuk
 */
public class HomeworkManageView extends javax.swing.JFrame {

    /**
     * Creates new form HomeworkManageView
     */
    public HomeworkManageView() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cmbHStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtHWID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Square721 BT", 1, 36)); // NOI18N
        jLabel16.setText("Homework Details Manager");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 530, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myriad Pro Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nayanajith Rathnayaka Student Managment System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/back.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel2.setText("HID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, 30));
        jPanel1.add(txtSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 360, 40));

        jLabel3.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel3.setText("SID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 90, 30));

        txtHID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtHID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 360, 40));

        jLabel4.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/cover2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 1210, 260));

        btnDelete.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 220, 40));

        btnSave.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 220, 40));

        btnUpdate.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 220, 40));

        cmbHStatus.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        cmbHStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complete", "Incomplete" }));
        jPanel1.add(cmbHStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 370, 40));

        jLabel6.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel6.setText("Record Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 100, -1, -1));

        txtHWID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHWIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtHWID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1229, 100, 70, -1));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record Number", "HID", "SID", "Status"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 610, 90));

        jButton1.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 243, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dispose();
       lk.ijse.nrsms.view.DetailManagerView info = new lk.ijse.nrsms.view.DetailManagerView();
       info.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String HWID = null;
            String HID = txtHID.getText();
            String SID = txtSID.getText();
            String HStatus = cmbHStatus.getSelectedItem().toString();
            
            
            Homework h1 = new Homework(
                    HWID,
                    HID,
                    SID,
                    HStatus
            );
            
            boolean isSaved = new HomeworkController().saveHomework(h1);
            
            if(isSaved){
                JOptionPane.showMessageDialog(null, "Saved");
            }else{
            JOptionPane.showMessageDialog(null, "Try again");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HomeworkManageView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeworkManageView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtHIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHIDActionPerformed
       
    }//GEN-LAST:event_txtHIDActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(txtHWID.getText().trim().length()>0){
            try {
                if(new HomeworkController().dropHomework(txtHWID.getText().trim())){
                    JOptionPane.showMessageDialog(null, "Deleted...");
                }else{
                    JOptionPane.showMessageDialog(null, "Something went wrong!!!", "Warning", JOptionPane.WARNING_MESSAGE);
                }   
            } catch (SQLException ex) {
                Logger.getLogger(HomeworkManageView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeworkManageView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtHWIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHWIDActionPerformed
        if(txtHWID.getText().trim().length()>1){
            try {
                Homework OBJ = new HomeworkController().getHomework(txtHWID.getText().trim());
                
                if(OBJ!=null){
                    txtHWID.setText(OBJ.getHWID());
                    txtHID.setText(OBJ.getHID());
                    txtSID.setText(OBJ.getSID());
                    cmbHStatus.setSelectedItem(OBJ.getStatus());
                }else{
                    JOptionPane.showMessageDialog(this, "No results found","Warning",JOptionPane.WARNING_MESSAGE);
                }   } catch (SQLException ex) {
                Logger.getLogger(HomeworkManageView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeworkManageView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        JOptionPane.showMessageDialog(this, "Please Insert an Record Number","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtHWIDActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtHWID.getText().trim().length()>0){
            
            try {
                String HWID = txtHWID.getText();
                String HID = txtHID.getText();
                String SID = txtSID.getText();
                String Status = cmbHStatus.getSelectedItem().toString();

                
                Homework h1 = new Homework(HWID, HID, SID, Status);
                
                if(new HomeworkController().updateState(h1)){
                    JOptionPane.showMessageDialog(null, "Done...");
                }else{
                    JOptionPane.showMessageDialog(null, "Please try again", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(StudentManagerView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentManagerView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        JOptionPane.showMessageDialog(null, "Please Insert Correct ID", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DefaultTableModel modal = (DefaultTableModel) tbl.getModel();

        int rowNumber = isAlreadyExists(txtHWID.getText());

        if (rowNumber == -1) {
            Object rowData[] = {
                txtHWID.getText(),
                txtHID.getText(),
                txtSID.getText(),
                cmbHStatus.getSelectedItem().toString()
            };

            modal.addRow(rowData);
        }else{
            /*qty+=(int)modal.getValueAt(rowNumber, 2);
            total=qty*unitPrice;
            tbl.setValueAt(qty, rowNumber, 2);
            tbl.setValueAt(total, rowNumber, 4);*/
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeworkManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeworkManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeworkManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeworkManageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeworkManageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbHStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtHID;
    private javax.swing.JTextField txtHWID;
    private javax.swing.JTextField txtSID;
    // End of variables declaration//GEN-END:variables

    private int isAlreadyExists(String code) {
        DefaultTableModel modal = (DefaultTableModel) tbl.getModel();

        for (int i = 0; i < modal.getRowCount(); i++) {
            String temp = (String) modal.getValueAt(i, 0);
            if (temp.equals(code)) {
                return i;
            }
        }

        return -1;
    }
}
