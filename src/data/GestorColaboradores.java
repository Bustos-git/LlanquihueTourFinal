/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import model.Colaborador;
import model.GuiaTuristico;
import model.Proveedor;
import model.Transporte;

/**
 * Gestor de Colaboradores
 * elaboracion de listas de colaboradores, busquedas y filtracion de datos 
 * @author Usuario
 */
public class GestorColaboradores {
    
    private ArrayList<Colaborador> listaColaboradores;
    
    public GestorColaboradores(){
        listaColaboradores = new ArrayList<>();
    }
    
    public void setListaColaboradores(ArrayList<Colaborador> listaColaboradores){
        this.listaColaboradores = listaColaboradores;
    }
    
    
    public void agregarColaborador(Colaborador colaborador) {
        listaColaboradores.add(colaborador);
    }
    
    public GuiaTuristico buscarGuiaPorRut(String rutBuscado){
        for(Colaborador colaborador : listaColaboradores){
            if(colaborador instanceof GuiaTuristico) {
                GuiaTuristico guia = (GuiaTuristico) colaborador;
                
                if(guia.getRut().getNumero().equalsIgnoreCase(rutBuscado)){
                    return guia;
                }
            }
        }
        return null;
    }
    
    public void mostrarGuias() {
        for (Colaborador colaborador : listaColaboradores) {
            
            if(colaborador instanceof GuiaTuristico){
                GuiaTuristico guia = (GuiaTuristico) colaborador;
                
                System.out.println(guia.mostrarDetalles());
            }
        }
    }
    
     public void mostrarProveedores() {
        for (Colaborador colaborador : listaColaboradores) {
            
            if(colaborador instanceof Proveedor){
                Proveedor proveedor = (Proveedor) colaborador;
                
                System.out.println(proveedor.mostrarDetalles());
            }
        }
    }
     
      public void mostrarTransportes() {
        for (Colaborador colaborador : listaColaboradores) {
            
            if(colaborador instanceof Transporte){
                Transporte transporte = (Transporte) colaborador;
                
                System.out.println(transporte.mostrarDetalles());
            }
        }
    }
     
     
   
}
