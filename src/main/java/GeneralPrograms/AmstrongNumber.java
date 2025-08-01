package GeneralPrograms;

public class AmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        int result = 0, rem = 0, temp =num;


        for (int i=num; i>0; i++){

            rem = num%10;
            num = num/10;
            result = result + rem*rem*rem;
        }

        if (result == temp){
            System.out.println("This is Amstrong");
        }else {
            System.out.println("Not an Amstrong");
        }


    }
}
