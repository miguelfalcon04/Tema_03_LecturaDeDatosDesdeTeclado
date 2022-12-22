/* Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();

        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();

        System.out.print("El área del rectángulo es: "+base*altura);

        sc.close();
    }
}
