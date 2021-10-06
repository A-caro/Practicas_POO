package src.poo.herencia.zoo;

public class main {
    public static void main(String[] args) {
        Dog perro = new Dog("Golden", 4, 10);
        Horse caballo = new Horse("Pony", "Coki", 10);
        Dog perro1 = new Dog("Golden", 4, 10);
        Horse caballo1 = new Horse();


        System.out.println(perro);
        System.out.println(caballo);

        System.out.println(perro.hashCode());
        System.out.println(caballo.hashCode());

        System.out.println(perro.equals(caballo));
        System.out.println(perro.equals(perro1));
        System.out.println(caballo.equals(caballo1));


    }
}
