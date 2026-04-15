/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_3;

/**
 *
 * @author ASUS
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int suma = Matematicas.suma(10, 5);// Ve a la clase Matematicas, ejecuta el método suma y dame el resultado
        int resta = Matematicas.resta(10, 5);
        int mult = Matematicas.multiplicacion(10, 5);
        double div = Matematicas.division(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + mult);
        System.out.println("División: " + div);
    }
    
}
