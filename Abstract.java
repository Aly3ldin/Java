package Abstraction;
public class Abstract {



     static abstract class Bike{
        abstract void run();


    }
       static class honda4 extends Bike{
        @Override
         void run ()
        {
            System.out.println("Overidding abstract method");
        }
    }

    public static void main (String []args)
    {
        Bike cr= new honda4() ;
        cr.run();
    }
}
