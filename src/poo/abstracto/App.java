package src.poo.abstracto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Figuras triangulo = new Triangulo(9, 8);
        System.out.println(triangulo);
        System.out.println(triangulo.calculoArea());

        Figuras circulo = new Circulo(5);
        System.out.println(circulo);
        System.out.println(circulo.calculoArea());

        Figuras rectangulo = new Rectangulo(5,5);
        System.out.println(rectangulo);
        System.out.println(rectangulo.calculoArea());

        System.out.println(triangulo.equals(rectangulo));
        System.out.println(triangulo.equals(circulo));
        System.out.println(circulo.equals(rectangulo));



    }
}
