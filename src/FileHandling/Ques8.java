package FileHandling;
//Print the size of a file in bytes
//Print the size of a file in KB
//Print the size of a file in MB
//Print the size of a file in GB

import java.io.File;
import java.io.IOException;

public class Ques8 {
    public static void main(String[] args) throws IOException {
        File f = new File("Test.txt");
        f.createNewFile();
        long bytes = f.length();
        double kb = bytes / 1024.0;
        System.out.println("Size in bytes :" + bytes + "B");
    }
}
