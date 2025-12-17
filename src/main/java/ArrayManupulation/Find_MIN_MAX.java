package ArrayManupulation;

public class Find_MIN_MAX {

    public static void main(String[] args) {

        int[] num = {100, 20, 11, 36, 44, 0};

        int small = num[0];
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if ( num[i] < small) {
                small = num[i];

            }

            if (num[i] > max){
                max = num[i];
            }

        }

        System.out.println(small);
        System.out.println(max);

    }
}
