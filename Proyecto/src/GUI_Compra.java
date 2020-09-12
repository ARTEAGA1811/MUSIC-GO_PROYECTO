
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class GUI_Compra extends javax.swing.JFrame {
    
    static String factura;
    /**
     * Creates new form GUI_Compra
     */
    public GUI_Compra() {
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

        buttonGroupClientes = new javax.swing.ButtonGroup();
        lblVIP = new javax.swing.JLabel();
        jPanelTipoCliente = new javax.swing.JPanel();
        rbtnAmateur = new javax.swing.JRadioButton();
        rbtnMusicoProfesional = new javax.swing.JRadioButton();
        rbtnPersonaJuridica = new javax.swing.JRadioButton();
        rbtnPublicoGeneral = new javax.swing.JRadioButton();
        jPanelPaseVIP = new javax.swing.JPanel();
        lblCodigoVIP = new javax.swing.JLabel();
        txtCodigoVIP = new javax.swing.JTextField();
        jPanelDatosPersonales = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtIdentificador = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblIdentificador = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblDatos = new javax.swing.JLabel();
        lblTipoCliente = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreTarjeta = new javax.swing.JTextField();
        txtNumTarjeta = new javax.swing.JTextField();
        txtFechaCaducidad = new javax.swing.JTextField();
        txtCVC = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVIP.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblVIP.setText("VIP");
        getContentPane().add(lblVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        jPanelTipoCliente.setBackground(new java.awt.Color(204, 255, 255));

        rbtnAmateur.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupClientes.add(rbtnAmateur);
        rbtnAmateur.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnAmateur.setText("Amateur");
        rbtnAmateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAmateurActionPerformed(evt);
            }
        });

        rbtnMusicoProfesional.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupClientes.add(rbtnMusicoProfesional);
        rbtnMusicoProfesional.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnMusicoProfesional.setText("Músico Profesional");
        rbtnMusicoProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMusicoProfesionalActionPerformed(evt);
            }
        });

        rbtnPersonaJuridica.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupClientes.add(rbtnPersonaJuridica);
        rbtnPersonaJuridica.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnPersonaJuridica.setText("Persona Jurídica");
        rbtnPersonaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPersonaJuridicaActionPerformed(evt);
            }
        });

        rbtnPublicoGeneral.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupClientes.add(rbtnPublicoGeneral);
        rbtnPublicoGeneral.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnPublicoGeneral.setText("Público General");
        rbtnPublicoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPublicoGeneralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipoClienteLayout = new javax.swing.GroupLayout(jPanelTipoCliente);
        jPanelTipoCliente.setLayout(jPanelTipoClienteLayout);
        jPanelTipoClienteLayout.setHorizontalGroup(
            jPanelTipoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMusicoProfesional)
                    .addComponent(rbtnPersonaJuridica)
                    .addComponent(rbtnPublicoGeneral)
                    .addComponent(rbtnAmateur))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanelTipoClienteLayout.setVerticalGroup(
            jPanelTipoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoClienteLayout.createSequentialGroup()
                .addComponent(rbtnAmateur, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnMusicoProfesional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnPersonaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnPublicoGeneral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 350, 110));

        jPanelPaseVIP.setBackground(new java.awt.Color(204, 255, 255));
        jPanelPaseVIP.setForeground(new java.awt.Color(255, 255, 255));

        lblCodigoVIP.setBackground(new java.awt.Color(255, 255, 255));
        lblCodigoVIP.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblCodigoVIP.setText("Ingrese su código");

        txtCodigoVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPaseVIPLayout = new javax.swing.GroupLayout(jPanelPaseVIP);
        jPanelPaseVIP.setLayout(jPanelPaseVIPLayout);
        jPanelPaseVIPLayout.setHorizontalGroup(
            jPanelPaseVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaseVIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigoVIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(txtCodigoVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPaseVIPLayout.setVerticalGroup(
            jPanelPaseVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaseVIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPaseVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoVIP)
                    .addComponent(txtCodigoVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPaseVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 350, 40));

        jPanelDatosPersonales.setBackground(new java.awt.Color(204, 255, 255));
        jPanelDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        lblApellido.setText("Apellido");

        lblIdentificador.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblIdentificador.setText("Cédula / RUC");

        lblCantidad.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblCantidad.setText("Cantidad");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Dirección");

        javax.swing.GroupLayout jPanelDatosPersonalesLayout = new javax.swing.GroupLayout(jPanelDatosPersonales);
        jPanelDatosPersonales.setLayout(jPanelDatosPersonalesLayout);
        jPanelDatosPersonalesLayout.setHorizontalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(lblIdentificador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelDatosPersonalesLayout.setVerticalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(lblIdentificador)
                        .addGap(18, 18, 18)
                        .addComponent(lblCantidad)
                        .addGap(33, 33, 33))
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        getContentPane().add(jPanelDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 330, 210));

        lblDatos.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDatos.setText("Datos");
        getContentPane().add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        lblTipoCliente.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblTipoCliente.setText("Tipo de Cliente");
        getContentPane().add(lblTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        btnComprar.setBackground(new java.awt.Color(153, 255, 204));
        btnComprar.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 110, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("Pago");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jPanelPanel.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la tarjeta");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Número de la Tarjeta");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Caducidad (mm/yy)");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("CVC/CVV");

        javax.swing.GroupLayout jPanelPanelLayout = new javax.swing.GroupLayout(jPanelPanel);
        jPanelPanel.setLayout(jPanelPanelLayout);
        jPanelPanelLayout.setHorizontalGroup(
            jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPanelLayout.createSequentialGroup()
                        .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(txtCVC)))
                    .addGroup(jPanelPanelLayout.createSequentialGroup()
                        .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreTarjeta)
                            .addComponent(txtNumTarjeta))))
                .addContainerGap())
        );
        jPanelPanelLayout.setVerticalGroup(
            jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 350, 150));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPrincipalMarca1.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/Fondo1.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnAmateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAmateurActionPerformed
        // TODO add your handling code here:
        txtCodigoVIP.setText("");
        txtCodigoVIP.setEditable(false);
        
        //pago
        txtNombreTarjeta.setEditable(true);
        txtNumTarjeta.setEditable(true);
        txtFechaCaducidad.setEditable(true);
        txtCVC.setEditable(true);
        
        //dato
        txtNombre.setEditable(true);
        txtApellido.setEditable(true);
        txtDireccion.setEditable(true);
        txtIdentificador.setEditable(true);
        txtCantidad.setEditable(true);
        
        
        
    }//GEN-LAST:event_rbtnAmateurActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVIPActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_txtCodigoVIPActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        GUI_MenuPrincipal menuPrincipal = new GUI_MenuPrincipal();
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        String apellido;
        String nomCliente;
        String cedula;
        String tipoCliente;
        String nomTarjeta;
        String numTarjeta;
        String fechaCaducidad;
        String cvv;
        String direccion;
        String nombreInstrumento = Instrumento.nomInstrumento;
        int cantidad;
        double precioInstrumento = Instrumento.precioInst;
        double descuentoExtra = Instrumento.descuentoEXTRA;
        
        
        
        
        //Amateur ----------------------------------------------------------------------------------------------------------------------------
        if(rbtnAmateur.isSelected()){
                    //Datos cliente
                    nomCliente=txtNombre.getText();
                    apellido=txtApellido.getText();
                    direccion=txtDireccion.getText();
                    cedula=txtIdentificador.getText();
                    cantidad=Integer.parseInt(txtCantidad.getText());
                    Amateur miAmateur=new Amateur(nomCliente, apellido, cedula);
                    //Datos pago
                    nomTarjeta=txtNombreTarjeta.getText();
                    numTarjeta=txtNumTarjeta.getText();
                    fechaCaducidad=txtFechaCaducidad.getText();
                    cvv=txtCVC.getText();

                    //Validar cédula
                    if(miAmateur.esIdentidadValida()&& miAmateur.esMetodoPagoValido(nomTarjeta, numTarjeta, fechaCaducidad, cvv)){
                        factura = miAmateur.compraInstrumento(
                                                    direccion,
                                                    nombreInstrumento,
                                                    cantidad,
                                                    precioInstrumento,
                                                    descuentoExtra);
                    GUI_Factura factura = new GUI_Factura();
                    factura.setVisible(true);
                    dispose();
                    }
                    else{
                        GUI_Factura factura = new GUI_Factura();
                        factura.setVisible(false);
                    }
        }
        
        
            //Musico Profesional ---------------------------------------------------------------------------------------------------------------
        else if(rbtnMusicoProfesional.isSelected()){
                    //Datos cliente
                    nomCliente=txtNombre.getText();
                    apellido=txtApellido.getText();
                    direccion=txtDireccion.getText();
                    String codigoVIP = txtCodigoVIP.getText();
                    cedula=txtIdentificador.getText();
                    cantidad=Integer.parseInt(txtCantidad.getText());
                    MusicoProfesional miMusicoProfesional=new MusicoProfesional(nomCliente, apellido, cedula);
                    //Datos pago
                    nomTarjeta=txtNombreTarjeta.getText();
                    numTarjeta=txtNumTarjeta.getText();
                    fechaCaducidad=txtFechaCaducidad.getText();
                    cvv=txtCVC.getText();

                    //Validar cédula
                    if(miMusicoProfesional.esIdentidadValida() && 
                            miMusicoProfesional.esPaseVip(codigoVIP)&& 
                            miMusicoProfesional.esMetodoPagoValido(nomTarjeta, numTarjeta, fechaCaducidad, cvv)){
                        factura = miMusicoProfesional.compraInstrumento(
                                                    direccion,
                                                    nombreInstrumento,
                                                    cantidad,
                                                    precioInstrumento,
                                                    descuentoExtra);
                    GUI_Factura factura = new GUI_Factura();
                    factura.setVisible(true);
                    dispose();
                    }
                    else{
                        GUI_Factura factura = new GUI_Factura();
                        factura.setVisible(false);
                    }
            
        }
        
        
            //Persona Jurídica ----------------------------------------------------------------------------------------------------------------
        else if(rbtnPersonaJuridica.isSelected()){
                    //Datos cliente
                    nomCliente=txtNombre.getText();
                    direccion=txtDireccion.getText();
                    String ruc =txtIdentificador.getText();
                    cantidad=Integer.parseInt(txtCantidad.getText());
                    PersonaJuridica miPersonaJuridica=new PersonaJuridica(nomCliente,ruc);
                    //Datos pago
                    nomTarjeta=txtNombreTarjeta.getText();
                    numTarjeta=txtNumTarjeta.getText();
                    fechaCaducidad=txtFechaCaducidad.getText();
                    cvv=txtCVC.getText();

                    //Validar cédula
                    if(miPersonaJuridica.esIdentidadValida()&& miPersonaJuridica.esMetodoPagoValido(nomTarjeta, numTarjeta, fechaCaducidad, cvv)){
                        factura = miPersonaJuridica.compraInstrumento(
                                                    direccion,
                                                    nombreInstrumento,
                                                    cantidad,
                                                    precioInstrumento,
                                                    descuentoExtra);
                    GUI_Factura factura = new GUI_Factura();
                    factura.setVisible(true);
                    dispose();
                    }
                    else{
                        GUI_Factura factura = new GUI_Factura();
                        factura.setVisible(false);
                    }
            
        }
        
        
            //Publico General ----------------------------------------------------------------------------------------------------------------------------------
        else if(rbtnPublicoGeneral.isSelected()){
                    //Datos cliente
                    nomCliente=txtNombre.getText();
                    apellido=txtApellido.getText();
                    direccion=txtDireccion.getText();
                    cedula=txtIdentificador.getText();
                    cantidad=Integer.parseInt(txtCantidad.getText());
                    PublicoGeneral miPublicoGeneral=new PublicoGeneral(nomCliente, apellido, cedula);
                    //Datos pago
                    nomTarjeta=txtNombreTarjeta.getText();
                    numTarjeta=txtNumTarjeta.getText();
                    fechaCaducidad=txtFechaCaducidad.getText();
                    cvv=txtCVC.getText();

                    //Validar cédula
                    if(miPublicoGeneral.esIdentidadValida()&& miPublicoGeneral.esMetodoPagoValido(nomTarjeta, numTarjeta, fechaCaducidad, cvv)){
                        factura = miPublicoGeneral.compraInstrumento(
                                                    direccion,
                                                    nombreInstrumento,
                                                    cantidad,
                                                    precioInstrumento,
                                                    descuentoExtra);
                    GUI_Factura factura = new GUI_Factura();
                    factura.setVisible(true);
                    dispose();
                    }
                    else{
                        GUI_Factura factura = new GUI_Factura();
                        factura.setVisible(false);
                    }
            
        }

 
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void rbtnPersonaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPersonaJuridicaActionPerformed
        // TODO add your handling code here:
        txtCodigoVIP.setText("");
        txtApellido.setText("");
        txtCodigoVIP.setEditable(false);
        
        //pago
        txtNombreTarjeta.setEditable(true);
        txtNumTarjeta.setEditable(true);
        txtFechaCaducidad.setEditable(true);
        txtCVC.setEditable(true);
        
        //dato
        txtNombre.setEditable(true);
        txtApellido.setEditable(false);
        txtDireccion.setEditable(true);
        txtIdentificador.setEditable(true);
        txtCantidad.setEditable(true);
        
    }//GEN-LAST:event_rbtnPersonaJuridicaActionPerformed

    private void rbtnPublicoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPublicoGeneralActionPerformed
        // TODO add your handling code here:
        txtCodigoVIP.setText("");
        txtCodigoVIP.setEditable(false);
        
        //pago
        txtNombreTarjeta.setEditable(true);
        txtNumTarjeta.setEditable(true);
        txtFechaCaducidad.setEditable(true);
        txtCVC.setEditable(true);
        
        //dato
        txtNombre.setEditable(true);
        txtApellido.setEditable(true);
        txtDireccion.setEditable(true);
        txtIdentificador.setEditable(true);
        txtCantidad.setEditable(true);
    }//GEN-LAST:event_rbtnPublicoGeneralActionPerformed

    private void rbtnMusicoProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMusicoProfesionalActionPerformed
        // TODO add your handling code here:
        txtCodigoVIP.setEditable(true);
        JOptionPane.showMessageDialog(null,"               ¡INGRESE SU PASE VIP! ","VIP",JOptionPane.PLAIN_MESSAGE);
               
        //pago
        txtNombreTarjeta.setEditable(true);
        txtNumTarjeta.setEditable(true);
        txtFechaCaducidad.setEditable(true);
        txtCVC.setEditable(true);
        
        //dato
        txtNombre.setEditable(true);
        txtApellido.setEditable(true);
        txtDireccion.setEditable(true);
        txtIdentificador.setEditable(true);
        txtCantidad.setEditable(true);
    }//GEN-LAST:event_rbtnMusicoProfesionalActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.ButtonGroup buttonGroupClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelDatosPersonales;
    private javax.swing.JPanel jPanelPanel;
    private javax.swing.JPanel jPanelPaseVIP;
    private javax.swing.JPanel jPanelTipoCliente;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigoVIP;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipoCliente;
    private javax.swing.JLabel lblVIP;
    private javax.swing.JRadioButton rbtnAmateur;
    private javax.swing.JRadioButton rbtnMusicoProfesional;
    private javax.swing.JRadioButton rbtnPersonaJuridica;
    private javax.swing.JRadioButton rbtnPublicoGeneral;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCVC;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoVIP;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaCaducidad;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreTarjeta;
    private javax.swing.JTextField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
