/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        double Numero1=10;
        double Numero2=20;
        
        //Llamamos a Matematicas para que se realice el proceso matematico requerido
        double suma=Matematicas.sumar(Numero1, Numero2);
        double resta=Matematicas.restar(Numero1, Numero2);
        double multiplicacion=Matematicas.multiplicar(Numero1, Numero2);
        double division=Matematicas.dividir(Numero1, Numero2);
  
        //Imprimimos toda las operaciónes realizadas
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    }

