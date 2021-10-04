package src.poo.metodos;

import java.util.Scanner;

/*
Saludador es la CLASE, persona es el nombre que le damos al OBJETO. Usamos la palabra NEW para
crear el objeto ¿Que estamos haciendo al crear el objeto? lo INSTANCIAMOS (creamos un espacio en memoria)

 */
public class Central {
    public static void main(String[] args) {
        Saludador persona = new Saludador();
        Scanner scan = new Scanner(System.in);
        System.out.println("Que queres que haga?: ");
        System.out.println("1. Saludar");
        System.out.println("2. Despedirse");
        boolean tipoSaludo = scan.nextLine() == "1";
        System.out.println("Por favor introduce tu nombre");
        String nombre = scan.nextLine();
        String saludo = persona.saludar(nombre, tipoSaludo);
        System.out.println(saludo);
        //System.out.println("Por favor introduce tu nombre de nuevo: ");
        //persona.saludar(scan.nextLine());
        //System.out.println(persona.saludar(scan.nextLine()));

    }
}
