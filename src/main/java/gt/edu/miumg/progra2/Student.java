/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Student extends Person {
    
    private String carne;

    /**
     * Instancia la clase con los valores obligatorios
     * @param name
     * @param lastname
     * @param size
     * @param carne 
     */
    public Student(String name, String lastname, float size, String carne) {
        super(name, lastname, size);
        this.carne = carne;
    }
    
}
