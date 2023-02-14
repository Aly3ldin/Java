package Array1;
import java.util.Scanner;
public class Array1 {
     public static void main(String []args){
         Scanner days =new Scanner(System.in);
         int j=1;
        do{
             int s;
             System.out.println("Enter size of Array !");
                s =days.nextInt();
             int []numbers= new int[s];
            int sum=0, count =0 ,i ;
                 for ( i =0;i <numbers.length;i++){
                     System.out.println("Enter no"+(i+1));
                     numbers[i]=days.nextInt();
                 }
                 for ( i =0;i <numbers.length;i++){
                 if (numbers[i]>0) {
                     sum += numbers[i];
                     count++;
                 }

         }
                System.out.println("the sum numbers is "+sum);
                System.out.println("the sum numbers is "+sum/count);
             }while( j>0);


         }


     }

