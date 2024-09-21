/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Triangulo extends FiguraGeometrica {
    
    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double area() {
        return (base * altura) / 2;
    }
    
}
