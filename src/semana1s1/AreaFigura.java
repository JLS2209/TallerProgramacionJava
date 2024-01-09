/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1s1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class AreaFigura {

    public static void main(String[] args) {
        // Definiciones
        double radio, area;
        Scanner scan = new Scanner(System.in);
        // Entrada
        System.out.println("Ingrese el radio del círculo (en cm):");
        radio = scan.nextDouble();
        // Proceso
        area = Math.PI * (radio*radio);
        // Salida
        System.out.printf("El área del círculo es %.3f cm2.\n", area);      
    }
    
}
