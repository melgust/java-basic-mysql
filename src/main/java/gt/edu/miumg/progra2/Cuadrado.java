/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Cuadrado extends FiguraGeometrica {
    
    public Cuadrado(double lado) {
        super(lado);
    }
    
    @Override
    public double area() {
        return base * base;
    }
    
    @Override
    public double perimetro() {
        return 4 * base;
    }
    
}
