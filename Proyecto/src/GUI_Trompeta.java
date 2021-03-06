
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Trompeta extends javax.swing.JFrame {

    
    static String ins;
    /**
     * Creates new form Trompeta
     */
    public GUI_Trompeta() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("Imagenes/LogoIcono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtrasViento = new javax.swing.JButton();
        lblTrompeta1 = new javax.swing.JLabel();
        lblTrompeta2 = new javax.swing.JLabel();
        lblTrompeta3 = new javax.swing.JLabel();
        lblTrompeta4 = new javax.swing.JLabel();
        btnComprarTrompeta1 = new javax.swing.JButton();
        btnComprarTrompeta2 = new javax.swing.JButton();
        btnComprarTrompeta3 = new javax.swing.JButton();
        btnComprarTrompeta4 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasViento.setBackground(new java.awt.Color(255, 255, 255));
        btnAtrasViento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasViento.setText("Atrás");
        btnAtrasViento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasVientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasViento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 40));

        lblTrompeta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Trompetas/trompeta1.png"))); // NOI18N
        getContentPane().add(lblTrompeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lblTrompeta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Trompetas/trompeta2.png"))); // NOI18N
        getContentPane().add(lblTrompeta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        lblTrompeta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Trompetas/trompeta3.png"))); // NOI18N
        getContentPane().add(lblTrompeta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        lblTrompeta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Trompetas/trompeta4.png"))); // NOI18N
        getContentPane().add(lblTrompeta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        btnComprarTrompeta1.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarTrompeta1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarTrompeta1.setText("Comprar");
        btnComprarTrompeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTrompeta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarTrompeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 110, 30));

        btnComprarTrompeta2.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarTrompeta2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarTrompeta2.setText("Comprar");
        btnComprarTrompeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTrompeta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarTrompeta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 110, 30));

        btnComprarTrompeta3.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarTrompeta3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarTrompeta3.setText("Comprar");
        btnComprarTrompeta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTrompeta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarTrompeta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 110, 30));

        btnComprarTrompeta4.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarTrompeta4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarTrompeta4.setText("Comprar");
        btnComprarTrompeta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTrompeta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarTrompeta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 110, 30));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("TROMPETAS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 400, 40));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/Fondo1.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasVientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasVientoActionPerformed
        // TODO add your handling code here:
        GUI_Viento intrumentoViento = new GUI_Viento();
        intrumentoViento.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasVientoActionPerformed

    private void btnComprarTrompeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTrompeta1ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesTrompeta OpcionesCompra  = new GUI_OpcionesTrompeta();
        OpcionesCompra.setVisible(true);
        dispose();
        ins = "trompeta1";
    }//GEN-LAST:event_btnComprarTrompeta1ActionPerformed

    private void btnComprarTrompeta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTrompeta2ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesTrompeta OpcionesCompra  = new GUI_OpcionesTrompeta();
        OpcionesCompra.setVisible(true);
        dispose();
        ins = "trompeta2";
    }//GEN-LAST:event_btnComprarTrompeta2ActionPerformed

    private void btnComprarTrompeta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTrompeta3ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesTrompeta OpcionesCompra  = new GUI_OpcionesTrompeta();
        OpcionesCompra.setVisible(true);
        dispose();
        ins = "trompeta3";
    }//GEN-LAST:event_btnComprarTrompeta3ActionPerformed

    private void btnComprarTrompeta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTrompeta4ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesTrompeta OpcionesCompra  = new GUI_OpcionesTrompeta();
        OpcionesCompra.setVisible(true);
        dispose();
        ins = "trompeta4";
    }//GEN-LAST:event_btnComprarTrompeta4ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Trompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Trompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Trompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Trompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Trompeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasViento;
    private javax.swing.JButton btnComprarTrompeta1;
    private javax.swing.JButton btnComprarTrompeta2;
    private javax.swing.JButton btnComprarTrompeta3;
    private javax.swing.JButton btnComprarTrompeta4;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrompeta1;
    private javax.swing.JLabel lblTrompeta2;
    private javax.swing.JLabel lblTrompeta3;
    private javax.swing.JLabel lblTrompeta4;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}
