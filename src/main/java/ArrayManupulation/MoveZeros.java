package ArrayManupulation;

public class MoveZeros {

    public static void main(String[] args) {

        // first bring all the number to front
        // then after looping the index will be in mid so jst put assign the zero to remainig sports
        // for these we need one more variable to go through the index positoin so manually add one

        int[] num = {1, 5, 6, 0, 5, 0, 7, 9, 0, 7, 0};

        int indexpostion = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] != 0) {
                int current = num[i];
                num[indexpostion] = current;
                indexpostion++;
            }
        }

        for (int i = indexpostion; i < num.length; i++) {
            num[i] = 0;  // remaning index ewhich is in mid after moving the element to left
        }

        for (int n : num)
            System.out.print(n);
    }
}