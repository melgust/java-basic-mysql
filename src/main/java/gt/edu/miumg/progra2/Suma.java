/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class Suma extends Operacion {
    
    public Suma(int operando1, int operando2) {
        super(operando1, operando2);
    }
    
    @Override
    public int resultado(){
        return operando1 + operando2;
    }
    
}
