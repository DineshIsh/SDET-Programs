package prg;

public class Prg {


//    Right to left (last to first) → use >= 0 ✅
//    Left to right (first to last) → use < length ✅ (not <=, or you'll exceed the index)

   /* public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 6};

        int num1 = 7;

//        if (num1 % 2 != 0) {
//            System.out.println("odd");
//        } else {
//            System.out.println("Even");
//        }

        for (int i=0; i<num.length; i++){

           String result =  (num[i] % 2 == 0) ? "even" : "odd";

            System.out.println(num[i]+" "+ result );
//            System.out.println(result);
        }
        }
        */

    //   ==============
    //factorial

 /*   public static void main(String[] args) {

        int ff = 7;

        for (int i = 1; i < ff; i++) {

           int fac* = 1;
        }*/

    // ================================
    // Reverse String


//    public static void main(String[] args) {
//        String s = "Dinesh";
//        char[] c = s.toCharArray();
//        String tmp = "";
//        for (int i = c.length - 1; i >= 0; i--) {
//            tmp = tmp + c[i];
//        }
//        System.out.println(tmp);

    // =============type2==========
//        char ct = s.charAt(0);
//        String rev =" ";
//        for (int i=s.length()-1; i>=0; i--){
//
//            rev = rev + s.charAt(i);
//        }
//        System.out.println(rev);

    //  ===============type3========

//       String rez="";
//        for (int i=s.length()-1; i>=0; i--){
//            rez = rez + s.substring(i,i+1);  // dinesh
//        }
//        System.out.println(rez);


        /*public static void main(String[] args){

            String ss = "Dinesh kumar";

            String rev = "";

            for(int i=ss.length()-1; i>=0; i--){

                rev = rev + ss.charAt(i);

            }
            System.out.println(rev);
        }*/


    // =============findLargest===========

//    public static void main(String[] args) {
//        int a = 10; int b = 20; int c=30;

//        int largest = 0;
//
//        if(a >= b && a>= c){
//            largest = a;
//        }else if (b>=a && b>=c){
//            largest=b;
//        }else{
//            largest = c;
//        }

//        int[] nu = {10,55,69,78};
//        int larg = nu[0];
//
//        for (int i=0; i< nu.length; i++ ){
//
//            if(nu[i] > larg){
//                larg = nu[i];
//            }
//        }
//        System.out.println(larg);
//    }

//======================palindrome============

   /* public static void main(String[] args) {

        String ispalindrome = "Anna";

        String revv = "";

        for (int i = ispalindrome.length() - 1; i >= 0; i--) {

            revv = revv + ispalindrome.charAt(i);
        }

        if (ispalindrome.equalsIgnoreCase(revv)){
            System.out.println("palindrome");
        }else {
            System.out.println("NOt a Palindrome ");
        }

    }*/


    // ==========multiplicationTable============

/*    public static void main(String[] args) {

        int num= 2;

        for (int i=1; i<=10; i++){

            System.out.println(num + "*" + i + "=" + (num*i));
        }
    }*/

    //   =========loop============

    public static void main(String[] arg) {

//        Prg ob = new Prg();
//        ob.revNumber();
//        ob.revString();
//        ob.whileloop();
//    }
//    static  int num = 1234;
//
//    public void revString() {
//
//        String ss = "Dinesh";
//        String revStr = "";
//
//        for (int i = ss.length() - 1; i >= 0; i--) {
//
//            revStr = revStr + ss.charAt(i);
//
//        }
//
//        System.out.println(revStr);
//
//    }
//
//    public void revNumber() {
//        int revnum = 0;
//
//        for (int temp = num ; temp != 0; temp = temp / 10) {
//            int digit = temp % 10;
//            revnum = revnum * 10 + digit;
//        }
//        System.out.println(revnum);
//    }
//
//    public  void whileloop(){
//        int revz = 0;
//        int tem = num;
//                while (tem!=0){
//                    int digit1 = tem % 10;
//                    revz = revz*10 + digit1;
//                    tem = tem /10;
//                }
//                System.out.println(revz);

//        public void simplewordReverse(){
//
//            String si = "Dinesh";
//            String rev ="";
//
//            for(int i=0; i<si.length(); i++){  //length gives the total charter count in string without converting
//                rev = si.charAt(i) + rev;
//            }
//            System.out.println(rev);
//        }


        // ========== Switch===========

        /*String strInput = "Reverse_Number";


        switch (strInput){
            case "Reverse_Number":

                int num1 = 4321;
                int rev_N = 0;

                for(int i = num1; i!=0; i=i/10){

                    int digit = i % 10;   // first we are seperating the last number by getting the reminder
                    rev_N = rev_N * 10 + digit; // we are multiplying it by 10 coz to extract the one last number,
                                                // only if we divide by 10 then on ly all the time we can get the original num1 value
                                                 // again we are dividing the last number coz to remove the last number

                }
                System.out.println(rev_N );

                break;

            case "Reverse_Word":
                String st = "Maam";
                String rev1 = "";

                for(int i =st.length()-1; i>=0; i--){

                    rev1 = rev1 + st.charAt(i);

                }
                System.out.println(rev1);



                break;

            case "reverse_whileloop":
                 String wh = "Woooow";

            int i = wh.length()-1;
               String rev = "";

               while (i>=0){
                   rev = rev + wh.charAt(i);;
               }
                System.out.println(rev);

                break;

            case "reverse_Number_whileloop":
                int num = 1234;

                int revq = 0;

                while (num >=0){

                    int digit = num % 10;
                    revq = revq * 10 + digit;
                    num = num/10;

                }

                break;

            default:
                System.out.println("Base on the variable the loop will execute");

        }*/

//===================Factoriya==============


//        int num = 5;
//        int fact = 1;
//
//        for (int i=1; i<=num; i++){
//
//            fact = fact * i;
//        }
//        System.out.println(fact);

//===================== Find how many digits are in a given number ============

//        int[] num = {1,2,2,3,4,5,5,8};
      /*  long nnum = 124578955;
        int count=0;

        while (nnum != 0){
            nnum = nnum / 10;
            count = count +1;
        }
        System.out.println(count);*/


        //================
     /*   int a= 0;
        int b = 1;

        for (int i=2; i<=10; i++){

            a=b;
            b = a + b;
        }*/


        // ============


//        int[] num = {1, 2, 3, 4, 8, 11};
//
//        for (int i = 0; i < num.length; i++) {
//            boolean isprime = true;
//
//            if (num[i] <= 1) {
//                isprime = false;
//            } else {
//                for (int j = 2; j < num[i]; j++) {  // {1, 2, 3, 4, 8, 11};
//                    if (num[i] % j == 0) { // 1 % 2 == 1  ,  2  % jas2 = 0
//                        isprime = false;
//                        break;
//                    }
//                }
//            }
//
//            if (isprime) {
//                System.out.println(num[i] + " : Prime number");
//            } else {
//                System.out.println(num[i] + " : Not a prime number");
//            }
//        }

      //   ========================= Array sorting ==============

        int[] num = {1,5,8,4,9,741,5};

        System.out.println(num);

        System.out.println(num.length + "jst the exact count of digits ");


        for(int i=0; i<6; i++){

            System.out.println("new");

            for (int j=0; j<3; j++){

                System.out.print("  "  + "*");
            }



        }



    }


}











