package max_mini;

import java.util.Scanner;
public class max_mini {
    public static void main(String args[])
    {
        Scanner number=new Scanner(System.in);
        System.out.println("Please enter The size of Array");
        int num =number.nextInt();
        int[]numbers=new int [num];
        int max=numbers[0];
        int min=numbers[0];
        int i;
        for(i=0;i<numbers.length;i++)
        {
            System.out.println("Enter number"+(i+1));
            numbers[i]= number.nextInt();
            max=Math.max(max,numbers[i]);
            if(numbers[i]<min)
                min=numbers[i];
        }
       printarray(numbers);
        System.out.println("The largest number is "+ max);
        System.out.println("The smallest number is "+ min);

    }
    public static void printarray(int list[])
    {
        System.out.println("The All Numbers");
        for (int i = 0; i < list.length; i++) {

            System.out.println(list[i]);
        }


    }

}
