package countwords;
import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int calcr[] = new int[256];

        String word;
        int i, ln;

            System.out.println("Please enter a word !");
            word = input.nextLine();

            ln = word.length();

            for (i = 0; i < ln; i++)
                calcr[(int) word.charAt(i)]++;

            for (i = 0; i < 256; i++) {
                if (calcr[i] != 0) {
                    System.out.println((char) i + ":--> " + calcr[i]);
                }

            }



    }
}
