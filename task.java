package task;
import java.util.Scanner;
public class task {
    public static void main(String[] args)
    {
        Scanner test=new Scanner(System.in);
        System.out.println("Enter your name please !");
        String nm=test.nextLine();
        System.out.println("Enter your Id !");
        int id= test.nextInt();
        person input= new person();
         // this step for get the set method.
         input.setName(nm);
         input.setId(id);
        // this step for get the get method.
        System.out.println("The Name :"+person.getName());
        System.out.println("The Id :"+person.getId());
        }
        public static class person
        {
            private  static String Name;
            private static int Id;
            public static void setName(String N)
            {Name = N;}
            public static void setId(int I)
            {Id =I;}
            public static String getName()
            {return Name;}
            public static int getId()
            {return Id;}
    }


}
