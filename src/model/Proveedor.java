/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *Colaboradores externos de Llanquihue Tour
 * 
 */
public class Proveedor extends Colaborador {
    
    private String empresa; //Empresa a la que pertenecen
    private String area; //Area en la que se desempenan (alimentacion, experiencia, alojamiento)

    public Proveedor(String nombre, Rut rut, Correo correo, String empresa, String area) {
        super(nombre, rut, correo);
        this.empresa = empresa;
        this.area = area;    
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
    public String mostrarDetalles() {
        return "Nombre: " + getNombre()
                + " |Rut: " + getRut()
                + " |Correo: " + getCorreo() 
                + " |Empresa: " + empresa 
                + " |Area: " + area;
    }

   
    }

   
    
    
    

