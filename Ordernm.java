package ordernm;
import java.util.*;
public class Ordernm {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Enter three numbers");
        n1=scan.nextInt();
        n2=scan.nextInt();
        n3=scan.nextInt();
        if(n1<n2 && n1<n3 && n2<n3)
        {
            System.out.println(n1+"\n"+n2+"\n"+n3+"\n");
        }
        else if(n2<n1 && n2<n3 && n1<n3)
        {
            System.out.println(n2+"\n"+n1+"\n"+n3+"\n");

        }
        else if (n3<n1 && n3<n2 && n2<n1)
        {
            System.out.println(n3+"\n"+n2+"\n"+n1+"\n");
        }


    }
}
