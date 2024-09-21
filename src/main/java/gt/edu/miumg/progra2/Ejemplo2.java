package gt.edu.miumg.progra2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melgust
 */
public class Ejemplo2 {
    
    public static void main(String[] args) {
        Ejemplo2 ejemplo2 = new Ejemplo2();
        String oracion = "anita lava la tina";
        boolean resultado = ejemplo2.isPalindrome(oracion);
        if (resultado) {
            System.out.println("Es palindroma");
        } else {
            System.out.println("No es palindroma");
        }
    }

    /**
     * Esta funcion valida una cadena si es palindroma
     * @param word string
     * @return boolean
     */
    boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length(); i > 0; i--) {
            reverse += word.charAt(i - 1);
        }
        word = word.replace(" ", "");
        reverse = reverse.replace(" ", "");
        return word.equals(reverse);
    }
    
}
