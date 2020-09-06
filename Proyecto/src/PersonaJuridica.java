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
public class PersonaJuridica extends Cliente{
    private String ruc;

    @Override
    public void compraInstrumento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    @Override
    public boolean esIdentidadValida() {
        //Primero toca inicializar el RUC
        boolean esRucValido = true;
        
        
        
        this.ruc = this.ruc.replace("-",""); //En caso que la cedula se haya ingresado con guiones.
        
        try{ //Para verificar que el RUC solo contenga numeros.
            int validarNumeros = Integer.parseInt(this.ruc);
        }catch(NumberFormatException e){
            esRucValido = false;
            JOptionPane.showMessageDialog(null, "El RUC no es válido.");    
            
        }
        
        //Aqui ya es verificado que la cedula contenga solo numeros.
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
                    if(tercer != 6){
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
