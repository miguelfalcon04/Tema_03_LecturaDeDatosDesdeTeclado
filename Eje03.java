/* Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Pesetas que va a pasar a euros: ");
        int pesetas = sc.nextInt();

        System.out.println(pesetas+" pesetas son "+pesetas/166+" en euros");

        sc.close();

    }
}
