package Practice_Prg;

import java.util.*;

public class Practice {
   /* int a=10; int b = 5;

    public static void main(String[] args) {
        Practice p = new Practice();
        p.sum();
    }

    public int sum(){
        int result = a+b;
        System.out.println("Sum value :" +  result);
        System.out.println("Sum value :" + a+b);
        return result;
    }*/

//    =============


    public void numberFinder() {
        int num = 2;

        if (num % 2 == 0) {
            System.out.println("Even number ");
        } else {
            System.out.println("Odd number ");
        }
    }

    public void numberFinderArray() {

        int[] num = {1, 2, 3, 4, 4, 5};

        for (int n : num) {

            if (n % 10 == 0) {
                System.out.println("Even number ");
            } else {
                System.out.println("Odd number ");
            }
        }
    }

    public void numberFinderArrayIndex() {
        int[] num = {1, 2, 3, 4, 4, 5};

        for (int i = 0; i < num.length; i++) {

            if (num.length % 10 == 0) {
                System.out.println("Even number " + num[i]);
            } else {
                System.out.println("Odd number " + num[i]);
            }
        }
    }

    public void factorial() {
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public void factorialwhile() {
        int num = 6;
        int fact = 1;
        int i = 1;

        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }

    public void factorialReverse() {
        int num = 7;
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public void palindromeNumberIncremental() {

       /* TODO: logic

         * Need to take the last digit so we need to mode it  by num % 10 (Mode helps to take the last number)
         * save the last seperated number in seperate vriable
         * Have a empty variable to do the logic
         * It multiplies the reversed number by 10 to shift its digits left and then adds the new last digit to build the reversed number step by step
         * option (every time to bring the seperated(rev) value left side we are multiplying with 10  and adding it)
         *Then remove the total number by dividing it by 10 to eleminate the last number to continue to reverse the next numbers

        And in condition if we put in any other way it will show error so simply saying num is != 0 */

        int num = 121;
        int rev = 0;


        for (int i = num; i != num; i++) {     // //        for (int i =1; num != 0; i++) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        System.out.println(rev);
    }

    public void reverseString() {

        String ss = "Dinesh";  //  6>=6, 6>

        System.out.println(ss.length());

        String rev = " ";

        for (int i = ss.length() - 1; i >= 0; i--) {
            rev = rev + ss.charAt(i);
        }
        System.out.println(rev);
    }

    public void counttheNUmberOfDigits() {
        long num = 12388888;
        long count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);

    }

    public void simpleCalculator() {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        System.out.println("print the first number ");

        double num2 = sc.nextDouble();
        System.out.println("print the Second number ");

        double sym = sc.next().charAt(0);
        System.out.println("wat type of actoin Do  you need ?  ");

        double result;

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num2 != 0 ? num1 / num2 : "Divide by 0");
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }

    public void sumOfDigits() {
        int num = 1234;


    }

    public void FibonacciSeries() {
        int num = 50;

        int sum = 0;
        int nub1 = 0;
        int nub2 = 1;

        for (int i = 1; i <= 50; i++) {
            sum = nub1 + nub2;
            nub1 = nub2;
            nub2 = sum;
        }
        System.out.println(sum);

    }


    public void findtheArraySmall_Largest() {

        /*  Assume first element is small
         * IF they ask to find its Largest same, consider the first number as largest    */

        int[] num = {1, 5, 6, 9, 8, 7, 5, 2};

        int smallest = num[0];
        int Largest = num[0];

        for (int i = 1; i < num.length; i++) {

            if (num[i] < smallest) {
                smallest = num[i];
            } else if (num[i] > Largest) {
                Largest = num[i];
            }
        }
        System.out.println(Largest + "  Largest Number ");
        System.out.println(smallest + "  Smallest Number ");


    }

    public void findSmallestNumber() {

        int[] arr = {5, 8, 1, 9, 3, 7};

        int smallest = arr[0];  // assume first element is smallest

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {

                smallest = arr[i];  // update if smaller element found
            }
        }

        System.out.println("Smallest number in the array: " + smallest);

    }

    public void findfirstTwoSmallNumber() {

        int[] arr = {5, 8, 1, 9, 3, 7, 1};

        int firstSmall, secondSmall;

        if (arr[0] < arr[1]) {

            firstSmall = arr[0];
            secondSmall = arr[1];

        } else {
            firstSmall = arr[1];
            secondSmall = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {

            if (i < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != firstSmall) {

                secondSmall = arr[i];
            }
        }
        System.out.println("First Smallest Number " + firstSmall);
        System.out.println("Second Smallest number " + secondSmall);

    }

    public void find1st_2ndLargestNumber() {   // diff approch

        int[] arr = {5, 8, 1, 9, 3, 7};

        int firstLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];
            }
        }


        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("First Largest: " + firstLargest);
        System.out.println("Second Largest: " + secondLargest);


    }

    public void removeDuplicatefromString() {

        String dup = "BigBang";
        String result = "";

        for (int i = 0; i < dup.length(); i++) {

            char c = dup.charAt(i);

            if (result.indexOf(c) == -1) {   // -1 means not found and can be use for other scenarios as well
                result = result + c;
            }
        }
        System.out.println(result);
    }

    public void UsingSetRemoveDuplicate() {
        String dup = "BigBang";
        String result = "";

        Set<Character> ss = new HashSet<>();

        for (int i = 0; i < dup.length(); i++) {
            char dd = dup.charAt(i);    // u cannot directly add into set coz it returun boolen
            // so jst use result variable by if condition

            if (ss.add(dd)) {
                result = result + dd;
            }
        }
        System.out.println(result);
    }

    public void   Countoccurrenceofcharacterinstring(){

        String[] words = {"Dinesh", "Hema" , "HemaRowdy"};


       HashMap <Integer,String> mp = new HashMap();

       for (int i=0; i < words.length; i++){

           mp.put(i,words[i]);
       }
        System.out.println(mp + "    " + mp.size());



    }

    public static void main(String[] args) {
        Practice pp = new Practice();
        pp.Countoccurrenceofcharacterinstring();


    }

    public void reverseString_withoutChangingSymboles() {
        String str = "Dines$Ish";
    }

    public void PrimeNumber() {
        int num = 5;
    }


}
