package GeneralPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateLetter {    //find the duplicate accurance
    //https://www.youtube.com/watch?v=TlbfgaGBu_Q


    public static void main(String[] args) {

        String ww = "Dineshkumarr";

        HashMap<Character, Integer> duplicateLetter = new HashMap<>();
        char[] cc = ww.toCharArray();

        for (char ch : cc) {

            if (duplicateLetter.containsKey(ch)) {  // begining  duplicateLetter variable will empty
                duplicateLetter.put(ch, duplicateLetter.get(ch) + 1);  //After getting the duplicate value then it will add +1 here
            } else {
                duplicateLetter.put(ch, 1);  // When the duplicate value agains checked by "duplicateLetter value" then it will go above condition will be true
            }
        }
        System.out.println(duplicateLetter);

        Set<Map.Entry<Character, Integer>> mpe = duplicateLetter.entrySet();

        for (Map.Entry<Character, Integer> entry : mpe) {

            if (entry.getValue() > 1) {  // only logic can make many programs
//                System.out.println(entry.getKey()+ " " + entry.getValue());
                System.out.println( "print the duplicate : " + entry.getKey());
            }

        }


    }
}
