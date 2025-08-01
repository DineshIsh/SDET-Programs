package Full_Half_Abstraction;

public class Demo {

    void car(){
        System.out.println("Print Car");
    }

 public static class  DemoInnerClass extends PartialAbstraction implements FullAbstract { // only inner class can be static (better to  have static class
       @Override
       void Tc3() {
           System.out.println("print TC3");
       }


     public static void main(String[] args) {
         DemoInnerClass dm = new DemoInnerClass();  // only if class is static
         dm.Tc1();
         dm.Tc3();
         dm.calc();
         dm.miniCalc();




     }

// interface
     @Override
     public int calc() {
           int a = 2;
           int b = 3;
         System.out.println(a+b+c);
         return 0;
     }

     @Override
     public void miniCalc() {
         System.out.println("miniCalc");
     }
 }


}
