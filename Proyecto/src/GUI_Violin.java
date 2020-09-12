
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
public class GUI_Violin extends javax.swing.JFrame {

    
    static String ins;
    /**
     * Creates new form Violin
     */
    public GUI_Violin() {
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

        lblViolin1 = new javax.swing.JLabel();
        lblViolin2 = new javax.swing.JLabel();
        lblViolin3 = new javax.swing.JLabel();
        lblViolin4 = new javax.swing.JLabel();
        btnAtrasCuerdas = new javax.swing.JButton();
        btnComprarViolin1 = new javax.swing.JButton();
        btnComprarViolin2 = new javax.swing.JButton();
        btnComprarViolin3 = new javax.swing.JButton();
        btnComprarViolin4 = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViolin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin4.png"))); // NOI18N
        getContentPane().add(lblViolin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblViolin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin2.png"))); // NOI18N
        getContentPane().add(lblViolin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        lblViolin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin3.png"))); // NOI18N
        getContentPane().add(lblViolin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        lblViolin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin1.png"))); // NOI18N
        getContentPane().add(lblViolin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        btnAtrasCuerdas.setBackground(new java.awt.Color(255, 255, 255));
        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 40));

        btnComprarViolin1.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarViolin1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarViolin1.setText("Comprar");
        btnComprarViolin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarViolin1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarViolin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 110, 30));

        btnComprarViolin2.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarViolin2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarViolin2.setText("Comprar");
        btnComprarViolin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarViolin2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarViolin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 110, 30));

        btnComprarViolin3.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarViolin3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarViolin3.setText("Comprar");
        btnComprarViolin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarViolin3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarViolin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 110, 30));

        btnComprarViolin4.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarViolin4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarViolin4.setText("Comprar");
        btnComprarViolin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarViolin4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarViolin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 110, 30));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 400, 40));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("VIOLINES");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoNuevosProductos.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Cuerdas menuCuerdas  = new GUI_Cuerdas();
        menuCuerdas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasCuerdasActionPerformed

    private void btnComprarViolin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarViolin1ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesViolines opcionesCompra  = new GUI_OpcionesViolines();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "violin1";
    }//GEN-LAST:event_btnComprarViolin1ActionPerformed

    private void btnComprarViolin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarViolin2ActionPerformed
        // TODO add your handling code here:
       GUI_OpcionesViolines opcionesCompra  = new GUI_OpcionesViolines();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "violin2";
    }//GEN-LAST:event_btnComprarViolin2ActionPerformed

    private void btnComprarViolin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarViolin3ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesViolines opcionesCompra  = new GUI_OpcionesViolines();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "violin3";
    }//GEN-LAST:event_btnComprarViolin3ActionPerformed

    private void btnComprarViolin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarViolin4ActionPerformed
        // TODO add your handling code here:
        GUI_OpcionesViolines opcionesCompra  = new GUI_OpcionesViolines();
        opcionesCompra.setVisible(true);
        dispose();
        ins = "violin4";
    }//GEN-LAST:event_btnComprarViolin4ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Violin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Violin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Violin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Violin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Violin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasCuerdas;
    private javax.swing.JButton btnComprarViolin1;
    private javax.swing.JButton btnComprarViolin2;
    private javax.swing.JButton btnComprarViolin3;
    private javax.swing.JButton btnComprarViolin4;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblViolin1;
    private javax.swing.JLabel lblViolin2;
    private javax.swing.JLabel lblViolin3;
    private javax.swing.JLabel lblViolin4;
    // End of variables declaration//GEN-END:variables
}
