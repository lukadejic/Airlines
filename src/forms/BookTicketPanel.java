
package forms;

import controller.Controller;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import model.Destinations;
import model.Flight;
import model.FlightTableModel;
import model.Passenger;
import model.PromoCode;
import utilites.CardNumberFilter;
import utilites.ExpiryDateFilter;
import utilites.NameFilter;
import utilites.SecurityCodeFilter;


public class BookTicketPanel extends javax.swing.JPanel {

    private Passenger logedInPassenger;
    
    public BookTicketPanel(Passenger passenger) {
        this.logedInPassenger = passenger;
        initComponents();
        fillform();
        tableDesign();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JComboBoxFrom = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        JComboBoxTo = new rojerusan.RSComboMetro();
        jRadioButtonReturn = new javax.swing.JRadioButton();
        jRadioButtonOneWay = new javax.swing.JRadioButton();
        jDateChooserReturn = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooserDepart = new com.toedter.calendar.JDateChooser();
        jLabelReturn = new javax.swing.JLabel();
        JButtonSearch = new rojerusan.RSMaterialButtonRectangle();
        jPanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        JButtonDetails = new rojerusan.RSMaterialButtonRectangle();
        jPanelDetails = new javax.swing.JPanel();
        jTextFieldPromoCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JComboBoxBaggage = new rojerusan.RSComboMetro();
        jLabel8 = new javax.swing.JLabel();
        JComboBoxInsurance = new rojerusan.RSComboMetro();
        jSpinFieldPassengers = new com.toedter.components.JSpinField();
        jLabel9 = new javax.swing.JLabel();
        JButtonPayment = new rojerusan.RSMaterialButtonRectangle();
        jPanelPayment = new javax.swing.JPanel();
        jTextFieldCardNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldExpiryDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldSecurityCode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCardholderName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JButtonPay = new rojerusan.RSMaterialButtonRectangle();
        jLabel14 = new javax.swing.JLabel();
        jLabelTotalPrice = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JComboBoxClass = new rojerusan.RSComboMetro();
        jLabel16 = new javax.swing.JLabel();
        JButtonCancel = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();

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
        JComboBoxTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxToActionPerformed(evt);
            }
        });
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
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 610, 80));

        JButtonDetails.setBackground(new java.awt.Color(51, 23, 113));
        JButtonDetails.setText("DETAILS");
        JButtonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 110, 40));

        jPanelDetails.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        jTextFieldPromoCode.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPromoCode.setFont(new java.awt.Font("KufiStandardGK", 1, 14)); // NOI18N
        jTextFieldPromoCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Baggage");

        JComboBoxBaggage.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxBaggage.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxBaggage.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxBaggage.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxBaggage.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxBaggage.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxBaggage.setPreferredSize(new java.awt.Dimension(94, 31));
        JComboBoxBaggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxBaggageActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("Insurance");

        JComboBoxInsurance.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxInsurance.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxInsurance.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxInsurance.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxInsurance.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxInsurance.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxInsurance.setPreferredSize(new java.awt.Dimension(94, 31));
        JComboBoxInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxInsuranceActionPerformed(evt);
            }
        });

        jSpinFieldPassengers.setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Passengers");

        JButtonPayment.setBackground(new java.awt.Color(51, 23, 113));
        JButtonPayment.setText("Go to payment");
        JButtonPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPaymentActionPerformed(evt);
            }
        });

        jPanelPayment.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldCardNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Card number");

        jTextFieldExpiryDate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Expiry date");

        jTextFieldSecurityCode.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("Security code");

        jTextFieldCardholderName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Cardholder name");

        JButtonPay.setBackground(new java.awt.Color(51, 23, 113));
        JButtonPay.setText("pay now");
        JButtonPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPayActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setText("Total price");

        jLabelTotalPrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelTotalPrice.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTotalPrice.setText("0$");

        javax.swing.GroupLayout jPanelPaymentLayout = new javax.swing.GroupLayout(jPanelPayment);
        jPanelPayment.setLayout(jPanelPaymentLayout);
        jPanelPaymentLayout.setHorizontalGroup(
            jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCardholderName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSecurityCode, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanelPaymentLayout.setVerticalGroup(
            jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSecurityCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabelTotalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCardholderName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonPay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setText("Class");

        JComboBoxClass.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxClass.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxClass.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxClass.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxClass.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxClass.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxClass.setPreferredSize(new java.awt.Dimension(94, 31));
        JComboBoxClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxClassActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel16.setText("Promo code");

        javax.swing.GroupLayout jPanelDetailsLayout = new javax.swing.GroupLayout(jPanelDetails);
        jPanelDetails.setLayout(jPanelDetailsLayout);
        jPanelDetailsLayout.setHorizontalGroup(
            jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPromoCode))
                            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JComboBoxBaggage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JComboBoxInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinFieldPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelDetailsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(JButtonPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDetailsLayout.setVerticalGroup(
            jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboBoxBaggage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JComboBoxInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(JComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSpinFieldPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPromoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JButtonPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanelPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 620, 270));

        JButtonCancel.setBackground(new java.awt.Color(153, 0, 0));
        JButtonCancel.setText("cancel");
        JButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/Avion.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReturnActionPerformed
        jDateChooserReturn.setVisible(true);
        jLabelReturn.setVisible(true);
    }//GEN-LAST:event_jRadioButtonReturnActionPerformed

    private void jRadioButtonOneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOneWayActionPerformed
        jDateChooserReturn.setVisible(false);
        jLabelReturn.setVisible(false);
    }//GEN-LAST:event_jRadioButtonOneWayActionPerformed

    private void jTextFieldPromoCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPromoCodeFocusGained

    }//GEN-LAST:event_jTextFieldPromoCodeFocusGained

    private void jTextFieldPromoCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPromoCodeFocusLost

    }//GEN-LAST:event_jTextFieldPromoCodeFocusLost

    private void jTextFieldPromoCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPromoCodeActionPerformed
        
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

    private void JButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSearchActionPerformed
        Flight flight = searchFlight();
        System.out.println(flight);
        if(flight == null){
            JOptionPane.showMessageDialog(this, "No flight", "no flight",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        List<Flight> flightbp = new ArrayList<>();
        flightbp.add(flight);
        FlightTableModel ftm = new FlightTableModel(flightbp);
        jTable.setModel(ftm);
        jPanelTable.setVisible(true);
        JButtonDetails.setVisible(true);
    }//GEN-LAST:event_JButtonSearchActionPerformed

    private void JButtonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonDetailsActionPerformed
        
        fillDetailsPanel();
        jPanelDetails.setVisible(true);
    }//GEN-LAST:event_JButtonDetailsActionPerformed

    private void JComboBoxToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxToActionPerformed

    private void JComboBoxBaggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxBaggageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxBaggageActionPerformed

    private void JComboBoxInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxInsuranceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxInsuranceActionPerformed

    private void JButtonPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPaymentActionPerformed
        Flight flight = returnFlight();
        double price = flight.getPrice();
        
        
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
        String promoCodeInput = jTextFieldPromoCode.getText().trim();
        
        
        if(promoCodeInput.isEmpty()){
            jLabelTotalPrice.setText(String.valueOf(price) + "$");
            jPanelPayment.setVisible(true);
            setTextFields();
            return;            
        }

        boolean isPromoCodeValid = false;
        
        for (PromoCode pc : PromoCode.values()) {
                if (promoCodeInput.equals(pc.toString())) {
                price = price - (price * 0.2);
                isPromoCodeValid = true;
                break;
            }
         }        
        
        if(!isPromoCodeValid){
            JOptionPane.showMessageDialog(this,
                                          "Promo code invalid or already in use",
                                          "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        jLabelTotalPrice.setText(String.valueOf(price) + "$");
        jPanelPayment.setVisible(true);
        setTextFields();
    }//GEN-LAST:event_JButtonPaymentActionPerformed

    private void JButtonPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPayActionPerformed
        String cardNumber = jTextFieldCardNumber.getText();
        String expiryDate = jTextFieldExpiryDate.getText();
        String securityCode = jTextFieldSecurityCode.getText();
        String cardholderName = jTextFieldCardholderName.getText();
        
        if(jTextFieldCardNumber.getText().isEmpty() ||
                jTextFieldExpiryDate.getText().isEmpty() ||
                jTextFieldSecurityCode.getText().isEmpty()||
                jTextFieldCardholderName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Input fields cannot be empty", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(jTextFieldCardNumber.getText().length() != 19){
            JOptionPane.showMessageDialog(this, 
                    "Invalid card number format", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;  
        }
        
        if(jTextFieldExpiryDate.getText().length() != 5){
            JOptionPane.showMessageDialog(this, 
                    "Invalid expiry date format", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;  
        }
        
        if(jTextFieldSecurityCode.getText().length() < 3){
            JOptionPane.showMessageDialog(this, 
                    "Invalid security code format", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;  
        }
        String stringAmount = jLabelTotalPrice.getText();
        double amount = Double.parseDouble(stringAmount.substring(0,stringAmount.length() - 1));
        int isPaymentSuccesful = Controller.getInstace().payment(cardNumber,expiryDate,securityCode,cardholderName,amount);
       
        switch (isPaymentSuccesful) {
            case 1:
                JOptionPane.showMessageDialog(this, 
                        "PAYMENT SUCCESSFUL", 
                        "", JOptionPane.INFORMATION_MESSAGE);
                bookTicket();
                resetBookingPanel();
                break;
            case 2:
                JOptionPane.showMessageDialog(this, 
                        "Insufficient amount on your credit card", 
                        "", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(this, 
                        "Invalid user info provided, please check again or contact your bank", 
                        "", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(this, 
                        "An unexpected error occurred, please try again", 
                        "", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
 
    }//GEN-LAST:event_JButtonPayActionPerformed

    private void JComboBoxClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxClassActionPerformed

    private void JButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelActionPerformed
       resetBookingPanel();
    }//GEN-LAST:event_JButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonCancel;
    private rojerusan.RSMaterialButtonRectangle JButtonDetails;
    private rojerusan.RSMaterialButtonRectangle JButtonPay;
    private rojerusan.RSMaterialButtonRectangle JButtonPayment;
    private rojerusan.RSMaterialButtonRectangle JButtonSearch;
    private rojerusan.RSComboMetro JComboBoxBaggage;
    private rojerusan.RSComboMetro JComboBoxClass;
    private rojerusan.RSComboMetro JComboBoxFrom;
    private rojerusan.RSComboMetro JComboBoxInsurance;
    private rojerusan.RSComboMetro JComboBoxTo;
    private com.toedter.calendar.JDateChooser jDateChooserDepart;
    private com.toedter.calendar.JDateChooser jDateChooserReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JLabel jLabelTotalPrice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDetails;
    private javax.swing.JPanel jPanelPayment;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JRadioButton jRadioButtonOneWay;
    private javax.swing.JRadioButton jRadioButtonReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinFieldPassengers;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCardNumber;
    private javax.swing.JTextField jTextFieldCardholderName;
    private javax.swing.JTextField jTextFieldExpiryDate;
    private javax.swing.JTextField jTextFieldPromoCode;
    private javax.swing.JTextField jTextFieldSecurityCode;
    // End of variables declaration//GEN-END:variables

    private Flight searchFlight() {
        String from = String.valueOf(JComboBoxFrom.getSelectedItem());
        String to = String.valueOf(JComboBoxTo.getSelectedItem());
        String departDate = jDateChooserDepart.getDate().toString().substring(0,10);
        String returnDate = null;
        if (jDateChooserReturn != null && jDateChooserReturn.getDate() != null) {
            returnDate = jDateChooserReturn.getDate().toString().substring(0, 10);
        }
        System.out.println(departDate);
        System.out.println(returnDate);

        Flight flight = Controller.getInstace().searchFlight(from,to,departDate,returnDate);
        return flight;
    }

    private void fillform() {
        JButtonDetails.setVisible(false);
        jPanelTable.setVisible(false);
        jPanelDetails.setVisible(false);
        jPanelPayment.setVisible(false);
        JComboBoxFrom.removeAll();
        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = dateFormat.parse("04.12.2024"); // Datum u formatu dd.MM.yyyy
            jDateChooserDepart.setDate(date); // Postavljanje datuma
            Date returnDate = dateFormat.parse("11.12.2024");
            jDateChooserReturn.setDate(returnDate);
        } catch (ParseException e) {
        }
        
        List<Flight> flights = Controller.getInstace().returnFlights();
        
        for (Flight flight : flights) {
            JComboBoxFrom.addItem(flight.getFromDestination());
        }
        
        JComboBoxTo.removeAll();
        
        for (Flight flight : flights) {
            JComboBoxTo.addItem(flight.getToDestination());
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

        private void fillDetailsPanel() {
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

    private Flight returnFlight() {
        String from = String.valueOf(JComboBoxFrom.getSelectedItem());
        String to = String.valueOf(JComboBoxTo.getSelectedItem());
        Date departDate = jDateChooserDepart.getDate();
        
        String departDate1;
        
        if(departDate == null){
            departDate1 = "";
        }else{
            departDate1 = departDate.toString().substring(0,10);
        }
        
        String returnDate = null;
        if (jDateChooserReturn != null && jDateChooserReturn.getDate() != null) {
            returnDate = jDateChooserReturn.getDate().toString().substring(0, 10);
        }
        System.out.println(departDate);
        System.out.println(returnDate);
        int passangers = jSpinFieldPassengers.getValue();
        Flight flight = Controller.getInstace().returnFlight(from,to,departDate1,returnDate,passangers);
        System.out.println(flight);
        return flight;
    }

    private void setTextFields() {
       ((AbstractDocument) jTextFieldCardNumber.getDocument()).setDocumentFilter(new CardNumberFilter());
       ((AbstractDocument) jTextFieldExpiryDate.getDocument()).setDocumentFilter(new ExpiryDateFilter());
       ((AbstractDocument) jTextFieldSecurityCode.getDocument()).setDocumentFilter(new SecurityCodeFilter());
       ((AbstractDocument) jTextFieldCardholderName.getDocument()).setDocumentFilter(new NameFilter());
    }

    private void resetBookingPanel() {
        jRadioButtonReturn.setSelected(true);
        JComboBoxFrom.setSelectedIndex(0);
        JComboBoxTo.setSelectedIndex(0);
        jDateChooserDepart.setDate(null);
        jDateChooserReturn.setDate(null);
        jPanelTable.setVisible(false);
        JButtonDetails.setVisible(false);
        jPanelDetails.setVisible(false);
        jPanelPayment.setVisible(false);
        JComboBoxBaggage.removeAll();
        JComboBoxBaggage.setSelectedIndex(0);
        JComboBoxClass.removeAll();
        JComboBoxClass.setSelectedItem(0);
        JComboBoxInsurance.removeAll();
        JComboBoxInsurance.setSelectedItem(0);
        jSpinFieldPassengers.setValue(1);
        jTextFieldCardNumber.setText("");
        jTextFieldExpiryDate.setText("");
        jTextFieldSecurityCode.setText("");
        jTextFieldCardholderName.setText("");
       
    }

    private void bookTicket() {
        String fromDestination = String.valueOf(JComboBoxFrom.getSelectedItem());
        String toDestination = String.valueOf(JComboBoxTo.getSelectedItem());
        String departDate = jDateChooserDepart.getDate().toString();
        String returnDate = null;
        if (jDateChooserReturn != null && jDateChooserReturn.getDate() != null) {
            returnDate = jDateChooserReturn.getDate().toString();
        }
        String baggage = String.valueOf(JComboBoxBaggage.getSelectedItem());
        String insurance = String.valueOf(JComboBoxInsurance.getSelectedItem());
        String flightClass = String.valueOf(JComboBoxClass.getSelectedItem());
        int passengers = jSpinFieldPassengers.getValue();
        String price = jLabelTotalPrice.getText();
        double totalPrice = Double.parseDouble(price.substring(0, price.length() - 1));
        
        boolean isBooked = Controller.getInstace().bookTicket(fromDestination,toDestination,departDate,returnDate,baggage,insurance,flightClass,passengers,totalPrice,logedInPassenger);
        
        if(isBooked){
            JOptionPane.showMessageDialog(this,
                   "You have booked your ticket succesfully", 
                   "Congratulations", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private void initListeners() {
        JComboBoxBaggage.addActionListener(evt -> updatePrice());
        JComboBoxInsurance.addActionListener(evt -> updatePrice());
        JComboBoxClass.addActionListener(evt -> updatePrice());
        jSpinFieldPassengers.addPropertyChangeListener("value", evt -> updatePrice());
    }
    
    private void updatePrice(){
        Flight flight = returnFlight();
        if(flight != null){
        double price = flight.getPrice();
        
        
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

            jLabelTotalPrice.setText(String.valueOf(price) + "$");
        }
    }
}
