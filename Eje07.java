/* Ejercicio 7
Escribe un programa que calcule el total de una factura a partir de la base
imponible.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu sueldo: ");
        double sueldo = sc.nextDouble();

        double sueldo2 = (sueldo/1.21);

        System.out.println("Tu sueldo final sera: " + sueldo2);

        sc.close();
    }
}
