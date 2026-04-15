/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_3;

/**
 *
 * @author ASUS
 */
public class Coche {
    String marca;
    String modelo;
    static int contadorCoches = 0;

    
    public Coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    contadorCoches++;// cada que se crea un objeto aumenta el contador
}
    
    public static void mCCoches() {
        System.out.println("Total de coches ceados:" + contadorCoches);
        
    }
}
