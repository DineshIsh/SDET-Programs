package GeneralPrograms;

public class PalidromeNumber {

    public static void main(String[] args) {
        int number = 121;
        int originalNumber = number;
        int revv = 0;


        while (number>0){

            revv = revv*10 + number%10;
            number = number/10;
        }
        System.out.println(revv);

        if ( originalNumber == revv){
            System.out.println("Its palirom");
        }
        else {
            System.out.println("Not palirom");
        }

    }
}
