/* Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int n1 = sc.nextInt();

        System.out.print("Numero 2: ");
        int n2 = sc.nextInt();

        System.out.println(n1+"+"+n2+"= "+n1+n2);
        System.out.println(n1+"-"+n2+"= "+(n1-n2));
        System.out.println(n1+"*"+n2+"= "+n1*n2);
        System.out.println(n1+"/"+n2+"= "+(float)n1/(float)n2);

        sc.close();
    }
}
