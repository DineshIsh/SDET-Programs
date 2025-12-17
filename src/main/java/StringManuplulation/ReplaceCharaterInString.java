package StringManuplulation;

public class ReplaceCharaterInString {


        public static void main(String[] args) {
            String str = "hello world";

            // Replace all 'l' with 'x'
            String replaced = str.replace('l', 'x');

            System.out.println("Original: " + str);
            System.out.println("Replaced: " + replaced);
        }


}
