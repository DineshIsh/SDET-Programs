package StringManuplulation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {

        String sentence =  "Dineshh kumarr";
        char[] cc =  sentence.toCharArray();

        Set<Character> ss = new TreeSet<>();

       /* for(char x : cc ){     // if with foreach loop u can put directly cc.toCharArray();
            ss.add(cc[i]);
        }*/

        for(int i=0; i<sentence.length(); i++ ){
            ss.add(cc[i]);
        }
        System.out.println(ss + " - After the removing the Duplicates");
    }
}
