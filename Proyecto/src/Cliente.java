/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public abstract class Cliente implements Identidad, MetodoPago {
    protected String nombreCliente;
    protected String tipoCliente;
    
    //METODOS
    public abstract String compraInstrumento(String direccion, 
                                                String nomInstrumento, 
                                                int cantidad, 
                                                double precioInstrumento,
                                                double descuentoEXTRA);

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + '}';
    }

    
    
}
