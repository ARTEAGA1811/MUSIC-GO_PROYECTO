
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
    
    //cONSTRUCTO VACIO
    public Directo(){}
    
    
    @Override
    public void producirSonido(String ins) {
        
        //SE VAN A EJECUTAR LAS flautas  |saxofonoes | trompetas
        AudioClip sonido;
        switch(ins){
            
            //FLAUTAS
            case "flauta1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/flautas/flUno.wav"));
                sonido.play();
            break;
            
            case "flauta2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/flautas/flDos.wav"));
                sonido.play();
            break;
            
            case "flauta3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/flautas/flTres.wav"));
                sonido.play();
            break;
            
            case "flauta4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/flautas/flCuatro.wav"));
                sonido.play();
            break;
            
            
            //SAXOFONES
            case "saxofon1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/saxofones/saUno.wav"));
                sonido.play();
            break;
            
            case "saxofon2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/saxofones/saDos.wav"));
                sonido.play();
            break;
            
            case "saxofon3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/saxofones/saTres.wav"));
                sonido.play();
            break;
            
            case "saxofon4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/saxofones/saCuatro.wav"));
                sonido.play();
            break;
            
            
            //TROMPETAS
            case "trompeta1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/trompetas/trUno.wav"));
                sonido.play();
            break;
            
            case "trompeta2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/trompetas/trDos.wav"));
                sonido.play();
            break;
            
            case "trompeta3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/trompetas/trTreswav"));
                sonido.play();
            break;
            
            case "trompeta4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/trompetas/trCuatro.wav"));
                sonido.play();
            break;
            
            default:
                System.out.println("no se eligio sonido CORREGIRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            break;   
        }
    }
    
    public void manualInstrumento(String nomInstrumento){
        if(nomInstrumento.equals("Flauta")){
            
        }
    }

    @Override
    public double calcularPrecio(String nombreInstr) {
        if(nombreInstr.equals("Flauta")){
            this.precioInst=(precioMaterialD*(peso*100*tamaño))+(precioColorD*tamaño*100)+precioMarcaD;
            this.precioInst=precioInst-(precioInst*precioInstDescuento);
        }        
        if(nombreInstr.equals("Trompeta")){
            this.precioInst=(precioMaterialD*(peso*100*tamaño))+(precioColorD*tamaño*100)+precioMarcaD;   
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
    
    @Override
    public String toString() {
        return "***" + nomInstrumento + "***" +  "\nMarca:" + marca +"\nColor: " + color+"\nTamaño: " + tamaño+ "\nPeso: "+peso+"\n";
    }
}
