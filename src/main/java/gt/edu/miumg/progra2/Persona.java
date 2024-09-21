/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private float peso;

    public Persona(String nombre, String apellido, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getPeso() {
        return peso;
    }

}
