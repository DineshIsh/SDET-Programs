package GeneralPrograms;

public class PrimeNum {

    public static void main(String[] args) {
        int num = 55;

        boolean isprime = true;

        if (num <= 1) {
            isprime = false;

        }
        else
        {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }

            if (isprime) {
                System.out.println("Prime number ");
            } else {
                System.out.println("Not a prime number ");
            }
        }




    }
}
