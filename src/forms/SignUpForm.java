
package forms;

import controller.Controller;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import utilites.NumericDocumentFilter;


public class SignUpForm extends javax.swing.JFrame {

    public SignUpForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timingTargetAdapter1 = new org.jdesktop.core.animation.timing.TimingTargetAdapter();
        swingTimerTimingSource1 = new org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource();
        rSPasswordTextPlaceHolderBeanInfo1 = new rojerusan.RSPasswordTextPlaceHolderBeanInfo();
        rSButtonPaneBeanInfo1 = new rojerusan.RSButtonPaneBeanInfo();
        materialColor1 = new efectos.MaterialColor();
        manualTimingSource1 = new org.jdesktop.core.animation.timing.sources.ManualTimingSource();
        evaluatorShort1 = new org.jdesktop.core.animation.timing.evaluators.EvaluatorShort();
        evaluatorRoundRectangle2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorRoundRectangle2D();
        customUI1 = new necesario.CustomUI();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPasswordFieldConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Create your account");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jTextFieldUsername.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 230, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/profile.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/password.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 50));

        jPasswordFieldPassword.setBackground(new java.awt.Color(102, 102, 255));
        jPasswordFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 230, 40));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(204, 153, 255));
        rSMaterialButtonCircle1.setText("SIGNUP");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 320, 70));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Already got an account?");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jTextFieldEmail.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/icons8-email-50.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, 60));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/icons8-phone-50.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 80, 60));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Name:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        jTextFieldName.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 230, 40));

        jTextFieldPhone.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldPhone.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 230, 40));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Phone:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log in");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 680, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirm password:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/password.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 50));

        jPasswordFieldConfirmPassword.setBackground(new java.awt.Color(102, 102, 255));
        jPasswordFieldConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldConfirmPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jPasswordFieldConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        String username = jTextFieldUsername.getText();
        String password = String.valueOf(jPasswordFieldPassword.getPassword());
        String confifrmPassword = String.valueOf(jPasswordFieldConfirmPassword.getPassword());
        String email = jTextFieldEmail.getText();
        String phone = jTextFieldPhone.getText();
        String name = jTextFieldName.getText();
//        
//        if(!phoneValidation(phone)){
//            JOptionPane.showMessageDialog(this, 
//                    "Invalid phone format",
//                    "Error", JOptionPane.ERROR_MESSAGE); 
//            return;
//        }
//        
//        if(!confifrmPassword.equals(password)){
//           JOptionPane.showMessageDialog(this, 
//                    "Confirmed password must be the same",
//                    "Error", JOptionPane.ERROR_MESSAGE); 
//           return;
//        }
//        
//        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() || name.isEmpty()){
//            JOptionPane.showMessageDialog(this, 
//                    "All fields must be filled",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        
//        if(!emailValidation(email)){
//            JOptionPane.showMessageDialog(this, 
//                    "Invalid email format, please provide valid email address",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        
//        if(name.contains(",.+-_")){
//            JOptionPane.showMessageDialog(this, 
//                    "Name cannot contain symbols (,.+-_)",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        
        if(Controller.getInstace().signUp(username,password,email,phone,name)){
            try {
                MainForm mf = new MainForm();
                mf.setVisible(true);
                mf.setLocationRelativeTo(null);
            } catch (ParseException ex) {
                Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, 
                    "User with the given name already exists",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       LogInForm lf = new LogInForm();
       lf.setVisible(true);
       lf.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private boolean phoneValidation(String phone){
        Pattern VALID_PHONE_NUMBER_REGEX = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        
        Matcher matcher = VALID_PHONE_NUMBER_REGEX.matcher(phone);
        return matcher.matches();
    };
    
    private boolean emailValidation(String email){
        Pattern VALID_EMAIL_REGEX = Pattern.compile("^[a-zA-Z0-9._%+-]+@(gmail\\.com|yahoo\\.com|outlook\\.com|hotmail\\.com|live\\.com|icloud\\.com)$", Pattern.CASE_INSENSITIVE);
        
        Matcher matcher = VALID_EMAIL_REGEX.matcher(email);
        return matcher.matches();
    };


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.CustomUI customUI1;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorRoundRectangle2D evaluatorRoundRectangle2D1;
    private org.jdesktop.core.animation.timing.evaluators.EvaluatorShort evaluatorShort1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldUsername;
    private org.jdesktop.core.animation.timing.sources.ManualTimingSource manualTimingSource1;
    private efectos.MaterialColor materialColor1;
    private rojerusan.RSButtonPaneBeanInfo rSButtonPaneBeanInfo1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSPasswordTextPlaceHolderBeanInfo rSPasswordTextPlaceHolderBeanInfo1;
    private org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource swingTimerTimingSource1;
    private org.jdesktop.core.animation.timing.TimingTargetAdapter timingTargetAdapter1;
    // End of variables declaration//GEN-END:variables
}


