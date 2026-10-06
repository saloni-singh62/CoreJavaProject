package FileHandling;

import java.io.File;
import java.io.IOException;

//6  WAP that creates student.txt only if it does not already exists
public class Ques6 {
    public static void main(String[] args) throws IOException {
        File f = new File("Student.txt");

        f.createNewFile();

    }
}
