package max_mini;
import java.util.Scanner;
public class max_min {
    public static void main(String []args) {
        Scanner array = new Scanner(System.in);

        System.out.println("Enter The Size of array !");
        int num = array.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i< arr.length; i++) {
            System.out.println("Enter index no" + (i + 1));
            arr[i] = array.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++)
        {
           max=Math.max(max,arr[i]);
           min=Math.min(min,arr[i]);
                 }

        System.out.println("The maximum value :" + max);
        System.out.println("The minimum value :" + min);

    }
}