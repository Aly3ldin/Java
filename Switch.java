package Switch;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;


public class Switch {
     public static void main ( String[]args){

         Scanner switch0=new Scanner(System.in);

         char grade;
         System.out.println("Enter your grade");
         grade =switch0.next().charAt(0);
         switch (grade)
         {
             case 'A' :
                 System.out.println("Excellent");
             break;

             case 'B' :
                 System.out.println("Very good ");
             break;

             case 'C' :
                 System.out.println("Good ");
             break;

             case 'D' :
                 System.out.println("Fair");
             break;

             default:
                 System.out.println("Invalid grade");

         }
     }

}
