
import java.applet.AudioClip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class Percusion extends Cordofonos {
    private double precioMaterialP;
    private double precioColorP;
    private double precioMarcaP;
    
    public Percusion(String materialInst, String color, double tamaño, double peso, String marca) {
        this.materialInst = materialInst;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;

        if (this.materialInst.equals("Abeto")) {
            this.precioMaterialP =1.32;
        } else {
            if (this.materialInst.equals("Roble")) {
                this.precioMaterialP =1.5;
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColorP=0.80;
        }else{
            if(this.color.equals("Café")){
                this.precioColorP=0.090;
            }
        }

        //Marcas de pianos
        if(this.marca.equals("YAMAHA")){
            this.precioMarcaP=75;
        }else{
            if(this.marca.equals("BECHSTEIN")){
                this.precioMarcaP=50;
            }else{
                if(this.marca.equals("SCHIMMEL")){
                    this.precioMarcaP=30;
                }
            }             
        }
    }
    
    
    //Contructor vacio
    public Percusion(){}
    
    
    @Override
    public void producirSonido(String ins) {
        
        //SE VAN A EJECUTAR el piano
        AudioClip sonido;
        switch(ins){
            
            case "piano1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/pianos/piUno.wav"));
                sonido.play();
            break;
            
            case "piano2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/pianos/piDos.wav"));
                sonido.play();
            break;
            
            case "piano3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/pianos/piTres.wav"));
                sonido.play();
            break;
            
            default:
                System.out.println("no se eligio sonido CORREGIRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            break;
            
        }
    }

    @Override
    public double calcularPrecio(String nombreInstr) {
        this.precioInst=(precioMaterialP*(peso*100*tamaño))+(precioColorP*tamaño*100)+precioMarcaP;
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
