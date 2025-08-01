package GeneralPrograms;

public class Factorial {

    public static void main(String arg[]){

        int n1 = 5;
        int n2 = 5;

       int  factorial = 1;

        // Assesding order
        for (int i =1; i<=5;i++ ){
            factorial = factorial * i;  // f = 1 * 0 = 0,  1*1 = 1 , 2*2=4
        }

        System.out.println("Assecending order : " + factorial);

       // ============

        for (int i=n2;i>=1;i--){
            factorial = factorial * i; // 1*5=5, 4*5=20
        }
        System.out.println("decnding  order : " + factorial);


//        int a = 5;
//        int fact = 1;
//
//        for (int i =1;i<10; i++){
//
//            fact = fact*i;  //1 2 6
//
//            System.out.println(fact);
//        }


    }
    }
