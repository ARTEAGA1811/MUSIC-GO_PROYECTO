/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicol
 */
public interface MetodoPago {
    public boolean esMetodoPagoValido(String nomTarjeta,String numTarjeta,String fechaCaducidad,String cvv);
}
