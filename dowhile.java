package dowhile;
import java.util.Scanner;
public class dowhile {
    public static void main(String[]args){
        Scanner Dohile = new Scanner(System.in);
        boolean positvieinput =true;
        double value;
        double sum =0.0;                                                // this is a flag because we used a boolean vairable .
        while(positvieinput == true){
            System.out.println("Enter positive number please !");
            value=Dohile.nextDouble();
            if(value < 0){
                positvieinput=false;
            }
            else{
                sum+=value;
                System.out.println("the sum of the numbers that you entered ="+sum);
            }


        }
    }
}
