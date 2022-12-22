/* Ejercicio 11
Realiza un conversor de Kb a Mb.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Kb que va a pasar a Mb: ");
        int kb = sc.nextInt();

        System.out.println(kb+" kb son "+kb/1000+" en Mb");

        sc.close();
    }
}
