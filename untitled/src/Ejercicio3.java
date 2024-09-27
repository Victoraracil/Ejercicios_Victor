//Ejercicio 3.
// Realizar un programa para dividir dos números leídos por teclado y escribir el resultado.
// Se debe controlar que el divisor no sea igual a 0 e informaremos con el siguiente mensaje: "ERROR: no se puede dividir entre 0".

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public void ejecutar(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 3: Division de numeros");

        float num1 = 0;
        float num2 = 0;
        float result = 0;


        while ( num2 == 0) {
            try {
                System.out.println("Introduce el dividendo");
                num1 = entrada.nextLong();

                System.out.println("Introduce el divisor");
                num2 = entrada.nextLong();

                if (num2 == 0) {
                    System.out.println("ERROR: no se puede dividir entre 0");
                }

            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido ");
                entrada.nextLine();
            }
        }
        result = num1 / num2;
        System.out.println( num1 + " dividido entre " + num2 + " da " + result);
    }
}
