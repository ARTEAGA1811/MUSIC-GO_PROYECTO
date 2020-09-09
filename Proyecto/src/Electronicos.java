/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class Electronicos extends Electrofonos {
    private double precioMaterialP;
    private double precioColorP;
    private double precioMarcaP;
    private double precioInstDescuento;
    
    public Electronicos(String material,String color, double tamaño, double peso, String marca) {
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;
        this.materialInst=material;
        
        if(materialInst.equals("Acero")){
            this.precioMaterialP=1.99;
        }
        
        if(this.color.equals("Negro")){
            this.precioColorP=0.80;
        }else{
            if(this.color.equals("Rojo")){
                this.precioColorP=0.080;
            }
        }

        //Marcas de pianos eléctricos
        if(this.marca.equals("YAMAHA")){
            this.precioMarcaP=80;
        }else{
            if(this.marca.equals("ROLAND")){
                this.precioMarcaP=50;
            }else{
                if(this.marca.equals("CASIO")){
                    this.precioMarcaP=30;
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
         this.precioInst=(precioMaterialP*(peso*tamaño))+(precioColorP*tamaño)+precioMarcaP;
         return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        this.precioInstDescuento=precioInstDescuento-(precioInstDescuento*0.5);
        return precioInstDescuento;
    }
    
}
