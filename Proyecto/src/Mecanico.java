
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
    
    
    public Mecanico (){}
    
    
    
    @Override
    public  void producirSonido(String ins) { 
        //Cambio, ahora ingresan parametros
        
        
        //SE VAN A EJECUTAR LOS ORGANOS
        AudioClip sonido;
        switch(ins){
            case "organo1":
                
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/organos/orUno.wav"));
                sonido.play();
            break;
            
            case "organo2":
                
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/organos/orDos.wav"));
                sonido.play();
            break;
            
            default:
                System.out.println("no se eligio sonido CORREGIRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            break;    
            
        }
   
    }

    @Override
    public double calcularPrecio(String nombreInstr) {
        this.precioInst=(precioMaterialO*((peso/100)*tamaño))+(precioColorO*tamaño)+precioMarcaO;
        return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "***"+nomInstrumento+"***" +  "\nMarca:" + marca +"\nColor: " + color+"\nTamaño: " + tamaño+ "\nPeso: "+peso+"\nDescuento: "+ precioInst  +"\nPrecio:"
                +"\nPrecio con Descuento"+ precioInst ;
    }

}
