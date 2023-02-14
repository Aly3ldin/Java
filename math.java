package math;
import java.util.Scanner;
public class math {
    public static void main(String args[]) {
        Scanner calc = new Scanner(System.in);
        System.out.println("please select the process from the menu !");
        System.out.println("1-calc Triangle area");
        System.out.println("2-calc Square area");
        System.out.println("3-calc Circle area");

        int menu=0;
        int high, base;
        float trianglearea ;
        do {

            System.out.println("select now!");
            menu = calc.nextInt();
            if(menu!=1 && menu!=2 &&menu!=3)
             {
                System.out.println("Invalid correct");
                System.out.println("Please select correct choice !");
                continue;
            }
            if (menu == 1) {
                System.out.println("Enter The high of triangle");
                high = calc.nextInt();
                System.out.println("Enter the base of triangle");
                base = calc.nextInt();
                trianglearea = (float) (0.5 * high * base);
                System.out.println("The Triangle area =" + trianglearea);
            } else if (menu == 2) {
                System.out.println("Enter one side of the Square !");
                int side = calc.nextInt();
                int squarearea = 0;
                squarearea = side * side;
                System.out.println("The Square area =" + squarearea);
            } else if (menu == 3) {
                System.out.println("Enter the radius");
                double radius = calc.nextDouble();
                double circlearea;
                circlearea = (3.14 * Math.sqrt(radius));
                System.out.println("The Circle area =" + circlearea);
            }
        }while (true);
    }
}

