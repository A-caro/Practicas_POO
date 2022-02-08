package src.poo.genericas;

public class ClaseGenerica<T> {
    //entre los corchetes angulares le decimos que tipo de clase generica va a recibir esa clase

    private T objeto;
    // T es el tipo de generico

    //metodo constructor
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }

    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }

}
