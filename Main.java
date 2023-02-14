package inheritance;
public class Main {
    public static void main(String[] args)
    {
    //Person r1 = new Person("Ali",21,"Maghagha","Egyptian");

       /* Student std1 = new Student("Ali",21,"Maghagha","Egyptian","level 3","IT",2.70);

        System.out.println(std1.getName());

        */
        Employee se = new Salaried_Employee("Ali",21,"Maghagha","Egyptian",3000,"Advisor","IT_pentest",700,50);
       // System.out.println(se.get_Salary());
        se.print_all_details();
    }
}