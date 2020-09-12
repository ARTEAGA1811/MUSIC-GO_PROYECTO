/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Principiante extends javax.swing.JFrame {

    /**
     * Creates new form Principiante
     */
    public GUI_Principiante() {
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

        btnMenuPrincipal = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();
        lblManual1 = new javax.swing.JLabel();
        lblManual = new javax.swing.JLabel();
        lblManual2 = new javax.swing.JLabel();
        lblManual3 = new javax.swing.JLabel();
        lblTecladoConManual = new javax.swing.JLabel();
        lblGuitarraConManual = new javax.swing.JLabel();
        lblFlautaConManual = new javax.swing.JLabel();
        lblViolinConManual = new javax.swing.JLabel();
        btnComprarTecladoM = new javax.swing.JButton();
        btnComprarViolinM = new javax.swing.JButton();
        btnComprarGuitarraM = new javax.swing.JButton();
        btnComprarFlautaM = new javax.swing.JButton();
        lblInfo2 = new javax.swing.JLabel();
        lblFondoPrincipiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnMenuPrincipal.setText("Atrás");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 40));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("¿Principiante?");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("¡NO TE PREOCUPES!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        lblInfo1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo1.setText("Aquí una lista de nuestros productos con manuales incluidos");
        getContentPane().add(lblInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        lblManual1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual2.png"))); // NOI18N
        getContentPane().add(lblManual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        lblManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual2.png"))); // NOI18N
        getContentPane().add(lblManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblManual2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual2.png"))); // NOI18N
        getContentPane().add(lblManual2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        lblManual3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual2.png"))); // NOI18N
        getContentPane().add(lblManual3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, -1));

        lblTecladoConManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Teclados/teclado6.png"))); // NOI18N
        getContentPane().add(lblTecladoConManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 270, -1));

        lblGuitarraConManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuitarraAcustica/Guitarra-Acustica2.png"))); // NOI18N
        getContentPane().add(lblGuitarraConManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        lblFlautaConManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Flautas/flauta1.png"))); // NOI18N
        getContentPane().add(lblFlautaConManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        lblViolinConManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin1.png"))); // NOI18N
        getContentPane().add(lblViolinConManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 230));

        btnComprarTecladoM.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarTecladoM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarTecladoM.setText("Comprar");
        btnComprarTecladoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTecladoMActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarTecladoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        btnComprarViolinM.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarViolinM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarViolinM.setText("Comprar");
        btnComprarViolinM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarViolinMActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarViolinM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        btnComprarGuitarraM.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarGuitarraM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarGuitarraM.setText("Comprar");
        btnComprarGuitarraM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarGuitarraMActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarGuitarraM, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        btnComprarFlautaM.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarFlautaM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarFlautaM.setText("Comprar");
        btnComprarFlautaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarFlautaMActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarFlautaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        lblInfo2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo2.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 400, 40));

        lblFondoPrincipiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/Fondo1.png"))); // NOI18N
        getContentPane().add(lblFondoPrincipiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        // TODO add your handling code here:
        GUI_MenuPrincipal  menuPrincipal = new GUI_MenuPrincipal();
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnComprarTecladoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTecladoMActionPerformed
        // TODO add your handling code here:
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarTecladoMActionPerformed

    private void btnComprarViolinMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarViolinMActionPerformed
        // TODO add your handling code here:
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarViolinMActionPerformed

    private void btnComprarGuitarraMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarGuitarraMActionPerformed
        // TODO add your handling code here:
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarGuitarraMActionPerformed

    private void btnComprarFlautaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarFlautaMActionPerformed
        // TODO add your handling code here:
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarFlautaMActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Principiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Principiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Principiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Principiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Principiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarFlautaM;
    private javax.swing.JButton btnComprarGuitarraM;
    private javax.swing.JButton btnComprarTecladoM;
    private javax.swing.JButton btnComprarViolinM;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel lblFlautaConManual;
    private javax.swing.JLabel lblFondoPrincipiante;
    private javax.swing.JLabel lblGuitarraConManual;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblManual;
    private javax.swing.JLabel lblManual1;
    private javax.swing.JLabel lblManual2;
    private javax.swing.JLabel lblManual3;
    private javax.swing.JLabel lblTecladoConManual;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblViolinConManual;
    // End of variables declaration//GEN-END:variables
}
