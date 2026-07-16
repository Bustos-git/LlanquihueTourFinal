/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * Transportes de Llanquihue Tour
 */
public class Transporte extends Colaborador {
    private String patente; //Patente del vehiculo
    private String tipoVehiculo; //Tipo de vehiculo

    public Transporte(String nombre, Rut rut, Correo correo, String patente, String tipoVehiculo) {
        super(nombre, rut, correo);
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    @Override
    public String mostrarDetalles() {
        return "Nombre: " + getNombre()
                + " |Rut: " + getRut()
                + " |Correo: " + getCorreo() 
                + " |Patente: " + patente 
                + " |Tipo de Vehiculo: " + tipoVehiculo;
    }
    
    
}
