/* Ejercicio 10
Realiza un conversor de Mb a Kb.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Mb que va a pasar a kb: ");
        int mb = sc.nextInt();

        System.out.println(mb+" Mb son "+mb*1000+" en Kb");

        sc.close();
    }
}
