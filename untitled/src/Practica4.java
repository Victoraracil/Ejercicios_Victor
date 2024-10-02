import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica4 {
    public void ejecutar () {

        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        while (num1 < 100 || num2 < 100 || num1 > 999 || num2 > 999) {
            try {
                System.out.println("Introduce el multiplicando (3 cifras): ");
                num1 = entrada.nextInt();

                System.out.println("Introduce el multiplicador (3 cifras): ");
                num2 = entrada.nextInt();

                if (num1 < 100 || num2 < 100) {
                    System.out.println("Solo puedes introducir numeros de 3 cifras positivos");
                }
                if (num1 > 999 || num2 > 999) {
                    System.out.println("Solo puedes introducir numeros de 3 cifras positivos");
                }

            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido "); //Error si no se introduce un numero
                entrada.nextLine();
            }
        }
        //int x = 2;    //z = z - 1;
        //              //x = x - 1;
        //int z = 3;
        int resultado = num1 * num2;

        String numC = Integer.toString(num2); //convertimos el número a carácter
        String numC_1 = numC.substring(2, 3);
        String numC_2 = numC.substring(1, 2);
        String numC_3 = numC.substring(0, 1);//cogemos la primera cifra (desde posión 0 hasta 1)

        int temp1 = Integer.parseInt(numC_1);
        int temp2 = Integer.parseInt(numC_2);
        int temp3 = Integer.parseInt(numC_3);

        int rest1 = temp1 * num1;
        int rest2 = temp2 * num1;
        int rest3 = temp3 * num1;

        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println("El producto de la multiplicacion es:" + resultado);
        System.out.println("El proceso es:");
        System.out.println(" ");
        System.out.println("     " + num1);
        System.out.println("x    " + num2);
        System.out.println("-------------");
        System.out.println("    " + rest1);
        System.out.println("   " + rest2 + "x");
        System.out.println("  " + rest3 + "xx");
        System.out.println("-------------");
        System.out.println("  " + resultado);

              
    }
}
//bucle donde segun sumo el numero, le multiplicacion cambia
//parte grafica donde se muestre el proceso