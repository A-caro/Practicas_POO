package src.poo.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PrubasColecciones {
    public static void main(String[] args) {
        //dentro de los corchetes definimos que tipo de coleccion (q tipo de dato) vamos a formar
        //hashSet es el nombre del objeto
        System.out.println("**** HashSet ****");
        HashSet<Integer> hashSet = new HashSet<>();
//eto es tipo un array pero en objetos
        hashSet.add(9); //add es para agregar datos
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(7);
        System.out.println(hashSet);

        hashSet.remove(2); //esto es para quitar un elemento de la coleccion
        System.out.println(hashSet);

        System.out.println("****TreeSet****");
        //coleccion ordenada pero es mas lento por eso
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("elemento3");
        treeSet.add("elemento2");
        treeSet.add("elemento1");
        System.out.println(treeSet);

        treeSet.remove("elemento2");
        System.out.println(treeSet);

        System.out.println("****LinkedHashSet****");
        //mantiene el orden de inserccion
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("elementoA");
        linkedHashSet.add("elementoC");
        linkedHashSet.add("elementoB");
        System.out.println(linkedHashSet);

        linkedHashSet.remove("elementoA");
        System.out.println(linkedHashSet);
    }
}
