package Experiment;

public class Elephant  {

    public void ele(int ph, String name, Byte age){
        System.out.println("Phone: " + ph + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args){
        Elephant e = new Elephant();
        e.ele(8056, "Dinesh", (byte) 30);  // Pass proper arguments
    }
}
