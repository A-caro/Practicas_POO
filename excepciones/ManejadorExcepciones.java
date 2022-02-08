package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejadorExcepciones {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int base;
        int contador = 0;
        while(contador < 3) {
            try {
                System.out.print("Ingrese un valor entero:");
                base = keyboard.nextInt();
                int square = base * base;
                System.out.println("El cuadrado de " + base + " es " + square);
                contador = 3;
            } catch (InputMismatchException iME) {
                System.out.printf("Debe ingresar obligatoriamente un número entero." + "Tenes %d intentos disponibles \n", 2 - contador);
                keyboard.nextLine();
                contador++;
            }
        }
    }
}
