package lk.ijse.nrsms.view;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import  lk.ijse.nrsms.view.StudentDetailsView;
import lk.ijse.nrsms.view.AttendenceView;
import lk.ijse.nrsms.view.PaymentsView;
import lk.ijse.nrsms.view.HomeworkView;
import lk.ijse.nrsms.view.CenterView;
import lk.ijse.nrsms.view.ExamDetailView;
import lk.ijse.nrsms.view.PaymentsView;
import lk.ijse.nrsms.view.ScheduleView;
import lk.ijse.nrsms.view.ScheduleView;
import lk.ijse.nrsms.view.SessionView;
public class ConsoleView extends javax.swing.JFrame {

 
    public ConsoleView() {
        initComponents();
        
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtnAttendence = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnSessions = new javax.swing.JButton();
        jbtnHomeworks = new javax.swing.JButton();
        jbtnExams = new javax.swing.JButton();
        jbtnDetailManager = new javax.swing.JButton();
        jbtnCenters = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        jbtnSchedule = new javax.swing.JButton();
        jbtnPayments = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jButton3.setText("Student Search");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1163, 100, 160, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 100, 150, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myriad Pro Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nayanajith Rathnayaka Student Managment System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/shutdown.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 60, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/logo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 450, 300, 300));

        jLabel16.setFont(new java.awt.Font("Square721 BT", 1, 36)); // NOI18N
        jLabel16.setText("Main Console");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/homew001.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/atttend001.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, 50));

        jbtnAttendence.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAttendence.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnAttendence.setText("Attendence");
        jbtnAttendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAttendenceActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAttendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 300, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/Exxams001.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/centr001.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/sessi001.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 40, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/batch002.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 50, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/Sched 001.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/pay 001.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/stdnt dt.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 144, -1, 60));

        jbtnSessions.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSessions.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnSessions.setText("Sessions");
        jbtnSessions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSessionsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSessions, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 300, 50));

        jbtnHomeworks.setBackground(new java.awt.Color(255, 255, 255));
        jbtnHomeworks.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnHomeworks.setText("Homeworks");
        jbtnHomeworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeworksActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnHomeworks, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 300, 50));

        jbtnExams.setBackground(new java.awt.Color(255, 255, 255));
        jbtnExams.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnExams.setText("Exams");
        jbtnExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExamsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExams, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 300, 50));

        jbtnDetailManager.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDetailManager.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnDetailManager.setText("       Detail Manager");
        jbtnDetailManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDetailManagerActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDetailManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 300, 50));

        jbtnCenters.setBackground(new java.awt.Color(255, 255, 255));
        jbtnCenters.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnCenters.setText("Centers");
        jbtnCenters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCentersActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCenters, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 300, 50));

        btnStudents.setBackground(new java.awt.Color(255, 255, 255));
        btnStudents.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        btnStudents.setText("Students");
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 300, 50));

        jbtnSchedule.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSchedule.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnSchedule.setText("Schedule");
        jbtnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnScheduleActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 300, 50));

        jbtnPayments.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPayments.setFont(new java.awt.Font("Myanmar Text", 1, 27)); // NOI18N
        jbtnPayments.setText("Payments");
        jbtnPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPaymentsActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/nrsms/view/watermrk1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1380, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAttendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAttendenceActionPerformed
           
            dispose();
            lk.ijse.nrsms.view.AttendenceView info = new lk.ijse.nrsms.view.AttendenceView();
            info.setVisible(true);

    }//GEN-LAST:event_jbtnAttendenceActionPerformed

    private void jbtnSessionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSessionsActionPerformed
            dispose();     
            lk.ijse.nrsms.view.SessionView info = new lk.ijse.nrsms.view.SessionView();
            info.setVisible(true);

    }//GEN-LAST:event_jbtnSessionsActionPerformed

    private void jbtnHomeworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeworksActionPerformed
      
            dispose();    
            lk.ijse.nrsms.view.HomeworkView info = new lk.ijse.nrsms.view.HomeworkView();
            info.setVisible(true);
            
            
    }//GEN-LAST:event_jbtnHomeworksActionPerformed

    private void jbtnExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExamsActionPerformed
            
            dispose(); 
            lk.ijse.nrsms.view.ExamDetailView info = new lk.ijse.nrsms.view.ExamDetailView();
            info.setVisible(true);    
            
           // dispose();
    }//GEN-LAST:event_jbtnExamsActionPerformed

    private void jbtnCentersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCentersActionPerformed
            dispose();     
            lk.ijse.nrsms.view.CenterView info = new lk.ijse.nrsms.view.CenterView();
            info.setVisible(true);       
    }//GEN-LAST:event_jbtnCentersActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
            
            dispose();
            lk.ijse.nrsms.view.StudentDetailsView info = new lk.ijse.nrsms.view.StudentDetailsView();
            info.setVisible(true);
            
           
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void jbtnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnScheduleActionPerformed
            dispose();     
            lk.ijse.nrsms.view.ScheduleView info = new lk.ijse.nrsms.view.ScheduleView ();
            info.setVisible(true);
            
           // dispose();
    }//GEN-LAST:event_jbtnScheduleActionPerformed

    private void jbtnPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPaymentsActionPerformed
            dispose();
            lk.ijse.nrsms.view.PaymentsView info = new lk.ijse.nrsms.view.PaymentsView();
            info.setVisible(true); 
            

    }//GEN-LAST:event_jbtnPaymentsActionPerformed

    private void jbtnDetailManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDetailManagerActionPerformed
            dispose();     
            lk.ijse.nrsms.view.DetailManagerView info = new lk.ijse.nrsms.view.DetailManagerView();
            info.setVisible(true); 
            
    }//GEN-LAST:event_jbtnDetailManagerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         dispose();
         lk.ijse.nrsms.view.LoginView info = new lk.ijse.nrsms.view.LoginView();
         info.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        lk.ijse.nrsms.view.SearchView info =  new lk.ijse.nrsms.view.SearchView();
        info.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(ConsoleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsoleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsoleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsoleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsoleView().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnAttendence;
    private javax.swing.JButton jbtnCenters;
    private javax.swing.JButton jbtnDetailManager;
    private javax.swing.JButton jbtnExams;
    private javax.swing.JButton jbtnHomeworks;
    private javax.swing.JButton jbtnPayments;
    private javax.swing.JButton jbtnSchedule;
    private javax.swing.JButton jbtnSessions;
    // End of variables declaration//GEN-END:variables
  
}
