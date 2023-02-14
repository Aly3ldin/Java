package Exception;

public class Except {
    public static void main(String[]args)
    {
        /*
            int num1 = 4;
            int num2 = 0;

            try {
                System.out.println("Done ✅");

                System.out.println(num1 / num2);
            } catch (ArithmeticException e) {
                System.out.println("So Sorry.. the division on zero is not allowed.");
            } catch (Exception e) {
                System.out.println(" Exception is occurred");
            }
        */
        /*
        try{
            int arr[]=new int[8];
            arr[7]=33/11;
            System.out.println("🤞🤞🤞");
            System.out.println(arr[7]);

        }
        catch (ArithmeticException e)
        {
            System.out.println("The division on zero is not allowed .");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" Outside of the limit ");
        }
        finally {
            System.out.println("any other exception ");
        }



        System.out.println("أبو اسلمان");
*/

        System.out.println(Except.mymethod());

    }
    public static int mymethod(){
    try
    {
        return 111;
    }
    finally {
        System.out.println("suiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        System.out.println("Gooooooooooooooooooooooooooooooooooooooooooat");

    }
    }

}
