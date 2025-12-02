package forms;

import controller.Controller;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class AddFlightForm extends javax.swing.JFrame {

    public AddFlightForm() {
        initComponents();
        setUpForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jDateChooserDepart1 = new org.netbeans.modules.form.InvalidComponent();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFrom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JButtonAdd = new rojerusan.RSMaterialButtonRectangle();
        jRadioButtonReturnTrip = new javax.swing.JRadioButton();
        jRadioButtonOneWay = new javax.swing.JRadioButton();

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Depart");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("From");

        jTextFieldFrom.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldFrom.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldFrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFrom.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jTextFieldFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFromActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("To");

        jTextFieldTo.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldTo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldTo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Depart");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return");

        jTextFieldPrice.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");

        JButtonAdd.setBackground(new java.awt.Color(51, 23, 113));
        JButtonAdd.setText("Add");
        JButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddActionPerformed(evt);
            }
        });

        jRadioButtonReturnTrip.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonReturnTrip.setText("Return Trip");

        jRadioButtonOneWay.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOneWay.setText("One way");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonReturnTrip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonOneWay))
                            .addComponent(JButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 297, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonReturnTrip)
                    .addComponent(jRadioButtonOneWay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(JButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void jDateChooserDepartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepartFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepartFocusGained

    private void jDateChooserDepartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepartFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepartFocusLost

    private void jDateChooserDepart1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepart1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepart1FocusGained

    private void jDateChooserDepart1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepart1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepart1FocusLost

    private void jDateChooserReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserReturnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserReturnFocusGained

    private void jDateChooserReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserReturnFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserReturnFocusLost

    private void JButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddActionPerformed
        if (jTextFieldTo.getText().isEmpty()
            || jTextFieldFrom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please fill all the fields", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        addFlight();
    }//GEN-LAST:event_JButtonAddActionPerformed

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceActionPerformed

    private void jTextFieldFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFromActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonAdd;
    private org.netbeans.modules.form.InvalidComponent jDateChooserDepart1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonOneWay;
    private javax.swing.JRadioButton jRadioButtonReturnTrip;
    private javax.swing.JTextField jTextFieldFrom;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldTo;
    // End of variables declaration//GEN-END:variables

    private void addFlight() {
        String from = jTextFieldFrom.getText();
        String to = jTextFieldTo.getText();
        // String departDate = jDateChooserDepart.getDate().toString();
        String returnDate = null;

//        if(jDateChooserReturn.getDate() != null && jDateChooserReturn != null){
//            returnDate = jDateChooserReturn.getDate().toString();
//        }
        double price = Double.parseDouble(jTextFieldPrice.getText());
        boolean isAddedFlight = Controller.getInstace().addFlight(from, to, "", returnDate, price);

        if (isAddedFlight) {
            JOptionPane.showMessageDialog(this,
                    "Flight added succesfuly", "", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }

    private void setUpForm() {
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButtonReturnTrip);
        group.add(jRadioButtonOneWay);
        jRadioButtonReturnTrip.setSelected(true);

        if (jRadioButtonOneWay.isSelected()) {
            //        jDateChooserReturn.setVisible(false);
            this.revalidate();
            this.repaint();
        }
    }
}
