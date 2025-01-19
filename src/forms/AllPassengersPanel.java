
package forms;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
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
import model.Flight;
import model.Passenger;

public class AllPassengersPanel extends javax.swing.JPanel {
    private List<Passenger> passengers;

    public AllPassengersPanel() throws ParseException {
        initComponents();
        tableDesign();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JButtonRemove = new rojerusan.RSMaterialButtonRectangle();
        JButtonEdit = new rojerusan.RSMaterialButtonRectangle();
        jTextFieldEmail = new javax.swing.JTextField();
        JButtonAdd = new rojerusan.RSMaterialButtonRectangle();

        setPreferredSize(new java.awt.Dimension(1336, 700));
        setSize(new java.awt.Dimension(1336, 700));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1290, 510));

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
        jPanel1.add(JButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 170, 50));

        JButtonEdit.setBackground(new java.awt.Color(51, 23, 113));
        JButtonEdit.setText("Edit");
        JButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 150, 50));

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
        jPanel1.add(JButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1336, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
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
        try {
            fillTable();
        } catch (ParseException ex) {
            System.out.println("Error while fetching the list of passengers");
        }
    }//GEN-LAST:event_JButtonRemoveActionPerformed

    private void JButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditActionPerformed

        int selectedRow = jTable.getSelectedRow();

        if(selectedRow >= 0){
            int modelRowIndex = jTable.convertRowIndexToModel(selectedRow);
            Passenger passenger = passengers.get(modelRowIndex);
            EditPassengerRemakeForm epf = new EditPassengerRemakeForm(passenger,this);
            epf.setVisible(true);
            epf.setLocationRelativeTo(null);
            epf.setResizable(false);
            epf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }else{
            JOptionPane.showMessageDialog(this,
                "Please select the passenger",
                "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_JButtonEditActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void JButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddActionPerformed
        AddPassengerFormRemake apf = new AddPassengerFormRemake(this);
        apf.setVisible(true);
        apf.setLocationRelativeTo(null);
        apf.setResizable(false);
        apf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_JButtonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonAdd;
    private rojerusan.RSMaterialButtonRectangle JButtonEdit;
    private rojerusan.RSMaterialButtonRectangle JButtonRemove;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    private Flight searchFlight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                //label.setIcon(createCircularImageIcon((ImageIcon) value));
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

    private void tableDesign() {
        jTable.getTableHeader().setOpaque(false);
        Color darkPurple = Color.decode("#331771");
        jTable.getTableHeader().setBackground(darkPurple);
        jTable.getTableHeader().setFont(new Font("Segoe UI Semilign", Font.BOLD, 18));
        jTable.getTableHeader().setForeground(Color.white);
    }

    private void dispose() {
       
    }

    private void switchPanel(Container parentContainer, JPanel newPanel) {
        parentContainer.removeAll(); 
        parentContainer.add(newPanel); 
        parentContainer.revalidate(); 
        parentContainer.repaint();
    }
}
