package Sumps;
import java.util.*;
public class Sumps {
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);

        // System.out.println("Enter the length of the set numbers");
        // lnn= scn.nextInt();
        
        int sum = 0;
        boolean lnn=true;
        while(lnn)
        {
            System.out.println("Enter the number to check");
            int number=scn.nextInt();
            if(number>0)
            {
                sum+=number;
            }
            else if(number<0)
            {
               System.out.println("Sum="+sum);
               lnn=false;
            }
        }

    }
}
