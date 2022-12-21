/* Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int n1 = sc.nextInt();

        System.out.print("Numero 2: ");
        int n2 = sc.nextInt();

        System.out.print(n1+"*"+n2+"= "+n1*n2);

        sc.close();
    }
}