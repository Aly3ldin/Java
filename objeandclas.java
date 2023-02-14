package objeandclas;
import java.util.Scanner;
public class objeandclas
{
    public static void main(String[]args)
    {
     Rectangle area_re =new Rectangle ();
     area_re.setlength(38);
     area_re.setWidth(30);
    // area_re.getLength();
     //area_re.getWidth();
        area_re.setWidth(8);
        area_re.setlength(9);
    double r = area_re.getarea();
    System.out.println(r);
    Rectangle box=new Rectangle();
    box.setlength(10);
    box.setWidth(9);
     double r2 =box.getarea();
     System.out.println(r2);

    }

}
