/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 * Validacion de Rut
 */
import util.RutInvalidoException;

public class Rut {
    
    private String numero;
    
    
    /**
     *
     * @param numero rut de la persona
     * @throws RutInvalidoException cuando el rut que se ingreso es invalido
     */

    public Rut(String numero) throws RutInvalidoException {
        //eliminacion de puntos y espacios par aceptar formatos con puntos
        String rutLimpio = numero.replace(".", "").trim().toUpperCase();

        //Validacion del formato del rut

        if (!validarFormato(rutLimpio)) {
            throw new RutInvalidoException ("El RUT ingresado no tiene formato valido");
        }

        this.numero = rutLimpio;
    }

    /**
     * Validacion del rut, que tenga el formato correcto
     * @param rut rut de la persona
     * @return true si el formato es correcto, false si no lo es
     */

    private boolean validarFormato(String rut) {
        return rut.matches("[0-9]{7,8}-[0-9K]");
    }

    public String getNumero() {
        return numero;
    }
    @Override
    public String toString(){
        return numero;
    }

}
