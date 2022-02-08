package src.poo.genericas;
import java.util.*;

public class ColeccionesMapGenericas {
    public static void main(String[] args) {

        //creamos los objetos con polimorfismo
        Map miMapa = new HashMap();
        List miLista = new ArrayList();
        Set setear = new TreeSet();

        //con put agregamos datos al hashmap
        miMapa.put(1, "Buenos Aires");
        miMapa.put(2, "Bogota");
        miMapa.put(3, "Caracas");

        System.out.println("La capital de Colombia es : " + miMapa.get(2));

        //con add agregamos datos al set
        setear.add("Tucuman");
        setear.add("Cordoba");
        setear.add("Mendoza");

        int contador = 0;
        for (Iterator it = setear.iterator(); it.hasNext(); contador++) {
            String provincia = (String) it.next();
            if(contador == 2)
            System.out.println("Provincia Iterator: " + provincia);
        }

        // for (Object provincia : setear){
        //   String provinciaString = (String) provincia;
        // System.out.println("Provincia: " + provincia);
        //}

        //Iterator it = setear.iterator();
        //while (it.hasNext()) {
          //  System.out.println("Provincia: " + it.next());

          //  System.out.println("La ultima provincia es :" + setear);


            miLista.add("Repasar POO");
            miLista.add("Escribir codigo a pesar de que crea que no puedo");
            miLista.add("Escribir más codigo");

            System.out.println("La tarea que debo hacer primero es :" + miLista.get(0));
            System.out.println("La tarea que debo hacer primero es :" + miLista.get(1));
            System.out.println("La tarea que debo hacer primero es :" + miLista.get(2));


            imprimir(miMapa.keySet());
            imprimir(miMapa.values());
            imprimir(setear);
            imprimir(miLista);

    }
 //aca imprimimos
    public static void imprimir(Collection arregloDeObjetos){
        for(Object elemento : arregloDeObjetos){
            System.out.println("elemento = " + elemento);
        }

    }
    }

