
package forms;

import controller.Controller;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Destinations;
import model.Flight;
import model.FlightTableModel;

public class BookTicketForm extends javax.swing.JFrame {

    public BookTicketForm() {
        initComponents();
        fillForm();
        tableDesign();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JComboBoxFrom = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        JComboBoxTo = new rojerusan.RSComboMetro();
        jRadioButtonReturn = new javax.swing.JRadioButton();
        jRadioButtonOneWay = new javax.swing.JRadioButton();
        jTextFieldPromoCode = new javax.swing.JTextField();
        jDateChooserReturn = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooserDepart = new com.toedter.calendar.JDateChooser();
        jLabelReturn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinFieldPassengers = new com.toedter.components.JSpinField();
        JButtonSearch = new rojerusan.RSMaterialButtonRectangle();
        jPanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        JButtonDetails = new rojerusan.RSMaterialButtonRectangle();
        jPanelImage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("From");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("To");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 53, 84, -1));

        JComboBoxFrom.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxFrom.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxFrom.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxFrom.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxFrom.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxFrom.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxFrom.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanel1.add(JComboBoxFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 93, 290, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 53, 84, -1));

        JComboBoxTo.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxTo.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxTo.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxTo.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxTo.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxTo.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxTo.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanel1.add(JComboBoxTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 93, 290, 40));

        jRadioButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonReturn.setText("Return trip");
        jRadioButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReturnActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1, -1, -1));

        jRadioButtonOneWay.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOneWay.setText("One way");
        jRadioButtonOneWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOneWayActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonOneWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 1, -1, -1));

        jTextFieldPromoCode.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPromoCode.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldPromoCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPromoCode.setText("Apply Promo Code");
        jTextFieldPromoCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPromoCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPromoCodeFocusLost(evt);
            }
        });
        jTextFieldPromoCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPromoCodeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPromoCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 5, 166, 23));

        jDateChooserReturn.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooserReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserReturnFocusLost(evt);
            }
        });
        jPanel1.add(jDateChooserReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 173, 240, 50));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Depart");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 145, 84, -1));

        jDateChooserDepart.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooserDepart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserDepartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserDepartFocusLost(evt);
            }
        });
        jPanel1.add(jDateChooserDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 173, 240, 50));

        jLabelReturn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelReturn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReturn.setText("Return");
        jPanel1.add(jLabelReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 145, 84, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Passengers");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 145, -1, -1));

        jSpinFieldPassengers.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jSpinFieldPassengers, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 81, 20));

        JButtonSearch.setBackground(new java.awt.Color(51, 23, 113));
        JButtonSearch.setText("Search");
        JButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSearchActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 139, 51));

        jTable.setBackground(new java.awt.Color(204, 204, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.setGridColor(new java.awt.Color(51, 51, 255));
        jTable.setRowHeight(60);
        jTable.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 610, 80));

        JButtonDetails.setBackground(new java.awt.Color(51, 23, 113));
        JButtonDetails.setText("DETAILS");
        JButtonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 110, 40));

        jPanelImage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/Avion.jpg"))); // NOI18N
        jPanelImage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 650, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReturnActionPerformed
        jDateChooserReturn.setVisible(true);
        jLabelReturn.setVisible(true);
    }//GEN-LAST:event_jRadioButtonReturnActionPerformed

    private void jTextFieldPromoCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPromoCodeFocusGained
        if(jTextFieldPromoCode.getText().equals("Apply Promo Code")){
            jTextFieldPromoCode.setText("");
        }
    }//GEN-LAST:event_jTextFieldPromoCodeFocusGained

    private void jTextFieldPromoCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPromoCodeFocusLost
        if(jTextFieldPromoCode.getText().equals("")){
            jTextFieldPromoCode.setText("Apply Promo Code");
        }
    }//GEN-LAST:event_jTextFieldPromoCodeFocusLost

    private void jTextFieldPromoCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPromoCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPromoCodeActionPerformed

    private void jDateChooserReturnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserReturnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserReturnFocusGained

    private void jDateChooserReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserReturnFocusLost

    }//GEN-LAST:event_jDateChooserReturnFocusLost

    private void jDateChooserDepartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepartFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepartFocusGained

    private void jDateChooserDepartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserDepartFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDepartFocusLost

    private void jRadioButtonOneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOneWayActionPerformed
        jDateChooserReturn.setVisible(false);
        jLabelReturn.setVisible(false);
    }//GEN-LAST:event_jRadioButtonOneWayActionPerformed

    private void JButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSearchActionPerformed
        Flight flight = searchFlight();
        if(flight == null){
            JOptionPane.showMessageDialog(this, "No flight", "no flight", 
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        FlightTableModel ftm = new FlightTableModel((List<Flight>) flight);
        jTable.setModel(ftm);
        jPanelTable.setVisible(true);
        JButtonDetails.setVisible(true);
    }//GEN-LAST:event_JButtonSearchActionPerformed

    private void JButtonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonDetails;
    private rojerusan.RSMaterialButtonRectangle JButtonSearch;
    private rojerusan.RSComboMetro JComboBoxFrom;
    private rojerusan.RSComboMetro JComboBoxTo;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooserDepart;
    private com.toedter.calendar.JDateChooser jDateChooserReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JRadioButton jRadioButtonOneWay;
    private javax.swing.JRadioButton jRadioButtonReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinFieldPassengers;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldPromoCode;
    // End of variables declaration//GEN-END:variables

    private void fillForm() {
        JButtonDetails.setVisible(false);
        jPanelTable.setVisible(false);
        JComboBoxFrom.removeAll();
        
        for (Destinations destination : Destinations.values()) {
            JComboBoxFrom.addItem(destination);
        }
        
        JComboBoxTo.removeAll();
        
        for (Destinations destination : Destinations.values()) {
            JComboBoxTo.addItem(destination);
        }
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButtonOneWay);
        group.add(jRadioButtonReturn);      
        jRadioButtonReturn.setSelected(true);
            
        if(jRadioButtonOneWay.isSelected()){
            jDateChooserReturn.setVisible(false);
            jLabelReturn.setVisible(false);
            this.revalidate();
            this.repaint();
        }
    }
     private void tableDesign() {
        jTable.getTableHeader().setOpaque(false);
        Color darkPurple = Color.decode("#331771");
        jTable.getTableHeader().setBackground(darkPurple);
        jTable.getTableHeader().setFont(new Font("Segoe UI Semilign", Font.BOLD, 18));
        jTable.getTableHeader().setForeground(Color.white);
        jTable.setRowHeight(60);
        
        for(int i = 0 ; i < jTable.getColumnCount(); i++){
            jTable.getColumnModel().getColumn(i).setResizable(false);
        }
        jTable.getTableHeader().setReorderingAllowed(false);
    }

    private Flight searchFlight() {
        String from = String.valueOf(JComboBoxFrom.getSelectedItem());
        String to = String.valueOf(JComboBoxTo.getSelectedItem());
        Date departDate = jDateChooserDepart.getDate();
        Date returnDate = jDateChooserReturn.getDate();
        int passengers = jSpinFieldPassengers.getValue();
        //Flight flight = Controller.getInstace().searchFlight(from,to,departDate,returnDate,passengers);
        return null;
    }
}
