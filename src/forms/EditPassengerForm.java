
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
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Passenger;



public class EditPassengerForm extends javax.swing.JFrame {
    
    private Passenger passenger;
    private String path;
    private byte[] userimage;
    private JPanel parentPanel;
    
    public EditPassengerForm(Passenger passenger, JPanel spf) {
        this.passenger = passenger;
        this.parentPanel = spf;
        initComponents();
        fillForm();
        
        buttonGroup1.add(jRadioButtonMale);
        buttonGroup1.add(jRadioButtonFemale);
        userimage = AddPassengerForm.userimage;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIme = new javax.swing.JTextField();
        jTextFieldBrojPasosa = new javax.swing.JTextField();
        jTextFieldPrezime = new javax.swing.JTextField();
        jTextFieldAdresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jTextFieldBrojTelefona = new javax.swing.JTextField();
        jButtonPicture = new javax.swing.JButton();
        jButtonPonisti = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabelPicture = new javax.swing.JLabel();
        jTextFieldJMBG = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldState = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jTextField2.setText("jTextField1");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        jLabel6.setText("JMBG:");

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Passport");

        jLabel4.setText("Address");

        jTextFieldPrezime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrezimeActionPerformed(evt);
            }
        });

        jLabel5.setText("Date of birth");

        jLabel8.setText("Gender");

        jLabel9.setText("Phone Number");

        jRadioButtonMale.setText("Male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });

        jRadioButtonFemale.setText("Female");

        jButtonPicture.setText("Choose a picture");
        jButtonPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPictureActionPerformed(evt);
            }
        });

        jButtonPonisti.setText("Cancel");
        jButtonPonisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPonistiActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Update");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Search the passenger");

        jLabel10.setText("State");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(399, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(383, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonPicture))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldBrojPasosa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(54, 54, 54))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jButtonPonisti, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jRadioButtonMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonFemale)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldBrojPasosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPicture)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonMale)
                                .addComponent(jRadioButtonFemale)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPonisti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrezimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrezimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrezimeActionPerformed

    private void jButtonPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPictureActionPerformed
        setPicture();
    }//GEN-LAST:event_jButtonPictureActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try {
            updatePassenger();
        } catch (ParseException ex) {
            Logger.getLogger(EditPassengerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jButtonPonistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPonistiActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonPonistiActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonPicture;
    private javax.swing.JButton jButtonPonisti;
    private com.toedter.calendar.JDateChooser jDateChooser;
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
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldAdresa;
    private javax.swing.JTextField jTextFieldBrojPasosa;
    private javax.swing.JTextField jTextFieldBrojTelefona;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldJMBG;
    private javax.swing.JTextField jTextFieldPrezime;
    private javax.swing.JTextField jTextFieldState;
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


    private void findPassangerFromDataBase() {
        String jmbg = jTextFieldJMBG.getText();
        
        Passenger passenger = Controller.getInstace().getPassenger(jmbg);
       
        if(passenger != null){
            jTextFieldIme.setText(passenger.getFirstName());
            jTextFieldPrezime.setText(passenger.getLastName());
            jTextFieldBrojPasosa.setText(passenger.getPassport());
            jTextFieldAdresa.setText(passenger.getAddress());
            jDateChooser.setDate(passenger.getBirthDate());
            if (passenger.getGender().equals("Male")){
                jRadioButtonMale.setSelected(true);
            }else{
                jRadioButtonFemale.setSelected(true);
            }
            jTextFieldBrojTelefona.setText(passenger.getPhoneNumber());
            jLabelPicture.setIcon(passenger.getUserimage());
            enableAllInputFields();
       }else{
            JOptionPane.showMessageDialog(this, 
                    "Passenger with giver JMBG does not exist", 
                    "INFO!",
                    JOptionPane.INFORMATION_MESSAGE);
            jTextFieldJMBG.setText("");
            disableAllInputFields();
        }
    }

    private void updatePassenger() throws ParseException {
        String id = jTextFieldJMBG.getText();
        String firstName = jTextFieldIme.getText();
        String lastName = jTextFieldPrezime.getText();
        String passport = jTextFieldBrojPasosa.getText();
        String address = jTextFieldAdresa.getText();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(jDateChooser.getDate());
        String gender;
        
        if (jRadioButtonMale.isSelected()){
            gender = "Male";
        }else{
            gender = "Female";
        }
        
        String phoneNumber = jTextFieldBrojTelefona.getText();
        String state = jTextFieldState.getText();
        
        extractImageFromLabel();
        
        Controller.getInstace().updatePassenger(id,firstName,lastName,address,date,state,gender,phoneNumber,passport,userimage);
        JOptionPane.showMessageDialog(this, 
                    "Passenger updated successfuly", 
                    "INFO!",
                    JOptionPane.INFORMATION_MESSAGE);
        
        this.dispose();
    }
    
    private void disableAllInputFields() {
        jTextFieldIme.setEnabled(false);
        jTextFieldPrezime.setEnabled(false);
        jTextFieldBrojPasosa.setEnabled(false);
        jTextFieldBrojTelefona.setEnabled(false);
        jTextFieldAdresa.setEnabled(false);
        jDateChooser.setEnabled(false);
        jRadioButtonMale.setEnabled(false);
        jRadioButtonFemale.setEnabled(false);
        jButtonPicture.setEnabled(false);
        jButtonEdit.setEnabled(false);
    }

    private void enableAllInputFields() {
        jTextFieldJMBG.setEnabled(false);
        jTextFieldIme.setEnabled(true);
        jTextFieldPrezime.setEnabled(true);
        jTextFieldBrojPasosa.setEnabled(true);
        jTextFieldBrojTelefona.setEnabled(true);
        jTextFieldAdresa.setEnabled(true);
        jDateChooser.setEnabled(true);
        jRadioButtonMale.setEnabled(true);
        jRadioButtonFemale.setEnabled(true);
        jButtonPicture.setEnabled(true);
        jButtonEdit.setEnabled(true);
    }

    private boolean isJMBGValid() {
        if(jTextFieldJMBG.getText().length() != 13 || !jTextFieldJMBG.getText().trim().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Invalid jmbg format");
            return false;
        }
        return true;
    }

    private void fillUserImage() {
        JFileChooser pictureChooser = new JFileChooser();
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

    private void fillForm() {
        jTextFieldJMBG.setText(passenger.getId());
        jTextFieldJMBG.setEnabled(false);
        jTextFieldIme.setText(passenger.getFirstName());
        jTextFieldPrezime.setText(passenger.getLastName());
        jTextFieldAdresa.setText(passenger.getAddress());
        jTextFieldBrojTelefona.setText(passenger.getPhoneNumber());
        jTextFieldBrojPasosa.setText(passenger.getPassport());
        jDateChooser.setDate(passenger.getBirthDate());
        jDateChooser.setEnabled(false);
        jLabelPicture.setIcon(passenger.getUserimage());
        jRadioButtonMale.setEnabled(false);
        jRadioButtonFemale.setEnabled(false);
        
        if(passenger.getGender().equals("Male")){
            jRadioButtonMale.setSelected(true);
        }else{
            jRadioButtonFemale.setSelected(true);
        }
        jTextFieldState.setText(passenger.getState());
        
    }

    

}
