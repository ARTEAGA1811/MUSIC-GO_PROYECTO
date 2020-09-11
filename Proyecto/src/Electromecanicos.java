
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
        
        //Material guitarra acústica
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
    
    //Contructor vacio
    public Electromecanicos(){}
    
    
    @Override
    public void producirSonido(String ins) {
        
        //SE VAN A EJECUTAR LAS guitarras electricas
        AudioClip sonido;
        switch(ins){
            
            case "guitarraElectrica1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarrasElectricas/geUno.wav"));
                sonido.play();
            break;
            
            case "guitarraElectrica2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarrasElectricas/geDos.wav"));
                sonido.play();
            break;
            
            case "guitarraElectrica3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarrasElectricas/geTres.wav"));
                sonido.play();
            break;
            
            case "guitarraElectrica4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarrasElectricas/geCuatro.wav"));
                sonido.play();
            break;
            
            default:
                System.out.println("no se eligio sonido CORREGIRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            break; 
        }
        
    }

    @Override
    public double calcularPrecio(String nombreInstr) {
        this.precioInst=(precioMaterialG*(peso*tamaño))+(precioColorG*tamaño)+precioMarcaG;   
        return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
