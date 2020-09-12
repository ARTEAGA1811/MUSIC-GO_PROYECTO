/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author David Arteaga, Timoteo Camuendo, Anahí Vásquez, Jenny Llano
 */
public class PersonaJuridica extends Cliente{
    private String ruc;
    
    public PersonaJuridica(String nombre, String ruc){
        this.nombreCliente = nombre;
        this.ruc = ruc;
        this.tipoCliente = "Persona Juridica";
    }

    @Override
    public String compraInstrumento(String nomTarjeta, 
                                    String numTarjeta, 
                                    String fechaCaducidad, 
                                    String cvv, 
                                    String direccion,
                                    String nomInstrumento, 
                                    int cantidad, 
                                    double precioInst,
                                    double descuentoEXTRA) {
        
        int numFactura = (int) (Math.random() * 5000) + 1;
        double descuento = (cantidad*precioInst)*descuentoEXTRA;
        double iva = (cantidad*precioInst)*0.12;
        double subtotal = cantidad*precioInst;
        double total = subtotal + iva - descuento;
        
        //EMITIR FACTURA
        if( numTarjeta.length()== 16 && fechaCaducidad.matches("[0-9][0-9][/][0-9][0-9]") && cvv.length() == 3){
        
            java.util.Date fecha = new Date();
            String factura = "    ______________________FACTURA_________________________\n"+
                             "    ____________________MUSIC-GO S.A._____________________\n\n"+
                    
                            "     N° Factura: "+numFactura +"\n"+
                            "     Nombre Cliente: "+this.nombreCliente +"\n"+
                            "     Cédula / RUC: "+this.ruc +"\n"+
                            "     Dirección: "+direccion +"\n"+
                            "     Fecha emisión: "+fecha.toString()+"\n\n"+
                    
                            "     ____________________________________________________\n"+
                            "                                              \n"+
                            "     CANT.        DESCRIPCIÓN     PRECIO UNITARIO \n"+
                            "     ____________________________________________________\n"+
                            "       "+cantidad+"\t"+nomInstrumento+"\t    "+precioInst+"\n"+
                            "     ____________________________________________________\n\n"+
                            "               SUBTOTAL:      "+subtotal+" \n"+
                            "               DESCUENTO:     "+descuento+" \n"+
                            "               IVA:           "+iva+" \n"+
                            "               TOTAL:         "+total+" \n";

        return factura;  
        }
        else{
            return "No se pudo emitir su compra";
        }       
       
    }

    
    
    
    @Override
    public boolean esIdentidadValida() {
        //Primero toca inicializar el RUC
        boolean esRucValido = true;
        //RUC VÁLIDO : 1090072923001
        
        
        this.ruc = this.ruc.replace("-",""); //En caso que la RUC se haya ingresado con guiones.
        
       try{ //Para verificar que el RUC solo contenga numeros.
            //int validarNumeros = Integer.parseInt(ruc);
            char[] arrayRuc = ruc.toCharArray();
            for(char bucle: arrayRuc){
                int num = Integer.parseInt(Character.toString(bucle));
            }
        }catch(NumberFormatException e){
            esRucValido = false;
            JOptionPane.showMessageDialog(null, "El RUC no es válido.");    
            
        }
        
        //Aqui ya es verificado que la RUC contenga solo numeros.
        if(esRucValido){
            if(this.ruc.length() != 13){ //Verificar tamanio
                esRucValido = false;
                JOptionPane.showMessageDialog(null, "El RUC no es válido.");

            }else{

                //Los dos primeros digitos deber estar entre 0 y 24
                int dosPrimeros = Integer.parseInt(this.ruc.substring(0, 2));
                if(dosPrimeros <=0 || dosPrimeros >24){ 
                    esRucValido = false;
                    JOptionPane.showMessageDialog(null, "El RUC no es válido."); 

                }else{

                    //El tercer digito debe obligatoriamente ser 9.
                    int tercer = Character.getNumericValue(ruc.charAt(2));
                    if(tercer != 9){
                        esRucValido = false;
                        JOptionPane.showMessageDialog(null, "El RUC no es válido."); 
                    }else{
                        
                        //SE REALIZA LA VERIFICACION DE VALIDEZ DEl RUC CON EL MODULO 11.
                        
                        char[] arrayRuc = this.ruc.toCharArray();
                        int totalRuc = 0;
                        //Se multiplica cada uno de los nueve promeros digitos
                        //por su respectivo coeficiente, y se suman los resultados
                        //de las operaciones.
                        //4,3,2,7,6,5,4,3,2
                        
                        totalRuc += (Character.getNumericValue(arrayRuc[0]) * 4);
                        totalRuc += (Character.getNumericValue(arrayRuc[1]) * 3);
                        totalRuc += (Character.getNumericValue(arrayRuc[2]) * 2);
                        totalRuc += (Character.getNumericValue(arrayRuc[3]) * 7);
                        totalRuc += (Character.getNumericValue(arrayRuc[4]) * 6);
                        totalRuc += (Character.getNumericValue(arrayRuc[5]) * 5);
                        totalRuc += (Character.getNumericValue(arrayRuc[6]) * 4);
                        totalRuc += (Character.getNumericValue(arrayRuc[7]) * 3);
                        totalRuc += (Character.getNumericValue(arrayRuc[8]) * 2);
                        
                        //Se obtiene el modulo 11 de la suma total anterior.
                        int modulo = totalRuc % 11;

                        int numValidez = 11 - modulo;

                        //Si el numero de validez es 11, se lo toma como digito 0.
                        if(numValidez == 11){
                            numValidez = 0;
                        }

                        //Se verifica el numero de validez con el decimo numero del  RUC
                        int decimoNum = Character.getNumericValue(arrayRuc[9]);
                        if(decimoNum != numValidez){
                            esRucValido = false;
                            JOptionPane.showMessageDialog(null, "El RUC no es válido.");
                        }
          
                        
                    }
                    
                    
                }
            }
        }
         
        return esRucValido;
    }
}
