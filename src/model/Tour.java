/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * Tours de Llanquihue Tour
 */
public class Tour implements Registrable {
    private String codigo; //Codigo identificador del Tour
    private String nombreTour; //Nombre del Tour
    private String tipo; //Tipo de Tour (Paseo Lacustre, Ruta Gastronomica, Excursion cultural)
    private boolean disponible; //Si el tour esta disponible o no
    private GuiaTuristico guia; //Que guia esta asignado a este Tour

    public Tour(String codigo, String nombreTour, String tipo, boolean disponible, GuiaTuristico guia) {
        this.codigo = codigo;
        this.nombreTour = nombreTour;
        this.tipo = tipo;
        this.disponible = disponible;
        this.guia = guia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public GuiaTuristico getGuia() {
        return guia;
    }

    public void setGuia(GuiaTuristico guia) {
        this.guia = guia;
    }
    
    @Override
    public String mostrarDetalles() {
        return "Codigo del Tour: " + codigo
                + " |Nombre del Tour: " + nombreTour
                + " |Tipo: " + tipo 
                + " |Disponibilidad: " + disponible 
                + " |Guia Asociado: " + (guia != null ? guia.getNombre() : "Sin Guia");
    }

  
    
}
