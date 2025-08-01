package Experiment;

public class Animal implements Cat,Dog {
    public void sleep(){
        System.out.println("sleep");
    }


    @Override
    public void run() {
        System.out.println("Dog can run");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.run();
    }
}

