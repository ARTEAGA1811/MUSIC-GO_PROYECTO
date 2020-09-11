
import java.applet.AudioClip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DOS
 */
public class PercusionMembranofos extends Membranofonos{
    private double precioMaterialM;
    private double precioColorM;
    private double precioMarcaM;
    private double precioInstDescuento;
    
    public PercusionMembranofos(String materialInst, String color, double tamaño, double peso, String marca) {
        this.materialInst = materialInst;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;

        if (this.materialInst.equals("Arce")) {
            this.precioMaterialM =2;
        } else {
            if (this.materialInst.equals("Caoba")) {
                this.precioMaterialM =3.2;
            }else{
                if(this.materialInst.equals("Madera")){
                    this.precioMaterialM=1;
                }else{
                    if(this.materialInst.equals("Aluminio")){
                        this.precioMaterialM=1.8;
                    }
                }
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColorM=0.04;
        }else{
            if(this.color.equals("Café")){
                this.precioColorM=0.04;
            }else{
                if(this.marca.equals("Rojo")){
                    this.precioMarcaM=0.04;
                }else{
                if(this.marca.equals("Azul")){
                    this.precioMarcaM=0.04;
                }
            }   
            }    
        }

        //Marcas de bateria
        if(this.marca.equals("YAMAHA")){
            this.precioMarcaM=60;
        }else{
            if(this.marca.equals("PREMIER")){
                this.precioMarcaM=80;
            }else{
                if(this.marca.equals("GRETSCH")){
                    this.precioMarcaM=90;
                }
            }             
        }
        
        //Marcas de bongos
        if(this.marca.equals("MEINL")){
            this.precioMarcaM=10;
        }else{
            if(this.marca.equals("FREEDOM")){
                this.precioMarcaM=15;
            }else{
                if(this.marca.equals("LP")){
                    this.precioMarcaM=10;
                }
            }                 
        }
        
        //Marcas de congas
        if(this.marca.equals("STRONG")){
            this.precioMarcaM=25;
        }else{
            if(this.marca.equals("Latin Percussion")){
                this.precioMarcaM=20;
            }else{
                if(this.marca.equals("CAMEMUSIC")){
                    this.precioMarcaM=30;
                }
            }                 
        }
        
    }
    
    //Constructor vacio
    public PercusionMembranofos(){}
    
    
    @Override
    public double calcularPrecio(String nombreInstr) {
        if(nombreInstr.equals("Bateria")){
            this.precioInst=(precioMaterialM*(peso*tamaño))+(precioColorM*tamaño)+precioMarcaM;
            this.precioInst=precioInst-(precioInst*precioInstDescuento);
        }        
        if(nombreInstr.equals("Bongo")){
            this.precioInst=(precioMaterialM*(peso*tamaño))+(precioColorM*tamaño)+precioMarcaM;   
        }
        if(nombreInstr.equals("Conga")){
            this.precioInst=(precioMaterialM*(peso*tamaño))+(precioColorM*tamaño)+precioMarcaM;   
        }
        return precioInst;
    }
    
    @Override
    public double calcularDescuento(String nombreInstr) {
        if(nombreInstr.equals("Bateria")){
            this.precioInstDescuento=precioInstDescuento-(precioInstDescuento*0.25);
        } 
        return precioInstDescuento;
    }
    @Override
    public void producirSonido() {
        String algo = "bateria1";
        //SE VAN A EJECUTAR LAS BATERIAS | bONGOS |Congas
        AudioClip sonido;
        switch(algo){
            
            //baterias
            case "bateria1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/baterias/bUno.wav"));
                sonido.play();
            break;
            
            case "bateria2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/baterias/bDos.wav"));
                sonido.play();
            break;
            
            case "bateria3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/baterias/bTres.wav"));
                sonido.play();
            break;
            
            //bongos
            case "bongo1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/bongos/bonUno.wav"));
                sonido.play();
            break;
            
            case "bongo2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/bongos/bonDos.wav"));
                sonido.play();
            break;
            
            case "bongo3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/bongos/bonTres.wav"));
                sonido.play();
            break;
            
            case "bongo4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/bongos/bonCuatro.wav"));
                sonido.play();
            break;
            
            
            //Congas
            case "conga1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/congas/cUno.wav"));
                sonido.play();
            break;
            
            case "conga2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/congas/cDos.wav"));
                sonido.play();
            break;
            
            case "conga3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/congas/cTres.wav"));
                sonido.play();
            break;
            
            case "conga4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/congas/cCuatro.wav"));
                sonido.play();
            break;
            
            
            
            default:
                System.out.println("no se eligio sonido CORREGIRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            break;    
        }
    }
}
