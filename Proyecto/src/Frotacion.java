/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class Frotacion extends Cordofonos {
    
    private double precioMarcaV;
    private double precioColorV;
    private double precioMaterialV;
    
    public Frotacion(String materialInst, String color, double tamaño, double peso, String marca) {
        this.materialInst = materialInst;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;

        if (this.materialInst.equals("Caoba")) {
            this.precioMaterialV =5.6;
        } else {
            if (this.materialInst.equals("Sapele")) {
                this.precioMaterialV =4.7;
            }
        }

        if (this.color.equals("Cafe")) {
            this.precioColorV = 0.14;
        } else {
            if (this.color.equals("Natural")) {
                this.precioColorV = 0.09;
            }
        }


        //Marcas de violin
        if(this.marca.equals("SONJ LIN")){
            this.precioMarcaV=10;
        }else{
            if(this.marca.equals("YOSENG")){
                this.precioMarcaV=5;
            }else{
                if(this.marca.equals("GOLDEN")){
                    this.precioMarcaV=50;
                }
            }             
        }
    }  
    
    @Override
    public void producirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPrecio(String nombreInstr) {
        if(tipoInst.equals("Violin")){
            this.precioInst=(precioMaterialV*(peso*tamaño))+(precioColorV*tamaño)+precioMarcaV;
        } 
        return precioInst; 
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
