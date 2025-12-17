package PatterDesign;

public class PatterDesign {

    public static void main(String[] args) {


        int[] num = {1,3,4,5,0,5,6};
        int temp =0;

        for (int i=0; i<=num.length; i++){

            for (int j=i+1; j<=num.length; j++){

                if (num[i] == 0){

                    num[j] = temp;

                    num[j] = num[i];

                }
                System.out.println(num);
            }

        }


    }
}
