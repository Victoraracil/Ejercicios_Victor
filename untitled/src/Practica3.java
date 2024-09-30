import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {

        int edad = 0;
        System.out.println("Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        String name = entrada.next();

        while (edad <= 0) {

            try {
                System.out.println("Hola " + name + ". Introduce tu edad:");
                edad = entrada.nextInt();

                if (edad <= 0){
                    System.out.println("No puedes tener 0 años o menos");
                }

            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido ");
                entrada.nextLine();
            }
        }

        if (edad >= 18) {
            System.out.println("Enhorabuena " + name + ". Puedes votar.");
        } else {
            System.out.println("Lo siento " + name + ". No puedes votar.");
            int rest = 18 - edad;
            System.out.println("Te faltan " + rest + " años para ser mayor de edad.");
        }
    }
}
