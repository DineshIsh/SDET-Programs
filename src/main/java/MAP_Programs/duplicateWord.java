package MAP_Programs;

import java.util.HashMap;
import java.util.Map;

public class duplicateWord {
    public static void main(String[] args) {


        String[] word = {"Dinesh", "KUmar" ,"DineshJava", "Dinesh" };




        Map<String,Integer> mp = new HashMap<>();

        for (int i=0; i<word.length; i++){
            if (mp.containsKey(word[i])){
                mp.put(word[i],mp.get(word[i])+1);
            }else {
                mp.put(word[i],1);
            }
        }

        System.out.println(mp);

    }
}
