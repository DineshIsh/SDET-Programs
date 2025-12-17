package ArrayManupulation;

import java.util.Arrays;

public class ZeroAtFront {

    public static void main(String[] args) {

        int[] arr = {1, 0, 5, 66, 36, 0, 0, 1};

        int arrIndex = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[arrIndex] = arr[i];   // the user introduced index is arr[arrIndex]  >> arr[8]= 8
                arrIndex--;
            }
        }
        for (int i = arrIndex; i >= 0; i--) {
            arr[i] = 0;
        }

        Arrays.stream(arr).forEach(ar -> System.out.print(ar));


    }
}
