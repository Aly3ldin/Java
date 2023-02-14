package Palindrome;
import java.util.*;
public class Palind {
    public static void main(String []ali)
    {
        Scanner palind =new Scanner(System.in);
        String word;
        do {
            System.out.println("Enter any word that you want test it ...Please !");
            word = palind.nextLine();

            String reword = "";

            int wordln = word.length();

            for (int i = (wordln - 1); i >= 0; --i) {
                reword = reword + word.charAt(i);
            }

            if (word.toLowerCase().equals(reword.toLowerCase())) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }while(true);

    }
}
