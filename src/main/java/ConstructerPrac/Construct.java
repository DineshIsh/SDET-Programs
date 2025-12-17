package ConstructerPrac;

public class Construct extends ABC {


    Construct() {

        System.out.println("Hello I am Constructor");
    }

    Construct(int nu) {
        super(nu);
        System.out.println("Hello I am Constructor - " + nu);
    }

    public static void main(String[] args) {

        Construct ob = new Construct(10);

    }

}

