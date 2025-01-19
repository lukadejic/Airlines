
package forms;

import controller.Controller;
import java.awt.Graphics2D;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Gender;
import model.Passenger;
import model.States;

public class EditPassengerRemakeForm extends javax.swing.JFrame {
    
    private Passenger passenger;
    private String path;
    private byte[] userimage;
    private AllPassengersPanel parent;

    public EditPassengerRemakeForm(Passenger passenger, AllPassengersPanel parent) {
        initComponents();
        this.passenger = passenger;
        this.parent = parent;
        fillForm();  
        disableFields();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        JComboBoxState = new rojerusan.RSComboMetro();
        jLabel10 = new javax.swing.JLabel();
        JComboBoxGender = new rojerusan.RSComboMetro();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPassport = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelPicture = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JButtonAddPicutre = new rojerusan.RSMaterialButtonRectangle();
        JButtonUpdate = new rojerusan.RSMaterialButtonRectangle();
        JButtonCancel = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldID.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldID.setForeground(new java.awt.Color(255, 51, 51));
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        jTextFieldFirstName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldFirstName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanel1.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, 40));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 30));

        jTextFieldLastName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldLastName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanel1.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, 40));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 30));

        jTextFieldAddress.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAddress.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldAddress.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanel1.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 210, 40));

        JComboBoxState.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxState.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxState.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxState.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxState.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxState.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxState.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanel1.add(JComboBoxState, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 210, 40));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 20));

        JComboBoxGender.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxGender.setToolTipText("");
        JComboBoxGender.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxGender.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxGender.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanel1.add(JComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 210, 40));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone number");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 130, 30));

        jTextFieldPhoneNumber.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPhoneNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanel1.add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 210, 40));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Passport number");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 150, 30));

        jTextFieldPassport.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPassport.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldPassport.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPassport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanel1.add(jTextFieldPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 210, 40));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of birth");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jDateChooser.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserFocusLost(evt);
            }
        });
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 210, 40));

        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel1.add(jLabelPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 152, 123));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("State");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, -1));

        JButtonAddPicutre.setBackground(new java.awt.Color(51, 23, 113));
        JButtonAddPicutre.setText("Chose a picture");
        JButtonAddPicutre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddPicutreActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonAddPicutre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 200, 50));

        JButtonUpdate.setBackground(new java.awt.Color(51, 23, 113));
        JButtonUpdate.setText("Update");
        JButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 70));

        JButtonCancel.setBackground(new java.awt.Color(102, 0, 0));
        JButtonCancel.setText("Cancel");
        JButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserFocusGained

    private void jDateChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusLost

    }//GEN-LAST:event_jDateChooserFocusLost

    private void JButtonAddPicutreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddPicutreActionPerformed
        setPicture();
    }//GEN-LAST:event_JButtonAddPicutreActionPerformed

    private void JButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonUpdateActionPerformed
        try {
            updatePassenger();
        } catch (ParseException ex) {
            Logger.getLogger(EditPassengerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonUpdateActionPerformed

    private void JButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonAddPicutre;
    private rojerusan.RSMaterialButtonRectangle JButtonCancel;
    private rojerusan.RSMaterialButtonRectangle JButtonUpdate;
    private rojerusan.RSComboMetro JComboBoxGender;
    private rojerusan.RSComboMetro JComboBoxState;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPassport;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void setPicture() {
        JFileChooser pictureChooser = new JFileChooser();
        pictureChooser.showOpenDialog(this);
        File imageFile = pictureChooser.getSelectedFile();
        
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

    private void fillForm() {
        jTextFieldID.setText(passenger.getId());
        jTextFieldFirstName.setText(passenger.getFirstName());
        jTextFieldLastName.setText(passenger.getLastName());
        jTextFieldAddress.setText(passenger.getAddress());
        jTextFieldPassport.setText(passenger.getPassport());
        jTextFieldPhoneNumber.setText(passenger.getPhoneNumber());
        fillComboBox();
        jDateChooser.setDate(passenger.getBirthDate());
        jLabelPicture.setIcon(passenger.getUserimage());
    }

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

    private void updatePassenger() throws ParseException{
        String id = jTextFieldID.getText();
        String firstName = jTextFieldFirstName.getText();
        String lastName = jTextFieldLastName.getText();
        String passport = jTextFieldPassport.getText();
        String address = jTextFieldAddress.getText();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(jDateChooser.getDate());
        String gender = String.valueOf(JComboBoxGender.getSelectedItem());
       
        String phoneNumber = jTextFieldPhoneNumber.getText();
        String state = String.valueOf(JComboBoxState.getSelectedItem());
        
        extractImageFromLabel();
        
        Controller.getInstace().updatePassenger(id,firstName,lastName,address,date,state,gender,phoneNumber,passport,userimage);
        JOptionPane.showMessageDialog(this, 
                    "Passenger updated successfuly", 
                    "INFO!",
                    JOptionPane.INFORMATION_MESSAGE);
        parent.fillTable();
        this.dispose();
    }

    private void extractImageFromLabel() {
        Icon icon = jLabelPicture.getIcon();
        
        if (icon instanceof ImageIcon){
            ImageIcon imageIcon = (ImageIcon) icon;
            Image image = imageIcon.getImage();
            
            BufferedImage bufferedImage = new BufferedImage(
                    image.getWidth(null), 
                    image.getHeight(null),
                    BufferedImage.TYPE_INT_RGB);
            
            Graphics2D g2d = bufferedImage.createGraphics();
            g2d.drawImage(image, 0, 0, null);
            g2d.dispose();
            
            
            String format = "png"; 
            if (path != null && !path.isEmpty()) { 
            
                String fileExtension = path.substring(path.lastIndexOf(".") + 1).toLowerCase();
                if (fileExtension.equals("jpg") || fileExtension.equals("jpeg") || fileExtension.equals("bmp")) {
                    format = fileExtension; 
                }
            }
            
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                ImageIO.write(bufferedImage, format, baos); 
                userimage = baos.toByteArray(); 
            } catch (IOException ex) {
                System.out.println("Error converting image from JLabel: " + ex.getMessage());
                userimage = null;
            }
            
        } else {
            System.out.println("No valid image found in JLabel.");
            userimage = null;
        }
    }

    private void disableFields() {
        jTextFieldID.setEnabled(false);
        JComboBoxGender.setEnabled(false);
        jDateChooser.setEnabled(false);
    }
}
