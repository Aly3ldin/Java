package functions;
import java.util.Scanner;

public class Functions {
    public static void main (String[]args) {




        Scanner func = new Scanner(System.in);
       /* System.out.println(Math.sqrt(25));





       This comment for get The root of number 25.

        System.out.println("Start of the village");
        abuelsayed();
        System.out.println("Welcome to you in our house");
        abuelsayed();
        System.out.println("the End of the visit");
        */





        int cou = 1;
        do {
            int num1, num2, total = 0;
            System.out.println("Enter two numbers please!");
             num1 = func.nextInt();
             num2 = func.nextInt();
                if(num1<0||num2<0){
                    System.out.println("Sorry! not allowed for negative numbers");
                    continue;
                }
            total = talk(num1, num2);
            System.out.println("talk =" + total);
        }
        while (cou > 0);
    }




               //function 1
                public static void abuelsayed () {
                //this function for draw some stars
                    for (int i = 0; i < 20; i++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }



                //function 2
                public static int talk ( int j, int k){
                //this function for sum two numbers
                     int result = 0;
                     result = j + k;
                     return result;

                    }
                   



    }

