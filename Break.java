package Break;
import java.util.Scanner;

public class Break {
    public static void main (String[]args) {
        Scanner state = new Scanner(System.in);

            int i = 0, num, sum = 0;
            int j = 1;
        do {
            System.out.println("Etnter the times that you want.");
            int counter = state.nextInt();
                for (; counter > i; ) {
                    System.out.println("Enter positive number please !");
                    num = state.nextInt();

                    if (num < 0) {
                        System.out.println("Negative numbers are not allowed.");
                        continue;
                    }
                sum += num;
                i++;
            }

            System.out.println("Sum =" + sum);
        }
        while(j>0);
    }
}
