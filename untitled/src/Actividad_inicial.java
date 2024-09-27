import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_inicial {

    public void ejecutar() {

        System.out.println("Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

            int num1 = 0;
            int num2 = 0;

              while (num1 == 0 || num2 == 0) {

                    try {
                        System.out.println("introduce un numero:");
                        num1 = entrada.nextInt();

                        System.out.println("introduce otro numero:");
                        num2 = entrada.nextInt();

                        if (num1 == 0 || num2 == 0) {
                            System.out.println("No puedes usar el numero 0");
                        }
                    }catch (NumberFormatException | InputMismatchException e) {
                        System.out.println("Introduce un numero valido ");
                        entrada.nextLine();
                    }
                }
                int resultado = num1 + num2;
                System.out.println("El resultado de la suma es " + resultado);
    }
}