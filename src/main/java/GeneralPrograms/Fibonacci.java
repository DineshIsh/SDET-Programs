package GeneralPrograms;

public class Fibonacci {

    // for example we can take calander where we need to add the pervious number one by one from 1-30

    public static void main(String[] args) {

        int n1=0, n2=1, sum = 0;

     for (int i=2; i<10; i++){

         sum = n1+n2; //  1  2
         n1 = n2;    //n1 --//1
         n2 = sum;   //n2 --// 1 3
         System.out.println(sum);

     }
    }

}
