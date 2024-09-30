import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) { //creacion de clase

        int edad = 0; //predefinir edad para las excepciones
        System.out.println("Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        String name = entrada.next();

        while (edad <= 0) {

            try {
                System.out.println("Hola " + name + ". Introduce tu edad:");
                edad = entrada.nextInt();

                if (edad <= 0){ //Excepcion para no poner numeros negativos
                    System.out.println("No puedes tener 0 años o menos");
                }

            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido "); //Error si no se introduce un numero
                entrada.nextLine();
            }
        }

        if (edad >= 18) {
            System.out.println("Enhorabuena " + name + ". Puedes votar.");
        } else {
            System.out.println("Lo siento " + name + ". No puedes votar.");  //Salida
            int rest = 18 - edad; //Años restantes para votar
            System.out.println("Te faltan " + rest + " años para ser mayor de edad.");
        }
    }
}
