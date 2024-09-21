/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

/**
 *
 * @author melgust
 */
public class TomatoCalc extends Operation implements Addition, Substraction {

    @Override
    public float add(float operandOne, float operandTwo) {
        return operandOne + operandTwo;
    }

    @Override
    public float substract(float operandOne, float operandTwo) {
        return operandOne - operandTwo;
    }
    
}
