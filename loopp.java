package loopp;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class loopp {
    public static void main (String[]args) {
        Scanner dohille = new Scanner(System.in);

        int num1, num2;
        float sum;
        int option;
        System.out.println("Select The process that you want to do :");
        System.out.println("1. sum two numbers ");
        System.out.println("2. subtract two numbers");
        System.out.println("3. divide two numbers ");
        System.out.println("4. multiple two numbers ");
        System.out.println("0. enter (0) to Exist ");

        do {
            System.out.println("Select The process that you want to do");
            option=dohille.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the first number");
                    num1 = dohille.nextInt();
                    System.out.println("Enter the second number");
                    num2 = dohille.nextInt();
                    sum = num1 + num2;
                    System.out.println("sum =" + sum);
                    break;
                case 2:
                    System.out.println("Enter the first number");
                    num1 = dohille.nextInt();
                    System.out.println("Enter the second number");
                    num2 = dohille.nextInt();
                    sum = num1 - num2;
                    System.out.println("sum =" + sum);
                    break;
                case 3:
                    System.out.println("Enter the first number");
                    num1 = dohille.nextInt();
                    System.out.println("Enter the second number");
                    num2 = dohille.nextInt();
                    sum = num1 / num2;
                    System.out.println("sum =" + sum);
                    break;
                case 4:
                    System.out.println("Enter the first number");
                    num1 = dohille.nextInt();
                    System.out.println("Enter the second number");
                    num2 = dohille.nextInt();
                    sum = num1 * num2;
                    System.out.println("sum =" + sum);
                    break;
                case 0:
                    System.out.println("Good bye !");
                    break;

                default:
            }

        }
        while (option !=0);
    }
}
