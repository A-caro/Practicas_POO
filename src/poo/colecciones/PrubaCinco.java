package src.poo.colecciones;

import java.util.HashMap;

public class PrubaCinco {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(0, "value1");
        hashMap.put(1, "value2");
        hashMap.put(1, "value3");
        System.out.println(hashMap);

        hashMap.remove(0);
        System.out.println(hashMap);
    }
}
