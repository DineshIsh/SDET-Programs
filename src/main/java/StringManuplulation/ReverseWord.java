package StringManuplulation;

public class ReverseWord {

    public static void main(String[] args) {
        String s = "I love java ";
        String rev = "";
        String[] wrd = s.split(" ");

        for (int i=wrd.length-1; i>=0; i--){
             rev = rev + " " +wrd[i]; // need to implement  the space to be same data
        }
        System.out.println(rev);

    }
}
