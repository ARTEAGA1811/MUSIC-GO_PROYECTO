
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
public class Electronicos extends Electrofonos {
    private double precioColorP;
    private double precioMarcaP;
    private double precioInstDescuento;
    private double precioTamañoP;
    
    public Electronicos(String color, double tamaño, double peso, String marca) {
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
        this.marca = marca;        
        int numeroTeclas=0;
        
        if(numeroTeclas==88){
            this.precioTamañoP=0.8;
        }else{
            if(numeroTeclas==32){
                this.precioTamañoP=0.5;
            }
        }
        
        if(this.color.equals("Negro")){
            this.precioColorP=0.80;
        }else{
            if(this.color.equals("Rojo")){
                this.precioColorP=0.080;
            }else{
                if(this.color.equals("Azul")){
                    this.precioColorP=0.080;
                }
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
    
    //Constructor vacio
    public Electronicos(){}
    
    @Override
    public void producirSonido(String ins) {
        
        //SE VAN A EJECUTAR EL PIANO ELECTRICO
        AudioClip sonido;
        switch(ins){

            case "pianoElectrico1":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/tecladosElectricos/peUno.wav"));
                sonido.play();
            break;
            
            case "pianoElectrico2":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/tecladosElectricos/peDos.wav"));
                sonido.play();
            break;
            
            case "pianoElectrico3":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/tecladosElectricos/peTres.wav"));
                sonido.play();
            break;
            
            case "pianoElectrico4":
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/tecladosElectricos/peCuatro.wav"));
                sonido.play();
            break;
            
            default:
                System.out.println("no se eligio sonido CORREGIRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            break; 
        }
    }
    
    public void manualInstrumento(String url) throws Exception {
        if (nomInstrumento.equals("Teclado")) {
            URL urlPdf = new URL(url);
            InputStream pdfDescargado = urlPdf.openStream();
            //nombre del manual a descargar
            FileOutputStream manualUsuario = new FileOutputStream(new File("Manual_Piano.pdf"));
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
         this.precioInst=(peso*tamaño*100)+(precioColorP*tamaño*100)+precioMarcaP;
         return precioInst;
    }

    @Override
    public double calcularDescuento(String nombreInstr) {
        this.precioInstDescuento=precioInstDescuento-(precioInstDescuento*0.5);
        return precioInstDescuento;
    }

    @Override
    public String toString() {
        return "***"+nomInstrumento+"***" +  "\nMarca:" + marca +"\nColor: " + color+"\nTamaño: " + tamaño+ "\nPeso: "+peso+"\n";
    }
    
    
    
    
}
