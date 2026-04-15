/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_3;

/**
 *
 * @author ASUS
 */
public class ErrorStatic {
    String nombre; // atributo NO static

   /* public static void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre; //  ERROR
    }*/ // el error pasa porque el metodo static no puede acceder a atributos no estaticos como lo es nombre en este caso, por que pertenecen al objetos y no a la clase.
    
    public static void cambiarNombre(ErrorStatic p, String nuevoNombre) {// para mantener el static se pasa el objeto como parametro
        p.nombre = nuevoNombre; // ✔ correcto
    }
}
