
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
public class GUI_Piano extends javax.swing.JFrame {

    
    static String ins;
    /**
     * Creates new form Piano
     */
    public GUI_Piano() {
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

        lblPiano1 = new javax.swing.JLabel();
        lblPiano2 = new javax.swing.JLabel();
        lblPiano3 = new javax.swing.JLabel();
        btnAtrasTeclado = new javax.swing.JButton();
        btnComprarPiano1 = new javax.swing.JButton();
        btnComprarPiano2 = new javax.swing.JButton();
        btnComprarPiano3 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPiano1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Pianos/piano2.png"))); // NOI18N
        getContentPane().add(lblPiano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblPiano2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Pianos/piano1.png"))); // NOI18N
        getContentPane().add(lblPiano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        lblPiano3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Pianos/piano3.png"))); // NOI18N
        getContentPane().add(lblPiano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        btnAtrasTeclado.setBackground(new java.awt.Color(255, 255, 255));
        btnAtrasTeclado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasTeclado.setText("Atrás");
        btnAtrasTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasTecladoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 409, 90, 40));

        btnComprarPiano1.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarPiano1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarPiano1.setText("Comprar");
        btnComprarPiano1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPiano1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarPiano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 110, 30));

        btnComprarPiano2.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarPiano2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarPiano2.setText("Comprar");
        btnComprarPiano2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPiano2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarPiano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 110, 30));

        btnComprarPiano3.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarPiano3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarPiano3.setText("Comprar");
        btnComprarPiano3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPiano3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarPiano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 110, 30));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("PIANOS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 400, 40));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/Fondo1.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasTecladoActionPerformed
        // TODO add your handling code here:
        GUI_Teclado piano = new GUI_Teclado();
        piano.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasTecladoActionPerformed

    private void btnComprarPiano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPiano1ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesPiano opcionesPiano  = new GUI_OpcionesPiano();
        opcionesPiano.setVisible(true);
        dispose();
        ins = "piano1";
    }//GEN-LAST:event_btnComprarPiano1ActionPerformed

    private void btnComprarPiano2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPiano2ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesPiano opcionesPiano  = new GUI_OpcionesPiano();
        opcionesPiano.setVisible(true);
        dispose();
        ins = "piano2";
    }//GEN-LAST:event_btnComprarPiano2ActionPerformed

    private void btnComprarPiano3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPiano3ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesPiano opcionesPiano  = new GUI_OpcionesPiano();
        opcionesPiano.setVisible(true);
        dispose();
        ins = "piano3";
    }//GEN-LAST:event_btnComprarPiano3ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Piano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasTeclado;
    private javax.swing.JButton btnComprarPiano1;
    private javax.swing.JButton btnComprarPiano2;
    private javax.swing.JButton btnComprarPiano3;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPiano1;
    private javax.swing.JLabel lblPiano2;
    private javax.swing.JLabel lblPiano3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}
