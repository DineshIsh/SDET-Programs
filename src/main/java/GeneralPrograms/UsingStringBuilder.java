package GeneralPrograms;

public class UsingStringBuilder {
    public static void main(String[] args) {


        String sentence = "I love learning Java";
        String rev = " ";

        // Split the sentence into words
        String[] words = sentence.trim().split(" ");

        for (String x : words) {
//            System.out.println(x);
        }
//        for (int i = words.length - 1; i >= 0; i--) {
//            rev = words[i];
//        }
//        System.out.println(rev);


        for (int i = words.length - 1; i >= 0; i--) {
//            if (rev.isEmpty()) {
                rev = rev + " " + words[i];
                System.out.println(rev);
//            }
        }
    }
}

//  from GPT Actual


/*
 public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I love learning Java";

        // Split the sentence into words
        String[] words = sentence.trim().split("\\s+");

        String reversed = "";
        // Loop from the end to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            if (reversed.isEmpty()) {
                reversed = words[i];
            } else {
                reversed = reversed + " " + words[i];
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversed);
    }
}*/
