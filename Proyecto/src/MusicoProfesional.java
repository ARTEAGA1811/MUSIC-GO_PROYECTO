/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
    public void paseVip(){
        /*
        CLAVE 3 DÍGITOS Y DOS LETRAS (135PS, 1NH46, A913M)
        SUMA DE DÍGITOS SE 8 O 12 (F35J4, NH812, 
        */
        
        String msjPrincipal= "HA SIDO ACREEDOR DE UN PASE VIP\n";
        String instComprado = "this.nombreInstrumento";
        String precioInst = "this.precioInst";
        
        
        
        msjPrincipal += "Nombre: "+nombreCliente+"\n"+
                        "Apellido: "+apellido+"'n"+
                        "CI: "+cedula+"\n";
        
        System.out.print(msjPrincipal);
    }

    @Override
    public void compraInstrumento() {
         String Factura = "\t******FACTURA******";        
        
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
