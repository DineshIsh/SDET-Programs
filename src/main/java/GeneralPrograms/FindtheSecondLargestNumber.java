package GeneralPrograms;

public class FindtheSecondLargestNumber {

    public static void main(String ary[]){

        int[] arry = {1,5,6,9,8,7,5,2};
        int temp =0;
        int sz =arry.length;

        for (int i=0; i<arry.length;i++){
            for (int j=i+1; j<arry.length;j++){

                if (arry[i]>arry[j]){
                    temp = arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;
                }
            }

            System.out.print(arry[i]);
        }

        System.out.print(" is the second largrest array =" + arry[sz-2]);

    }
}
