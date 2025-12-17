package MAP_Programs;

import java.util.HashMap;
import java.util.Map;

public class MAPTime {


    public void countTheFrequencyofeachCharater() {

        String word = "The preffered lang is JAVA";

        HashMap<Character, Integer> Hmap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char charerters = word.charAt(i);

            if (Hmap.containsKey(charerters)) {
                Hmap.put(charerters, 1 + Hmap.get(charerters));
            } else {
                Hmap.put(charerters, 1);
            }
        }
        System.out.println(Hmap);

    }

    public void countTheFrequencyofeachWord() {

        String str = "Java is fun and Java is powerful";

        String[] SPLword = str.split(" ");

        HashMap<String, Integer> mapH = new HashMap<>();


        for (String ss : SPLword) {
            System.out.println(ss);

            if (mapH.containsKey(SPLword)) {

                mapH.put(ss, mapH.get(ss) + 1);

            }

        }
    }


    public void findtheprefixLetter() {

        String[] words = {"flower", "flow", "flight"};

        String prefix = words[0].substring(0, 3);
//        System.out.println(prefix);
//        System.out.println(words.length);

        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);

            if (words[i].length() < 3 || words[i].substring(0, 3).equals(prefix)) {
            }
        }

        System.out.println("The common first two common prefix is :  " + prefix);
    }


    public void PrintthefrequencywhichisnotrepetativeinString() {
        String words = "Java is Powerfull and Java Secure program ";


        HashMap<Character, Integer> MPP = new HashMap<>();

        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);

            if (MPP.containsKey(ch)) {
                MPP.put(ch, MPP.get(ch) + 1);
            } else {
                MPP.put(ch, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : MPP.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }

        }

    }

    public void PrintthefrequencywhichisnotrepetativeinArray() {
        String[] words = {"Java", "Phython", "Selenium", "PLaywright", "API"};

        HashMap<Character, Integer> HP = new HashMap<>();

        for (String newWrd : words) {

            for (int i = 0; i < newWrd.length(); i++) {
                char WrdCh = newWrd.charAt(i);
//
                if (HP.containsKey(WrdCh)) {
                    HP.put(WrdCh, HP.get(WrdCh) + 1);
                } else {
                    HP.put(WrdCh, 1);
                }
            }


            for (char c : HP.keySet()) {
                if (HP.get(c) == 1) {
                    System.out.println(c + "    : Single  letter ");
                }
            }

            for (int cInt : HP.values()) {
                System.out.println(cInt);
            }

            for (Map.Entry<Character, Integer> ent : HP.entrySet()) {
                if (ent.getValue() >= words.length) {
                    System.out.println(ent.getValue() + " " + ent.getKey());
                }
            }

        }
    }

    public void keyVAalue() {
        // Create a `Map<Integer, String>` from two arrays: one of keys and one of values.

        int[] keys = {1, 2, 3, 4};
        String[] values = {"Java", "Python", "Ruby", "Go"};

        HashMap<Integer, String> HP = new HashMap<>();

        for (int i = 0; i < keys.length; i++) {
            HP.put(keys[i], values[i]);

        }
        System.out.println(HP);


    }

    public static void main(String[] args) {
        MAPTime mp = new MAPTime();
        mp.PrintthefrequencywhichisnotrepetativeinArray();
    }

}





