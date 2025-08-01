package GeneralPrograms;

public class ArrayFindduplicate {

    public static void main(String arg[]) {

        //


        int[] num = {9,3, 2, 3, 4, 5,4, 3}; // 7
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j <num.length; j++) {

                if (num[i] == num[j]) {

                    System.out.println(" duplicates vale is  present in it  is " + num[j]);
                    count = count++;
                }


                // 3 < 7
                // 2 < 7
                // 3 == 2

            }

        }
        System.out.println(count);
    }


}
