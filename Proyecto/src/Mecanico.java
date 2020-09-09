/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class Mecanico extends Aerofonos {
    private double precioMaterialO;
    private double precioColorO;
    private double precioMarcaO;
    
    public Mecanico(String materialInst, String color, double tamaño, double peso, String marca) {
        this.materialInst = materialInst;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;

        if (this.materialInst.equals("Nogal")) {
            this.precioMaterialO =6.32;
        } else {
            if (this.materialInst.equals("Arce")) {
                this.precioMaterialO =2.5;
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColorO=0.80;
        }else{
            if(this.color.equals("Café")){
                this.precioColorO=0.090;
            }
        }

        //Marcas de organos
        if(this.marca.equals("YAMAHA")){
            this.precioMarcaO=75;
        }else{
            if(this.marca.equals("BECHSTEIN")){
                this.precioMarcaO=50;
            }else{
                if(this.marca.equals("SCHIMMEL")){
                    this.precioMarcaO=30;
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
        this.precioInst=(precioMaterialO*(peso*tamaño))+(precioColorO*tamaño)+precioMarcaO;
        return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
