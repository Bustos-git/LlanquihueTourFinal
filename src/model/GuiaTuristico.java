/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Guias Turisticos de Llanquihue Tour
 * 
 */
public class GuiaTuristico extends Colaborador {
    private String idioma; //Idioma que hablan los Guias

    public GuiaTuristico(String nombre, Rut rut, Correo correo, String idioma) {
        super(nombre, rut, correo);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    @Override
    public String mostrarDetalles() {
        return "Nombre: " + getNombre()
                + " |Rut: " + getRut()
                + " |Correo: " + getCorreo() 
                + " |Idioma: " + idioma ;
               
    }
    }
    





   