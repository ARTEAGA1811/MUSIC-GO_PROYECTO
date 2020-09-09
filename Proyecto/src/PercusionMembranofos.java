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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
