package FileHandling_Day2FileReader_And_FileWriter;
//1 . Read the complete content of student .txt using FileReader and print it on the Console.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ques1 {
    public static void main(String[] args) throws IOException {
        System.out.println("----Start-----");
        File f = new File("Student.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter("Student.txt");
        fw.write("Shreya");
        fw.write("BCA");

        fw.close();

       FileReader fr = new FileReader("Student.txt");
       fr.read();
       
    }
}
