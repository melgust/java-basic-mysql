/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra2;

import gt.edu.miumg.progra2.dao.Query;
import gt.edu.miumg.progra2.model.Color;
import gt.edu.miumg.progra2.model.TcExample;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author melgust
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del color: ");
        String colorDesc = scanner.nextLine();
        /*System.out.println("Ingrese el segundo valor: ");
        int operando2 = scanner.nextInt();
        FiguraGeometrica figuraGeometrica = new Circulo(operando2);
        figuraGeometrica = new Cuadrado(operando2);
        figuraGeometrica = new Triangulo(operando2, operando2);*/
        Query query = new Query();
        /*query.insert();
        String sql = "SELECT * FROM tb_example WHERE email = ?";
        Map<Integer, Object> parameters = new HashMap<>();
        parameters.put(1, "jperez@miumg.edu.gt");
        List<TcExample> data = query.selectExample(sql, parameters);
        for (TcExample tcExample : data) {
            System.err.println("Nombre: " + tcExample.getName());
        }*/
        query.insertColor(colorDesc);
        List<Color> data = query.getColores();
        for (Color color : data) {
            System.err.println("Color: " + color.getColorDesc());
        }
    }

}
