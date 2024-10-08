/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Ricardo Orihuela
 */
public class information_about_of extends javax.swing.JFrame {

    /**
     * Creates new form about_to
     */
    public information_about_of() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        ImageIcon wallpaper= new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon ic=new ImageIcon(wallpaper.getImage().getScaledInstance(jl_wallpaper.getWidth(), jl_wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jl_wallpaper.setIcon(ic);
        this.repaint();
        jl_info.setText("A Development made by Ricardo Orihuela in collaboration with Ernesto G. whose ");
        jl_info2.setText("contribution in java Intermediate Level was deeply important to design, develop");
        jl_info3.setText("and test always focusing up Ricardo investigation work related to **System ");
        jl_info4.setText("Information for Registry and Manage Enterprise Information**");
        
    }

     @Override
    public Image getIconImage(){
    
    Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
    return retValue;        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jl_info = new javax.swing.JLabel();
        jl_info2 = new javax.swing.JLabel();
        jl_info3 = new javax.swing.JLabel();
        jl_info4 = new javax.swing.JLabel();
        jl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INFORMATION RELATED TO THIS APPLICATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 20));

        jl_info.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 540, 20));

        jl_info2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_info2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl_info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 90, 550, 20));

        jl_info3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_info3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl_info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 110, 530, 20));

        jl_info4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_info4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl_info4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 130, 530, 20));
        getContentPane().add(jl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(information_about_of.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(information_about_of.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(information_about_of.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(information_about_of.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new information_about_of().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jl_info;
    private javax.swing.JLabel jl_info2;
    private javax.swing.JLabel jl_info3;
    private javax.swing.JLabel jl_info4;
    private javax.swing.JLabel jl_wallpaper;
    // End of variables declaration//GEN-END:variables
}
