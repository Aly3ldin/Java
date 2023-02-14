package Array1;
import java.util.Scanner;
public class array_method {
    static Scanner array =new Scanner(System.in);

    public static void main (String []args){

        int size ;
        System.out.println("Enter the size of the array !");
        size=array.nextInt();
        int ids[]= new int[size];

        fillarray(ids);
        printarray(ids);

        do {
            System.out.println("Enter The id to search for");
            int sreachid = array.nextInt();
            int returnindex = searcharray(ids, sreachid);

            if (returnindex >= 0)
                System.out.println("The item is found");
            else
                System.out.println("The item is not found");
        }while(true);



    }
        public static void fillarray(int []list) {
            for (int i = 0; i < list.length; i++)   {
                System.out.println("Enter no" + (i + 1));
                list[i] = array.nextInt();
            }
        }

        public static void printarray(int list[])
            {
                for (int i = 0; i < list.length; i++) {
                    System.out.println(list[i]);
                }

            }

        public static int searcharray(int []list, int target)
        {
            for (int i = 0;i<list.length;i++){
                if(list[i]==target)
                    return i;
            }
           return -1;
        }


        }



