/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class Coche {
    //Atributos y
   String marca;
   String modelo;
   static int contadorCoches=0;
   
   public Coche(String marca,String modelo){
       this.marca = marca;
       this.modelo = modelo;
       contadorCoches++;
   }
   public static void mostrarcontadorCoches(){
       System.out.println("La cantidad de coches es:  "+contadorCoches);
   }

       public static void main(String[] args) {
        Coche coche1= new Coche("mazda","mazda");
        Coche coche2 = new Coche("Audi","A4");
        
        Coche.mostrarcontadorCoches();
       
       }
   }
   
   
