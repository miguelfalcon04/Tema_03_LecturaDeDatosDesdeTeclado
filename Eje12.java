/* Ejercicio 12
Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota del primer exámen: ");
        double nota1= sc.nextDouble();

        System.out.print("Nota que desea sacar en el trimestre: ");
        double trimestre= sc.nextDouble();

        System.out.print("Para sacar un "+trimestre+" tienes que sacar un "+ ((trimestre * 100) - (nota1 * 40)) / 60 +" en el segundo exámen");

        sc.close();
    }
}
