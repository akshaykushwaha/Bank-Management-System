/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Akshay Kumar
 */
public class mainPage extends javax.swing.JFrame {

    /**
     * Creates new form mainPage
     */
    public mainPage() {
        initComponents();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login (Main Page)");
        setMinimumSize(new java.awt.Dimension(445, 402));
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 140, 170, 30);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("User Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 150, 90, 20);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 230, 70, 20);

        jPasswordField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(180, 220, 170, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 290, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/mainpage.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String user, pass, name="";
    user=jTextField1.getText();
    pass= new String(jPasswordField1.getPassword());
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","password");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from user where User='"+user+"' and Password='"+pass+"';");
        if(rs.next())
        {
            String s1=rs.getString("UserType");
            String s2=rs.getString("Name");
            if (s1.equals("Admin"))
            {
                adminPanel p=new adminPanel(s2);
                p.setVisible(true);
                this.setVisible(false);
            }
            else if (s1.equals("Employee"))
            {
                employeePanel p=new employeePanel(s2);
                p.setVisible(true);
                this.setVisible(false);
            }
            else
               JOptionPane.showMessageDialog(this, "Something is wrong."); 
        }
        else
            JOptionPane.showMessageDialog(this, "Either User Name or Password is wrong."); 
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}