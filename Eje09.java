/* Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3πr^2h

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el radio: ");
        double r = sc.nextInt();

        System.out.print("Introduzca la altura: ");
        double h = sc.nextInt();

        System.out.printf("El volumen del cono será de: %.2f",((1.0/3.0)*Math.PI*r*r*h));

        sc.close();
    }
}
