package src.poo.colecciones.repaso;
import java.util.HashSet;

    public class ColeccionHashSet {
        public static void main(String args[]) {
            //hashset no acepta valores duplicados por eso solo va a imprimir un apple y un null
            // HashSet declaracion
            HashSet<String> hset = new HashSet<String>();

            // añadimos elemntos a la coleccion
            hset.add("Apple");
            hset.add("Mango");
            hset.add("Grapes");
            hset.add("Orange");
            hset.add("Fig");

            //añadimos elementos duplicados
            hset.add("Apple");
            hset.add("Mango");

            //añadimos elementos null
            hset.add(null);
            hset.add(null);

            //imprimimos la coleccion
            System.out.println(hset);
        }
    }

