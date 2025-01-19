
package forms;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.text.ParseException;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableRowSorter;
import model.Passenger;


public class SearchAndEditPassengerForm extends javax.swing.JFrame {
    private List<Passenger> passengers;
    
    public SearchAndEditPassengerForm() throws ParseException {
        initComponents();
        tableDesign();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMaterialButtonRectangleBeanInfo1 = new rojerusan.RSMaterialButtonRectangleBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JButtonRemove = new rojerusan.RSMaterialButtonRectangle();
        JButtonCancel = new rojerusan.RSMaterialButtonRectangle();
        JButtonEdit = new rojerusan.RSMaterialButtonRectangle();
        jTextFieldEmail = new javax.swing.JTextField();
        JButtonAdd = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1080, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search the passenger");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

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
        jPanel1.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 240, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        JButtonRemove.setBackground(new java.awt.Color(51, 23, 113));
        JButtonRemove.setText("Delete");
        JButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 170, 50));

        JButtonCancel.setBackground(new java.awt.Color(102, 0, 0));
        JButtonCancel.setText("Cancel");
        JButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, 150, 50));

        JButtonEdit.setBackground(new java.awt.Color(51, 23, 113));
        JButtonEdit.setText("Edit");
        JButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 150, 50));

        jTextFieldEmail.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, 40));

        JButtonAdd.setBackground(new java.awt.Color(51, 23, 113));
        JButtonAdd.setText("Add");
        JButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 170, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditActionPerformed
        
        int selectedRow = jTable.getSelectedRow();
        
        if(selectedRow >= 0){
            int modelRowIndex = jTable.convertRowIndexToModel(selectedRow);
            
            Passenger passenger = passengers.get(modelRowIndex);
//            EditPassengerRemakeForm epf = new EditPassengerRemakeForm(passenger,this);
//            epf.setVisible(true);
//            epf.setLocationRelativeTo(null);
//            epf.setResizable(false);
//            epf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }else{
            JOptionPane.showMessageDialog(this,
                    "Please select the passenger", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_JButtonEditActionPerformed

    private void JButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonCancelActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

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

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed

    }//GEN-LAST:event_jTextFieldSearchActionPerformed

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
        try {
            fillTable();
        } catch (ParseException ex) {
            System.out.println("Error while fetching the list of passengers");
        }
    }//GEN-LAST:event_JButtonRemoveActionPerformed

    private void JButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddActionPerformed
//        AddPassengerFormRemake apf = new AddPassengerFormRemake(this);
//        apf.setVisible(true);
//        apf.setLocationRelativeTo(null);
    }//GEN-LAST:event_JButtonAddActionPerformed
   
    
    public void SetTableModel(PassengerTableModel model){
        jTable.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonAdd;
    private rojerusan.RSMaterialButtonRectangle JButtonCancel;
    private rojerusan.RSMaterialButtonRectangle JButtonEdit;
    private rojerusan.RSMaterialButtonRectangle JButtonRemove;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSearch;
    private rojerusan.RSMaterialButtonRectangleBeanInfo rSMaterialButtonRectangleBeanInfo1;
    // End of variables declaration//GEN-END:variables

    private void tableDesign() {
        jTable.getTableHeader().setOpaque(false);
        Color darkPurple = Color.decode("#331771");
        jTable.getTableHeader().setBackground(darkPurple);
        jTable.getTableHeader().setFont(new Font("Segoe UI Semilign", Font.BOLD, 18));
        jTable.getTableHeader().setForeground(Color.white);
    }

    public void fillTable() throws ParseException {
        passengers = Controller.getInstace().returnAllPassengers();
        PassengerTableModel ptm = new PassengerTableModel(passengers);
        jTable.setModel(ptm);
        jTable.getColumn("Picture").setCellRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setOpaque(false);
                
                JLabel label = new JLabel((ImageIcon) value);
                label.setHorizontalAlignment(SwingConstants.CENTER); 
                label.setIcon(createCircularImageIcon((ImageIcon) value));
                panel.add(label);
                
                label.setPreferredSize(new Dimension(10, 10));
                return panel;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
        });
        
        jTable.setRowHeight(60);
        
        for(int i = 0 ; i < jTable.getColumnCount(); i++){
            jTable.getColumnModel().getColumn(i).setResizable(false);
        }
        jTable.getTableHeader().setReorderingAllowed(false);
    }
    
    
    private ImageIcon createCircularImageIcon(ImageIcon originalIcon) {
        Image img = originalIcon.getImage();
        int width = originalIcon.getIconWidth();
        int height = originalIcon.getIconHeight();

        
        
        int size = Math.min(width, height);  
        
        BufferedImage circularImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = circularImage.createGraphics();

        g.setClip(new Ellipse2D.Double(30,35,60,60));
        g.drawImage(img, 0, 0, null);
        g.dispose();

        return new ImageIcon(circularImage);
    }
    
}
