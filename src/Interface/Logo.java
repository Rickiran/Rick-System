/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;


import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.sql.*;
import Classes.Connect;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Logo extends javax.swing.JFrame {

 public static String user="";
 String pass="";
 
    public Logo() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(true);
        setSize(400,500);
        setTitle("Access to the system");
        ImageIcon wallpaper= new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon ic=new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(), jlabel_wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jlabel_wallpaper.setIcon(ic);
        this.repaint();
  
        ImageIcon wallpaper_logo =new ImageIcon("src/images/DS.png");
        Icon icon=new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_wall.getWidth(),jLabel_wall.getHeight(),Image.SCALE_DEFAULT));
        jLabel_wall.setIcon(icon);
        this.repaint();
    }
    
    @Override
    public Image getIconImage(){
    
    Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
    return retValue;        
    }/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_wall = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_wall, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 270, 270));
        jLabel_wall.getAccessibleContext().setAccessibleDescription("");

        txt_user.setBackground(new java.awt.Color(153, 153, 255));
        txt_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 230, -1));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 230, 20));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 410, 220, -1));

        jLabel1.setText("         Under copyright Rick Resources ®");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 240, 20));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        user=txt_user.getText().trim();
        pass=txt_password.getText().trim();
        
        if(!user.equals("") || !pass.equals("")){
            try{
                
                Connection cn=Connect.Cnnct();
                PreparedStatement ps=cn.prepareStatement( "select tipo_nivel,estatus from usuarios where username='"+ user + "' and password='" + pass +"'");
                
                 ResultSet rs=ps.executeQuery();
                 
                 if(rs.next()){
                     String tipo_nivel=rs.getString("tipo_nivel");
                     String estatus=rs.getString("estatus");
                     
                     if(tipo_nivel.equalsIgnoreCase("Administrator") && estatus.equalsIgnoreCase("Active")){
                         dispose();
                         new Administrator().setVisible(true);
                     }
                     else if(tipo_nivel.equalsIgnoreCase("Technician") && estatus.equalsIgnoreCase("Active")){
                         dispose();
                         new Technician().setVisible(true);
                     }
                     else if(tipo_nivel.equalsIgnoreCase("Taker") && estatus.equalsIgnoreCase("Active")){
                         dispose();
                         new Taker().setVisible(true);
                     }
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Error , level type is not found out please enter a valid level type");
                      txt_user.setText("");
                      txt_password.setText("");
                 }
            
            }
            
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "You could not connect to the database please contact with your administrator");
            }
        }
        else{
                JOptionPane.showMessageDialog(null, "You must enter a user and/or Password please!" );
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
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_wall;
    private javax.swing.JLabel jlabel_wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void setResizeble(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
