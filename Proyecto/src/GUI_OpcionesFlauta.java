/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_OpcionesFlauta extends javax.swing.JFrame {
    public TiendaInstrumento musicGo=new TiendaInstrumento();

    /**
     * Creates new form GUI_OpcionesFlauta
     */
    public GUI_OpcionesFlauta() {
        initComponents();
        setLocationRelativeTo(null);
        Instrumento.nomInstrumento = "Flauta";
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
        lblColor = new javax.swing.JLabel();
        jPanelColor = new javax.swing.JPanel();
        rbtnCafe = new javax.swing.JRadioButton();
        rbtnNegro = new javax.swing.JRadioButton();
        btnAtrasCuerdas = new javax.swing.JButton();
        jPanelTamaño = new javax.swing.JPanel();
        rbtnTam080 = new javax.swing.JRadioButton();
        rbtnTam060 = new javax.swing.JRadioButton();
        rbtnTam03 = new javax.swing.JRadioButton();
        lblTamaño = new javax.swing.JLabel();
        jPanelMaterial = new javax.swing.JPanel();
        rbtnMatEbano = new javax.swing.JRadioButton();
        rbtnMatPlata = new javax.swing.JRadioButton();
        rbtnMatPlatino = new javax.swing.JRadioButton();
        lblMaterial = new javax.swing.JLabel();
        lblFlauta1 = new javax.swing.JLabel();
        lblFlauta = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        jPanelPeso = new javax.swing.JPanel();
        rbtnPeso0127 = new javax.swing.JRadioButton();
        rbtnPeso011 = new javax.swing.JRadioButton();
        rbtnPeso080 = new javax.swing.JRadioButton();
        lblSonido = new javax.swing.JLabel();
        btnSonido = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        lblMarca = new javax.swing.JLabel();
        jPanelMarca = new javax.swing.JPanel();
        rbtnOdissey = new javax.swing.JRadioButton();
        rbtnYamaha = new javax.swing.JRadioButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoPrincipalMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPrincipalMarca1.png"))); // NOI18N
        getContentPane().add(lblLogoPrincipalMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 200, 50));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setText("¡Elige lo que más te guste!");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblColor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblColor.setText("COLOR");
        getContentPane().add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jPanelColor.setBackground(new java.awt.Color(204, 255, 255));

        rbtnCafe.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnCafe);
        rbtnCafe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnCafe.setText("Café");

        rbtnNegro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnNegro);
        rbtnNegro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnNegro.setText("Negro");

        javax.swing.GroupLayout jPanelColorLayout = new javax.swing.GroupLayout(jPanelColor);
        jPanelColor.setLayout(jPanelColorLayout);
        jPanelColorLayout.setHorizontalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnNegro)
                    .addComponent(rbtnCafe, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(rbtnNegro)
                .addGap(18, 18, 18)
                .addComponent(rbtnCafe)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 160));

        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        jPanelTamaño.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroupTamaño.add(rbtnTam080);
        rbtnTam080.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam080.setText("0.80");

        buttonGroupTamaño.add(rbtnTam060);
        rbtnTam060.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam060.setText("0.60");

        buttonGroupTamaño.add(rbtnTam03);
        rbtnTam03.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam03.setText("0.3");

        javax.swing.GroupLayout jPanelTamañoLayout = new javax.swing.GroupLayout(jPanelTamaño);
        jPanelTamaño.setLayout(jPanelTamañoLayout);
        jPanelTamañoLayout.setHorizontalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTam060, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam080, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam03, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanelTamañoLayout.setVerticalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rbtnTam080)
                .addGap(13, 13, 13)
                .addComponent(rbtnTam060)
                .addGap(18, 18, 18)
                .addComponent(rbtnTam03)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 150));

        lblTamaño.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTamaño.setText("TAMAÑO (m)");
        getContentPane().add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 30));

        jPanelMaterial.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroupMaterial.add(rbtnMatEbano);
        rbtnMatEbano.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatEbano.setText("Ébano ");

        buttonGroupMaterial.add(rbtnMatPlata);
        rbtnMatPlata.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatPlata.setText("Plata");

        buttonGroupMaterial.add(rbtnMatPlatino);
        rbtnMatPlatino.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatPlatino.setText("Platino");

        javax.swing.GroupLayout jPanelMaterialLayout = new javax.swing.GroupLayout(jPanelMaterial);
        jPanelMaterial.setLayout(jPanelMaterialLayout);
        jPanelMaterialLayout.setHorizontalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMatPlata)
                    .addComponent(rbtnMatEbano)
                    .addComponent(rbtnMatPlatino))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanelMaterialLayout.setVerticalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnMatEbano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnMatPlata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnMatPlatino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, 90));

        lblMaterial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMaterial.setText("MATERIAL");
        getContentPane().add(lblMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 30));

        lblFlauta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Flautas/flauta1.png"))); // NOI18N
        getContentPane().add(lblFlauta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        lblFlauta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Flautas/flauta3.png"))); // NOI18N
        getContentPane().add(lblFlauta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        lblPeso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPeso.setText("PESO (kg)");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 20));

        jPanelPeso.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroupPeso.add(rbtnPeso0127);
        rbtnPeso0127.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso0127.setText("0.127");

        buttonGroupPeso.add(rbtnPeso011);
        rbtnPeso011.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso011.setText("0.11");

        buttonGroupPeso.add(rbtnPeso080);
        rbtnPeso080.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso080.setText("0.80");

        javax.swing.GroupLayout jPanelPesoLayout = new javax.swing.GroupLayout(jPanelPeso);
        jPanelPeso.setLayout(jPanelPesoLayout);
        jPanelPesoLayout.setHorizontalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnPeso080, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso011, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso0127, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelPesoLayout.setVerticalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rbtnPeso0127)
                .addGap(15, 15, 15)
                .addComponent(rbtnPeso011)
                .addGap(18, 18, 18)
                .addComponent(rbtnPeso080)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 170, 150));

        lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido.png"))); // NOI18N
        getContentPane().add(lblSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, -1, -1));

        btnSonido.setBackground(new java.awt.Color(255, 204, 204));
        btnSonido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSonido.setText("SONIDO");
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, 30));

        btnComprar.setBackground(new java.awt.Color(153, 255, 204));
        btnComprar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, 40));

        lblMarca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMarca.setText("MARCA");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jPanelMarca.setBackground(new java.awt.Color(204, 255, 255));

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

        getContentPane().add(jPanelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 110));

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondofondo1_3.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Flauta menuFlautas = new GUI_Flauta();
        menuFlautas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasCuerdasActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        String materialInstrumento="";
        String marca="";
        String color="";
        double peso=0;
        double tamaño=0;
        //Material 
        if(rbtnMatEbano.isSelected()){
            materialInstrumento=rbtnMatEbano.getText();
        }
        else if(rbtnMatPlata.isSelected()){
            materialInstrumento=rbtnMatPlata.getText();
            }
        else if(rbtnMatPlatino.isSelected()){
            materialInstrumento=rbtnMatPlatino.getText();
            }
        //Marca 
        if(rbtnOdissey.isSelected()){
            marca=rbtnOdissey.getText();
        }
        else if(rbtnYamaha.isSelected()){
            marca=rbtnYamaha.getText();
            }
        else if(rbtnYamaha.isSelected()){
            marca=rbtnYamaha.getText();
            }
        //Color 
        if(rbtnNegro.isSelected()){
            color=rbtnNegro.getText();
        }
        else if(rbtnCafe.isSelected()){
            color=rbtnCafe.getText();
            }
        
        //Tamaño 
        if(rbtnTam03.isSelected()){
            tamaño = Double.parseDouble(rbtnTam03.getText());
        }
        else if(rbtnTam060.isSelected()){
            tamaño = Double.parseDouble(rbtnTam060.getText());
            }
        else if(rbtnTam080.isSelected()){
            tamaño = Double.parseDouble(rbtnTam080.getText());
            }
        
        
        //Peso 
        if(rbtnPeso011.isSelected()){
            peso=Double.parseDouble(rbtnPeso011.getText());
        }
        else if(rbtnPeso0127.isSelected()){
            peso=Double.parseDouble(rbtnPeso0127.getText());
            }
        else if(rbtnPeso080.isSelected()){
            peso=Double.parseDouble(rbtnPeso080.getText());
            }
        
        Instrumento miFlauta =new Directo(materialInstrumento, color, tamaño, peso, marca);
        Instrumento.precioInst = miFlauta.calcularPrecio(Instrumento.nomInstrumento);        
        musicGo.setInstrumentos(miFlauta);
        
        GUI_Compra compra = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void rbtnOdisseyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOdisseyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOdisseyActionPerformed

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        // TODO add your handling code here:
        
        new Directo().producirSonido(GUI_Flauta.ins);
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
            java.util.logging.Logger.getLogger(GUI_OpcionesFlauta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesFlauta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesFlauta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesFlauta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_OpcionesFlauta().setVisible(true);
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
    private javax.swing.JPanel jPanelMaterial;
    private javax.swing.JPanel jPanelPeso;
    private javax.swing.JPanel jPanelTamaño;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFlauta;
    private javax.swing.JLabel lblFlauta1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoPrincipalMarca;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnCafe;
    private javax.swing.JRadioButton rbtnMatEbano;
    private javax.swing.JRadioButton rbtnMatPlata;
    private javax.swing.JRadioButton rbtnMatPlatino;
    private javax.swing.JRadioButton rbtnNegro;
    private javax.swing.JRadioButton rbtnOdissey;
    private javax.swing.JRadioButton rbtnPeso011;
    private javax.swing.JRadioButton rbtnPeso0127;
    private javax.swing.JRadioButton rbtnPeso080;
    private javax.swing.JRadioButton rbtnTam03;
    private javax.swing.JRadioButton rbtnTam060;
    private javax.swing.JRadioButton rbtnTam080;
    private javax.swing.JRadioButton rbtnYamaha;
    // End of variables declaration//GEN-END:variables
}
