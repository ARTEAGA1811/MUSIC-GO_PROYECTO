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
    protected String nombre, tipoInst, materialInst, color, marca;
    protected double precioInst, tamano, peso;
    
    
    public abstract void producirSonido();

    @Override
    public String toString() {
        return "Instrumento{" + "nombre=" + nombre + ", tipoInst=" + tipoInst + ", materialInst=" 
                + materialInst + ", color=" + color + ", marca=" + marca + ", precioInst=" 
                + precioInst + ", tamano=" + tamano + ", peso=" + peso + '}';
    }
    
    
    
    
}
