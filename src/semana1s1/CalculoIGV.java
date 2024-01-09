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
public class CalculoIGV {
    public static void main(String[] args) {
        // Definiciones
        double montoTotal, montoPagar, igv;
        Scanner scan = new Scanner(System.in);
        // Entrada
        System.out.println("Ingrese el monto total (en soles):");
        montoTotal = scan.nextDouble();
        // Proceso
        igv = montoTotal * 0.18;
        montoPagar = montoTotal - igv;
        // Salida
        System.out.printf("El monto a pagar es: S/. %.2f\n", montoPagar);
        System.out.printf("El IGV es          : S/. %.2f\n", igv);
    }
}
