package FileHandling;

import java.io.File;
import java.io.IOException;

//Create a file object for jsp.txt
//Print:
    //File name
    //FilePath
    //AbsolutePath

public class Ques2 {
    public static void main(String[] args) throws IOException {
        System.out.println("--Start--");
        File obj = new File("qsp.txt");
        obj.createNewFile();

        System.out.println(obj.getName());

    }
}
