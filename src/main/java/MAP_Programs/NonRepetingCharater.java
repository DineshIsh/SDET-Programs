package MAP_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonRepetingCharater {

    public static void main(String[] args) {

        String sh = "Dinesh";
        Map<Character, Integer> mp = new TreeMap<>();

        for (char x : sh.toCharArray()) {
            mp.put(x , 1);
        }

        System.out.println( mp);
    }


    // ------



}
