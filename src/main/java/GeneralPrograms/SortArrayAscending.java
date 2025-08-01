package GeneralPrograms;

public class SortArrayAscending {

        public static void main(String[] args) {
            int[] arry = {5, 2, 4, 1, 3};  // 2 5 4 1 3  |

            for (int i = 0; i < arry.length; i++) {
                for (int j = i + 1; j < arry.length; j++) {
                    if (arry[i] > arry[j]) {
                        // Swap elements
                        int temp = arry[i];
                        arry[i] = arry[j];
                        arry[j] = temp;
                    }
                }
            }

            System.out.print("Sorted array: ");
            for (int a : arry) {
                System.out.print(a + " ");
            }


            // ==============bubble ==============

            int[] arr = {5, 2, 4, 1, 3}; //5 4 2 1 3

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap adjacent elements
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.print("Sorted array: ");
            for (int a : arr) {
                System.out.print(a + " ");
            }

        }

}






