package Experiment;

public class StringPrac {

   static String[] name = {"Dinesh", "Ishaan"};

    public static void main(String[] args) {

        String nam = "id";

        for (String var: name){

            nam = nam + name;
            System.out.println( "nm  ..  " + var.hashCode() + var);

        }


    }
}
