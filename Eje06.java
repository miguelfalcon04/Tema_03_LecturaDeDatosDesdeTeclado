/* Ejercicio 6
Escribe un programa que calcule el área de un triángulo.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        int b = sc.nextInt();
        
        System.out.print("Introduzca la altura: ");
        int h = sc.nextInt();

        System.out.print("El área del triángulo es: "+(b*h)/2);

        sc.close();
    }
}
