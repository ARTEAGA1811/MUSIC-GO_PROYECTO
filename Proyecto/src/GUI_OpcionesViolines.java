/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_OpcionesViolines extends javax.swing.JFrame {
    public TiendaInstrumento musicGo=new TiendaInstrumento();
    /**
     * Creates new form GUI_OpcionesViolines
     */
    public GUI_OpcionesViolines() {
        initComponents();
        setLocationRelativeTo(null);
        Instrumento.nomInstrumento = "Violin";
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
        rbtnNatural = new javax.swing.JRadioButton();
        rbtnCafe = new javax.swing.JRadioButton();
        jPanelMarca = new javax.swing.JPanel();
        rbtnSonjLin = new javax.swing.JRadioButton();
        rbtnYoseng = new javax.swing.JRadioButton();
        rbtnGolden = new javax.swing.JRadioButton();
        lblMarca = new javax.swing.JLabel();
        btnAtrasCuerdas = new javax.swing.JButton();
        lblTamaño = new javax.swing.JLabel();
        jPanelTamaño = new javax.swing.JPanel();
        rbtnTam06 = new javax.swing.JRadioButton();
        rbtnTam057 = new javax.swing.JRadioButton();
        rbtnTam052 = new javax.swing.JRadioButton();
        jPanelMaterial = new javax.swing.JPanel();
        rbtnMatCaoba = new javax.swing.JRadioButton();
        rbtnMatSapele = new javax.swing.JRadioButton();
        lblMaterial = new javax.swing.JLabel();
        lblGuitarraAcustica1 = new javax.swing.JLabel();
        lblGuitarraAcustica = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        jPanelPeso = new javax.swing.JPanel();
        rbtnPeso047 = new javax.swing.JRadioButton();
        rbtnPeso043 = new javax.swing.JRadioButton();
        rbtnPeso040 = new javax.swing.JRadioButton();
        lblSonido = new javax.swing.JLabel();
        btnSonido = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
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
        getContentPane().add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 20));

        jPanelColor.setBackground(new java.awt.Color(204, 255, 255));

        rbtnNatural.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnNatural);
        rbtnNatural.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnNatural.setText("Natural");

        rbtnCafe.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnCafe);
        rbtnCafe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnCafe.setText("Café");

        javax.swing.GroupLayout jPanelColorLayout = new javax.swing.GroupLayout(jPanelColor);
        jPanelColor.setLayout(jPanelColorLayout);
        jPanelColorLayout.setHorizontalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNatural)
                    .addComponent(rbtnCafe))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelColorLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(rbtnCafe)
                .addGap(27, 27, 27)
                .addComponent(rbtnNatural)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 160));

        jPanelMarca.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroupMarca.add(rbtnSonjLin);
        rbtnSonjLin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnSonjLin.setText("SONJ LIN");

        buttonGroupMarca.add(rbtnYoseng);
        rbtnYoseng.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnYoseng.setText("YOSENG");

        buttonGroupMarca.add(rbtnGolden);
        rbtnGolden.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnGolden.setText("GOLDEN");

        javax.swing.GroupLayout jPanelMarcaLayout = new javax.swing.GroupLayout(jPanelMarca);
        jPanelMarca.setLayout(jPanelMarcaLayout);
        jPanelMarcaLayout.setHorizontalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnGolden)
                    .addComponent(rbtnYoseng)
                    .addComponent(rbtnSonjLin))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanelMarcaLayout.setVerticalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnSonjLin)
                .addGap(18, 18, 18)
                .addComponent(rbtnYoseng)
                .addGap(18, 18, 18)
                .addComponent(rbtnGolden)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 120));

        lblMarca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMarca.setText("MARCA");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 30));

        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        lblTamaño.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTamaño.setText("TAMAÑO (m)");
        getContentPane().add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 30));

        jPanelTamaño.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroupTamaño.add(rbtnTam06);
        rbtnTam06.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam06.setText("0.6");

        buttonGroupTamaño.add(rbtnTam057);
        rbtnTam057.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam057.setText("0.57");

        buttonGroupTamaño.add(rbtnTam052);
        rbtnTam052.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam052.setText("0.52");

        javax.swing.GroupLayout jPanelTamañoLayout = new javax.swing.GroupLayout(jPanelTamaño);
        jPanelTamaño.setLayout(jPanelTamañoLayout);
        jPanelTamañoLayout.setHorizontalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTam057, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam06, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam052, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanelTamañoLayout.setVerticalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rbtnTam06)
                .addGap(13, 13, 13)
                .addComponent(rbtnTam057)
                .addGap(18, 18, 18)
                .addComponent(rbtnTam052)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 150));

        jPanelMaterial.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroupMaterial.add(rbtnMatCaoba);
        rbtnMatCaoba.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatCaoba.setText("Caoba");

        buttonGroupMaterial.add(rbtnMatSapele);
        rbtnMatSapele.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatSapele.setText("Sapele");

        javax.swing.GroupLayout jPanelMaterialLayout = new javax.swing.GroupLayout(jPanelMaterial);
        jPanelMaterial.setLayout(jPanelMaterialLayout);
        jPanelMaterialLayout.setHorizontalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMatSapele)
                    .addComponent(rbtnMatCaoba))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelMaterialLayout.setVerticalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnMatCaoba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnMatSapele)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, 60));

        lblMaterial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMaterial.setText("MATERIAL");
        getContentPane().add(lblMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 30));

        lblGuitarraAcustica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin3.png"))); // NOI18N
        getContentPane().add(lblGuitarraAcustica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        lblGuitarraAcustica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Violin/violin1.png"))); // NOI18N
        getContentPane().add(lblGuitarraAcustica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        lblPeso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPeso.setText("PESO (kg)");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 20));

        jPanelPeso.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroupPeso.add(rbtnPeso047);
        rbtnPeso047.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso047.setText("0.47");

        buttonGroupPeso.add(rbtnPeso043);
        rbtnPeso043.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso043.setText("0.43");

        buttonGroupPeso.add(rbtnPeso040);
        rbtnPeso040.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso040.setText("0.40");

        javax.swing.GroupLayout jPanelPesoLayout = new javax.swing.GroupLayout(jPanelPeso);
        jPanelPeso.setLayout(jPanelPesoLayout);
        jPanelPesoLayout.setHorizontalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnPeso040, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso043, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso047, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelPesoLayout.setVerticalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rbtnPeso047)
                .addGap(15, 15, 15)
                .addComponent(rbtnPeso043)
                .addGap(18, 18, 18)
                .addComponent(rbtnPeso040)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 170, 150));

        lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido.png"))); // NOI18N
        getContentPane().add(lblSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        btnSonido.setBackground(new java.awt.Color(255, 204, 204));
        btnSonido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSonido.setText("SONIDO");
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, 30));

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
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondofondo1_3.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Violin menuViolin = new GUI_Violin();
        menuViolin.setVisible(true);
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
        if(rbtnMatCaoba.isSelected()){
            materialInstrumento=rbtnMatCaoba.getText();
        }
        else if(rbtnMatSapele.isSelected()){
            materialInstrumento=rbtnMatSapele.getText();
            }
        //Marca 
        if(rbtnGolden.isSelected()){
            marca=rbtnGolden.getText();
        }
        else if(rbtnYoseng.isSelected()){
            marca=rbtnYoseng.getText();
            }
        else if(rbtnSonjLin.isSelected()){
            marca=rbtnSonjLin.getText();
            }
        //Color 
        if(rbtnCafe.isSelected()){
            color=rbtnCafe.getText();
        }
        else if(rbtnNatural.isSelected()){
            color=rbtnNatural.getText();
            }
        //Tamaño 
        if(rbtnTam052.isSelected()){
            tamaño=Double.parseDouble(rbtnTam052.getText());
        }
        else if(rbtnTam057.isSelected()){
            tamaño=Double.parseDouble(rbtnTam057.getText());
            }
        else if(rbtnTam06.isSelected()){
            tamaño=Double.parseDouble(rbtnTam06.getText());
            }
        //Peso 
        if(rbtnPeso040.isSelected()){
            peso=Double.parseDouble(rbtnPeso040.getText());
        }
        else if(rbtnPeso043.isSelected()){
            peso=Double.parseDouble(rbtnPeso043.getText());
            }
        else if(rbtnPeso047.isSelected()){
            peso=Double.parseDouble(rbtnPeso047.getText());
            }
        
        Instrumento miViolin=new Frotacion(materialInstrumento, color, tamaño, peso, marca);
        Instrumento.precioInst = miViolin.calcularPrecio(Instrumento.nomInstrumento);
        musicGo.setInstrumentos(miViolin);
        
        GUI_Compra compra = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        // TODO add your handling code here:
        
        new Frotacion().producirSonido(GUI_Violin.ins);
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
            java.util.logging.Logger.getLogger(GUI_OpcionesViolines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesViolines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesViolines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesViolines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_OpcionesViolines().setVisible(true);
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
    private javax.swing.JRadioButton rbtnCafe;
    private javax.swing.JRadioButton rbtnGolden;
    private javax.swing.JRadioButton rbtnMatCaoba;
    private javax.swing.JRadioButton rbtnMatSapele;
    private javax.swing.JRadioButton rbtnNatural;
    private javax.swing.JRadioButton rbtnPeso040;
    private javax.swing.JRadioButton rbtnPeso043;
    private javax.swing.JRadioButton rbtnPeso047;
    private javax.swing.JRadioButton rbtnSonjLin;
    private javax.swing.JRadioButton rbtnTam052;
    private javax.swing.JRadioButton rbtnTam057;
    private javax.swing.JRadioButton rbtnTam06;
    private javax.swing.JRadioButton rbtnYoseng;
    // End of variables declaration//GEN-END:variables
}
