/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double area() {
        return base * altura;
    }
    
    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }
    
}
