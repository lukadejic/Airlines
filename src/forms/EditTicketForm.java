
package forms;

import controller.Controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Ticket;

public class EditTicketForm extends javax.swing.JFrame {

    private Ticket ticket;
    private AllBookedTicketsPanel parent;
    
    public EditTicketForm(Ticket ticket, AllBookedTicketsPanel parent) {
        this.ticket = ticket;
        this.parent = parent;
        initComponents();
        try {
            fillForm();
        } catch (ParseException ex) {
            Logger.getLogger(EditTicketForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFrom = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JComboBoxClass = new rojerusan.RSComboMetro();
        jLabel12 = new javax.swing.JLabel();
        jLabelCustomer = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateChooserReturn = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        JButtonUpdate = new rojerusan.RSMaterialButtonRectangle();
        JButtonCancel = new rojerusan.RSMaterialButtonRectangle();
        jDateChooserDepart = new com.toedter.calendar.JDateChooser();
        JComboBoxBaggage = new rojerusan.RSComboMetro();
        JComboBoxInsurance = new rojerusan.RSComboMetro();
        jLabel16 = new javax.swing.JLabel();
        jSpinFieldPassengers = new com.toedter.components.JSpinField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");

        jTextFieldFrom.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldFrom.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldFrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFrom.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));

        jLabelID.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 0, 0));
        jLabelID.setText("From");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("To");

        jTextFieldTo.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldTo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldTo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Depart");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Baggage");

        JComboBoxClass.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxClass.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxClass.setToolTipText("");
        JComboBoxClass.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxClass.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxClass.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxClass.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxClass.setPreferredSize(new java.awt.Dimension(94, 31));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Passengers");

        jLabelCustomer.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabelCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomer.setText("Customer");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Class");

        jDateChooserReturn.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooserReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserReturnFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Return");

        JButtonUpdate.setBackground(new java.awt.Color(51, 23, 113));
        JButtonUpdate.setText("Update");
        JButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonUpdateActionPerformed(evt);
            }
        });

        JButtonCancel.setBackground(new java.awt.Color(102, 0, 0));
        JButtonCancel.setText("Cancel");
        JButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelActionPerformed(evt);
            }
        });

        jDateChooserDepart.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooserDepart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserDepartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserDepartFocusLost(evt);
            }
        });

        JComboBoxBaggage.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxBaggage.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxBaggage.setToolTipText("");
        JComboBoxBaggage.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxBaggage.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxBaggage.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxBaggage.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxBaggage.setPreferredSize(new java.awt.Dimension(94, 31));

        JComboBoxInsurance.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxInsurance.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxInsurance.setToolTipText("");
        JComboBoxInsurance.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxInsurance.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxInsurance.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxInsurance.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxInsurance.setPreferredSize(new java.awt.Dimension(94, 31));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Insurane");

        jSpinFieldPassengers.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("From");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Price");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Customer");

        jLabelPrice.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPrice.setText("From");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel10)
                                .addGap(17, 17, 17)
                                .addComponent(JComboBoxBaggage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel16)
                                .addGap(16, 16, 16)
                                .addComponent(JComboBoxInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jDateChooserDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(jLabel14)
                                .addGap(35, 35, 35)
                                .addComponent(JComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jDateChooserReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jSpinFieldPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(JButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(470, 470, 470)
                                .addComponent(JButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JComboBoxBaggage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JComboBoxInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jDateChooserDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14))
                    .addComponent(JComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jDateChooserReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSpinFieldPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabelPrice)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabelCustomer))))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooserReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserReturnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserReturnFocusGained

    private void jDateChooserReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserReturnFocusLost

    }//GEN-LAST:event_jDateChooserReturnFocusLost

    private void JButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonUpdateActionPerformed
        int id = Integer.parseInt(jLabelID.getText());
        String from = jTextFieldFrom.getText();
        String to = jTextFieldTo.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
        String departDate = dateFormat.format(jDateChooserDepart.getDate());
        String returnDate = dateFormat.format(jDateChooserReturn.getDate());
        String baggage = String.valueOf(JComboBoxBaggage.getSelectedItem());
        String insurance = String.valueOf(JComboBoxInsurance.getSelectedItem());
        String travelClass = String.valueOf(JComboBoxClass.getSelectedItem());
        int passengers = jSpinFieldPassengers.getValue();
        String stringAmount = jLabelPrice.getText();
        double price = Double.parseDouble(stringAmount.substring(0,stringAmount.length() - 1));
        String customer = jLabelCustomer.getText();
        boolean isUpdated = Controller.getInstace().updateTicket(id,from,to,departDate,returnDate,baggage,insurance,travelClass,passengers,price,customer);
        
        if(isUpdated){
            JOptionPane.showMessageDialog(this, 
                    "Ticket updated succesfully", "", JOptionPane.INFORMATION_MESSAGE);
            parent.fillPanel();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Error while updating ticket, please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JButtonUpdateActionPerformed

    private void JButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonCancelActionPerformed

    private void jDateChooserDepartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepartFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepartFocusGained

    private void jDateChooserDepartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepartFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepartFocusLost



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonCancel;
    private rojerusan.RSMaterialButtonRectangle JButtonUpdate;
    private rojerusan.RSComboMetro JComboBoxBaggage;
    private rojerusan.RSComboMetro JComboBoxClass;
    private rojerusan.RSComboMetro JComboBoxInsurance;
    private com.toedter.calendar.JDateChooser jDateChooserDepart;
    private com.toedter.calendar.JDateChooser jDateChooserReturn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JPanel jPanel1;
    private com.toedter.components.JSpinField jSpinFieldPassengers;
    private javax.swing.JTextField jTextFieldFrom;
    private javax.swing.JTextField jTextFieldTo;
    // End of variables declaration//GEN-END:variables

    private void fillForm() throws ParseException {
        jLabelID.setText(ticket.getId() + "");
        jTextFieldFrom.setText(ticket.getFrom());
        jTextFieldTo.setText(ticket.getTo());
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
        Date departDate = dateFormat.parse(ticket.getDepartTime());
        Date returnDate = dateFormat.parse(ticket.getReturnTime());
        jDateChooserDepart.setDate(departDate);
        jDateChooserReturn.setDate(returnDate);
        fillComboBoxes();
        jLabelPrice.setText(ticket.getPrice() + "$");
        jLabelCustomer.setText(ticket.getCustomer());
    }

    private void fillComboBoxes() {
        String[] baggage = {"Cabin baggage", "Checked baggage", "Special baggage"};

        JComboBoxBaggage.removeAllItems();

        for (String item : baggage) {
            JComboBoxBaggage.addItem(item);
        }

        String[] insurance = {"Standard Insurance", "Insurance plus", "Anual insurance"};

        JComboBoxInsurance.removeAll();

        for (String string : insurance) {
            JComboBoxInsurance.addItem(string);
        }

        String[] travelClass = {"Economy class", "Bussines class"};

        JComboBoxClass.removeAll();

        for (String tc : travelClass) {
            JComboBoxClass.addItem(tc);
        }
        jSpinFieldPassengers.setValue(1);
        jSpinFieldPassengers.setMinimum(1);
        jSpinFieldPassengers.setMaximum(10);
        initListeners();
    }

    private void initListeners() {
        JComboBoxBaggage.addActionListener(evt -> updatePrice());
        JComboBoxInsurance.addActionListener(evt -> updatePrice());
        JComboBoxClass.addActionListener(evt -> updatePrice());
        jSpinFieldPassengers.addPropertyChangeListener("value", evt -> updatePrice());
    }

    private void updatePrice() {
        double price = ticket.getPrice();
        
        if(JComboBoxBaggage.getSelectedItem().equals("Cabin baggage")){
                price += 20;
            }else if(JComboBoxBaggage.getSelectedItem().equals("Checked baggage")){
                price += 40;
            }else if(JComboBoxBaggage.getSelectedItem().equals("Special baggage")){
                price += 80;
            }

            if(JComboBoxInsurance.getSelectedItem().equals("Standard Insurance")){
                price += 15;
            }else if(JComboBoxInsurance.getSelectedItem().equals("Insurance plus")){
                price += 25;
            }else if(JComboBoxInsurance.getSelectedItem().equals("Anual insurance")){
                price += 125;
            }

            if(JComboBoxClass.getSelectedItem().equals("Bussines class")){
                price += 100;
            }

            int passengers = jSpinFieldPassengers.getValue();
            price = price * passengers;
            
            jLabelPrice.setText(String.valueOf(price) + "$");
    }
}
