//Ejercicio 2 (hecho en DFD).
// Realizar un programa que permita leer 2 números diferentes por teclado y nos diga cuál de ellos es el mayor.
// En caso de que el usuario introduzca dos números iguales, informaremos con el siguiente mensaje: "ERROR: los números introducidos son iguales".

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    public void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 2: Numero mayor o menor");

        long num1 = 0;
        long num2 = 0;

        while (num1 == num2) {

            try {
                System.out.println("Introduce el primer numero");
                num1 = entrada.nextLong();

                System.out.println("Introduce un segundo numero");
                num2 = entrada.nextLong();

                if (num1 == num2) {
                    System.out.println("ERROR: los números introducidos son iguales");
                }

            }catch (NumberFormatException | InputMismatchException e) {
                System.out.println("ERROR: introduce un numero valido ");
                entrada.nextLine();
            }

        }
        if (num1 < num2){
            System.out.println( num2 + " es mayor que " + num1);

        }else{
            System.out.println( num1 + " es mayor que " + num2);
        }
    }
}