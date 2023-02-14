package moreoneif;
import java.util.Scanner;

public class moreoneif {
    public static void main(String[]args){
        Scanner boo=new Scanner(System.in);

        int num1 ,num2;

        System.out.println("Enter two numbers please !");
            num1=boo.nextInt();
            num2=boo.nextInt();
        if(num1== num2)
            System.out.println("Both are equal");
        else if(num1>=num2)
            System.out.println("Num1 is greater than Num2");
        else
            System.out.println("Num2 is greater than Num1");
    }
}
