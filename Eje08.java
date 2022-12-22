/* Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("Su salario será de: "+horas*12);

        sc.close();

    }
}
