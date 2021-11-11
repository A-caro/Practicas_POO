package src.poo.colecciones;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("element1");
        treeSet.add("element2");
        treeSet.add("element3");
        System.out.println(treeSet);

        treeSet.remove("element2");
        System.out.println(treeSet);

    }
}
