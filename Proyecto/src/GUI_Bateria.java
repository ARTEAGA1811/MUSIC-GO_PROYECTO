/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Bateria extends javax.swing.JFrame {

    
    static String ins;
    /**
     * Creates new form Bateria
     */
    public GUI_Bateria() {
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

        lblBateria1 = new javax.swing.JLabel();
        lblBateria2 = new javax.swing.JLabel();
        lblBateria3 = new javax.swing.JLabel();
        btnAtrasPercusion = new javax.swing.JButton();
        btnBateria1 = new javax.swing.JButton();
        btnBateria2 = new javax.swing.JButton();
        btnBateria3 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBateria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Bateria/bateria1.png"))); // NOI18N
        getContentPane().add(lblBateria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblBateria2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Bateria/bateria2.png"))); // NOI18N
        getContentPane().add(lblBateria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        lblBateria3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Bateria/bateria4.png"))); // NOI18N
        getContentPane().add(lblBateria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        btnAtrasPercusion.setBackground(new java.awt.Color(255, 255, 255));
        btnAtrasPercusion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasPercusion.setText("Atrás");
        btnAtrasPercusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasPercusionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasPercusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 40));

        btnBateria1.setBackground(new java.awt.Color(255, 255, 255));
        btnBateria1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBateria1.setText("Comprar");
        btnBateria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBateria1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBateria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 110, 30));

        btnBateria2.setBackground(new java.awt.Color(255, 255, 255));
        btnBateria2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBateria2.setText("Comprar");
        btnBateria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBateria2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBateria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 110, 30));

        btnBateria3.setBackground(new java.awt.Color(255, 255, 255));
        btnBateria3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBateria3.setText("Comprar");
        btnBateria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBateria3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBateria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 110, 30));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("BATERÍAS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 400, 40));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoPrincipiante.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void btnAtrasPercusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasPercusionActionPerformed
        // TODO add your handling code here:
        GUI_Percusion percusion = new GUI_Percusion();
        percusion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasPercusionActionPerformed

    private void btnBateria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBateria1ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesBateria opcionesCompra = new GUI_OpcionesBateria();
        opcionesCompra.setVisible(true);
        dispose();
        
        ins = "bateria1";
    }//GEN-LAST:event_btnBateria1ActionPerformed

    private void btnBateria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBateria2ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesBateria opcionesCompra = new GUI_OpcionesBateria();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "bateria2";
    }//GEN-LAST:event_btnBateria2ActionPerformed

    private void btnBateria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBateria3ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesBateria opcionesCompra = new GUI_OpcionesBateria();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "bateria3";
    }//GEN-LAST:event_btnBateria3ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Bateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Bateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Bateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Bateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Bateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasPercusion;
    private javax.swing.JButton btnBateria1;
    private javax.swing.JButton btnBateria2;
    private javax.swing.JButton btnBateria3;
    private javax.swing.JLabel lblBateria1;
    private javax.swing.JLabel lblBateria2;
    private javax.swing.JLabel lblBateria3;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}
