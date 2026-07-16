/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import data.GestorArchivos;
import data.GestorClientes;
import data.GestorColaboradores;
import data.GestorTours;
import util.CorreoInvalidoException;
import util.RutInvalidoException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    
    
    public static void main(String[] args) throws RutInvalidoException, CorreoInvalidoException {
        
        
         Scanner sc = new Scanner(System.in);
     
        GestorArchivos gestorArchivos = new GestorArchivos();
        
        GestorColaboradores gestorColab = new GestorColaboradores();
        gestorColab.setListaColaboradores(
        gestorArchivos.leerColaboradores("colaboradores.txt")
        );
        
        GestorTours gestorTours = new GestorTours();
        gestorTours.setListaTours(
        gestorArchivos.leerTours("tours.txt", gestorColab));
        
        GestorClientes gestorClientes = new GestorClientes();
        gestorClientes.setListaClientes(
        gestorArchivos.leerClientes("clientes.txt", gestorTours));
        
       
       int opcion;
       
       do {
           System.out.println("\n==========Llanquihue Tour App==========");
           System.out.println("1. Mostrar Clientes");
           System.out.println("2. Mostrar todos los Tours");
           System.out.println("3. Mostrar Tours Disponibles");
           System.out.println("4. Mostrar Colaboradores");
           System.out.println("5. Salir");
           System.out.println("Seleccione una opcion: ");
           
           opcion = sc.nextInt();
           
           switch(opcion){
               
               case 1:
                   System.out.println("\n====CLIENTES====");
                   gestorClientes.mostrarClientes();
                   break;
                   
               case 2:
                   System.out.println("\n====TODOS LOS TOURS====");
                   gestorTours.mostrarTours();
                   break;
                   
               case 3:
                   System.out.println("\n====TOURS DISPONIBLES====");
                   gestorTours.mostrarToursDisponibles();
                   break;
                   
               case 4:
                   menuColaboradores(sc,gestorColab);
                   break;
                   
               case 5:
                   System.out.println("Saliendo del sistema...");
                   break;
                   
               default :
                   System.out.println("Opcion invalida");
                   
           }
       } while(opcion != 5);
       
       sc.close();
    
    }
    
    /**
     * Menu de colaboradores
     * contiene la opcion de mosrtrar Guias Turisticos, Transportes y Proveedores
     * 
     */
     public static void menuColaboradores(Scanner sc, GestorColaboradores gestorColab){
         
         int opcion;
         
         do{
             System.out.println("\n====COLABORADORES====");
             System.out.println("1. Mostrar Guias Turisticos");
             System.out.println("2. Mostrar Proveedores");
             System.out.println("3. Mostrar Transportes");
             System.out.println("4. Volver");
             System.out.println("Seleccione una opcion: ");
             
             opcion = sc.nextInt();
             
             switch(opcion) {
                 
                 case 1: 
                     System.out.println("\n====GUIAS TURISTICOS====");
                     gestorColab.mostrarGuias();
                     break;
                     
                 case 2:
                     System.out.println("\n====PROVEEDORES====");
                     gestorColab.mostrarProveedores();
                     break;
                     
                 case 3:
                     System.out.println("\n====TRANSPORTES====");
                     gestorColab.mostrarTransportes();
                     break;
                     
                 case 4:
                     System.out.println("Volviendo al menu principal...");
                     break;
                     
                 default:
                     System.out.println("Opcion invalida");
                         
                         
             }
         } while(opcion != 4);
     }   
        
   
    }
    

