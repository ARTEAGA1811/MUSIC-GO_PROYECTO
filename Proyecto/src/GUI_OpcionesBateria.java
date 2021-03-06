
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
public class GUI_OpcionesBateria extends javax.swing.JFrame {

    public TiendaInstrumento musicGo=new TiendaInstrumento();
    
    /**
     * Creates new form GUI_OpcionesBateria
     */
    public GUI_OpcionesBateria() {
        initComponents();
        setLocationRelativeTo(null);
        Instrumento.nomInstrumento = "Bateria";
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

        buttonGroupColor = new javax.swing.ButtonGroup();
        buttonGroupMarca = new javax.swing.ButtonGroup();
        buttonGroupMaterial = new javax.swing.ButtonGroup();
        buttonGroupTamaño = new javax.swing.ButtonGroup();
        buttonGroupPeso = new javax.swing.ButtonGroup();
        lblLogoPrincipalMarca = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jPanelColor = new javax.swing.JPanel();
        rbtnAzul = new javax.swing.JRadioButton();
        rbtnRojo = new javax.swing.JRadioButton();
        rbtnCafe = new javax.swing.JRadioButton();
        rbtnNegro = new javax.swing.JRadioButton();
        lblMarca = new javax.swing.JLabel();
        jPanelMarca = new javax.swing.JPanel();
        rbtnYamaha = new javax.swing.JRadioButton();
        rbtnPremier = new javax.swing.JRadioButton();
        rbtnGretsch = new javax.swing.JRadioButton();
        btnAtrasCuerdas = new javax.swing.JButton();
        lblMaterial = new javax.swing.JLabel();
        jPanelMaterial = new javax.swing.JPanel();
        rbtnMatCaoba = new javax.swing.JRadioButton();
        rbtnMatSapele = new javax.swing.JRadioButton();
        lblTamaño = new javax.swing.JLabel();
        jPanelTamaño = new javax.swing.JPanel();
        rbtnTam3x3 = new javax.swing.JRadioButton();
        rbtnTam2x2 = new javax.swing.JRadioButton();
        lblPeso = new javax.swing.JLabel();
        jPanelPeso = new javax.swing.JPanel();
        rbtnPeso60 = new javax.swing.JRadioButton();
        rbtnPeso45 = new javax.swing.JRadioButton();
        lblBateria = new javax.swing.JLabel();
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

        jPanelColor.setBackground(new java.awt.Color(204, 255, 204));

        rbtnAzul.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnAzul);
        rbtnAzul.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnAzul.setText("Azul");

        rbtnRojo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnRojo);
        rbtnRojo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnRojo.setText("Rojo");

        rbtnCafe.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnCafe);
        rbtnCafe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnCafe.setText("Café");

        rbtnNegro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColor.add(rbtnNegro);
        rbtnNegro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnNegro.setSelected(true);
        rbtnNegro.setText("Negro");

        javax.swing.GroupLayout jPanelColorLayout = new javax.swing.GroupLayout(jPanelColor);
        jPanelColor.setLayout(jPanelColorLayout);
        jPanelColorLayout.setHorizontalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnAzul)
                    .addGroup(jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rbtnNegro)
                        .addComponent(rbtnCafe, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rbtnRojo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelColorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnNegro)
                .addGap(18, 18, 18)
                .addComponent(rbtnCafe)
                .addGap(18, 18, 18)
                .addComponent(rbtnRojo)
                .addGap(18, 18, 18)
                .addComponent(rbtnAzul)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 160));

        lblMarca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMarca.setText("MARCA");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 30));

        jPanelMarca.setBackground(new java.awt.Color(204, 255, 204));

        buttonGroupMarca.add(rbtnYamaha);
        rbtnYamaha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnYamaha.setSelected(true);
        rbtnYamaha.setText("YAMAHA");

        buttonGroupMarca.add(rbtnPremier);
        rbtnPremier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPremier.setText("PREMIER");

        buttonGroupMarca.add(rbtnGretsch);
        rbtnGretsch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnGretsch.setText("GRETSCH");

        javax.swing.GroupLayout jPanelMarcaLayout = new javax.swing.GroupLayout(jPanelMarca);
        jPanelMarca.setLayout(jPanelMarcaLayout);
        jPanelMarcaLayout.setHorizontalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnGretsch)
                    .addComponent(rbtnPremier)
                    .addComponent(rbtnYamaha))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanelMarcaLayout.setVerticalGroup(
            jPanelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnYamaha)
                .addGap(18, 18, 18)
                .addComponent(rbtnPremier)
                .addGap(18, 18, 18)
                .addComponent(rbtnGretsch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 120));

        btnAtrasCuerdas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAtrasCuerdas.setText("Atrás");
        btnAtrasCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCuerdasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCuerdas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 40));

        lblMaterial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMaterial.setText("MATERIAL");
        getContentPane().add(lblMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 30));

        jPanelMaterial.setBackground(new java.awt.Color(204, 255, 204));

        buttonGroupMaterial.add(rbtnMatCaoba);
        rbtnMatCaoba.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnMatCaoba.setSelected(true);
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

        lblTamaño.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTamaño.setText("TAMAÑO (m)");
        getContentPane().add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 30));

        jPanelTamaño.setBackground(new java.awt.Color(204, 255, 204));

        buttonGroupTamaño.add(rbtnTam3x3);
        rbtnTam3x3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam3x3.setSelected(true);
        rbtnTam3x3.setText("3 x 3");

        buttonGroupTamaño.add(rbtnTam2x2);
        rbtnTam2x2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnTam2x2.setText("2 x 2");

        javax.swing.GroupLayout jPanelTamañoLayout = new javax.swing.GroupLayout(jPanelTamaño);
        jPanelTamaño.setLayout(jPanelTamañoLayout);
        jPanelTamañoLayout.setHorizontalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTam2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTam3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanelTamañoLayout.setVerticalGroup(
            jPanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTamañoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(rbtnTam3x3)
                .addGap(13, 13, 13)
                .addComponent(rbtnTam2x2)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 150));

        lblPeso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPeso.setText("PESO (kg)");
        getContentPane().add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 20));

        jPanelPeso.setBackground(new java.awt.Color(204, 255, 204));

        buttonGroupPeso.add(rbtnPeso60);
        rbtnPeso60.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso60.setSelected(true);
        rbtnPeso60.setText("60");

        buttonGroupPeso.add(rbtnPeso45);
        rbtnPeso45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPeso45.setText("45");

        javax.swing.GroupLayout jPanelPesoLayout = new javax.swing.GroupLayout(jPanelPeso);
        jPanelPeso.setLayout(jPanelPesoLayout);
        jPanelPesoLayout.setHorizontalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnPeso45, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPeso60, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelPesoLayout.setVerticalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(rbtnPeso60)
                .addGap(15, 15, 15)
                .addComponent(rbtnPeso45)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 170, 150));

        lblBateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Bateria/bateria1.png"))); // NOI18N
        getContentPane().add(lblBateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido.png"))); // NOI18N
        getContentPane().add(lblSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, -1, -1));

        btnSonido.setBackground(new java.awt.Color(255, 204, 204));
        btnSonido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSonido.setText("SONIDO");
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, 30));

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
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/Fondo1.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCuerdasActionPerformed
        // TODO add your handling code here:
        GUI_Bateria menuBateria = new GUI_Bateria();
        menuBateria.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasCuerdasActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here
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
        if(rbtnGretsch.isSelected()){
            marca=rbtnGretsch.getText();
        }
        else if(rbtnPremier.isSelected()){
            marca=rbtnPremier.getText();
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
        else if(rbtnAzul.isSelected()){
            color=rbtnAzul.getText();
            }
        else if(rbtnRojo.isSelected()){
            color=rbtnRojo.getText();
            }
        //Tamaño 
        if(rbtnTam2x2.isSelected()){
            tamaño=4.0;
        }
        else if(rbtnTam3x3.isSelected()){
            tamaño=9.0;
            }
        //Peso 
        if(rbtnPeso45.isSelected()){
            peso=Double.parseDouble(rbtnPeso45.getText());
        }
        else if(rbtnPeso60.isSelected()){
            peso=Double.parseDouble(rbtnPeso60.getText());
            }
        
        Instrumento miBateria=new PercusionMembranofos(materialInstrumento, color, tamaño, peso, marca);
        Instrumento.precioInst = miBateria.calcularPrecio(Instrumento.nomInstrumento);        
        musicGo.setInstrumentos(miBateria);
        Instrumento.descripcionInstr = miBateria.toString();
        
        GUI_Compra compra = new GUI_Compra();
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        // TODO add your handling code here:
        
        new PercusionMembranofos().producirSonido(GUI_Bateria.ins);
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
            java.util.logging.Logger.getLogger(GUI_OpcionesBateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesBateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesBateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_OpcionesBateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_OpcionesBateria().setVisible(true);
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
    private javax.swing.JLabel lblBateria;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogoPrincipalMarca;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnAzul;
    private javax.swing.JRadioButton rbtnCafe;
    private javax.swing.JRadioButton rbtnGretsch;
    private javax.swing.JRadioButton rbtnMatCaoba;
    private javax.swing.JRadioButton rbtnMatSapele;
    private javax.swing.JRadioButton rbtnNegro;
    private javax.swing.JRadioButton rbtnPeso45;
    private javax.swing.JRadioButton rbtnPeso60;
    private javax.swing.JRadioButton rbtnPremier;
    private javax.swing.JRadioButton rbtnRojo;
    private javax.swing.JRadioButton rbtnTam2x2;
    private javax.swing.JRadioButton rbtnTam3x3;
    private javax.swing.JRadioButton rbtnYamaha;
    // End of variables declaration//GEN-END:variables
}
