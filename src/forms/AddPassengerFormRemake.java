
package forms;

import controller.Controller;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Gender;
import model.States;


public class AddPassengerFormRemake extends javax.swing.JFrame {
    
    private String path;
    public static byte[] userimage;
    private AllPassengersPanel parent;
    
    public AddPassengerFormRemake(AllPassengersPanel parent) {
        initComponents();
        this.parent = parent;
        fillComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialShadowRectangle1 = new efectos.MaterialShadowRectangle();
        fastGaussianBlur1 = new efectos.FastGaussianBlur();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldPassport = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        JComboBoxState = new rojerusan.RSComboMetro();
        jTextFieldName = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextFieldName5 = new javax.swing.JTextField();
        jLabelPicture = new javax.swing.JLabel();
        JButtonCreate = new rojerusan.RSMaterialButtonRectangle();
        JButtonAddPicutre = new rojerusan.RSMaterialButtonRectangle();
        JButtonCancel = new rojerusan.RSMaterialButtonRectangle();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JComboBoxGender = new rojerusan.RSComboMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 658));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldLastName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldLastName.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLastName.setText("Last Name");
        jTextFieldLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLastNameFocusLost(evt);
            }
        });
        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 50));

        jTextFieldPassport.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPassport.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldPassport.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPassport.setText("Passport Number");
        jTextFieldPassport.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPassportFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPassportFocusLost(evt);
            }
        });
        jTextFieldPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassportActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 370, 50));

        jTextFieldAddress.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAddress.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAddress.setText("Address");
        jTextFieldAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAddressFocusLost(evt);
            }
        });
        jTextFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddressActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 370, 50));

        JComboBoxState.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxState.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxState.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxState.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxState.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxState.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxState.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanel1.add(JComboBoxState, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 290, 40));

        jTextFieldName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldName.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldName.setText("First Name");
        jTextFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusLost(evt);
            }
        });
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 370, 50));

        jDateChooser.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserFocusLost(evt);
            }
        });
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 240, 50));

        jTextFieldName5.setBackground(new java.awt.Color(153, 102, 255));
        jTextFieldName5.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldName5.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldName5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldName5.setText("First Name");
        jTextFieldName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldName5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 370, 50));

        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jLabelPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 152, 123));

        JButtonCreate.setBackground(new java.awt.Color(51, 23, 113));
        JButtonCreate.setText("Create");
        JButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCreateActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 170, 50));

        JButtonAddPicutre.setBackground(new java.awt.Color(51, 23, 113));
        JButtonAddPicutre.setText("Chose a picture");
        JButtonAddPicutre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddPicutreActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonAddPicutre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 260, 50));

        JButtonCancel.setBackground(new java.awt.Color(102, 0, 0));
        JButtonCancel.setText("Cancel");
        JButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 170, 50));

        jTextFieldPhoneNumber.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPhoneNumber.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPhoneNumber.setText("Phone Number");
        jTextFieldPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneNumberFocusLost(evt);
            }
        });
        jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 370, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("State");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of birth");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 212, -1, 20));

        JComboBoxGender.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxGender.setToolTipText("");
        JComboBoxGender.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxGender.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxGender.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanel1.add(JComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 290, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jTextFieldPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassportActionPerformed

    private void jTextFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddressActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldName5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldName5ActionPerformed

    private void JButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCreateActionPerformed
        if(validateInputFields()){
            AddPassangerToDataBase();
            clear();
            try {
                parent.fillTable();
            } catch (ParseException ex) {
                Logger.getLogger(AddPassengerFormRemake.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            refreshTable();
        } catch (ParseException ex) {
            Logger.getLogger(AddPassengerFormRemake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonCreateActionPerformed

    private void JButtonAddPicutreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddPicutreActionPerformed
        setPicture();
    }//GEN-LAST:event_JButtonAddPicutreActionPerformed

    private void JButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonCancelActionPerformed

    private void jTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumberActionPerformed

    private void jTextFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusGained
        if(jTextFieldName.getText().equals("First Name")){
            jTextFieldName.setText("");
        }
    }//GEN-LAST:event_jTextFieldNameFocusGained

    private void jTextFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusLost
       if(jTextFieldName.getText().equals("")){
            jTextFieldName.setText("First Name");
        }
    }//GEN-LAST:event_jTextFieldNameFocusLost

    private void jTextFieldLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLastNameFocusGained
        if(jTextFieldLastName.getText().equals("Last Name")){
            jTextFieldLastName.setText("");
        }
    }//GEN-LAST:event_jTextFieldLastNameFocusGained

    private void jTextFieldLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLastNameFocusLost
        if(jTextFieldLastName.getText().equals("")){
            jTextFieldLastName.setText("Last Name");
        }
    }//GEN-LAST:event_jTextFieldLastNameFocusLost

    private void jTextFieldAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAddressFocusGained
       if(jTextFieldAddress.getText().equals("Address")){
            jTextFieldAddress.setText("");
        }
    }//GEN-LAST:event_jTextFieldAddressFocusGained

    private void jTextFieldAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAddressFocusLost
        if(jTextFieldAddress.getText().equals("")){
            jTextFieldAddress.setText("Address");
        }
    }//GEN-LAST:event_jTextFieldAddressFocusLost

    private void jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserFocusGained

    private void jDateChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusLost
       
    }//GEN-LAST:event_jDateChooserFocusLost

    private void jTextFieldPhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberFocusGained
        if(jTextFieldPhoneNumber.getText().equals("Phone Number")){
            jTextFieldPhoneNumber.setText("");
        }
    }//GEN-LAST:event_jTextFieldPhoneNumberFocusGained

    private void jTextFieldPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberFocusLost
        if(jTextFieldPhoneNumber.getText().equals("")){
            jTextFieldPhoneNumber.setText("Phone Number");
        }
    }//GEN-LAST:event_jTextFieldPhoneNumberFocusLost

    private void jTextFieldPassportFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPassportFocusGained
        if(jTextFieldPassport.getText().equals("Passport Number")){
            jTextFieldPassport.setText("");
        }
    }//GEN-LAST:event_jTextFieldPassportFocusGained

    private void jTextFieldPassportFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPassportFocusLost
        if(jTextFieldPassport.getText().equals("")){
            jTextFieldPassport.setText("Passport Number");
        }
    }//GEN-LAST:event_jTextFieldPassportFocusLost

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonAddPicutre;
    private rojerusan.RSMaterialButtonRectangle JButtonCancel;
    private rojerusan.RSMaterialButtonRectangle JButtonCreate;
    private rojerusan.RSComboMetro JComboBoxGender;
    private rojerusan.RSComboMetro JComboBoxState;
    private efectos.FastGaussianBlur fastGaussianBlur1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldName5;
    private javax.swing.JTextField jTextFieldPassport;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private efectos.MaterialShadowRectangle materialShadowRectangle1;
    // End of variables declaration//GEN-END:variables

    private void fillComboBox() {
        JComboBoxState.removeAll();
        
        for (States state : States.values()) {
            JComboBoxState.addItem(state);
        }
        
        JComboBoxGender.removeAll();
        
        for(Gender gender: Gender.values()){
            JComboBoxGender.addItem(gender);
        }
    }

    private void setPicture() {
        JFileChooser pictureChooser = new JFileChooser();
        pictureChooser.showOpenDialog(this);
        File imageFile = pictureChooser.getSelectedFile();
        
        if(imageFile == null){ return; }
        
        FileNameExtensionFilter filters = new FileNameExtensionFilter("*.images", "png","jpg");
        pictureChooser.addChoosableFileFilter(filters);
        
        path = imageFile.getAbsolutePath();
        BufferedImage image;
        
        try {
            image = ImageIO.read(imageFile);
            ImageIcon imageIcon = new ImageIcon(
            new ImageIcon(image).getImage().getScaledInstance(152, 123, Image.SCALE_DEFAULT));     
            jLabelPicture.setIcon(imageIcon);
            
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            for(int readNum; (readNum = fis.read(buff)) != -1;){
                baos.write(buff,0,readNum);
            }
            userimage = baos.toByteArray();
            
            
        } catch (IOException ex) {
            System.out.println("Error while trying to read a picture from the selected file");
        }
    }

    private boolean validateInputFields() {
        if(        jTextFieldName.getText().isEmpty() 
                || jTextFieldLastName.getText().isEmpty()
                || jTextFieldAddress.getText().isEmpty()
                || jTextFieldPassport.getText().isEmpty()
                || jTextFieldPhoneNumber.getText().isEmpty()
                || jDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(this, "All input fields must be filled");
            return false;
        }
//        if(jDateChooser.getDate() != null){
//            Date selectedDate = jDateChooser.getDate();
//            LocalDate date = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//            if(date.getYear() > 2006)
//            JOptionPane.showMessageDialog(this, "Passanger must be 18 years old or older");
//        }
        
        return true;
    }

    private void AddPassangerToDataBase() {
        String firstName = jTextFieldName.getText();
        String lastName = jTextFieldLastName.getText();
        String passport = jTextFieldPassport.getText();
        String address = jTextFieldAddress.getText();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(jDateChooser.getDate());
        
        States state = (States) JComboBoxState.getSelectedItem();
        Gender gender = (Gender) JComboBoxGender.getSelectedItem();
        
        String phoneNumber = jTextFieldPhoneNumber.getText();
        System.out.println("Adding");
        int exists = Controller.getInstace().addPassangerToDataBase(firstName, lastName, address, date, state.toString(), gender.toString(), phoneNumber, passport, userimage);
        System.out.println("Added");
        
        if(exists == 0){
            JOptionPane.showMessageDialog(this, "Passenger with this JMBG already exists");
            return;
        }
        JOptionPane.showMessageDialog(this, "Passanger is added succesfully");
    
    }

    
    private void refreshTable() throws ParseException{
        parent.fillTable();     
    }

    private void clear() {
        jTextFieldName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldAddress.setText("");
        jTextFieldPassport.setText("");
        jDateChooser.setDate(null);
        jTextFieldPhoneNumber.setText("");
        jLabelPicture.setIcon(null);
        this.dispose();
    }
    
}
