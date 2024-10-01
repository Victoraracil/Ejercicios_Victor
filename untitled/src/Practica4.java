import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica4 {
    public void ejecutar () {

        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        while (num1 < 100 || num2 < 100 || num1 > 999 || num2 > 999) {
            try {
                System.out.println("Introduce el multiplicando (3 cifras): 367");
                num1 = entrada.nextInt();

                System.out.println("Introduce el multiplicador (3 cifras): 251");
                num2 = entrada.nextInt();

                if (num1 < 100 || num2 < 100) {
                    System.out.println("Solo puedes introducir numeros de 3 cifras");
                }
                if (num1 > 999 || num2 > 999) {
                    System.out.println("Solo puedes introducir numeros de 3 cifras");
                }

            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido "); //Error si no se introduce un numero
                entrada.nextLine();
            }
        }
        int x = 2;
        int z = 3;

        while (z != 0) {
            String numC = Integer.toString(num2); //convertimos el número a carácter
            String numC_1 = numC.substring(x, z); //cogemos la primera cifra (desde posión 0 hasta 1)
            int num_1 = Integer.parseInt(numC_1); //convertimos a entero la cifra que hemos cogido, con la que podríamos hacer algún cálculo que necesitemos
            int res1 = num_1 * num1;//imprimimos el resultado

            z = z - 1;
            x = x - 1;

            System.out.println(res1);
        }


    }
}
//bucle donde segun sumo el numero, le multiplicacion cambia