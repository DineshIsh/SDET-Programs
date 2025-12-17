package StringManuplulation;

public class WordCountNoSplit {

    public static void main(String[] args) {


        String wrd = "I got a new job";
        int wordCount = 0;
        boolean isthatword = false;
        char[] c = wrd.toCharArray();

        for (int i = 0; i < wrd.length(); i++) {
            System.out.println(c[i]);
            if (Character.isLetterOrDigit(c[i])) {
                if (!isthatword) {
                    wordCount++;
                    isthatword = true;
                }
            }
            else {
                isthatword = false;
            }
        }
        System.out.println(wordCount + " - Number of new words");
    }
}
