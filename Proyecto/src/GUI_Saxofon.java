/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Saxofon extends javax.swing.JFrame {

    /**
     * Creates new form Saxofon
     */
    public GUI_Saxofon() {
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

        btnAtrasViento = new javax.swing.JButton();
        lblSaxofon1 = new javax.swing.JLabel();
        lblSaxofon2 = new javax.swing.JLabel();
        lblSaxofon3 = new javax.swing.JLabel();
        lblSaxofon4 = new javax.swing.JLabel();
        btnComprarSaxofon1 = new javax.swing.JButton();
        btnComprarSaxofon2 = new javax.swing.JButton();
        btnComprarSaxofon3 = new javax.swing.JButton();
        btnComprarSaxofon4 = new javax.swing.JButton();
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

        lblSaxofon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Saxofon/saxofon1.png"))); // NOI18N
        getContentPane().add(lblSaxofon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblSaxofon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Saxofon/saxofon2.png"))); // NOI18N
        getContentPane().add(lblSaxofon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        lblSaxofon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Saxofon/saxofon3.png"))); // NOI18N
        getContentPane().add(lblSaxofon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        lblSaxofon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Saxofon/saxofon4.png"))); // NOI18N
        getContentPane().add(lblSaxofon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        btnComprarSaxofon1.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarSaxofon1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarSaxofon1.setText("Comprar");
        getContentPane().add(btnComprarSaxofon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 110, 30));

        btnComprarSaxofon2.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarSaxofon2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarSaxofon2.setText("Comprar");
        getContentPane().add(btnComprarSaxofon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 110, 30));

        btnComprarSaxofon3.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarSaxofon3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarSaxofon3.setText("Comprar");
        getContentPane().add(btnComprarSaxofon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 110, 30));

        btnComprarSaxofon4.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarSaxofon4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarSaxofon4.setText("Comprar");
        getContentPane().add(btnComprarSaxofon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 110, 30));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("SAXOFONES");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 30));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 400, 40));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoNuevosProductos.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasVientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasVientoActionPerformed
        // TODO add your handling code here:
        GUI_Viento intrumentoViento = new GUI_Viento();
        intrumentoViento.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasVientoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Saxofon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Saxofon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Saxofon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Saxofon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Saxofon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasViento;
    private javax.swing.JButton btnComprarSaxofon1;
    private javax.swing.JButton btnComprarSaxofon2;
    private javax.swing.JButton btnComprarSaxofon3;
    private javax.swing.JButton btnComprarSaxofon4;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblSaxofon1;
    private javax.swing.JLabel lblSaxofon2;
    private javax.swing.JLabel lblSaxofon3;
    private javax.swing.JLabel lblSaxofon4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}
