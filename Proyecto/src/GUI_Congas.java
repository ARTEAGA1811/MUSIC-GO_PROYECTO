/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Congas extends javax.swing.JFrame {

    static String ins;
    /**
     * Creates new form Congas
     */
    public GUI_Congas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtrasPercusion = new javax.swing.JButton();
        lblConga1 = new javax.swing.JLabel();
        lblConga2 = new javax.swing.JLabel();
        lblCong3 = new javax.swing.JLabel();
        lblConga4 = new javax.swing.JLabel();
        btnComprarConga1 = new javax.swing.JButton();
        btnComprarConga2 = new javax.swing.JButton();
        btnComprarConga3 = new javax.swing.JButton();
        btnComprarConga4 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasPercusion.setBackground(new java.awt.Color(255, 255, 255));
        btnAtrasPercusion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasPercusion.setText("Atrás");
        btnAtrasPercusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasPercusionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasPercusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 40));

        lblConga1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Congas/conga1.png"))); // NOI18N
        getContentPane().add(lblConga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblConga2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Congas/conga2.png"))); // NOI18N
        getContentPane().add(lblConga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        lblCong3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Congas/conga3.png"))); // NOI18N
        getContentPane().add(lblCong3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        lblConga4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Congas/conga4.png"))); // NOI18N
        getContentPane().add(lblConga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        btnComprarConga1.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarConga1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarConga1.setText("Comprar");
        btnComprarConga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarConga1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarConga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, 30));

        btnComprarConga2.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarConga2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarConga2.setText("Comprar");
        btnComprarConga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarConga2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarConga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, 30));

        btnComprarConga3.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarConga3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarConga3.setText("Comprar");
        btnComprarConga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarConga3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarConga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, 30));

        btnComprarConga4.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarConga4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarConga4.setText("Comprar");
        btnComprarConga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarConga4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarConga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 110, 30));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("CONGAS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 400, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoNuevosProductos.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasPercusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasPercusionActionPerformed
        // TODO add your handling code here:
        GUI_Percusion percusion = new GUI_Percusion();
        percusion.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnAtrasPercusionActionPerformed

    private void btnComprarConga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarConga1ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesConga opcionesCompra  = new GUI_OpcionesConga();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "conga1";
    }//GEN-LAST:event_btnComprarConga1ActionPerformed

    private void btnComprarConga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarConga2ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesConga opcionesCompra  = new GUI_OpcionesConga();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "conga2";
    }//GEN-LAST:event_btnComprarConga2ActionPerformed

    private void btnComprarConga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarConga3ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesConga opcionesCompra  = new GUI_OpcionesConga();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "conga3";
    }//GEN-LAST:event_btnComprarConga3ActionPerformed

    private void btnComprarConga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarConga4ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesConga opcionesCompra  = new GUI_OpcionesConga();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "conga4";
    }//GEN-LAST:event_btnComprarConga4ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Congas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Congas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Congas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Congas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Congas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasPercusion;
    private javax.swing.JButton btnComprarConga1;
    private javax.swing.JButton btnComprarConga2;
    private javax.swing.JButton btnComprarConga3;
    private javax.swing.JButton btnComprarConga4;
    private javax.swing.JLabel lblCong3;
    private javax.swing.JLabel lblConga1;
    private javax.swing.JLabel lblConga2;
    private javax.swing.JLabel lblConga4;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
