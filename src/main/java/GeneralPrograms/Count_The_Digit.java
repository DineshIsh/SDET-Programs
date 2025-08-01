package GeneralPrograms;

public class Count_The_Digit {

    // Input = 124578;
public static void main(String[]args) {

    int numb = 124578;

    int count=0;

    while (numb>0){

       numb = numb/10;   // after division only rest of the number will be stored here
       count++;          // adding value as one (one time the division opertion happened it will add that )
    }


    System.out.println(count);



}

}
