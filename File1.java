package ffile;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class File1 {

    public static void main(String[]args)
    {
        try {
            FileWriter myObj = new FileWriter("filename.txt");
            myObj.write("Ali Sayed Ali Soliman");
            myObj.close();
            System.out.println("Successfully wrote to the file .");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    }

