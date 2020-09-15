/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public abstract class Instrumento implements Precio{
    protected String tipoInst, materialInst, color, marca;
    protected double tamaño, peso;
    
    public static String nomInstrumento;
    public static double precioInst;
    public static double descuentoEXTRA;
    public static String descripcionInstr;
    
    public abstract void producirSonido(String ins);

    @Override
    public String toString() {
        return "Instrumento{" + "nombre=" + nomInstrumento + ", tipoInst=" + tipoInst + ", materialInst=" 
                + materialInst + ", color=" + color + ", marca=" + marca + ", precioInst=" 
                + precioInst + ", tamano=" + tamaño + ", peso=" + peso + '}';
    }
    
    
    
    
}
