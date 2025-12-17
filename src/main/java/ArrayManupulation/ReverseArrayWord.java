package ArrayManupulation;

public class ReverseArrayWord {

    public static void main(String[] args) {

        String[] arr = {"Dinesh", "Java", "PLaywright"};

       /* for (int i=arr.length-1; i>=0; i-- ){

            String arrWrd = arr[i];

            for (int j=arrWrd.length()-1; j>=0; j--){
                System.out.print(arrWrd.charAt(j));
            }
            System.out.println(" ");
        }*/



        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
            String str = arr[i];

            for (int j=str.length()-1; j>=0; j--){
                System.out.print(arr[i].charAt(j));
//               char rev =  arr[i].charAt(0);
            }

            System.out.println(" ");
        }

    }
}
