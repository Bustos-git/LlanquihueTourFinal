/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * Cliente de Llanquihue Tour 
 * aquellos que han contratado algun tour
 */
public class Cliente extends Persona {
    
   private String numeroCliente; //numero de cliente
   private Tour tour; //Tour contratado

    public Cliente(String nombre, Rut rut, Correo correo, String numeroCliente, Tour tour) {
        super(nombre, rut, correo);
        this.numeroCliente = numeroCliente; 
        this.tour = tour; 
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
    
    
   

  
 @Override
    public String mostrarDetalles() {
        return "Nombre: " + getNombre()
                + " |Rut: " + getRut()
                + " |Correo: " + getCorreo() 
                + " |Numero de Cliente: " + numeroCliente 
                + " |Tour Contratado: " + (tour != null ? tour.getNombreTour() : "Sin Tour") ;
    }
}
