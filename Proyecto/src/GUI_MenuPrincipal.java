
import java.io.IOException;
import java.net.URISyntaxException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GuiProyecto
     */
    public GUI_MenuPrincipal() {
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

        lblLogoPrincipalCentral = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        btnnuevosProductos = new javax.swing.JButton();
        btnDescuentos = new javax.swing.JButton();
        btnMarcas = new javax.swing.JButton();
        bntPrincipiante = new javax.swing.JButton();
        lblLogoPrincipalMarca = new javax.swing.JLabel();
        btnFacebook = new javax.swing.JButton();
        btnWhatapp = new javax.swing.JButton();
        bntInstagram = new javax.swing.JButton();
        lblDescuento = new javax.swing.JLabel();
        lblNew = new javax.swing.JLabel();
        lblMarcas = new javax.swing.JLabel();
        lblTodosLosInstrumetnso = new javax.swing.JLabel();
        lblEnUnsoloLugar = new javax.swing.JLabel();
        lblPrincipiante = new javax.swing.JLabel();
        lblRedes = new javax.swing.JLabel();
        lblen = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoPrincipalCentral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoPrincipalCentral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guitarra-electrica (3).png"))); // NOI18N
        getContentPane().add(lblLogoPrincipalCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 360, 405));

        cmbCategorias.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "              CATEGORÍAS", "Cuerdas", "Percusión", "Teclados", "Viento" }));
        cmbCategorias.setBorder(null);
        cmbCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 340, 50));

        btnnuevosProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevosProductos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnnuevosProductos.setText("Nuevos Productos");
        btnnuevosProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevosProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, 40));

        btnDescuentos.setBackground(new java.awt.Color(255, 255, 255));
        btnDescuentos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDescuentos.setText("Descuentos");
        btnDescuentos.setBorder(null);
        btnDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 40));

        btnMarcas.setBackground(new java.awt.Color(255, 255, 255));
        btnMarcas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnMarcas.setText("Marcas");
        btnMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 40));

        bntPrincipiante.setBackground(new java.awt.Color(255, 255, 255));
        bntPrincipiante.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        bntPrincipiante.setText("Click aquí");
        bntPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPrincipianteActionPerformed(evt);
            }
        });
        getContentPane().add(bntPrincipiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 140, 40));

        lblLogoPrincipalMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPrincipalMarca1.png"))); // NOI18N
        getContentPane().add(lblLogoPrincipalMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 50));

        btnFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook 12.png"))); // NOI18N
        btnFacebook.setText("jButton2");
        btnFacebook.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebookActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 40, 40));

        btnWhatapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/whatsapp (3).png"))); // NOI18N
        getContentPane().add(btnWhatapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 40, 40));

        bntInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/instagram.png"))); // NOI18N
        bntInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInstagramActionPerformed(evt);
            }
        });
        getContentPane().add(bntInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 40, 40));

        lblDescuento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descuento.png"))); // NOI18N
        getContentPane().add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        lblNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new_1.png"))); // NOI18N
        getContentPane().add(lblNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        lblMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marca.png"))); // NOI18N
        getContentPane().add(lblMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        lblTodosLosInstrumetnso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTodosLosInstrumetnso.setText("!Todos los instrumentos ");
        getContentPane().add(lblTodosLosInstrumetnso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lblEnUnsoloLugar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEnUnsoloLugar.setText("en un solo lugar!");
        getContentPane().add(lblEnUnsoloLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblPrincipiante.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPrincipiante.setText("¿Principiante?");
        getContentPane().add(lblPrincipiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 120, -1));

        lblRedes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRedes.setText("Contáctanos");
        getContentPane().add(lblRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        lblen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblen.setText("en");
        getContentPane().add(lblen, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 30, 30));

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondofondo1_3.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebookActionPerformed
        // TODO add your handling code here:
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://www.facebook.com/Music-Go-106788524503440");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex ){}
            }
            
        }
    }//GEN-LAST:event_btnFacebookActionPerformed

    private void btnnuevosProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevosProductosActionPerformed
        // TODO add your handling code here:
        GUI_NuevosProductos  nuevosProductos = new GUI_NuevosProductos();
        nuevosProductos.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btnnuevosProductosActionPerformed

    private void btnDescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentosActionPerformed
        // TODO add your handling code here:
        GUI_Descuentos  descuento = new GUI_Descuentos();
        descuento.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDescuentosActionPerformed

    private void btnMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcasActionPerformed
        // TODO add your handling code here:
        GUI_Marcas marcas = new GUI_Marcas();
        marcas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMarcasActionPerformed

    private void bntPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrincipianteActionPerformed
        // TODO add your handling code here:
        GUI_Principiante  principiante = new GUI_Principiante();
        principiante.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntPrincipianteActionPerformed

    private void cmbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriasActionPerformed
        // TODO add your handling code here:
        if( cmbCategorias.getSelectedItem().equals("Cuerdas")){
            GUI_Cuerdas  instrumentoCuerdas = new GUI_Cuerdas();
            instrumentoCuerdas.setVisible(true);
            dispose();
        }
        if( cmbCategorias.getSelectedItem().equals("Percusión")){
            GUI_Percusion  instrumentoPercusion = new GUI_Percusion();
            instrumentoPercusion.setVisible(true);
            dispose();
        }
        if( cmbCategorias.getSelectedItem().equals("Teclados")){
            GUI_Teclado instrumentoTeclado= new GUI_Teclado();
            instrumentoTeclado.setVisible(true);
            dispose();
        }
        if( cmbCategorias.getSelectedItem().equals("Viento")){
            GUI_Viento instrumentoViento= new GUI_Viento();
            instrumentoViento.setVisible(true);
            dispose();
        }
      
        
    }//GEN-LAST:event_cmbCategoriasActionPerformed

    private void bntInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntInstagramActionPerformed
        // TODO add your handling code here:
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://youtube.com/");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex ){}
            }
            
        }
    }//GEN-LAST:event_bntInstagramActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntInstagram;
    private javax.swing.JButton bntPrincipiante;
    private javax.swing.JButton btnDescuentos;
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnMarcas;
    private javax.swing.JButton btnWhatapp;
    private javax.swing.JButton btnnuevosProductos;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblEnUnsoloLugar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoPrincipalCentral;
    private javax.swing.JLabel lblLogoPrincipalMarca;
    private javax.swing.JLabel lblMarcas;
    private javax.swing.JLabel lblNew;
    private javax.swing.JLabel lblPrincipiante;
    private javax.swing.JLabel lblRedes;
    private javax.swing.JLabel lblTodosLosInstrumetnso;
    private javax.swing.JLabel lblen;
    // End of variables declaration//GEN-END:variables
}
