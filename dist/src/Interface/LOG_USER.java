/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.sql.*;
import Classes.Connect;
import static Interface.Manage_User.user_updated;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LOG_USER extends javax.swing.JFrame {

   String user;
   String user_name;
   String type_level;
   public static String user_updated="";
   public static int ID=0;
   DefaultTableModel model=new DefaultTableModel();
   
    public LOG_USER() {
        initComponents();
        user=Logo.user;
        this.setLocationRelativeTo(null);
        this.setTitle("Session of :" + user);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);    
        ImageIcon wallpaper= new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon ic=new ImageIcon(wallpaper.getImage().getScaledInstance(jl_wallpaper.getWidth(), jl_wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jl_wallpaper.setIcon(ic);
        this.repaint();
        
        try{
            Connection cn=Connect.Cnnct();
            PreparedStatement ps=cn.prepareStatement("select id_cliente,nombre_cliente,mail_cliente,tel_cliente,ultima_modificacion from clientes");
            ResultSet rs=ps.executeQuery();
            
            jtable=new JTable(model);
            jScrollPane1.setViewportView(jtable);
            
            model.addColumn("");
            model.addColumn("Nombre");
            model.addColumn("em@il");
            model.addColumn("Telephone");
            model.addColumn("LastTimeModified");
            
              while(rs.next()){
                Object [] fila=new Object[5];
                
                for(int i=0;i<5;i++){
                    fila[i]=rs.getObject(i+1);
                }
                model.addRow(fila);
                
              }
              cn.close();
              
              
            }
        catch(SQLException e){
            System.out.println("Error to fill the table " + e);
            JOptionPane.showMessageDialog(null,"Error to fill the table");
        }
        
        jtable.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int row_point=jtable.rowAtPoint(e.getPoint());
                int column_point=0;
                
                if(row_point>-1){
                    ID=(int)model.getValueAt(row_point, column_point);
                    JOptionPane.showMessageDialog(null, "ID number selected is  :" + ID);
                    Customer_Info cinf=new Customer_Info();
                    cinf.setVisible(true);
                    
                }
            }
        });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 118, 582, 157));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                    LOG USER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 280, -1));
        getContentPane().add(jl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 360));

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
            java.util.logging.Logger.getLogger(LOG_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOG_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOG_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOG_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOG_USER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_wallpaper;
    private javax.swing.JTable jtable;
    // End of variables declaration//GEN-END:variables
}