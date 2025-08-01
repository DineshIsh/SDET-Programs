package Experiment;

public class constructorExp {

    public constructorExp(){
        System.out.println("print Default >> ");
    }

    public constructorExp(int num){
        this();
        System.out.println("print parameter constructor >> " + num);
    }

    static class constructorExp_B extends constructorExp{

        public constructorExp_B(){
            System.out.println("print Default 2nd class >> ");
        }

        public constructorExp_B(int num){
            super();
            System.out.println("print parameter constructor 2nd class >> " + num);
        }
    }


    public static void main(String[] args) {
        constructorExp_B obj = new constructorExp_B(10);

    }


}
