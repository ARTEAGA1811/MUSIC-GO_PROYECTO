
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
public class GUI_Arpas extends javax.swing.JFrame {
    
    
    static String ins;
    /**
     * Creates new form Arpas
     */
    public GUI_Arpas() {
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

        btnAtrasCuerdas = new javax.swing.JButton();
        lblArpa1 = new javax.swing.JLabel();
        lblArpa2 = new javax.swing.JLabel();
        lblArpa3 = new javax.swing.JLabel();
        btnComprarArpa1 = new javax.swing.JButton();
        btnComprarArpa2 = new javax.swing.JButton();
        btnComprarArpa3 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, 40));

        lblArpa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Arpas/arpa3.png"))); // NOI18N
        getContentPane().add(lblArpa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        lblArpa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Arpas/arpa1.png"))); // NOI18N
        getContentPane().add(lblArpa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblArpa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Arpas/arpa2.png"))); // NOI18N
        getContentPane().add(lblArpa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        btnComprarArpa1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarArpa1.setText("Comprar");
        btnComprarArpa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArpa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArpa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 110, 30));

        btnComprarArpa2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarArpa2.setText("Comprar");
        btnComprarArpa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArpa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArpa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 110, 30));

        btnComprarArpa3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarArpa3.setText("Comprar");
        btnComprarArpa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarArpa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarArpa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 110, 30));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("ARPAS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 400, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/Fondo1.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Cuerdas menuCuerdas = new GUI_Cuerdas();
        menuCuerdas.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btnAtrasCuerdasActionPerformed

    private void btnComprarArpa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArpa1ActionPerformed
        // TODO add your handling code here:
       GUI_OpcionesArpa opcionesCompra  = new GUI_OpcionesArpa();
        opcionesCompra.setVisible(true);
        dispose();
        
        ins = "arpa1";
    }//GEN-LAST:event_btnComprarArpa1ActionPerformed

    private void btnComprarArpa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArpa2ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesArpa opcionesCompra  = new GUI_OpcionesArpa();
        opcionesCompra.setVisible(true);
        dispose();
        
        ins = "arpa2";
    }//GEN-LAST:event_btnComprarArpa2ActionPerformed

    private void btnComprarArpa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarArpa3ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesArpa opcionesCompra  = new GUI_OpcionesArpa();
        opcionesCompra.setVisible(true);
        dispose();
        
        ins = "arpa3";
    }//GEN-LAST:event_btnComprarArpa3ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Arpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Arpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Arpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Arpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Arpas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasCuerdas;
    private javax.swing.JButton btnComprarArpa1;
    private javax.swing.JButton btnComprarArpa2;
    private javax.swing.JButton btnComprarArpa3;
    private javax.swing.JLabel lblArpa1;
    private javax.swing.JLabel lblArpa2;
    private javax.swing.JLabel lblArpa3;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
