package src.poo.colecciones;

import java.util.ArrayList;

public class PruebaTres {
    public static void main(String[] args) {
//coleccion con datos mas diverson que pueden contener valores nulos y duplicados
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("elemento2");
        arrayList.add("elemento1");
        arrayList.add("elemento3");
        arrayList.add(null);
        arrayList.add("elemento3");
        System.out.println(arrayList);

        System.out.println(arrayList.indexOf("elemento2")); //aca obtenemos el indice donde esta almacenado un objeto
        System.out.println(arrayList.indexOf("elemento3"));
        arrayList.remove("elemento3");
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));


    }
}
