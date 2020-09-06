/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Organo extends javax.swing.JFrame {

    /**
     * Creates new form Organo
     */
    public GUI_Organo() {
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

        btnAtrasTeclado = new javax.swing.JButton();
        lblOrgano1 = new javax.swing.JLabel();
        lblOrgano2 = new javax.swing.JLabel();
        btnComprarOrgano1 = new javax.swing.JButton();
        btnComprarOrgano2 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasTeclado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasTeclado.setText("Atras");
        btnAtrasTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasTecladoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 409, 90, 40));

        lblOrgano1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Organos/organo1.png"))); // NOI18N
        getContentPane().add(lblOrgano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 350));

        lblOrgano2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Organos/organo2.png"))); // NOI18N
        getContentPane().add(lblOrgano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 350));

        btnComprarOrgano1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarOrgano1.setText("Comprar");
        getContentPane().add(btnComprarOrgano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, 30));

        btnComprarOrgano2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarOrgano2.setText("Comprar");
        getContentPane().add(btnComprarOrgano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 110, 30));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("ÓRGANOS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 400, 40));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoDescuentos.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasTecladoActionPerformed
        // TODO add your handling code here:
        GUI_Teclado piano = new GUI_Teclado();
        piano.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasTecladoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Organo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Organo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Organo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Organo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Organo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasTeclado;
    private javax.swing.JButton btnComprarOrgano1;
    private javax.swing.JButton btnComprarOrgano2;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblOrgano1;
    private javax.swing.JLabel lblOrgano2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}
