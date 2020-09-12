/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Factura extends javax.swing.JFrame {

    
    /**
     * Creates new form GUI_Factura
     */
    public GUI_Factura() {
        initComponents();
        setLocationRelativeTo(null);
        txaResumenFactura.setText(GUI_Compra.factura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblSuFactura = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResumenFactura = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPrincipalMarca1.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        lblSuFactura.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSuFactura.setText("¡Su Factura Aquí !");
        getContentPane().add(lblSuFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        txaResumenFactura.setEditable(false);
        txaResumenFactura.setColumns(20);
        txaResumenFactura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txaResumenFactura.setRows(5);
        jScrollPane1.setViewportView(txaResumenFactura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 530, 450));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 100, 30));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoPrincipiante.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GUI_MenuPrincipal menuPrincipal = new GUI_MenuPrincipal();
        menuPrincipal.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSuFactura;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextArea txaResumenFactura;
    // End of variables declaration//GEN-END:variables
}
