/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class Electromecanicos extends Electrofonos{
    double precioMaterialG;
    double precioColorG;
    double precioMarcaG;
    
    public Electromecanicos(String materialInst, String color, double tamaño, double peso, String marca) {
        this.materialInst = materialInst;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;
        
        //Material guitarra Electrica
        if (this.materialInst.equals("Caoba")) {
            this.precioMaterialG =1.6;
        } else {
            if (this.materialInst.equals("Arce duro")) {
                this.precioMaterialG =2.7;
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColorG=0.08;
        }else{
            if(this.color.equals("Blanco")){
                this.precioColorG=0.08;
            }else{
                if(this.color.equals("Rojo")){
                    this.precioColorG=0.08;
                    
                }else{if(this.color.equals("Azul")){
                    this.precioColorG=0.08;
                }
                }
            }
        }
        
        //Marcas de guitarras eléctricas
        if(this.marca.equals("ENCORE")){
            this.precioMarcaG=30;
        }else{
            if(this.marca.equals("SCHECTER")){
                this.precioMarcaG=80;
            }else{
                if(this.marca.equals("VINTAGE")){
                    this.precioMarcaG=50;
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
        this.precioInst=(precioMaterialG*((peso*100)*tamaño))+(precioColorG*tamaño*100)+precioMarcaG;   
        return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "***Piano eléctrico***" +  "\nMarca:" + marca +"\nColor: " + color+"\nTamaño: " + tamaño+ "\nPeso: "+peso+"\nDescuento: "+ precioInst  +"\nPrecio:"
                +"\nPrecio con Descuento"+ precioInst +  '}';
    }
}
