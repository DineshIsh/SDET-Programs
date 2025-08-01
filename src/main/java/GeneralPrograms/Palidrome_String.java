package GeneralPrograms;

public class Palidrome_String {

    public static void main(String[] args) {
        String wr = "MaM";
        char[]  ch = wr.toCharArray();
        String re = "";

        for (int i =wr.length()-1; i>=0;  i--){

            re = re+ch[i];
        }
        System.out.println(re);

        if (re.equals(wr)){
            System.out.println("its palindrome");
        }
        else {
            System.out.println("its not palindrome");
        }

    }



}

