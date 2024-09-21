/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Circulo extends FiguraGeometrica {
    
    public Circulo(float radio) {
        super(radio);
    }
    
    @Override
    public double area() {
        return Math.PI * base * base;
    }
    
    @Override
    public double perimetro() {
        return 2 * Math.PI * base;
    }
    
}
