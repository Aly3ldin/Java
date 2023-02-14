package area;

import java.util.Scanner;

public class area {
    public static void main (String[]args){

        Scanner auc = new Scanner(System.in);
        int length ,width , area ;

        System.out.println("Enter the length");
        length = auc.nextInt();
        System.out.println("Enter the width");
        width = auc.nextInt();
        area =length*width;
        System.out.printf(" The rectangle area = %d" , area);
    }
}
