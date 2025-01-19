
package forms;

import controller.Controller;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import model.Airline;
import model.Flight;
import model.FlightTableModel;
import model.Passenger;



public class MainForm extends javax.swing.JFrame {
    private List<Passenger> passengers;
    private Airline logedInAirline;
    private Passenger logedInPassenger;
    
    public MainForm(Airline airline) throws ParseException {
        this.logedInAirline = airline;
        passengers = Controller.getInstace().returnAllPassengers();
        initComponents();
        loadForm();
    }
    
    public MainForm(Passenger passenger) throws ParseException {
        this.logedInPassenger = passenger;
        passengers = Controller.getInstace().returnAllPassengers();
        initComponents();
        loadForm();
    }
    
    
    public MainForm() throws ParseException {
        passengers = Controller.getInstace().returnAllPassengers();
        initComponents();
        loadForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanelMain = new javax.swing.JPanel();
        jPanelPassengers = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JButtonRemove = new rojerusan.RSMaterialButtonRectangle();
        jTextFieldEmail = new javax.swing.JTextField();
        JButtonAdd = new rojerusan.RSMaterialButtonRectangle();
        JButtonEdit = new rojerusan.RSMaterialButtonRectangle();
        jPanelEdit = new javax.swing.JPanel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        JComboBoxState = new rojerusan.RSComboMetro();
        jLabel28 = new javax.swing.JLabel();
        JComboBoxGender = new rojerusan.RSComboMetro();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldPassport = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelPicture = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        JButtonAddPicutre = new rojerusan.RSMaterialButtonRectangle();
        JButtonUpdate = new rojerusan.RSMaterialButtonRectangle();
        JButtonCancel = new rojerusan.RSMaterialButtonRectangle();
        jPanelBookTicket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JComboBoxFrom = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        JComboBoxTo = new rojerusan.RSComboMetro();
        jRadioButtonReturn = new javax.swing.JRadioButton();
        jRadioButtonOneWay = new javax.swing.JRadioButton();
        jTextFieldPromoCode = new javax.swing.JTextField();
        jDateChooserReturn = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jDateChooserDepart = new com.toedter.calendar.JDateChooser();
        jLabelReturn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinFieldPassengers = new com.toedter.components.JSpinField();
        JButtonSearch = new rojerusan.RSMaterialButtonRectangle();
        jPanelTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JButtonDetails = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        jPanelWelcomeScreen = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jPanelAllBookedTickets = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuPassengers = new javax.swing.JMenu();
        jMenuItemPassengers = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemBookTicket = new javax.swing.JMenuItem();
        jMenuItemBookedTickets = new javax.swing.JMenuItem();
        jMenuFlight = new javax.swing.JMenu();
        jMenuItemAddFlight = new javax.swing.JMenuItem();
        jMenuAirline = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuPassenger = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelPassengers.setBackground(new java.awt.Color(102, 102, 255));
        jPanelPassengers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelPassengers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable.setRowHeight(25);
        jTable.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable.setShowHorizontalLines(false);
        jTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable);

        jPanelPassengers.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1290, 510));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search the passenger");
        jPanelPassengers.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });
        jPanelPassengers.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 240, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPassengers.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        JButtonRemove.setBackground(new java.awt.Color(51, 23, 113));
        JButtonRemove.setText("Delete");
        JButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRemoveActionPerformed(evt);
            }
        });
        jPanelPassengers.add(JButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 170, 50));

        jTextFieldEmail.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelPassengers.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, 40));

        JButtonAdd.setBackground(new java.awt.Color(51, 23, 113));
        JButtonAdd.setText("Add");
        JButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddActionPerformed(evt);
            }
        });
        jPanelPassengers.add(JButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 170, 50));

        JButtonEdit.setBackground(new java.awt.Color(51, 23, 113));
        JButtonEdit.setText("Edit");
        JButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditActionPerformed(evt);
            }
        });
        jPanelPassengers.add(JButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 150, 50));

        jPanelMain.add(jPanelPassengers, "card2");

        jPanelEdit.setBackground(new java.awt.Color(102, 102, 255));
        jPanelEdit.setMinimumSize(new java.awt.Dimension(1336, 700));
        jPanelEdit.setPreferredSize(new java.awt.Dimension(1336, 700));
        jPanelEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldID.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldID.setForeground(new java.awt.Color(255, 51, 51));
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jPanelEdit.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 40));

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID");
        jPanelEdit.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        jTextFieldFirstName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldFirstName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanelEdit.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, 40));

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("First name");
        jPanelEdit.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Last name");
        jPanelEdit.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 30));

        jTextFieldLastName.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldLastName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanelEdit.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, 40));

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Address");
        jPanelEdit.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 30));

        jTextFieldAddress.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAddress.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldAddress.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanelEdit.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 210, 40));

        JComboBoxState.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxState.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxState.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxState.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxState.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxState.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxState.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanelEdit.add(JComboBoxState, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 210, 40));

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Gender");
        jPanelEdit.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 20));

        JComboBoxGender.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxGender.setToolTipText("");
        JComboBoxGender.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxGender.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxGender.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxGender.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanelEdit.add(JComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 210, 40));

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Phone number");
        jPanelEdit.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 130, 30));

        jTextFieldPhoneNumber.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPhoneNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanelEdit.add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 210, 40));

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Passport number");
        jPanelEdit.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 150, 30));

        jTextFieldPassport.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldPassport.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextFieldPassport.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPassport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 153)));
        jPanelEdit.add(jTextFieldPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 210, 40));

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Date of birth");
        jPanelEdit.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jDateChooser.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserFocusLost(evt);
            }
        });
        jPanelEdit.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 210, 40));

        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanelEdit.add(jLabelPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 152, 123));

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("State");
        jPanelEdit.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, -1));

        JButtonAddPicutre.setBackground(new java.awt.Color(51, 23, 113));
        JButtonAddPicutre.setText("Chose a picture");
        JButtonAddPicutre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddPicutreActionPerformed(evt);
            }
        });
        jPanelEdit.add(JButtonAddPicutre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 200, 50));

        JButtonUpdate.setBackground(new java.awt.Color(51, 23, 113));
        JButtonUpdate.setText("Update");
        JButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonUpdateActionPerformed(evt);
            }
        });
        jPanelEdit.add(JButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 70));

        JButtonCancel.setBackground(new java.awt.Color(102, 0, 0));
        JButtonCancel.setText("Cancel");
        JButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelActionPerformed(evt);
            }
        });
        jPanelEdit.add(JButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 170, 50));

        jPanelMain.add(jPanelEdit, "card3");

        jPanelBookTicket.setBackground(new java.awt.Color(102, 102, 255));
        jPanelBookTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("To");
        jPanelBookTicket.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 53, 84, -1));

        JComboBoxFrom.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxFrom.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxFrom.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxFrom.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxFrom.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxFrom.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxFrom.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanelBookTicket.add(JComboBoxFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 93, 290, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From");
        jPanelBookTicket.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 53, 84, -1));

        JComboBoxTo.setBackground(new java.awt.Color(204, 204, 255));
        JComboBoxTo.setForeground(new java.awt.Color(0, 0, 0));
        JComboBoxTo.setColorArrow(new java.awt.Color(51, 0, 204));
        JComboBoxTo.setColorBorde(new java.awt.Color(204, 204, 255));
        JComboBoxTo.setColorFondo(new java.awt.Color(204, 204, 255));
        JComboBoxTo.setMinimumSize(new java.awt.Dimension(11, 31));
        JComboBoxTo.setPreferredSize(new java.awt.Dimension(94, 31));
        jPanelBookTicket.add(JComboBoxTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 93, 290, 40));

        jRadioButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonReturn.setText("Return trip");
        jRadioButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReturnActionPerformed(evt);
            }
        });
        jPanelBookTicket.add(jRadioButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1, -1, -1));

        jRadioButtonOneWay.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonOneWay.setText("One way");
        jRadioButtonOneWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOneWayActionPerformed(evt);
            }
        });
        jPanelBookTicket.add(jRadioButtonOneWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 1, -1, -1));

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
        jPanelBookTicket.add(jTextFieldPromoCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 5, 166, 23));

        jDateChooserReturn.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooserReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserReturnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserReturnFocusLost(evt);
            }
        });
        jPanelBookTicket.add(jDateChooserReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 240, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Depart");
        jPanelBookTicket.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 84, -1));

        jDateChooserDepart.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooserDepart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooserDepartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooserDepartFocusLost(evt);
            }
        });
        jPanelBookTicket.add(jDateChooserDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 240, 50));

        jLabelReturn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelReturn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReturn.setText("Return");
        jPanelBookTicket.add(jLabelReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 84, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Passengers");
        jPanelBookTicket.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        jSpinFieldPassengers.setBackground(new java.awt.Color(204, 204, 255));
        jPanelBookTicket.add(jSpinFieldPassengers, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 81, 20));

        JButtonSearch.setBackground(new java.awt.Color(51, 23, 113));
        JButtonSearch.setText("Search");
        JButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSearchActionPerformed(evt);
            }
        });
        jPanelBookTicket.add(JButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 139, 51));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(51, 51, 255));
        jTable1.setRowHeight(60);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanelBookTicket.add(jPanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 610, 80));

        JButtonDetails.setBackground(new java.awt.Color(51, 23, 113));
        JButtonDetails.setText("DETAILS");
        JButtonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonDetailsActionPerformed(evt);
            }
        });
        jPanelBookTicket.add(JButtonDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Accessories/Avion.jpg"))); // NOI18N
        jPanelBookTicket.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 600, 700));

        jPanelMain.add(jPanelBookTicket, "card4");

        jPanelWelcomeScreen.setBackground(new java.awt.Color(102, 102, 255));
        jPanelWelcomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUser.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("WELCOME, ");
        jPanelWelcomeScreen.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 310, 50));

        jPanelMain.add(jPanelWelcomeScreen, "card5");

        javax.swing.GroupLayout jPanelAllBookedTicketsLayout = new javax.swing.GroupLayout(jPanelAllBookedTickets);
        jPanelAllBookedTickets.setLayout(jPanelAllBookedTicketsLayout);
        jPanelAllBookedTicketsLayout.setHorizontalGroup(
            jPanelAllBookedTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1336, Short.MAX_VALUE)
        );
        jPanelAllBookedTicketsLayout.setVerticalGroup(
            jPanelAllBookedTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanelMain.add(jPanelAllBookedTickets, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jmenuPassengers.setText("Passengers");

        jMenuItemPassengers.setText("Search and Edit Passenger");
        jMenuItemPassengers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPassengersActionPerformed(evt);
            }
        });
        jmenuPassengers.add(jMenuItemPassengers);

        jMenuBar1.add(jmenuPassengers);

        jMenu2.setText("Tickets");

        jMenuItemBookTicket.setText("Book ticket");
        jMenuItemBookTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBookTicketActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemBookTicket);

        jMenuItemBookedTickets.setText("Booked Tickets");
        jMenuItemBookedTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBookedTicketsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemBookedTickets);

        jMenuBar1.add(jMenu2);

        jMenuFlight.setText("Flight");

        jMenuItemAddFlight.setText("Add Flight");
        jMenuItemAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddFlightActionPerformed(evt);
            }
        });
        jMenuFlight.add(jMenuItemAddFlight);

        jMenuBar1.add(jMenuFlight);

        jMenuAirline.setText("Airline");

        jMenuItem5.setText("Create");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuAirline.add(jMenuItem5);

        jMenuBar1.add(jMenuAirline);

        jMenuPassenger.setText("Passenger");

        jMenuItem6.setText("Create");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuPassenger.add(jMenuItem6);

        jMenuBar1.add(jMenuPassenger);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed

    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                TableRowSorter<PassengerTableModel> trs = new TableRowSorter<>(new PassengerTableModel(passengers));
                jTable.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(jTextFieldSearch.getText())));
            }

            @Override
            public void keyPressed(KeyEvent e) {
                TableRowSorter<PassengerTableModel> trs = new TableRowSorter<>(new PassengerTableModel(passengers));
                jTable.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(jTextFieldSearch.getText())));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                TableRowSorter<PassengerTableModel> trs = new TableRowSorter<>(new PassengerTableModel(passengers));
                jTable.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(jTextFieldSearch.getText())));
            }
        });
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void JButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRemoveActionPerformed

        int selectedPassenger = jTable.getSelectedRow();

        if(selectedPassenger == -1){
            JOptionPane.showMessageDialog(this,
                "Please select the passenger to delete",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Passenger passenger = passengers.get(selectedPassenger);
        int id = Integer.parseInt(passenger.getId());
        int removed = Controller.getInstace().removePassenger(id);

        if(removed == 1){
            JOptionPane.showMessageDialog(this,
                "Passenger succesfuly deleted",
                "", JOptionPane.INFORMATION_MESSAGE);
        }
        
        fillTable();
    }//GEN-LAST:event_JButtonRemoveActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void JButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddActionPerformed
        System.out.println("button add pressed");
        //        AddPassengerFormRemake apf = new AddPassengerFormRemake(this);
        //        apf.setVisible(true);
        //        apf.setLocationRelativeTo(null);
    }//GEN-LAST:event_JButtonAddActionPerformed

    private void jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserFocusGained

    private void jDateChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooserFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserFocusLost

    private void JButtonAddPicutreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddPicutreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonAddPicutreActionPerformed

    private void JButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonUpdateActionPerformed

    private void JButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonCancelActionPerformed

    private void jRadioButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReturnActionPerformed
        jDateChooserReturn.setVisible(true);
        jLabelReturn.setVisible(true);
    }//GEN-LAST:event_jRadioButtonReturnActionPerformed

    private void jRadioButtonOneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOneWayActionPerformed
        jDateChooserReturn.setVisible(false);
        jLabelReturn.setVisible(false);
    }//GEN-LAST:event_jRadioButtonOneWayActionPerformed

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

    private void JButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditActionPerformed
        
        int selectedRow = jTable.getSelectedRow();
        System.out.println(selectedRow);
        if(selectedRow >= 0){
            int modelRowIndex = jTable.convertRowIndexToModel(selectedRow);
            Passenger passenger = passengers.get(modelRowIndex);
//            jPanelMain.removeAll();
//            jPanelMain.add(new TestPanel2(passenger));
//            jPanelMain.repaint();
//            jPanelMain.revalidate();
            
        }else{
            JOptionPane.showMessageDialog(this,
                "Please select the passenger",
                "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_JButtonEditActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        LogInForm lif = new LogInForm();
        lif.setVisible(true);
        lif.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItemBookTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBookTicketActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(new BookTicketPanel(logedInPassenger));
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_jMenuItemBookTicketActionPerformed

    private void jMenuItemPassengersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPassengersActionPerformed
        try {
            jPanelPassengers = new AllPassengersPanel();
            jPanelMain.removeAll();
            jPanelMain.add(jPanelPassengers);
            jPanelMain.repaint();
            jPanelMain.revalidate();
        } catch (ParseException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItemPassengersActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItemBookedTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBookedTicketsActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(new AllBookedTicketsPanel());
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_jMenuItemBookedTicketsActionPerformed

    private void jMenuItemAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddFlightActionPerformed
        AddFlightForm aff = new AddFlightForm();
        aff.setVisible(true);
        aff.setLocationRelativeTo(null);
        aff.setResizable(false);
        aff.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItemAddFlightActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonAdd;
    private rojerusan.RSMaterialButtonRectangle JButtonAddPicutre;
    private rojerusan.RSMaterialButtonRectangle JButtonCancel;
    private rojerusan.RSMaterialButtonRectangle JButtonDetails;
    private rojerusan.RSMaterialButtonRectangle JButtonEdit;
    private rojerusan.RSMaterialButtonRectangle JButtonRemove;
    private rojerusan.RSMaterialButtonRectangle JButtonSearch;
    private rojerusan.RSMaterialButtonRectangle JButtonUpdate;
    private rojerusan.RSComboMetro JComboBoxFrom;
    private rojerusan.RSComboMetro JComboBoxGender;
    private rojerusan.RSComboMetro JComboBoxState;
    private rojerusan.RSComboMetro JComboBoxTo;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private com.toedter.calendar.JDateChooser jDateChooserDepart;
    private com.toedter.calendar.JDateChooser jDateChooserReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAirline;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFlight;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemAddFlight;
    private javax.swing.JMenuItem jMenuItemBookTicket;
    private javax.swing.JMenuItem jMenuItemBookedTickets;
    private javax.swing.JMenuItem jMenuItemPassengers;
    private javax.swing.JMenu jMenuPassenger;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAllBookedTickets;
    private javax.swing.JPanel jPanelBookTicket;
    private javax.swing.JPanel jPanelEdit;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelPassengers;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JPanel jPanelWelcomeScreen;
    private javax.swing.JRadioButton jRadioButtonOneWay;
    private javax.swing.JRadioButton jRadioButtonReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.components.JSpinField jSpinFieldPassengers;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPassport;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldPromoCode;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JMenu jmenuPassengers;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        
    }

    private Flight searchFlight() {
        return null;
    }

    private void loadForm() {
        if(logedInPassenger == null){
            jMenuPassenger.setVisible(false);
            jMenuItemBookTicket.setVisible(false);
            jMenuAirline.setText(logedInAirline.getName());
            jLabelUser.setText("WELCOME, " + logedInAirline.getName() + "!");        
        }
        
        if(logedInAirline == null){
            jMenuAirline.setVisible(false);
            jMenuItemBookedTickets.setVisible(false);
            jmenuPassengers.setVisible(false);
            jMenuFlight.setVisible(false);
            jMenuPassenger.setText(logedInPassenger.getFirstName());
            jLabelUser.setText("WELCOME, " + logedInPassenger.getFirstName() + "!");
        }
        jPanelMain.removeAll();
        jPanelMain.add(jPanelWelcomeScreen);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }
}
