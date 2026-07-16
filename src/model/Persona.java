/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Clase que otorga los datos base de todas las personas involucradas con
 * Llanquihue Tour
 * 
 */
public abstract class Persona implements Registrable{
    
    private String nombre; //Nombre de la persona
    private Rut rut; //Rut de la persona 
    private Correo correo; //Direccion de correo de la persona

    public Persona(String nombre, Rut rut, Correo correo) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }
    
    @Override
    public String mostrarDetalles(){
            return "Nombre: " + nombre + " |Rut: " + rut + " |Correo: " + correo;
    }        
    
    
    
    
    
    
}
