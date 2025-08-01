package GeneralPrograms;

public class Swapping_Numbers {

     public static void main(String[] args) {
        int a = 10; int b = 20;
        int z  = 0;

//         System.out.println("The value of element is : "+ b);

        z = a;
//         System.out.println("The value of element is : "+ z);
//         System.out.println("The value of element is : "+ a);

         b = a;
//         System.out.println("The value of element is : "+ b);


         z = a;
         a = b;
         b = z;

         System.out.println("The value of element is : "+ a);
         System.out.println("The value of element is : "+ b);
         System.out.println("The value of element is : "+ z);



         // Approach 2 without usig 3rd variable
        /* int a = 300; int b = 20;

         a = a+b;
         b = a-b;
         a = a-b;

         System.out.println("The value of element is A: "+ a);
         System.out.println("The value of element is B: "+ b);*/















    }
}
