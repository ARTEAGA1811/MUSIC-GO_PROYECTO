
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
public class GUI_NuevosProductos extends javax.swing.JFrame {
    public TiendaInstrumento musicGo=new TiendaInstrumento();
    /**
     * Creates new form NuevosProductos
     */
    public GUI_NuevosProductos() {
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

        btnMenuPrincipal = new javax.swing.JButton();
        lbltitulo = new javax.swing.JLabel();
        lblNew = new javax.swing.JLabel();
        lblNew1 = new javax.swing.JLabel();
        lblNew2 = new javax.swing.JLabel();
        lblNew3 = new javax.swing.JLabel();
        lblBateriaRL = new javax.swing.JLabel();
        lblBongoRL = new javax.swing.JLabel();
        lblSaxofonRL = new javax.swing.JLabel();
        lblGuitarraElecRL = new javax.swing.JLabel();
        btnComprarBongoNuevo = new javax.swing.JButton();
        btnComprarBateriaNuevo = new javax.swing.JButton();
        btnComprarViolinNuevo = new javax.swing.JButton();
        btnComprarGuitarraElecNuevo = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

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
        getContentPane().add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 90, 40));

        lbltitulo.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbltitulo.setText("¡NUESTROS NUEVOS PRODUCTOS RICIÉN LLEGADOS !");
        getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo1.png"))); // NOI18N
        getContentPane().add(lblNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        lblNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo1.png"))); // NOI18N
        getContentPane().add(lblNew1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        lblNew2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo1.png"))); // NOI18N
        getContentPane().add(lblNew2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        lblNew3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo1.png"))); // NOI18N
        getContentPane().add(lblNew3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lblBateriaRL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Bateria/bateria1.png"))); // NOI18N
        getContentPane().add(lblBateriaRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 250, 250));

        lblBongoRL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Bongos/bongos2.png"))); // NOI18N
        getContentPane().add(lblBongoRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblSaxofonRL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin1.png"))); // NOI18N
        getContentPane().add(lblSaxofonRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        lblGuitarraElecRL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuitarraElectrica/guitarraElectrica2.png"))); // NOI18N
        lblGuitarraElecRL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblGuitarraElecRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, 290));

        btnComprarBongoNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarBongoNuevo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarBongoNuevo.setText("Comprar");
        btnComprarBongoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBongoNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarBongoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnComprarBateriaNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarBateriaNuevo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarBateriaNuevo.setText("Comprar");
        btnComprarBateriaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBateriaNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarBateriaNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        btnComprarViolinNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarViolinNuevo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarViolinNuevo.setText("Comprar");
        btnComprarViolinNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarViolinNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarViolinNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        btnComprarGuitarraElecNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnComprarGuitarraElecNuevo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprarGuitarraElecNuevo.setText("Comprar");
        btnComprarGuitarraElecNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarGuitarraElecNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarGuitarraElecNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        lblInfo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblInfo.setText("Haz click en \"comprar\" para más información!");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 400, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoNuevosProductos.png"))); // NOI18N
        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        // TODO add your handling code here:
        GUI_MenuPrincipal  menuPrincipal = new GUI_MenuPrincipal();
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnComprarBongoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBongoNuevoActionPerformed
        // TODO add your handling code here:
        Instrumento.nomInstrumento = "Bongo";
        Instrumento miBongoNuevo = new PercusionMembranofos("Caoba", "Negro", 0.2032, 6.5, "MEINL");
        Instrumento.precioInst = miBongoNuevo.calcularPrecio(Instrumento.nomInstrumento);
        musicGo.setInstrumentos(miBongoNuevo);
        Instrumento.descripcionInstr = miBongoNuevo.toString();
        
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarBongoNuevoActionPerformed

    private void btnComprarBateriaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBateriaNuevoActionPerformed
        // TODO add your handling code here:
        Instrumento.nomInstrumento = "Bateria";
        Instrumento miBateriaNuevo = new PercusionMembranofos("Caoba", "Cafe", 9, 60, "PREMIER");
        Instrumento.precioInst = miBateriaNuevo.calcularPrecio(Instrumento.nomInstrumento);
        musicGo.setInstrumentos(miBateriaNuevo);
        Instrumento.descripcionInstr = miBateriaNuevo.toString();
        
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarBateriaNuevoActionPerformed

    private void btnComprarViolinNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarViolinNuevoActionPerformed
        // TODO add your handling code here:
        Instrumento.nomInstrumento = "Violin";
        Instrumento miViolinNuevo = new Directo("Caoba", "Natural", 0.6, 0.43, "GOLDEN");
        Instrumento.precioInst = miViolinNuevo.calcularPrecio(Instrumento.nomInstrumento);
        musicGo.setInstrumentos(miViolinNuevo);
        Instrumento.descripcionInstr = miViolinNuevo.toString();
        
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarViolinNuevoActionPerformed

    private void btnComprarGuitarraElecNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarGuitarraElecNuevoActionPerformed
        // TODO add your handling code here:
        Instrumento.nomInstrumento = "Guitarra Electrica";
        Instrumento miGuitarraElectricaNuevo = new Directo("Arce Duro", "Blanco", 1.5, 1.15, "VINTAGE");
        Instrumento.precioInst = miGuitarraElectricaNuevo.calcularPrecio(Instrumento.nomInstrumento);
        musicGo.setInstrumentos(miGuitarraElectricaNuevo);
        Instrumento.descripcionInstr = miGuitarraElectricaNuevo.toString();
        
        GUI_Compra compra  = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarGuitarraElecNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_NuevosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_NuevosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_NuevosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_NuevosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_NuevosProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarBateriaNuevo;
    private javax.swing.JButton btnComprarBongoNuevo;
    private javax.swing.JButton btnComprarGuitarraElecNuevo;
    private javax.swing.JButton btnComprarViolinNuevo;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel lblBateriaRL;
    private javax.swing.JLabel lblBongoRL;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGuitarraElecRL;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNew;
    private javax.swing.JLabel lblNew1;
    private javax.swing.JLabel lblNew2;
    private javax.swing.JLabel lblNew3;
    private javax.swing.JLabel lblSaxofonRL;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
