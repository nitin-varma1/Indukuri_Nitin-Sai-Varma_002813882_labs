/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitin
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountJPanel
     */
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    public ManageAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.accountDirectory = accountDirectory;
        this.userProcessContainer = userProcessContainer;
        //Debug Code
        for(Account a: accountDirectory.getAccountList())
            System.out.println(a.getBankName());
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        txtAccountNumber = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bank Name", "Routing Number", "Account Number", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAccount);
        if (tblAccount.getColumnModel().getColumnCount() > 0) {
            tblAccount.getColumnModel().getColumn(0).setResizable(false);
            tblAccount.getColumnModel().getColumn(1).setResizable(false);
            tblAccount.getColumnModel().getColumn(2).setResizable(false);
            tblAccount.getColumnModel().getColumn(3).setResizable(false);
        }

        btnSearch.setText("Search Account");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("(Only Numbers)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnViewDetails)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteAccount)
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAccount.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the account details?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Account account = (Account) tblAccount.getValueAt(selectedRow, 0);
                accountDirectory.deleteAccount(account);
                populateTable();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select a Row!","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow  = tblAccount.getSelectedRow();
        if(selectedRow<0)
            JOptionPane.showMessageDialog(null, "Please Select a Row!", "Warning", JOptionPane.WARNING_MESSAGE);
        else{
            Account account = (Account) tblAccount.getValueAt(selectedRow, 0);
            ViewAccountJPanel panel = new ViewAccountJPanel(userProcessContainer, account);
            userProcessContainer.add("ViewAccountJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try{
        if(!txtAccountNumber.getText().equals("")){
            Account result = accountDirectory.searchAccount(Integer.parseInt(txtAccountNumber.getText()));
            if(result == null)
                JOptionPane.showMessageDialog(null, "Account number you entered doesn't exist","Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                ViewAccountJPanel panel = new ViewAccountJPanel(userProcessContainer, result);
                userProcessContainer.add("ViewAccountJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Incorrect format entry", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTextField txtAccountNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel table = (DefaultTableModel) tblAccount.getModel();
        table.setRowCount(0);
        for(Account account: accountDirectory.getAccountList()){
            Object[] row = new Object[4];
            row[0] = account;
            row[1] = account.getRoutingNumber();
            row[2] = account.getAccountNumber();
            row[3] = account.getBalance();
            
            table.addRow(row);
        }
    }
}
