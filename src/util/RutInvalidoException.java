/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 * Excepcion personalizada para manejar los errores de Rut
 * 
 */
public class RutInvalidoException extends Exception {

    /**
     * 
     * @param mensaje mensaje que explica el error ocurrido
     */
    
    
public RutInvalidoException (String mensaje){
    super(mensaje);
}
    
    
    
}
