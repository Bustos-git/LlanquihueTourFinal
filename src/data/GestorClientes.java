/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.ArrayList;
import model.Cliente;
/**
 * Gestor de clientes 
 * 
 */
public class GestorClientes {
    
    private ArrayList<Cliente> listaClientes;
    
    public GestorClientes() {
        listaClientes = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    
    public ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }
    
    public void setListaClientes(ArrayList<Cliente> listaClientes){
        this.listaClientes = listaClientes;
    }
    
    public void mostrarClientes(){
        if(listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
            return;
        }
        
        for(Cliente cliente : listaClientes) {
            System.out.println(cliente.mostrarDetalles());
        }
    }
    
}
