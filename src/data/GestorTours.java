/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import model.Tour;

/**
 *Gestor de los Tours.
 * elaboracion de listas de tours, muestra de listas, filtracion segun disponibilidad y asignacion de guia 
 * 
 */
public class GestorTours {
    
    private ArrayList<Tour> listaTours;
    
    public GestorTours(){
        listaTours = new ArrayList<>(); 
   }
    
    public void agregarTour(Tour tour) {
        listaTours.add(tour);
    }
    
    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }
    
    public void setListaTours(ArrayList<Tour> listaTours) {
        this.listaTours = listaTours;
    }
    
    public void mostrarTours(){
        if(listaTours.isEmpty()) {
            System.out.println("No hay tours registrados");
            return;
        }
        
        for(Tour tour : listaTours) {
            System.out.println(tour.mostrarDetalles());
        }
    }
    
    public Tour buscarTourPorCodigo(String codigoBuscado) {
        for(Tour tour : listaTours) {
            if(tour.getCodigo().equalsIgnoreCase(codigoBuscado)) {
                return tour;
            }
        }
        
        return null;
    }
    
    public ArrayList<Tour> obtenerToursDisponibles(){
        
        ArrayList<Tour> toursDisponibles = new ArrayList<>();
        
        for(Tour tour : listaTours) {
            if(tour.isDisponible()){
                toursDisponibles.add(tour);
            }
        }
        return toursDisponibles;
    }
    
    
    
    
    
    public void mostrarToursDisponibles(){
        
        ArrayList<Tour> toursDisponibles = obtenerToursDisponibles();
        
        if(toursDisponibles.isEmpty()){
            System.out.println("No hay tours disponibles");
            return;
        }
        
        for(Tour tour : toursDisponibles){
            System.out.println(tour.mostrarDetalles());
        }
        
        
    }

    
    
   
    
}
