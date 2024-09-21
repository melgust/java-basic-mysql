/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Person {
    
    private String name;
    private String lastname;
    private float size;

    public Person(String name, String lastname, float size) {
        this.name = name;
        this.lastname = lastname;
        this.size = size;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public float getSize() {
        return size;
    }
    
}
