
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 *
 */
public class TiendaInstrumento {
    private ArrayList <Instrumento> instrumentos = new ArrayList <Instrumento>();
    private ArrayList <Cliente> clientes = new ArrayList <Cliente>();
    
    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Instrumento miInstrumento) {
        instrumentos.add(miInstrumento);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cliente miCliente) {
        clientes.add(miCliente);
    }
    
    
}
