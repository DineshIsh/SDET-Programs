package MAP_Programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class practiceMap {

    public static void main(String[] args) {


        Map<String, Integer> mp = new HashMap<>();
        mp.put("Dinesh",105);
        mp.put("Kumar",106);


        System.out.println(mp.get("Dinesh" + "Get value "));  // to get the value u can get it directly

        // to get the ket need to loop
        for(Map.Entry<String,Integer>  ent : mp.entrySet()){
            System.out.println(ent.getValue() + "   it will get all the value ");
        }

        for(Map.Entry<String,Integer> et : mp.entrySet()){
            if (et.getKey().equals("Kumar")){  // need to mention key or value
                System.out.println(et.getValue() + "   If i want to get Specific value ");
            }
        }

        practiceMap m = new practiceMap();

        for(Map.Entry<String,Integer> et : mp.entrySet()){
            if (et.getKey().equals("Kumar")){  // need to mention key or value
                System.out.println(et.getValue() + "   If i want to get Specific value ");
            }
        }


    }
}
