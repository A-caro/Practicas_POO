package src.poo.metodoconstructor.inheritance.ar.com.ada.online.second.obj.override;

public class App {
    public static void main(String[] args) {
        Person Tuca = new Person();
        Person Alfonsa = new Person("Carmela");
        Person Juana = new Person("Rocio", "Alegre");
        Person Aime = new Person("Agustina", "Alegre");

        System.out.println("*****Metodo toString*****");
        System.out.println(Tuca.toString());
        System.out.println(Alfonsa.toString());
        System.out.println(Juana.toString());
        System.out.println(Aime.toString());

        System.out.println("*****Metodo hashCode*****");
        System.out.println(Tuca.hashCode());
        System.out.println(Alfonsa.hashCode());
        System.out.println(Juana.hashCode());
        System.out.println(Aime.hashCode());

        System.out.println("*****Metodo equals*****");
        System.out.println(Juana.equals(Tuca));
        System.out.println(Alfonsa.equals(Aime));



    }
}
