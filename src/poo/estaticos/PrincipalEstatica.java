package src.poo.estaticos;

public class PrincipalEstatica {
    public static void main(String[] args) {
        PracticaEstatica.estado = "Encendido"; //se puede llamar sin crear una instancia
        PracticaEstatica ps = new PracticaEstatica(); //Declaracion e instancia
        PracticaEstatica ps2 = new PracticaEstatica();

        PracticaEstatica.setEstado("Apagado");



        System.out.println(ps);
        System.out.println(ps2);
        System.out.println(PracticaEstatica.estado);
    }
}
