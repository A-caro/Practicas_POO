package src.poo.metodoconstructor;

import src.poo.metodoconstructor.instantiation.Person;
import src.poo.metodoconstructor.overloading.Arithmetic;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Person persona = new Person();
        Person persona2 = new Person("Karo");
        Person persona3 = new Person("Caro", "Atampis");

        System.out.println(persona.getName() + " " + persona.getName());
        System.out.println(persona2.getName() + " " + persona2.getLastName());
        System.out.println(persona3.getName() + " " + persona3.getLastName());

        System.out.println("************************");
        System.out.println("Bienvenido al operador Aritmetico");

        Arithmetic suma = new Arithmetic(); //Declaramos e instanciamos al objeto
        Integer num = new Integer(7); //siempre que usemos a la clase integer para llamarla la tenemos que instanciar
        Integer resultado = suma.sum(3,6);

        //Double num2 = new Double();
       // Double num3 = new Double();

        System.out.println("Resultado 1 = " + resultado); //metodo de la linea 5 porque ambos argumentos son tipo primitivo
        System.out.println("Resultado 2 = " + suma.sum(num,6)); //linea 9, integer, int. (Integer vale 7)
        System.out.println("Resultado 3 = " + suma.sum(5, num));//linea 13
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa un double por favor");
        //num3 = lector.nextDouble();
        System.out.println();


    }
}
