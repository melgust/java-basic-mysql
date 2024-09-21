/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Professor extends Person {
    
    private int code;
    public String description;
    protected String others;

    public Professor(String name, String lastname, float size, int code) {
        super(name, lastname, size);
        this.code = code;
    }

    public Professor(String name) {
        super(name);
    }

    public int getCode() {
        return code;
    }
    
}
