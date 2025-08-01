package GeneralPrograms;

public class SumOf_Numbers {


    public static void main(String[] args) {
        int num = 123456;

        int sum = 0;

        for (int i = num; i>0; i++) {

            sum = sum + num % 10;

            num = num / 10;

        }
        System.out.println(sum);
    }

}
