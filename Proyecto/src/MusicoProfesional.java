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
public class MusicoProfesional extends Cliente{
    private String apellido, cedula;
    
    public MusicoProfesional(String nombre, String apellido, String cedula){
        this.nombreCliente = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.tipoCliente = "Músico Profesional";
    }
    
    public boolean esMetodoPagoValido(String nomTarjeta,String numTarjeta,String fechaCaducidad,String cvv){
        boolean esMetodoPagoValido = true;
        if( numTarjeta.length()== 16 && fechaCaducidad.matches("[0-9][0-9][/][0-9][0-9]") && cvv.length() == 3){
            return esMetodoPagoValido= true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Método de pago inválido!!\n No se ha podido emitir su factura!!");
            return esMetodoPagoValido= false;
        }
    }
    
    public boolean esPaseVip(String codigoVip){
        /*
        CLAVE 3 DÍGITOS Y DOS LETRAS (135PS, 1NH46, A913M)
        SUMA DE DÍGITOS DE 12
        */
        boolean esPaseVip = true;
        int contadorNum=0;
        int contadorLetras=0;
        int sumaNum=0;
        
        try{
            if(codigoVip.length() == 5){
                char[] arrayCodigovip = codigoVip.toCharArray();
                System.out.println(arrayCodigovip);
                
                for(int i=0; i<codigoVip.length();i++){
                    if(Character.isLetter(arrayCodigovip[i])){
                        contadorLetras++;
                    }
                    else if (Character.isDigit(arrayCodigovip[i])){
                        contadorNum++;
                        sumaNum += Character.getNumericValue(arrayCodigovip[i]);
                    }
                }
                
                if(contadorLetras == 2 && contadorNum == 3 && sumaNum == 12){
                    esPaseVip = true;
                    JOptionPane.showMessageDialog(null, "Su pase Vip ha sido activado");
                }
                else{
                    esPaseVip = false;
                    JOptionPane.showMessageDialog(null, "Su código no es válido");
                }
                
            }
            else{
                esPaseVip = false;
                JOptionPane.showMessageDialog(null, "El código debe tener 5 caracteres");
            }
        }
        catch(Exception e){
            esPaseVip = false;
            JOptionPane.showMessageDialog(null, "El código no es válido!!");
        }
        return esPaseVip;
    }

    @Override
    public String compraInstrumento(String direccion,
                                    String nomInstrumento, 
                                    int cantidad, 
                                    double precioInst,
                                    double descuentoEXTRA) {
        
        int numFactura = (int) (Math.random() * 5000) + 1;
        double descuento = (cantidad*precioInst)*0.10 + (cantidad*precioInst)*descuentoEXTRA;
        double iva = (cantidad*precioInst)*0.12;
        double subtotal = cantidad*precioInst;
        double total = subtotal + iva - descuento;
        
        //EMITIR FACTURA
        
            java.util.Date fecha = new Date();
            String factura = "    ______________________FACTURA_________________________\n"+
                             "    ____________________MUSIC-GO S.A._____________________\n\n"+
                    
                            "    N° Factura: "+numFactura +"\n"+
                            "    Nombre Cliente: "+this.nombreCliente +"\n"+
                            "    Apellido Cliente: "+this.apellido +"\n"+
                            "    Cédula / RUC: "+this.cedula +"\n"+
                            "    Dirección: "+direccion +"\n"+
                            "    Fecha emisión: "+fecha.toString()+"\n\n"+
                    
                            "    _______________________________________________________\n"+
                            "                                               \n"+
                            "    CANT.        DESCRIPCIÓN     PRECIO UNITARIO \n"+
                            "    _______________________________________________________\n"+
                            "       "+cantidad+"\t  "+nomInstrumento+"\t       "+precioInst+"\n"+
                            "    ________________________________________________________\n\n"+
                            "               SUBTOTAL:\t   "+subtotal+" \n"+
                            "               DESCUENTO:\t   "+descuento+" \n"+
                            "               IVA:\t\t   "+iva+" \n"+
                            "               TOTAL:\t   "+total+" \n";

        return factura;  
  
       
    }

    
    
    
    @Override
    public boolean esIdentidadValida() {
        //Primero toca inicializar la cedula.
        boolean esCedulaValida = true;
        
        
        
        this.cedula = this.cedula.replace("-",""); //En caso que la cedula se haya ingresado con guiones.
        
        try{ //Para verificar que la cedula solo contenga numeros.
            int validarNumeros = Integer.parseInt(this.cedula);
        }catch(NumberFormatException e){
            esCedulaValida = false;
            JOptionPane.showMessageDialog(null, "La cédula no es válida.");    
            
        }
        
        //Aqui ya es verificado que la cedula contenga solo numeros.
        if(esCedulaValida){
            if(this.cedula.length() != 10){ //Verificar tamanio
                esCedulaValida = false;
                JOptionPane.showMessageDialog(null, "La cédula no es válida.");

            }else{

                //Los dos primeros digitos deber estar entre 0 y 24
                int dosPrimeros = Integer.parseInt(this.cedula.substring(0, 2));
                if(dosPrimeros <=0 || dosPrimeros >24){ 
                    esCedulaValida = false;
                    JOptionPane.showMessageDialog(null, "La cédula no es válida."); 

                }else{

                    //El tercer digito debe ser menor a 6.
                    int tercer = Character.getNumericValue(cedula.charAt(2));
                    if(tercer >= 6){
                        esCedulaValida = false;
                        JOptionPane.showMessageDialog(null, "La cédula no es válida."); 
                    }else{
                        
                        //SE REALIZA LA VERIFICACION DE VALIDEZ DE LA CEDULA CON EL ALGORITMO 2.1.2.1.2.1.2.1.2
                        
                        char[] arrayCedula = this.cedula.toCharArray();
                        int totalCedula = 0;

                        for (int i = 0; i < (arrayCedula.length - 1); i++) {

                            int aEntero = Character.getNumericValue(arrayCedula[i]);

                            if (i % 2 == 0) {
                                aEntero *= 2;

                            } else {
                                aEntero *= 1;

                            }
                            //Si el resultado de alguna de las multiplicaciones
                            //es mayor o igual a 10, se le resta 9
                            if (aEntero >= 10) {
                                aEntero -= 9;
                            }
                            
                            //Se van sumando valores
                            totalCedula += aEntero;
                        }

                        //Luego a la suma total, le restamos de la decena superior
                        int decenaSuperior;
                        decenaSuperior = totalCedula - (totalCedula%10) + 10;

                        int numValidez = decenaSuperior - totalCedula;

                        //Si el numero de validez es 10, se lo toma como digito 0.
                        if(numValidez == 10){
                            numValidez = 0;
                        }

                        //Se verifica el numero de validez con el ultimo numero de cedula
                        int ultimoNum = Character.getNumericValue(arrayCedula[9]);
                        if(ultimoNum != numValidez){
                            esCedulaValida = false;
                            JOptionPane.showMessageDialog(null, "La cédula no es válida.");
                        }
          
                        
                    }
                    
                    
                }
            }
        }
         
        return esCedulaValida;
    }
    
    
}
