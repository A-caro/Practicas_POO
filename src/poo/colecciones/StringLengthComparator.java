package src.poo.colecciones;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StringLengthComparator implements Comparator<String>{
    @Override public int compare(String x, String y){
        // Assume neither string is null.
        // Real code should
        // probably be more robust
        // You could also just return
       // x.length() - y.length(),
        // which would be more efficient.
        if (x.length() < y.length()) {
            return -1;
        }
        if (x.length() > y.length()){
            return 1;
        }return 0;
    }
}
