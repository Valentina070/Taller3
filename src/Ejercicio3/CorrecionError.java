/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class CorrecionError {
    private static String nombreError;
    
  public CorrecionError(String nombreError) {
        CorrecionError.nombreError = nombreError;  
  }
// Lo que sucedia es que se estaba intentando acceder a un atributo no estatico por lo que una solición es volver al atributo static  
 public static void mostrarNombreError() {
System.out.println("Nombre del error: " + nombreError); 
    
 }
 public static void main(String[] args) {
        CorrecionError error1 = new CorrecionError("Error 0001");
        CorrecionError.mostrarNombreError();  
 }
}