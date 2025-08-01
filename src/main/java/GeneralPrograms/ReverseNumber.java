package GeneralPrograms;

public class ReverseNumber {

    public  static void main(String arg[]){
        // The main idea is to remove the last digit to remove last digit % is used
        // * is used to make any number as round fig so the next value can be added easily (430+2 = 432)
        // division is used to restrict given number



        int digit = 123456;
        int rev = 0;

        while (digit > 0 ) {

             rev = rev * 10 + digit%10;
             digit = digit/10;

        }

        System.out.println(rev);
    }


}
