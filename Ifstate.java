package Ifsate;
import java.util.Scanner;

public class Ifstate {
    public static void main(String[]args){

        Scanner Bo = new Scanner(System.in);
            int grade;
                System.out.println("Enter the grade please !");
                grade = Bo.nextInt();
                    if (grade >= 60)
                        System.out.println("Congratulation ! you are passed");
                    else
                        System.out.println("Sorry ! you are failed");
    }
}
