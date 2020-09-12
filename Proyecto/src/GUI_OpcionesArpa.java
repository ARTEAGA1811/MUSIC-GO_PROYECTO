/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_OpcionesArpa extends javax.swing.JFrame {
    public TiendaInstrumento musicGo=new TiendaInstrumento();
    

    
    /**
     * Creates new form GUI_OpcionesArpa
     */
    public GUI_OpcionesArpa() {
        initComponents();
        setLocationRelativeTo(null);
        Instrumento.nomInstrumento = "Arpa";
        
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
        rbtnNegro = new javax.swing.JRadioButton();
        lblMarca = new javax.swing.JLabel();
        jPanelMarca = new javax.swing.JPanel();
        rbtnParaguayanHarps = new javax.swing.JRadioButton();
        rbtnAngeles = new javax.swing.JRadioButton();
        lblTamaño = new javax.swing.JLabel();
        jPanelTamaño = new javax.swing.JPanel();
        rbtnTam17 = new javax.swing.JRadioButton();
        rbtnTam15 = new javax.swing.JRadioButton();
        rbtnTam13 = new javax.swing.JRadioButton();
        lblMaterial = new javax.swing.JLabel();
        jPanelMaterial = new javax.swing.JPanel();
        rbtnMatCedro = new javax.swing.JRadioButton();
        rbtnMatSauce = new javax.swing.JRadioButton();
        lblPeso = new javax.swing.JLabel();
        jPanelPeso = new javax.swing.JPanel();
        rbtnPeso680 = new javax.swing.JRadioButton();
        rbtnPeso650 = new javax.swing.JRadioButton();
        rbtnPeso600 = new javax.swing.JRadioButton();
        btnAtrasCuerdas = new javax.swing.JButton();
        lblGuitarraAcustica1 = new javax.swing.JLabel();
        lblGuitarraAcustica = new javax.swing.JLabel();
        lblSonido = new javax.swing.JLabel();
        btnSonido = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

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

        jPanelColor.setBackground(new java.awt.Color(255, 204, 204));

        rbtnNatural.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnNatural);
        rbtnNatural.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnNatural.setText("Natural");

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
                .addGap(16, 16, 16)
                .addGroup(jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNatural)
                    .addGroup(jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rbtnNegro)
                        .addComponent(rbtnCafe, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbtnNegro)
                .addGap(18, 18, 18)
                .addComponent(rbtnCafe)
                .addGap(18, 18, 18)
                .addComponent(rbtnNatural)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 160));

        lblMarca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMarca.setText("MARCA");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 30));

        jPanelMarca.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupMarca.add(rbtnParaguayanHarps);
        rbtnParaguayanHarps.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnParaguayanHarps.setText("PARAGUAYANHARPS");

        buttonGroupMarca.add(rbtnAngeles);
        rbtnAngeles.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnAngeles.setText("AngelsWorld ");

        javax.swing.GroupLayout jPanelMarcaLayout = new javax.swing.GroupLayout(jPanelMarca);
        jPanelMarca.setLayout(jPanelMarcaLayout);
        jPanelMarcaLayout.setHorizontalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnAngeles)
                    .addComponent(rbtnParaguayanHarps))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelMarcaLayout.setVerticalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rbtnParaguayanHarps)
                .addGap(18, 18, 18)
                .addComponent(rbtnAngeles)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 110));

        lblTamaño.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTamaño.setText("TAMAÑO (m)");
        getContentPane().add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 30));

        jPanelTamaño.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupTamaño.add(rbtnTam17);
        rbtnTam17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam17.setText("1.7");

        buttonGroupTamaño.add(rbtnTam15);
        rbtnTam15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam15.setText("1.5");

        buttonGroupTamaño.add(rbtnTam13);
        rbtnTam13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam13.setText("1.3");

        javax.swing.GroupLayout jPanelTamañoLayout = new javax.swing.GroupLayout(jPanelTamaño);
        jPanelTamaño.setLayout(jPanelTamañoLayout);
        jPanelTamañoLayout.setHorizontalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTam15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelTamañoLayout.setVerticalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rbtnTam17)
                .addGap(13, 13, 13)
                .addComponent(rbtnTam15)
                .addGap(18, 18, 18)
                .addComponent(rbtnTam13)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 150));

        lblMaterial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMaterial.setText("MATERIAL");
        getContentPane().add(lblMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 30));

        jPanelMaterial.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupMaterial.add(rbtnMatCedro);
        rbtnMatCedro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatCedro.setText("Cedro");

        buttonGroupMaterial.add(rbtnMatSauce);
        rbtnMatSauce.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatSauce.setText("Sauce");

        javax.swing.GroupLayout jPanelMaterialLayout = new javax.swing.GroupLayout(jPanelMaterial);
        jPanelMaterial.setLayout(jPanelMaterialLayout);
        jPanelMaterialLayout.setHorizontalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMatSauce)
                    .addComponent(rbtnMatCedro))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelMaterialLayout.setVerticalGroup(
            jPanelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnMatCedro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnMatSauce)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, 70));

        lblPeso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPeso.setText("PESO (kg)");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 20));

        jPanelPeso.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroupPeso.add(rbtnPeso680);
        rbtnPeso680.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso680.setText("680");

        buttonGroupPeso.add(rbtnPeso650);
        rbtnPeso650.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso650.setText("650");

        buttonGroupPeso.add(rbtnPeso600);
        rbtnPeso600.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso600.setText("600");

        javax.swing.GroupLayout jPanelPesoLayout = new javax.swing.GroupLayout(jPanelPeso);
        jPanelPeso.setLayout(jPanelPesoLayout);
        jPanelPesoLayout.setHorizontalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnPeso600, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso650, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso680, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelPesoLayout.setVerticalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rbtnPeso680)
                .addGap(15, 15, 15)
                .addComponent(rbtnPeso650)
                .addGap(18, 18, 18)
                .addComponent(rbtnPeso600)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 170, 150));

        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        lblGuitarraAcustica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Arpas/arpa2.png"))); // NOI18N
        getContentPane().add(lblGuitarraAcustica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        lblGuitarraAcustica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Arpas/arpa1.png"))); // NOI18N
        getContentPane().add(lblGuitarraAcustica, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 130, 120, -1));

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
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, 40));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/FondoPrincipiante.png"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Arpas menuArpas = new GUI_Arpas();
        menuArpas.setVisible(true);
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
        if(rbtnMatCedro.isSelected()){
            materialInstrumento=rbtnMatCedro.getText();
        }
        else if(rbtnMatSauce.isSelected()){
            materialInstrumento=rbtnMatSauce.getText();
            }
        //Marca 
        if(rbtnParaguayanHarps.isSelected()){
            marca=rbtnParaguayanHarps.getText();
        }
        else if(rbtnAngeles.isSelected()){
            marca=rbtnAngeles.getText();
            }
        //Color 
        if(rbtnNegro.isSelected()){
            color=rbtnNegro.getText();
        }
        else if(rbtnCafe.isSelected()){
            color=rbtnCafe.getText();
            }
        else if(rbtnNatural.isSelected()){
            color=rbtnNatural.getText();
            }
        //Tamaño 
        if(rbtnTam17.isSelected()){
            tamaño=Double.parseDouble(rbtnTam17.getText());
        }
        else if(rbtnTam15.isSelected()){
            tamaño=Double.parseDouble(rbtnTam15.getText());
            }
        else if(rbtnTam13.isSelected()){
            tamaño=Double.parseDouble(rbtnTam13.getText());
            }
        //Peso 
        if(rbtnPeso600.isSelected()){
            peso=Double.parseDouble(rbtnPeso600.getText());
        }
        else if(rbtnPeso650.isSelected()){
            peso=Double.parseDouble(rbtnPeso650.getText());
            }
        else if(rbtnPeso680.isSelected()){
            peso=Double.parseDouble(rbtnPeso680.getText());
            }
        
        Instrumento miArpa=new Punteo(materialInstrumento, color, tamaño, peso, marca);
        Instrumento.precioInst = miArpa.calcularPrecio(Instrumento.nomInstrumento);
        musicGo.setInstrumentos(miArpa);
        
        
        GUI_Compra compra = new GUI_Compra();
        compra.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        // TODO add your handling code here:
        
        new Punteo().producirSonido(GUI_Arpas.ins);
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
            java.util.logging.Logger.getLogger(GUI_OpcionesArpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesArpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesArpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesArpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_OpcionesArpa().setVisible(true);
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
    private javax.swing.JLabel lblGuitarraAcustica;
    private javax.swing.JLabel lblGuitarraAcustica1;
    private javax.swing.JLabel lblLogoPrincipalMarca;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JRadioButton rbtnAngeles;
    private javax.swing.JRadioButton rbtnCafe;
    private javax.swing.JRadioButton rbtnMatCedro;
    private javax.swing.JRadioButton rbtnMatSauce;
    private javax.swing.JRadioButton rbtnNatural;
    private javax.swing.JRadioButton rbtnNegro;
    private javax.swing.JRadioButton rbtnParaguayanHarps;
    private javax.swing.JRadioButton rbtnPeso600;
    private javax.swing.JRadioButton rbtnPeso650;
    private javax.swing.JRadioButton rbtnPeso680;
    private javax.swing.JRadioButton rbtnTam13;
    private javax.swing.JRadioButton rbtnTam15;
    private javax.swing.JRadioButton rbtnTam17;
    // End of variables declaration//GEN-END:variables
}
