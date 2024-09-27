//Ejercicio 4. Traduce el siguiente diagrama de flujo Java: (imagen de aules)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4{

    public void ejecutar() {

        float area = 0;
        float base = 0;
        float altura = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 4: Area de un triangulo");

        while (base == 0) {
            try {
                System.out.println("Introduce la base");
                base = entrada.nextLong();

                System.out.println("Introduce la altura");
                altura = entrada.nextLong();

            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido ");
                entrada.nextLine();
            }
        }

        area = (base * altura) / 2;
        System.out.println("El area de este triangulo es " + area);
    }
}