/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class Punteo extends Cordofonos {
    double precioMaterial;
    double precioColor;
    double precioMarca;
    public Punteo(String materialInst, String color, double tamaño, double peso, String marca) {
        this.materialInst = materialInst;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;        
        //Material guitarra acústica
        if (this.materialInst.equals("Caoba")) {
            this.precioMaterial =5.6;
        } else {
            if (this.materialInst.equals("Sapele")) {
                this.precioMaterial =4.7;
            }
        }
        
        //Material arpa
        if (this.materialInst.equals("Cedro")) {
            this.precioMaterial =20;
        } else {
            if (this.materialInst.equals("Sapele")) {
                this.precioMaterial =15.68;
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColor=0.076;
        }else{
            if(this.color.equals("Cafe")){
                this.precioColor=0.08;
            }else{
                if(this.color.equals("Natural")){
                    this.precioColor=0.05;
                }else{
                    if(this.color.equals("Aceite de linaza ")){
                        this.precioColor=0.051;
                    }
                }
            }
        }
        
        //Marcas de guitarras acústicas
        if(this.marca.equals("SCHACTER")){
            this.precioMarca=80;
        }else{
            if(this.marca.equals("VINTAGE")){
                this.precioMarca=30;
            }             
        }
        //Marcas de arpas
        if(this.marca.equals("ParaguayanHarps")){
            this.precioMarca=90;
        }else{
            if(this.marca.equals("Angelsworld")){
                this.precioMarca=50;
            }             
        }
    }
    
    @Override
    public void producirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPrecio() {
        if(tipoInst.equals("Guitarra Acústica")){
            this.precioInst=(precioMaterial*(peso*tamaño))+(precioColor*tamaño)+precioMarca;
        }        
        if(tipoInst.equals("Arpa")){
            this.precioInst=(precioMaterial*(peso*tamaño))+(precioColor*tamaño)+precioMarca;   
        }
        return precioInst;
    }

    @Override
    public double calcularDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
