//Ejercicio 1 (hecho en DFD).
// Realizar un programa que pida un número al usuario, que deberá introducirlo usando el teclado.
// El algoritmo debe identificar si el número introducido se trata de un número positivo (> 0) o
// un número negativo (< 0) y controlar el caso particular del número 0, que es natural.

import java.util.Scanner;

public class Ejercicio1 {

    public void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 1: Numero positivo, negativo o natural");

        System.out.println("Introduce un numero");
        int num = entrada.nextInt();
        if (num == 0) {
            System.out.println("Tu numero es natural");
        } else if (num < 0) {
            System.out.println("Tu numero es negativo");
        } else {
            System.out.println("Tu numero es positivo");
        }

    }
}

