//Ejercicio 5.
// Realizar un programa para calcular el mínimo de 3 números diferentes leídos desde teclado.
// En caso de que el usuario introduzca dos o tres números iguales, informaremos con el siguiente mensaje: "ERROR: hay números introducidos que son iguales".

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

    public void ejecutar() {

        float min = 0;
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 5: Numero minimo");

        while (num1 == num2 || num1 == num3 || num2 == num3) {
            try {
                System.out.println("Introduce el primer numero");
                num1 = entrada.nextLong();

                System.out.println("Introduce el segundo numero");
                num2 = entrada.nextLong();

                System.out.println("Introduce el tercero numero");
                num3 = entrada.nextLong();

            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido ");
                entrada.nextLine();
            }
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("ERROR: hay números introducidos que son iguales");

            }

        }
        if (num1 < num2){
            min = num1;
        }else{
            min = num2;
        }
        if (num1 <num3){
            min = num1;
        }else {
            min = num3;
        }

        System.out.println(min + " es el numero mas pequeño");
    }
}