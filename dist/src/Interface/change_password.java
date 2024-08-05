/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import Classes.Connect;
import java.awt.Color;
import javax.swing.WindowConstants;
/**
 *
 * @author dsoto
 */
public class change_password extends javax.swing.JFrame {

    String user;
    String user_updated="";
    
    public change_password() {
        initComponents();
        setSize(400, 300);
        setResizable(true);
        this.setLocationRelativeTo(null);
        user=Logo.user;
        user_updated=Manage_User.user_updated;
        setTitle("Changing of  password to :" + user_updated );
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);    
        ImageIcon wallpaper= new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon ic=new ImageIcon(wallpaper.getImage().getScaledInstance(jl_wallpaper.getWidth(), jl_wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jl_wallpaper.setIcon(ic);
        this.repaint();
    }

    @Override
    public Image getIconImage(){
    
    Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
    return retValue;        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jb_rest = new javax.swing.JButton();
        jt_cpass = new javax.swing.JTextField();
        jt_pass = new javax.swing.JTextField();
        jl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PASSWORD CHANGING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 140, -1));

        jLabel2.setText("Confirm Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, -1));

        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, -1));

        jb_rest.setText("Restore Password");
        jb_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_restActionPerformed(evt);
            }
        });
        getContentPane().add(jb_rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, -1));

        jt_cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_cpassActionPerformed(evt);
            }
        });
        getContentPane().add(jt_cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, -1));

        jt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_passActionPerformed(evt);
            }
        });
        getContentPane().add(jt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, -1));
        getContentPane().add(jl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_cpassActionPerformed

    private void jt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_passActionPerformed

    private void jb_restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_restActionPerformed
    int value=0;   
        
        try{
            Connection cn=Connect.Cnnct();
            PreparedStatement ps=cn.prepareStatement("update usuarios set password=? where username='"+user_updated+"'");
            if(jt_cpass.getText().trim().equals(jt_pass.getText().trim())){
               System.out.println("Passwords are okey");
               jt_pass.setBackground(Color.green);
               jt_cpass.setBackground(Color.green);
               value++;
            
            
            if(value>0){
            ps.setString(1,jt_cpass.getText().trim());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Successfull update");
                    }
            this.dispose();
            }
            else{
                jt_pass.setBackground(Color.red);
               jt_cpass.setBackground(Color.red);
               JOptionPane.showMessageDialog(null,"Passwords are not the same");
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "An Error pop ups to update the password please try again");
        }
    }//GEN-LAST:event_jb_restActionPerformed

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
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_rest;
    private javax.swing.JLabel jl_wallpaper;
    private javax.swing.JTextField jt_cpass;
    private javax.swing.JTextField jt_pass;
    // End of variables declaration//GEN-END:variables
}
