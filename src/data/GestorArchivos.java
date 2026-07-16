/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.GuiaTuristico;
import model.Tour;
import model.Cliente;
import model.Colaborador;
import model.Correo;
import model.Proveedor;
import model.Rut;
import model.Transporte;
import util.CorreoInvalidoException;
import util.RutInvalidoException;



/**
 * Clase para Gestionar los archivos txt. 
 * Lectura de txt de Colaboradores, Tours y Clientes
 * 
 */
public class GestorArchivos {
 
   
    public ArrayList<Tour> leerTours(String rutaArchivo, GestorColaboradores gestorColab){
        
        ArrayList<Tour> listaTour = new ArrayList<>();
        
        try {
            
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            
            while ((linea = lector.readLine()) != null) {
                
                String[] partes = linea.split(";");
                
                if (partes.length == 5) {
                    
                    String codigo = partes[0];
                    String nombreTour= partes[1];
                    String tipo= partes[2];
                    boolean disponible = Boolean.parseBoolean(partes[3]);
                    String rutGuia = partes[4];
                    
                    GuiaTuristico guia = gestorColab.buscarGuiaPorRut(rutGuia);
                   
                    if (guia == null) {
                        System.out.println("Guia no encontrado: " + rutGuia);
                    }
                    
                    Tour tour = new Tour(codigo, nombreTour, tipo, disponible,  guia);
                    listaTour.add(tour);                                      
                    
                }
            }
            
            lector.close();
            
        } catch (IOException e) {
            System.out.println("Error al leer archivo de Tours" + e.getMessage());
        }
        
        return listaTour;
    }
    
    public ArrayList<Cliente> leerClientes(String rutaArchivo, GestorTours gestorTours) throws RutInvalidoException, CorreoInvalidoException{
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            
            while ((linea = lector.readLine()) != null) {
                
                String[] partes = linea.split(";");
                
                if (partes.length == 5) {
                    
                    String nombre = partes[0];
                    String rutTexto= partes[1];
                    String correoTexto= partes[2];
                    String numeroCliente = partes[3];
                    String codigoTour = partes[4];
                   
                    
                    Rut rut = new Rut(rutTexto);
                    Correo correo = new Correo(correoTexto);
                    
                    Tour tour = gestorTours.buscarTourPorCodigo(codigoTour);
                    
                   if (tour == null) {
                       System.out.println("Tour no encontrado" + codigoTour);
                   }
                   
                   Cliente cliente = new Cliente(nombre, rut, correo, numeroCliente, tour);
                   listaClientes.add(cliente);
    }          
    
    }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de Clientes" + e.getMessage());
        }
        
        return listaClientes;
    }
 
public ArrayList<Colaborador> leerColaboradores (String rutaArchivo) throws RutInvalidoException, CorreoInvalidoException{
    ArrayList<Colaborador> listaColaboradores = new ArrayList<>();
        
        try {
            
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            
            while ((linea = lector.readLine()) != null) {
                
                String[] partes = linea.split(";");
                
               String tipo = partes[0];
               
               switch (tipo) {
                   case "GUIA":
                       if (partes.length == 5){
                           String nombre = partes[1];
                           Rut rut = new Rut(partes[2]);
                           Correo correo = new Correo(partes[3]);
                           String idioma = partes[4];
                           
                           GuiaTuristico guia = new GuiaTuristico(nombre,rut,correo,idioma);
                           listaColaboradores.add(guia);
                       }
                       
                       break;
                       
                   case "PROVEEDOR": 
                       if (partes.length == 6){
                           String nombre = partes[1];
                           Rut rut = new Rut(partes[2]);
                           Correo correo = new Correo(partes[3]);
                           String empresa = partes[4];
                           String area = partes[5];
                           
                           Proveedor proveedor = new Proveedor(nombre, rut, correo, empresa, area);
                           listaColaboradores.add(proveedor);
                           
                       }
                       
                       break;
                       
                   case "TRANSPORTE":
                       if (partes.length == 6){
                           String nombre = partes[1];
                           Rut rut = new Rut(partes[2]);
                           Correo correo = new Correo(partes[3]);
                           String patente = partes[4];
                           String tipoVehiculo = partes[5];
                           
                           Transporte transporte = new Transporte(nombre, rut, correo, patente, tipoVehiculo);
                           listaColaboradores.add(transporte);
                       }
                       
                        break;
                                
                                default: 
                                    System.out.println("Tipo desconocido: " + tipo);
                                
               
                
               }
               
            }
            
            lector.close();
                       
        }catch (IOException e) {
            System.out.println("Error al leer el archivo Colaboradores: " + e.getMessage());
        }  
        
        return listaColaboradores;
                    
                         
}


}
        
