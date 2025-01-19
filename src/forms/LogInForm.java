
package forms;

import controller.Controller;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Airline;
import model.Passenger;


public class LogInForm extends javax.swing.JFrame {

    public LogInForm() {
        initComponents();
        setButtonGroup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonMetroBeanInfo1 = new rojerusan.RSButtonMetroBeanInfo();
        rSButtonMetroBeanInfo2 = new rojerusan.RSButtonMetroBeanInfo();
        evaluatorLine2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorLine2D();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonAirline = new javax.swing.JRadioButton();
        jRadioButtonCustomer = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Airlines Reservation System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/airlines_logo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 700));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login to your account");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jTextFieldUsername.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setText("test");
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 230, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/profile.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/password.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 50));

        jPasswordFieldPassword.setBackground(new java.awt.Color(102, 102, 255));
        jPasswordFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassword.setText("test");
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 230, 40));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Click here");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, -1, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(204, 153, 255));
        rSMaterialButtonCircle1.setText("SIGNUP");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 320, 70));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(102, 0, 255));
        rSMaterialButtonCircle2.setText("Login");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 320, 70));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Forgot password?");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        jRadioButtonAirline.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonAirline.setText("Airline");
        jPanel2.add(jRadioButtonAirline, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jRadioButtonCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonCustomer.setText("Customer");
        jPanel2.add(jRadioButtonCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 370, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        this.dispose();
        SignUpForm sf = new SignUpForm();
        sf.setVisible(true);
        sf.setLocationRelativeTo(null);   
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        if(jRadioButtonAirline.isSelected()){
            logInAirline();
        }else{
            try {
                logInCustomer();
            } catch (ParseException ex) {
                Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorLine2D evaluatorLine2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JRadioButton jRadioButtonAirline;
    private javax.swing.JRadioButton jRadioButtonCustomer;
    private javax.swing.JTextField jTextFieldUsername;
    private rojerusan.RSButtonMetroBeanInfo rSButtonMetroBeanInfo1;
    private rojerusan.RSButtonMetroBeanInfo rSButtonMetroBeanInfo2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    // End of variables declaration//GEN-END:variables

    private void setButtonGroup() {
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButtonAirline);
        group.add(jRadioButtonCustomer);
        jRadioButtonAirline.setSelected(true);
    }

    private void logInAirline() {
        String username = jTextFieldUsername.getText();
        String password = String.valueOf(jPasswordFieldPassword.getPassword());
        
        if(password.isEmpty() || username.isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Username or password must not be empty", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Airline airline = Controller.getInstace().logIn(username,password);
        
        if(airline != null){
            this.dispose();
            MainForm mf;
            try {
                mf = new MainForm(airline);
                mf.setVisible(true);
                mf.setLocationRelativeTo(null);
            } catch (ParseException ex) {
                Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
           JOptionPane.showMessageDialog(this, 
                    "airline not found", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
           jTextFieldUsername.setText("");
           jPasswordFieldPassword.setText("");           
        }
    }

    private void logInCustomer() throws ParseException {
        String username = jTextFieldUsername.getText();
        String password = String.valueOf(jPasswordFieldPassword.getPassword());
        
        if(password.isEmpty() || username.isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Username or password must not be empty", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Passenger passenger = Controller.getInstace().logInCustomer(username,password);
        
        if(passenger != null){
            System.out.println(passenger.toString());
            this.dispose();
            MainForm mf;
            try {
                mf = new MainForm(passenger);
                mf.setVisible(true);
                mf.setLocationRelativeTo(null);
            } catch (ParseException ex) {
                Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
           JOptionPane.showMessageDialog(this, 
                    "airline not found", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
           jTextFieldUsername.setText("");
           jPasswordFieldPassword.setText("");           
        }
    }
}
