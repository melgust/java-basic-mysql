/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gt.edu.miumg.progra2;

import java.util.Scanner;

/**
 *
 * @author melgust
 */
public class Progra2 {

    public static void main(String[] args) {
        String operacionesValidas = "+-*/";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la expresion: ");
        String expresion = scanner.nextLine();
        Progra2 progra2 = new Progra2();
        boolean exito = false;
        for (int i = 0; i < operacionesValidas.length(); i++) {
            char operacion = operacionesValidas.charAt(i);
            String operacionStr = String.valueOf(operacion);
            if (expresion.contains(operacionStr)) {
                String partes[] = expresion.split("\\" + operacionStr);
                float valor1 = Float.parseFloat(partes[0]);
                float valor2 = Float.parseFloat(partes[1]);
                float resultado = 0;
                switch (operacion) {
                    case '+':
                        resultado = progra2.sumar(valor1, valor2);
                        break;
                    case '-':
                        resultado = progra2.restar(valor1, valor2);
                        break;
                    case '*':
                        resultado = progra2.multiplicar(valor1, valor2);
                        break;
                    case '/':
                        resultado = progra2.dividir(valor1, valor2);
                        break;
                }
                System.out.println(expresion + "=" + resultado);
                exito = true;
            }
        }
        if (!exito) {
            System.out.println("La expresion no es valida");
        }
    }
    
    public float sumar(float valor1, float valor2) {
        return valor1 + valor2;
    }
    
    public float restar(float valor1, float valor2) {
        return valor1 - valor2;
    }
    
    public float multiplicar(float valor1, float valor2) {
        return valor1 * valor2;
    }
    
    public float dividir(float valor1, float valor2) {
        if (valor2 == 0) {
            System.out.println("No se puede dividir por cero");
        }
        return valor1 / valor2;
    }
    
}
