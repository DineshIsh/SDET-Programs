package GeneralPrograms;

public class ReverseString_Array {

    public static void main(String arg[]) {

//        Character[] val = {'D','I','N','E','S','H'};

        String value = "Dinesh_ -";
        String rev = "";

        char[] va = value.toCharArray();   //Changed the normal String to Array toCharArray is the only way as to change into charater

        for (int i = va.length - 1; i >= 0; i--) {   // 4 >=0 ,

            rev = rev + va[i];

        }
        System.out.println(rev);
    }
}


