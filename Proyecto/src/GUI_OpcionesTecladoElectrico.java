/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_OpcionesTecladoElectrico extends javax.swing.JFrame {

    /**
     * Creates new form GUI_OpcionesTecladoElectrico
     */
    public GUI_OpcionesTecladoElectrico() {
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
        lblTitulo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jPanelColor = new javax.swing.JPanel();
        rbtnCafe = new javax.swing.JRadioButton();
        rbtnAzul = new javax.swing.JRadioButton();
        rbtnNegro1 = new javax.swing.JRadioButton();
        lblMarca = new javax.swing.JLabel();
        jPanelMarca = new javax.swing.JPanel();
        rbtnRoland = new javax.swing.JRadioButton();
        rbtnCasio = new javax.swing.JRadioButton();
        rbtnYamaha = new javax.swing.JRadioButton();
        btnAtrasCuerdas = new javax.swing.JButton();
        lblLogoPrincipalMarca = new javax.swing.JLabel();
        jPanelTamaño = new javax.swing.JPanel();
        rbtnTam139 = new javax.swing.JRadioButton();
        rbtnTam11 = new javax.swing.JRadioButton();
        lblPeso = new javax.swing.JLabel();
        lblTeclado = new javax.swing.JLabel();
        jPanelPeso = new javax.swing.JPanel();
        rbtnPeso0998 = new javax.swing.JRadioButton();
        rbtnPeso8 = new javax.swing.JRadioButton();
        lblTamaño = new javax.swing.JLabel();
        lblSonido = new javax.swing.JLabel();
        btnSonido = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("¡Elige lo que más te guste!");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblColor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblColor.setText("COLOR");
        getContentPane().add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 20));

        jPanelColor.setBackground(new java.awt.Color(255, 255, 204));

        rbtnCafe.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnCafe);
        rbtnCafe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnCafe.setText("Café");

        rbtnAzul.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnAzul);
        rbtnAzul.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnAzul.setText("Azul");

        rbtnNegro1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnNegro1);
        rbtnNegro1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnNegro1.setText("Negro");

        javax.swing.GroupLayout jPanelColorLayout = new javax.swing.GroupLayout(jPanelColor);
        jPanelColor.setLayout(jPanelColorLayout);
        jPanelColorLayout.setHorizontalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnAzul, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnCafe, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNegro1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(rbtnAzul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(rbtnNegro1)
                .addGap(18, 18, 18)
                .addComponent(rbtnCafe)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 160));

        lblMarca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMarca.setText("MARCA");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 30));

        jPanelMarca.setBackground(new java.awt.Color(255, 255, 204));

        buttonGroupMarca.add(rbtnRoland);
        rbtnRoland.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnRoland.setText("ROLAND");

        buttonGroupMarca.add(rbtnCasio);
        rbtnCasio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnCasio.setText("CASIO");

        buttonGroupMarca.add(rbtnYamaha);
        rbtnYamaha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnYamaha.setText("YAMAHA");

        javax.swing.GroupLayout jPanelMarcaLayout = new javax.swing.GroupLayout(jPanelMarca);
        jPanelMarca.setLayout(jPanelMarcaLayout);
        jPanelMarcaLayout.setHorizontalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnYamaha)
                    .addComponent(rbtnCasio)
                    .addComponent(rbtnRoland))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanelMarcaLayout.setVerticalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnRoland)
                .addGap(18, 18, 18)
                .addComponent(rbtnCasio)
                .addGap(18, 18, 18)
                .addComponent(rbtnYamaha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 120));

        btnAtrasCuerdas.setBackground(new java.awt.Color(255, 255, 255));
        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        lblLogoPrincipalMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPrincipalMarca1.png"))); // NOI18N
        getContentPane().add(lblLogoPrincipalMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 50));

        jPanelTamaño.setBackground(new java.awt.Color(255, 255, 204));

        buttonGroupTamaño.add(rbtnTam139);
        rbtnTam139.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam139.setText("32 Teclas");
        rbtnTam139.setToolTipText("");
        rbtnTam139.setBorderPainted(true);

        buttonGroupTamaño.add(rbtnTam11);
        rbtnTam11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam11.setText("88 Teclas");

        javax.swing.GroupLayout jPanelTamañoLayout = new javax.swing.GroupLayout(jPanelTamaño);
        jPanelTamaño.setLayout(jPanelTamañoLayout);
        jPanelTamañoLayout.setHorizontalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTam11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam139, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanelTamañoLayout.setVerticalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rbtnTam139)
                .addGap(18, 18, 18)
                .addComponent(rbtnTam11)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 150));

        lblPeso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPeso.setText("PESO (kg)");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 20));

        lblTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Teclados/teclado2.png"))); // NOI18N
        getContentPane().add(lblTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jPanelPeso.setBackground(new java.awt.Color(255, 255, 204));

        buttonGroupPeso.add(rbtnPeso0998);
        rbtnPeso0998.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso0998.setText("0.998");

        buttonGroupPeso.add(rbtnPeso8);
        rbtnPeso8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso8.setText("8");

        javax.swing.GroupLayout jPanelPesoLayout = new javax.swing.GroupLayout(jPanelPeso);
        jPanelPeso.setLayout(jPanelPesoLayout);
        jPanelPesoLayout.setHorizontalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnPeso8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso0998, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelPesoLayout.setVerticalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesoLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(rbtnPeso0998)
                .addGap(15, 15, 15)
                .addComponent(rbtnPeso8)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 170, 150));

        lblTamaño.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTamaño.setText("TAMAÑO (teclas)");
        getContentPane().add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 30));

        lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido.png"))); // NOI18N
        getContentPane().add(lblSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        btnSonido.setBackground(new java.awt.Color(255, 204, 204));
        btnSonido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSonido.setText("SONIDO");
        getContentPane().add(btnSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, 30));

        btnComprar.setBackground(new java.awt.Color(153, 255, 204));
        btnComprar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, 40));

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoMarcas.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_TecladoElectrico menuTeclado = new GUI_TecladoElectrico();
        menuTeclado.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasCuerdasActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        GUI_Compra compra = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_OpcionesTecladoElectrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesTecladoElectrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesTecladoElectrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesTecladoElectrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_OpcionesTecladoElectrico().setVisible(true);
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
    private javax.swing.JPanel jPanelColor;
    private javax.swing.JPanel jPanelMarca;
    private javax.swing.JPanel jPanelPeso;
    private javax.swing.JPanel jPanelTamaño;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoPrincipalMarca;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblTeclado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnAzul;
    private javax.swing.JRadioButton rbtnCafe;
    private javax.swing.JRadioButton rbtnCasio;
    private javax.swing.JRadioButton rbtnNegro1;
    private javax.swing.JRadioButton rbtnPeso0998;
    private javax.swing.JRadioButton rbtnPeso8;
    private javax.swing.JRadioButton rbtnRoland;
    private javax.swing.JRadioButton rbtnTam11;
    private javax.swing.JRadioButton rbtnTam139;
    private javax.swing.JRadioButton rbtnYamaha;
    // End of variables declaration//GEN-END:variables
}