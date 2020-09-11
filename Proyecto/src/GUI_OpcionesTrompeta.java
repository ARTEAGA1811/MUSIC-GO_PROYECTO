/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_OpcionesTrompeta extends javax.swing.JFrame {

    /**
     * Creates new form GUI_OpcionesTrompeta
     */
    public GUI_OpcionesTrompeta() {
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

        buttonGroupColor = new javax.swing.ButtonGroup();
        buttonGroupMarca = new javax.swing.ButtonGroup();
        buttonGroupMaterial = new javax.swing.ButtonGroup();
        buttonGroupTamaño = new javax.swing.ButtonGroup();
        buttonGroupPeso = new javax.swing.ButtonGroup();
        lblLogoPrincipalMarca = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jPanelMarca = new javax.swing.JPanel();
        rbtnOdissey = new javax.swing.JRadioButton();
        rbtnYamaha = new javax.swing.JRadioButton();
        lblTamaño = new javax.swing.JLabel();
        jPanelTamaño = new javax.swing.JPanel();
        rbtnTam08 = new javax.swing.JRadioButton();
        rbtnTam05 = new javax.swing.JRadioButton();
        lblMaterial = new javax.swing.JLabel();
        jPanelMaterial = new javax.swing.JPanel();
        rbtnMatPlata = new javax.swing.JRadioButton();
        rbtnMatPlatino = new javax.swing.JRadioButton();
        rbtnMatBronce = new javax.swing.JRadioButton();
        lblGuitarraAcustica1 = new javax.swing.JLabel();
        lblGuitarraAcustica = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        jPanelPeso = new javax.swing.JPanel();
        rbtnPeso129 = new javax.swing.JRadioButton();
        rbtnPeso115 = new javax.swing.JRadioButton();
        lblSonido = new javax.swing.JLabel();
        btnSonido = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnAtrasCuerdas = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoPrincipalMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPrincipalMarca1.png"))); // NOI18N
        getContentPane().add(lblLogoPrincipalMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 50));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("¡Elige lo que más te guste!");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblMarca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMarca.setText("MARCA");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jPanelMarca.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupMarca.add(rbtnOdissey);
        rbtnOdissey.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnOdissey.setText("ODISSEY ");
        rbtnOdissey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOdisseyActionPerformed(evt);
            }
        });

        buttonGroupMarca.add(rbtnYamaha);
        rbtnYamaha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnYamaha.setText("YAMAHA");

        javax.swing.GroupLayout jPanelMarcaLayout = new javax.swing.GroupLayout(jPanelMarca);
        jPanelMarca.setLayout(jPanelMarcaLayout);
        jPanelMarcaLayout.setHorizontalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnYamaha)
                    .addComponent(rbtnOdissey))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanelMarcaLayout.setVerticalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMarcaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(rbtnOdissey)
                .addGap(18, 18, 18)
                .addComponent(rbtnYamaha)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 110));

        lblTamaño.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTamaño.setText("TAMAÑO (m)");
        getContentPane().add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 30));

        jPanelTamaño.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupTamaño.add(rbtnTam08);
        rbtnTam08.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnTam08.setText("0.8");

        buttonGroupTamaño.add(rbtnTam05);
        rbtnTam05.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnTam05.setText("0.5");

        javax.swing.GroupLayout jPanelTamañoLayout = new javax.swing.GroupLayout(jPanelTamaño);
        jPanelTamaño.setLayout(jPanelTamañoLayout);
        jPanelTamañoLayout.setHorizontalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTam05, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam08, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelTamañoLayout.setVerticalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rbtnTam08)
                .addGap(13, 13, 13)
                .addComponent(rbtnTam05)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 150));

        lblMaterial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMaterial.setText("MATERIAL");
        getContentPane().add(lblMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 30));

        jPanelMaterial.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupMaterial.add(rbtnMatPlata);
        rbtnMatPlata.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnMatPlata.setText("Plata");

        buttonGroupMaterial.add(rbtnMatPlatino);
        rbtnMatPlatino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnMatPlatino.setText("Platino");

        buttonGroupMaterial.add(rbtnMatBronce);
        rbtnMatBronce.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnMatBronce.setText("Bronce");

        javax.swing.GroupLayout jPanelMaterialLayout = new javax.swing.GroupLayout(jPanelMaterial);
        jPanelMaterial.setLayout(jPanelMaterialLayout);
        jPanelMaterialLayout.setHorizontalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMatPlatino)
                    .addComponent(rbtnMatPlata)
                    .addComponent(rbtnMatBronce))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanelMaterialLayout.setVerticalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnMatPlata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnMatPlatino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnMatBronce)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, 100));

        lblGuitarraAcustica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Trompetas/trompeta2.png"))); // NOI18N
        getContentPane().add(lblGuitarraAcustica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        lblGuitarraAcustica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Trompetas/trompeta3.png"))); // NOI18N
        getContentPane().add(lblGuitarraAcustica, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        lblPeso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPeso.setText("PESO (kg)");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 20));

        jPanelPeso.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupPeso.add(rbtnPeso129);
        rbtnPeso129.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnPeso129.setText("1.29");

        buttonGroupPeso.add(rbtnPeso115);
        rbtnPeso115.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnPeso115.setText("1.15");

        javax.swing.GroupLayout jPanelPesoLayout = new javax.swing.GroupLayout(jPanelPeso);
        jPanelPeso.setLayout(jPanelPesoLayout);
        jPanelPesoLayout.setHorizontalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnPeso115, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso129, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelPesoLayout.setVerticalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(rbtnPeso129)
                .addGap(15, 15, 15)
                .addComponent(rbtnPeso115)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 170, 150));

        lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido.png"))); // NOI18N
        getContentPane().add(lblSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, -1, -1));

        btnSonido.setBackground(new java.awt.Color(255, 204, 204));
        btnSonido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSonido.setText("SONIDO");
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, 30));

        btnComprar.setBackground(new java.awt.Color(153, 255, 204));
        btnComprar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, 40));

        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoDescuentos.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        GUI_Compra compra = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Trompeta menuTrompetas = new GUI_Trompeta();
        menuTrompetas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasCuerdasActionPerformed

    private void rbtnOdisseyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOdisseyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOdisseyActionPerformed

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        // TODO add your handling code here:
        
        new Directo().producirSonido(GUI_Trompeta.ins);
    }//GEN-LAST:event_btnSonidoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_OpcionesTrompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesTrompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesTrompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesTrompeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_OpcionesTrompeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasCuerdas;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnSonido;
    private javax.swing.ButtonGroup buttonGroupColor;
    private javax.swing.ButtonGroup buttonGroupMarca;
    private javax.swing.ButtonGroup buttonGroupMaterial;
    private javax.swing.ButtonGroup buttonGroupPeso;
    private javax.swing.ButtonGroup buttonGroupTamaño;
    private javax.swing.JPanel jPanelMarca;
    private javax.swing.JPanel jPanelMaterial;
    private javax.swing.JPanel jPanelPeso;
    private javax.swing.JPanel jPanelTamaño;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGuitarraAcustica;
    private javax.swing.JLabel lblGuitarraAcustica1;
    private javax.swing.JLabel lblLogoPrincipalMarca;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnMatBronce;
    private javax.swing.JRadioButton rbtnMatPlata;
    private javax.swing.JRadioButton rbtnMatPlatino;
    private javax.swing.JRadioButton rbtnOdissey;
    private javax.swing.JRadioButton rbtnPeso115;
    private javax.swing.JRadioButton rbtnPeso129;
    private javax.swing.JRadioButton rbtnTam05;
    private javax.swing.JRadioButton rbtnTam08;
    private javax.swing.JRadioButton rbtnYamaha;
    // End of variables declaration//GEN-END:variables
}
