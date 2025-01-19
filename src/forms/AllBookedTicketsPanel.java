
package forms;

import controller.Controller;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import model.Passenger;
import model.Ticket;
import model.TicketsTableModel;

public class AllBookedTicketsPanel extends javax.swing.JPanel {

    private List<Ticket> tickets;
    
    public AllBookedTicketsPanel() {
        initComponents();
        fillPanel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelBackground = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JButtonRemove = new rojerusan.RSMaterialButtonRectangle();
        JButtonEdit = new rojerusan.RSMaterialButtonRectangle();
        jTextFieldEmail = new javax.swing.JTextField();

        jPanelBackground.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setBackground(new java.awt.Color(204, 204, 255));
        jTable.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1290, 510));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search the tickets");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

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
        jPanel2.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 240, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        JButtonRemove.setBackground(new java.awt.Color(51, 23, 113));
        JButtonRemove.setText("Delete");
        JButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(JButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 170, 50));

        JButtonEdit.setBackground(new java.awt.Color(51, 23, 113));
        JButtonEdit.setText("Edit");
        JButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditActionPerformed(evt);
            }
        });
        jPanel2.add(JButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 150, 50));

        jTextFieldEmail.setBackground(new java.awt.Color(102, 102, 255));
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, 40));

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1336, Short.MAX_VALUE)
            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 667, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed

    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                TableRowSorter<TicketsTableModel> trs = new TableRowSorter<>(new TicketsTableModel(tickets));
                jTable.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(jTextFieldSearch.getText())));
            }

            @Override
            public void keyPressed(KeyEvent e) {
                TableRowSorter<TicketsTableModel> trs = new TableRowSorter<>(new TicketsTableModel(tickets));
                jTable.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(jTextFieldSearch.getText())));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                TableRowSorter<TicketsTableModel> trs = new TableRowSorter<>(new TicketsTableModel(tickets));
                jTable.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(jTextFieldSearch.getText())));
            }
        });
        
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void JButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRemoveActionPerformed
        int selectedRow = jTable.getSelectedRow();
        
        if(selectedRow  == -1){
            JOptionPane.showMessageDialog(this,
                    "Please select a ticket to remove", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Ticket ticket = tickets.get(selectedRow);
        
        int id = ticket.getId();
        boolean isRemoved = Controller.getInstace().removeTicket(id);
        
        if(isRemoved){
            JOptionPane.showMessageDialog(this,
                    "Ticket removed succesfuly", "", JOptionPane.INFORMATION_MESSAGE);
            fillPanel();
        }
    }//GEN-LAST:event_JButtonRemoveActionPerformed

    private void JButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditActionPerformed
        int selectedRow = jTable.getSelectedRow();

        if(selectedRow >= 0){
            int modelRowIndex = jTable.convertRowIndexToModel(selectedRow);
            Ticket ticket = tickets.get(modelRowIndex);
            EditTicketForm etf = new EditTicketForm(ticket,this);
            etf.setVisible(true);
            etf.setLocationRelativeTo(null);
            etf.setResizable(false);
            etf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }else{
            JOptionPane.showMessageDialog(this,
                "Please select the passenger",
                "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_JButtonEditActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle JButtonEdit;
    private rojerusan.RSMaterialButtonRectangle JButtonRemove;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    public void fillPanel() {
        tickets = Controller.getInstace().getTickets();
        TicketsTableModel ttm = new TicketsTableModel(tickets);
        jTable.setModel(ttm);
       
        jTable.setRowHeight(30);
        
        for(int i = 0 ; i < jTable.getColumnCount(); i++){
            jTable.getColumnModel().getColumn(i).setResizable(false);
        }
        jTable.getTableHeader().setReorderingAllowed(false);
    }
}
