package prg;

public class GPT {


        public static void main(String[] args) {
          int[] arr = {0, 1, 9, 0, 4, 0, };
          // 6

            int index = 0;  // Position to place the next non-zero element

            // Move non-zero elements to the front
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                   // arr[index++] = arr[i]; // 4

                    arr[index] = arr[i];
                    index++;
                }
            }

            while (index < arr.length) {
                arr[index++] = 0;
            }

            // Print the result
            for (int n : arr) {
                System.out.print(n + " ");
            }
        }




}
