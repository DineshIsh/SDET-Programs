package GeneralPrograms;

public class Find_MIN_MAX_Val {     // Find the small anf big number in array

    public  static void main(String[] arg) {

        int[] a = {50, 60, 70, 80, 95,40};

        // need to loop the entire variable
        // Declare first var as higher jst to compare with other elements
        // Then it's easy to find low and Highest value from the varaiable

        int min = a[0];
        int count = 0;

        for (int i = 1; i < a.length; i++){    // 1 < 6
//
            if ( a[i]<min){  //50<60  ,

                  min = a[i];   // the value of first index is the lowest has be swapped

            }
            count = count+1;
        }
        System.out.println("The lowest num is : " + min + " cout : " + count);

    }




}


// ArrayList <Integer> Ary = new ArrayList;
