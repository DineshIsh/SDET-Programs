package MAP_Programs;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class practicetimeRoughf {

    public static void main(String[] args) {
        //        public void counttheFrequencyofLetter(){
        String wrd = "Java";
        char[] cWrd = wrd.toCharArray();
        System.out.println(cWrd);

        Map<Character, Integer> mp = new TreeMap<>();

        for (char sC : cWrd) {
            System.out.println(sC);

            if (mp.containsKey(sC)) {
                mp.put(sC, mp.get(sC) + 1);
            } else {
                mp.put(sC, 1);
            }
        }

        System.out.println(mp);
// ==========================================
        String newWords = "Java is form of Java";
        String[] ww = newWords.split(" ");
        System.out.println(ww.length);

        Map<String, Integer> mpp = new Hashtable<>();

        for (int i = 0; i < ww.length; i++) {
            String sWrd = ww[i];

            if (mpp.containsKey(sWrd)) {
                mpp.put(sWrd, mpp.get(sWrd) + 1);
            } else {
                mpp.put(sWrd, 1);
            }
        }

        System.out.println(mpp + " >> Frequency of Words");
//=============================================================

        String ss = "You are the strongest of Strongest";

        String[] swt = ss.split(" ");

        Map<String, Integer> mm = new Hashtable<>();

        for (String newswt : swt) {
            if (mm.containsKey(newswt)) {
                mm.put(newswt, mm.get(newswt) + 1);
            } else {
                mm.put(newswt, 1);
            }
        }

        System.out.println(mm);

        char[] oo = ss.toCharArray();

        Map<Character, Integer> mu = new TreeMap<>();

        for (char kk : oo) {
            System.out.println(kk);
            if (mu.containsKey(kk)) {
                mu.put(kk, mu.get(kk) + 1);
            } else {
                mu.put(kk, 1);
            }
        }
        System.out.println(mu + "charater");


        // ===============

        // find occurenec od charater

        String countWords = "Abcd dcbA abcd";
        char[] cc = countWords.toCharArray();

        int count = 0;

        Map<Character, Integer> acc = new TreeMap<>();

        for (int i = 0; i < cc.length; i++) {
            System.out.println(cc[i]);


        }


    }
}
