package final_exam;
import fina_exam.Encaps;

public class Final extends Encaps {
    double Square(double num)
    {
        return num * num;
    }

            public static void main (String []args)
            {
                Final sq = new Final();
                double n1=22.2;
                System.out.println(sq.Square(n1));
                int n2 =22;
                System.out.println(sq.Square(n2));

                
                int num=777;
                double nm=(double)num;
                double nn=num;

                System.out.println(nm);


                Vehicle b = new Vehicle();
                b.run();
      /*  Scanner grade =new Scanner(System.in);

        System.out.println("Enter you grade please !");
        int gr =grade.nextInt();

        if(gr >= 90 && gr <= 100)
        {
            System.out.println("You got A");
        }
        else if (gr >= 80 && gr <=90)
        {
            System.out.println("You got B");
        }
        else if (gr >= 70 && gr <= 80)
        {
            System.out.println("You got C");
        }
        else if (gr >= 50 && gr <= 70)
        {
            System.out.println("You got D");
        }
        else if (gr <= 50 )
        {
            System.out.println("Sorry..You got F");
        }
        else
            System.out.println("Invaled Grade..\n Please Enter valid grade");

       */
             Encaps vis= new Encaps() ;
             vis.visit();
            Ali obj= new Ali();
            obj.run();

            Encaps obj1 = new Final();
            obj1.setName("Ali");
            }


        }
        class Ali extends Final{
    void run ()
    {
        System.out.println("Hello world");
    }

        }
 class Vehicle extends Encaps{
   public void run(){
        System.out.println("Vehicle is running");
    }


    public void visit()
    {
        System.out.println("Visit our market at any time 🙂🤞");
    }
}

 class bike extends Vehicle{
    @Override
   public void run(){
        System.out.println(" Bike is running as well.");
    }
}


