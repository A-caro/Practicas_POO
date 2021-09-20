package src.poo.estaticos;

public class PrincipalEstatica {
    public static void main(String[] args) {
        PracticaEstatica ps = new PracticaEstatica(); //Declaracion e instancia
        PracticaEstatica ps2 = new PracticaEstatica();

        PracticaEstatica.estado = "Encendido";

        System.out.println(ps);
        System.out.println(ps2);
        System.out.println(PracticaEstatica.estado);
    }
}
