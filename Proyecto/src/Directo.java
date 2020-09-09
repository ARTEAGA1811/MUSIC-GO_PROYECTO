/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class Directo extends Aerofonos{
    private double precioMaterialD;
    private double precioColorD;
    private double precioMarcaD;
    private double precioInstDescuento;
    
    public Directo(String materialInst, String color, double tamaño, double peso, String marca) {
        this.materialInst = materialInst;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;

        if (this.materialInst.equals("Plata")) {
            this.precioMaterialD =0.87;
        } else {
            if (this.materialInst.equals("Platino")) {
                this.precioMaterialD =25;
            }else{
                if(this.materialInst.equals("Ébano")){
                    this.precioMaterialD=0.5;
                }else{
                    if(this.materialInst.equals("Bronce")){
                        this.precioMaterialD=15;
                    }
                }
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColorD=0.02;
        }else{
            if(this.color.equals("Café")){
                this.precioColorD=0.02;
            }
        }

        //Marcas de trompeta
        if(this.marca.equals("YAMAHA")){
            this.precioMarcaD=60;
        }else{
            if(this.marca.equals("ODISSEY")){
                this.precioMarcaD=80;
            }             
        }
        
        //Marcas de saxofón
        if(this.marca.equals("ODISSEY")){
            this.precioMarcaD=80;
        }else{
            if(this.marca.equals("YAMAHA")){
                this.precioMarcaD=60;
            }             
        }
        
        //Marcas de flauta
        if(this.marca.equals("ODISSEY")){
            this.precioMarcaD=15;
        }else{
            if(this.marca.equals("YAMAHA")){
                this.precioMarcaD=10;
            }             
        }
        
    }
    
    @Override
    public void producirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPrecio(String nombreInstr) {
        if(nombreInstr.equals("Flauta")){
            this.precioInst=(precioMaterialD*(peso*tamaño))+(precioColorD*tamaño)+precioMarcaD;
            this.precioInst=precioInst-(precioInst*precioInstDescuento);
        }        
        if(nombreInstr.equals("Trompeta")){
            this.precioInst=(precioMaterialD*(peso*tamaño))+(precioColorD*tamaño)+precioMarcaD;   
        }
        if(nombreInstr.equals("Saxofón")){
            this.precioInst=(precioMaterialD*(peso*tamaño))+(precioColorD*tamaño)+precioMarcaD;   
        }
        return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        if(nombreInstr.equals("Flauta")){
            this.precioInstDescuento=precioInstDescuento-(precioInstDescuento*0.1);
        } 
        return precioInstDescuento;
    }
    
}
