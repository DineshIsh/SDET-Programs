package GeneralPrograms;

public class reverseString {

    public static void main(String arg[]) {

        // new try

        String gg = "Hello world";

        String reverz = "";

        for (int i = gg.length()-1; i >= 0; i--) {

            reverz = reverz + gg.charAt(i);

        }
        System.out.println(reverz);


        String wr = "DInesh";
      char[]  ch = wr.toCharArray();
      String re = "";

        for (int i =wr.length()-1; i>=0;  i--){

            re = re+ch[i];
        }
        System.out.println(re);
    }
}
