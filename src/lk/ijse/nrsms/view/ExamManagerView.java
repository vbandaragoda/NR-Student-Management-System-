/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.nrsms.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.controller.ExamController;
import lk.ijse.nrsms.model.Exam;

/**
 *
 * @author vimuk
 */
public class ExamManagerView extends javax.swing.JFrame {

    /**
     * Creates new form ExamManagerView
     */
    public ExamManagerView() {
        initComponents();
        try {
            updateComboEID();
            updateComboSID();
        } catch (SQLException ex) {
            Logger.getLogger(ExamManagerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExamManagerView.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtRecordNumber = new javax.swing.JTextField();
        cmbEID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbSID = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myriad Pro Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nayanajith Rathnayaka Student Managment System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/back.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jLabel16.setFont(new java.awt.Font("Square721 BT", 1, 36)); // NOI18N
        jLabel16.setText("Exam Details Manager");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 460, 40));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel2.setText("EID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 60, 20));

        jLabel3.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel3.setText("SID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 60, 20));

        jLabel4.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jLabel4.setText("Marks");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 60, 20));

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, 330, 40));

        btnSave.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 220, 40));

        btnUpdate.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 220, 40));

        jLabel6.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel6.setText("Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 130, -1, -1));

        txtRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecordNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtRecordNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 110, 40, 40));

        cmbEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEIDActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 330, 40));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record Number", "SID", "EID", "Marks"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 610, 80));

        jButton1.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 220, 40));

        jLabel7.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel7.setText("Record");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 110, -1, -1));

        cmbSID.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jPanel1.add(cmbSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 330, 40));

        jButton2.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 460, 210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String EDID = null;
            String SID = cmbSID.getSelectedItem().toString();
            String EID = cmbEID.getSelectedItem().toString();
            String Marks = txtDate.getText();
            
            Exam e1 = new Exam(
                    EDID,
                    SID,
                    EID,
                    Marks
            );
            
            boolean isSaved = new ExamController().SaveExam(e1);
            
            if(isSaved){
                JOptionPane.showMessageDialog(null, "Saved");
            }else{
            JOptionPane.showMessageDialog(null, "Try again");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExamManagerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExamManagerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        if(txtRecordNumber.getText().trim().length()>0){
            
            try {
                String EDID = txtRecordNumber.getText();
                String SID = cmbSID.getSelectedItem().toString();
                String EID = cmbEID.getSelectedItem().toString();
                String Marks = txtDate.getText();

                
                Exam e1 = new Exam(EDID,SID,EID,Marks);
                
                if(new ExamController().updateState(e1)){
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        lk.ijse.nrsms.view.DetailManagerView info = new lk.ijse.nrsms.view.DetailManagerView();
        info.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecordNumberActionPerformed
        if(txtRecordNumber.getText().trim().length()>0){
            try {
                Exam OBJ = new ExamController().getExam(txtRecordNumber.getText().trim());
                
                if(OBJ!=null){
                    txtRecordNumber.setText(OBJ.getEDID());
                    cmbSID.getSelectedItem().toString();
                    cmbEID.getSelectedItem().toString();
                    txtDate.setText(OBJ.getMarks());
                }else{
                    JOptionPane.showMessageDialog(this,"No Result Found","Warning",JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CenterManagerView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CenterManagerView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        JOptionPane.showMessageDialog(this, "Please Insert an SID","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRecordNumberActionPerformed

    private void cmbEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modal = (DefaultTableModel) tbl.getModel();

        int rowNumber = isAlreadyExists(cmbSID.getSelectedItem().toString());

        if (rowNumber == -1) {
            Object rowData[] = {
                txtRecordNumber.getText(),
                cmbSID.getSelectedItem().toString(),
                cmbEID.getSelectedItem().toString(),
                txtDate.getText()
            };

            modal.addRow(rowData);
        }else{
            /*qty+=(int)modal.getValueAt(rowNumber, 2);
            total=qty*unitPrice;
            tbl.setValueAt(qty, rowNumber, 2);
            tbl.setValueAt(total, rowNumber, 4);*/
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        
        try{
            
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        String RecordNumber = model.getValueAt(tbl.getSelectedRow(), 0).toString();
        
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Select Raw");
        }
        
    }//GEN-LAST:event_tblMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(txtRecordNumber.getText().trim().length()>0){
            try {
                if(new ExamController().dropAttendence(txtRecordNumber.getText().trim())){
                    JOptionPane.showMessageDialog(null, "Deleted...");
                }else{
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Warning", JOptionPane.WARNING_MESSAGE);
                }   
            } catch (SQLException ex) {
                Logger.getLogger(AttendenceManageView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AttendenceManageView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ExamManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamManagerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbEID;
    private javax.swing.JComboBox<String> cmbSID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtRecordNumber;
    // End of variables declaration//GEN-END:variables

    
    private void updateComboEID() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM Exam").executeQuery();
        while(set.next()){
        cmbEID.addItem(set.getString("EID"));
        }
    }

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

    private void updateComboSID() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM Student").executeQuery();
        while(set.next()){
        cmbSID.addItem(set.getString("SID"));
        } 
        
    }
}
