/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay Kumar
 */
public class DepositBalance extends javax.swing.JFrame {

    /**
     * Creates new form DepositBalance
     */
    public DepositBalance() {
        initComponents();
        //For date
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        jTextField1.setText(sf.format(date));
        jTextField2.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deposit Form");
        setMinimumSize(new java.awt.Dimension(485, 415));
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 20, 160, 30);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 20, 40, 20);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 80, 110, 20);

        jTextField2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 80, 200, 30);

        jTextField3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 130, 200, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 60, 20);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Old Balance");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 180, 90, 20);

        jTextField4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(140, 180, 200, 30);

        jLabel15.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mode");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 230, 35, 20);

        jComboBox1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque", "RTGS" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 230, 200, 30);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Deposit Amount");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 280, 103, 20);

        jTextField5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(140, 280, 200, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 80, 100, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 330, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/deposit.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String acc=jTextField2.getText();
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","password");
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from account where Accountno='"+acc+"';");
        if(rs.next())
        {
           String name=rs.getString("Name");
           String bal=rs.getString("Balance");
           jTextField3.setText(name);
           jTextField4.setText(bal);
        }
        else
            JOptionPane.showMessageDialog(this, "Record does not exist.");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    double oldbal=Double.parseDouble(jTextField4.getText());
    double dep=Double.parseDouble(jTextField5.getText());
    double newbal=oldbal+dep;
    String date, mode;
    mode=jComboBox1.getSelectedItem().toString();
    date=jTextField1.getText();
    String acc=jTextField2.getText();
    String query="Update account set Balance="+newbal+" where Accountno='"+acc+"';";
    String query2="Insert into balancesheet values('"+acc+"', '"+date+"', '"+mode+"', "+dep+", NULL, "+newbal+", NULL);";
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","password");
        Statement st=conn.createStatement();
        int rs=st.executeUpdate(query);
        int rs2=st.executeUpdate(query2);
            if(rs2==1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Sheet Updated Successfully.");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jComboBox1.setSelectedIndex(0);
                }
                else
                    JOptionPane.showMessageDialog(this, "Something is wrong.");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepositBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}