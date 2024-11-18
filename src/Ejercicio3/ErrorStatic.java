/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class ErrorStatic {
     private String nombreError;
     
     public ErrorStatic(String nombreError) {
        ErrorStatic.nombreError = nombreError;  
  }

     public static void mostrarNombreError() {
     System.out.println("Nombre del error: " + nombreError); 
    
 }
     public static void main(String[] args) {
        ErrorStatic error1 = new ErrorStatic("Error 0001");
        ErrorStatic.mostrarNombreError(); 
 }
}
    
