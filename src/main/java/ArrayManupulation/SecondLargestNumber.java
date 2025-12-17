package ArrayManupulation;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int temp = 0;

        int[] num = {100, 20, 11, 36, 44, 0};

        for (int i=0; i<num.length; i++){
            for (int j=i+1; j<num.length; j++){

                if (num[i] > num[j] ){

                     temp = num[i];
                    num[i] =  num[j];
                    num[j] = temp;
                }
            }
            System.out.println(num[i] - 2);

        }




    }


}
