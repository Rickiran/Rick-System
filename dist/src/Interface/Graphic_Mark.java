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
import javax.swing.WindowConstants;
import java.sql.*;
import Classes.Connect;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Ricardo Orihuela
 */
public class Graphic_Mark extends javax.swing.JFrame {
String user="";
int [] v_mark_q=new int[8];
String [] v_mark_n=new String[8];

int hp,lenovo,dell,acer,apple,brother,asus,allenware;

    
    public Graphic_Mark() {
        initComponents();
        this.setLocationRelativeTo(null);
        user=Logo.user;
        setTitle("Technician Session - User :" + user);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);    
        ImageIcon wallpaper= new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon ic=new ImageIcon(wallpaper.getImage().getScaledInstance(jl_wallpaper.getWidth(), jl_wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jl_wallpaper.setIcon(ic);
        this.repaint();
        
        try{
          Connection cn=Connect.Cnnct();
          PreparedStatement ps=cn.prepareStatement("select marca,count(marca) as Marcas from equipos group by marca");
          ResultSet rs=ps.executeQuery();
          
          if(rs.next()){
              int position=0;
              do{
                  v_mark_n[position]=rs.getString(1);
                  v_mark_q[position]=rs.getInt(2);
                  
                  if(v_mark_n[position].equalsIgnoreCase("Acer")){
                      acer=v_mark_q[position];
                  } else if(v_mark_n[position].equalsIgnoreCase("Allenware")){
                      allenware=v_mark_q[position];
                  } else if(v_mark_n[position].equalsIgnoreCase("Apple")){
                      apple=v_mark_q[position];
                  } else if(v_mark_n[position].equalsIgnoreCase("Asus")){
                      asus=v_mark_q[position];
                  } else if(v_mark_n[position].equalsIgnoreCase("Brother")){
                      brother=v_mark_q[position];
                  } else if(v_mark_n[position].equalsIgnoreCase("Dell")){
                      dell=v_mark_q[position];
                  } else if(v_mark_n[position].equalsIgnoreCase("HP")){
                      hp=v_mark_q[position];
                  } else if(v_mark_n[position].equalsIgnoreCase("Lenovo")){
                      lenovo=v_mark_q[position];
                  }
                  position++;
              }
              while(rs.next());
          }
          
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Please contact with your administrator");
        }    
    }
    @Override
     
     public Image getIconImage(){
         Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
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

        jLabel1 = new javax.swing.JLabel();
        jl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MARK GRAPHIC");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 180, 40));
        getContentPane().add(jl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));

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
            java.util.logging.Logger.getLogger(Graphic_Mark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphic_Mark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphic_Mark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphic_Mark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphic_Mark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jl_wallpaper;
    // End of variables declaration//GEN-END:variables

@Override

public void paint (Graphics e){
    super.paint(e);
    int total_mark=hp+lenovo+dell+acer+apple+brother+asus+allenware;
    
    int arc_hp=hp*360/total_mark;
    int arc_lenovo=lenovo*360/total_mark;
    int arc_dell=dell*360/total_mark;
    int arc_acer=acer*360/total_mark;
    int arc_apple=apple*360/total_mark;
    int arc_brother=brother*360/total_mark;
    int arc_asus=asus*360/total_mark;
    int arc_allenware=allenware*360/total_mark;
    
    
    e.setColor(new Color(175,122,197));
    e.fillArc(25, 100, 270, 270, 0, arc_hp);
    e.fillRect(310, 120, 20, 20);
    e.drawString(hp+" de HP", 340, 135);
    
    e.setColor(new Color(0,255,0));
    e.fillArc(25, 100, 270, 270, arc_hp, arc_lenovo);
    e.fillRect(310, 160, 20, 20);
    e.drawString(lenovo+" de Lenovo", 340, 175);
    
    e.setColor(new Color(142,0,255));
    e.fillArc(25, 100, 270, 270, arc_hp+arc_lenovo, arc_dell);
    e.fillRect(310, 200, 20, 20);
    e.drawString(dell+" de Dell", 340, 215);
    
    e.setColor(new Color(255,0,255));
    e.fillArc(25, 100, 270, 270, arc_hp+arc_lenovo+arc_dell, arc_acer);
    e.fillRect(310, 240, 20, 20);
    e.drawString(acer+" de Acer", 340, 255);
    
    e.setColor(new Color(0,0,255));
    e.fillArc(25, 100, 270, 270, arc_hp+arc_lenovo+arc_dell+arc_acer, arc_apple);
    e.fillRect(410, 120, 20, 20);
    e.drawString(apple+" de Apple", 440, 135);
    
    e.setColor(new Color(100,0,120));
    e.fillArc(25, 100, 270, 270, arc_hp+arc_lenovo+arc_dell+arc_acer+arc_apple,arc_brother);
    e.fillRect(410, 160, 20, 20);
    e.drawString(brother+" de Brother", 440, 175);
    
    e.setColor(new Color(255,0,30));
    e.fillArc(25, 100, 270, 270, arc_hp+arc_lenovo+arc_dell+arc_acer+arc_apple+arc_brother,arc_asus);
    e.fillRect(410, 200, 20, 20);
    e.drawString(asus+" de Asus", 440, 215);
    
    e.setColor(new Color(0,255,255));
    e.fillArc(25, 100, 270, 270, arc_hp+arc_lenovo+arc_dell+arc_acer+arc_apple+arc_brother+arc_asus,arc_allenware);
    e.fillRect(410, 240, 20, 20);
    e.drawString(allenware+" de Allenware", 440, 255);
}

}
