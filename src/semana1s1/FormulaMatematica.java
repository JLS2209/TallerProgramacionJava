/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana1s1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class FormulaMatematica {
    public static void main(String[] args) {
        // Definiciones
        double lado1, lado2, lado3, semiperi, area;
        Scanner scan = new Scanner(System.in);
        // Entrada
        System.out.println("APLICACIÓN DEL TEOREMA DE HERÓN\nIngrese las longitudes de los tres lados de un triángulo (en cm):");
        lado1 = scan.nextDouble();
        lado2 = scan.nextDouble();
        lado3 = scan.nextDouble();
        // Proceso
        semiperi = (lado1 + lado2 + lado3)/2;
        area = Math.sqrt(semiperi*(semiperi - lado1)*(semiperi - lado2)*(semiperi - lado3));
        // Salida
        System.out.printf("El área del triángulo es %.3f cm2.\n", area);      
    }
}
