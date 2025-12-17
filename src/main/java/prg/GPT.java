package prg;

public class GPT {


    public static void main(String[] args) {
      /*  int[] arr = {0, 1, 9, 0, 4, 0,};
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
        }*/

// ====================================

// Find the prefix of first two common letter

        String[] str = {"Flight", "Flower", "Fleet"};


        String[] words = {"Flower", "Flight", "Fleet"};

        // Step 1: take the first word
        String firstWord = words[0];

        // Step 2: get the first 2 letters
        String prefix = firstWord.substring(0, 2);  // "Fl"

        boolean allMatch = true;  // flag to track

        // Step 3: check if all words start with that prefix
        for (int i = 1; i < words.length; i++) {
            if (!words[i].startsWith(prefix)) {
                allMatch = false;
                break;
            }
        }

        // Step 4: print result
        if (allMatch) {
            System.out.println("Common 2-letter prefix: " + prefix);
        } else {
            System.out.println("No common 2-letter prefix found.");
        }
    }


}
