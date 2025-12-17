package GeneralPrograms;

import java.util.HashMap;

public class FindCharacteroccurance {  //find the occurance of letter

    public static void main(String[] args) {

        String ss="appaamma 1 ";

        HashMap<Character,Integer> doublicateWord = new HashMap<>();
        System.out.println(doublicateWord);   // this is empty

        char[] c = ss.toCharArray();

        for (char chh: c ) {
            System.out.print(chh); // appaamma

            if (doublicateWord.containsKey(chh)){
                doublicateWord.put(chh,doublicateWord.get(chh)+1);  //increases the count value +1
            }else {
                doublicateWord.put(chh,1);
            }
        }

        System.out.println(doublicateWord);  //{p=2,  =1, a=4, 1=1, m=2}

    }
}
