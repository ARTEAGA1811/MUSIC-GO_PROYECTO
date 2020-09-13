

import java.applet.AudioClip;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

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
    double precioInstDescuento;
        
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
            if (this.materialInst.equals("Sauce")) {
                this.precioMaterial =15.68;
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColor=0.12;
        }else{
            if(this.color.equals("Cafe")){
                this.precioColor=0.12;
            }else{
                if(this.color.equals("Natural")){
                    this.precioColor=0.09;
                }else{
                    if(this.color.equals("Rojo")){
                        this.precioColor=0.12;
                    }
                }
            }
        }
        
        //Marcas de guitarras acústicas
        if(this.marca.equals("SCHACTER")){
            this.precioMarca=80;
        }else{
            if(this.marca.equals("VINTAGE")){
                this.precioMarca=55;
            }else{
                if(this.marca.equals("YAMAHA")){
                    this.precioMarca=30;
                }
            }             
        }
        //Marcas de arpas
        if(this.marca.equals("ParaguayanHarps")){
            this.precioMarca=90;
        }else{
            if(this.marca.equals("AngelsWorld")){
                this.precioMarca=50;
            }             
        }
    }
    
    //constructor vacio
    public Punteo(){}
    
    
    @Override
    public void producirSonido(String ins) {
         //se va a ejecutar el arpa |Guitarra
         
        //SE VAN A EJECUTAR ARPA |Guitarra
        AudioClip sonido;
        switch(ins){
            
            //ARPA
            case "arpa1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/arpas/aUno.wav"));
                sonido.play();
            break;
            
            case "arpa2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/arpas/aDos.wav"));
                sonido.play();
            break;
            
            case "arpa3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/arpas/aTres.wav"));
                sonido.play();
            break;
            
            
            
            
            //GUITARRA 
            case "guitarra1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarras/gUno.wav"));
                sonido.play();
            break;
            
            case "guitarra2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarras/gDos.wav"));
                sonido.play();
            break;
            
            case "guitarra3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarras/gTres.wav"));
                sonido.play();
            break;
            
            case "guitarra4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/guitarras/gCuatro.wav"));
                sonido.play();
            break;
            
            
            default:
                System.out.println("no se eligio sonido CORREGIRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            break;    
        }
         
    }

    public void manualInstrumento(String url) throws Exception {
        if (nomInstrumento.equals("Guitarra Acústica")) {
            URL urlPdf = new URL(url);
            InputStream pdfDescargado = urlPdf.openStream();
            //nombre del manual a descargar
            FileOutputStream manualUsuario = new FileOutputStream(new File("Manual_Guitarra_Acústica.pdf"));
            int length = -1;
            byte[] buffer = new byte[1024];
            while ((length = pdfDescargado.read(buffer)) > -1) {
                manualUsuario.write(buffer, 0, length);
            }
            manualUsuario.close();
            pdfDescargado.close();
            //manual descargado
        }
    }

    @Override
    public double calcularPrecio(String nombreInstr) {
        if(nombreInstr.equals("Guitarra Acústica")){
            this.precioInst=(precioMaterial*(peso*10*tamaño))+(precioColor*tamaño*10)+precioMarca;
            this.precioInst=precioInst-(precioInst*precioInstDescuento);
        }        
        if(nombreInstr.equals("Arpa")){
            this.precioInst=(precioMaterial*((peso/10)*tamaño))+(precioColor*tamaño)+precioMarca;   
        }
        return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        if(nombreInstr.equals("Guitarra Acústica")){
            this.precioInstDescuento=precioInst-(precioInst*0.15);
        }
        return precioInstDescuento;
    }
    
    @Override
    public String toString() {
        return "***"+nomInstrumento+"***" +  "\nMarca:" + marca +"\nColor: " + color+"\nTamaño: " + tamaño+ "\nPeso: "+peso+"\n";
    }    
    
}
