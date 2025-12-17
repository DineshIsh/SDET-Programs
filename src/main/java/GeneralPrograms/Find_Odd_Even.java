package GeneralPrograms;

public class Find_Odd_Even {

    public static void main(String arg[]){

        int num = 12342  ;
        int even_count = 0;
        int odd_count = 0;

//while (num > 0){
    for(; num>0;) {

        int rem = num % 10;

        if (rem % 2 == 0) {

            even_count++;
        } else {
            odd_count++;
        }
        num = num / 10;
    }

        System.out.println(even_count);


    }

}
