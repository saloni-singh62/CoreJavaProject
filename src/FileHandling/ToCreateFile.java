package FileHandling;

import java.io.File;
import java.io.IOException;

public class ToCreateFile {
    public static void main(String[] args) throws IOException {
        System.out.println("---Start---");
        File obj = new File("x.txt");
        boolean result = obj.createNewFile();
        System.out.println(result);
    }
}
