
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
public class GUI_GuitarraElectrica extends javax.swing.JFrame {

    
    static String ins;
    /**
     * Creates new form GuitarraElectrica
     */
    public GUI_GuitarraElectrica() {
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

        lblGuitarraE1 = new javax.swing.JLabel();
        lblGuitarraE2 = new javax.swing.JLabel();
        lblGuitarraE3 = new javax.swing.JLabel();
        lblGuitarraE4 = new javax.swing.JLabel();
        btnAtrasCuerdas = new javax.swing.JButton();
        btnComprarGE1 = new javax.swing.JButton();
        btnComprarGE2 = new javax.swing.JButton();
        btnComprarGE3 = new javax.swing.JButton();
        btnComprarGE4 = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGuitarraE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuitarraElectrica/guitarraElectrica1.png"))); // NOI18N
        getContentPane().add(lblGuitarraE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 320));

        lblGuitarraE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuitarraElectrica/guitarraElectrica2.png"))); // NOI18N
        getContentPane().add(lblGuitarraE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblGuitarraE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuitarraElectrica/guitarraElectrica3.png"))); // NOI18N
        getContentPane().add(lblGuitarraE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        lblGuitarraE4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuitarraElectrica/guitarra-electrica4.png"))); // NOI18N
        getContentPane().add(lblGuitarraE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        btnAtrasCuerdas.setBackground(new java.awt.Color(255, 255, 255));
        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 40));

        btnComprarGE1.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarGE1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarGE1.setText("Comprar");
        btnComprarGE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarGE1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarGE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 30));

        btnComprarGE2.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarGE2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarGE2.setText("Comprar");
        btnComprarGE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarGE2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarGE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 110, 30));

        btnComprarGE3.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarGE3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarGE3.setText("Comprar");
        btnComprarGE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarGE3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarGE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 110, 30));

        btnComprarGE4.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarGE4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarGE4.setText("Comprar");
        btnComprarGE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarGE4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarGE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 110, 30));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 400, 40));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("GUITARRAS ELÉCTRICAS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoMarcas.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Cuerdas menuCuerdas = new GUI_Cuerdas();
        menuCuerdas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasCuerdasActionPerformed

    private void btnComprarGE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarGE1ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesGuitarraElectrica opcionesCompra  = new GUI_OpcionesGuitarraElectrica();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "guitarraElectrica1";
    }//GEN-LAST:event_btnComprarGE1ActionPerformed

    private void btnComprarGE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarGE2ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesGuitarraElectrica opcionesCompra  = new GUI_OpcionesGuitarraElectrica();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "guitarraElectrica2";
    }//GEN-LAST:event_btnComprarGE2ActionPerformed

    private void btnComprarGE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarGE3ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesGuitarraElectrica opcionesCompra  = new GUI_OpcionesGuitarraElectrica();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "guitarraElectrica3";
    }//GEN-LAST:event_btnComprarGE3ActionPerformed

    private void btnComprarGE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarGE4ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesGuitarraElectrica opcionesCompra  = new GUI_OpcionesGuitarraElectrica();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "guitarraElectrica4";
    }//GEN-LAST:event_btnComprarGE4ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_GuitarraElectrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_GuitarraElectrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_GuitarraElectrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_GuitarraElectrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_GuitarraElectrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasCuerdas;
    private javax.swing.JButton btnComprarGE1;
    private javax.swing.JButton btnComprarGE2;
    private javax.swing.JButton btnComprarGE3;
    private javax.swing.JButton btnComprarGE4;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGuitarraE1;
    private javax.swing.JLabel lblGuitarraE2;
    private javax.swing.JLabel lblGuitarraE3;
    private javax.swing.JLabel lblGuitarraE4;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
