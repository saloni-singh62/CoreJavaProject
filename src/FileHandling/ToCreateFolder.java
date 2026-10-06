package FileHandling;

import java.io.File;
import java.io.IOException;

//to create folder
public class ToCreateFolder {
    public static void main(String[] args) throws IOException {
        File obj = new File("sql/notes");
       //obj.mkdir();

       obj.mkdirs(); // to create multiple file
    }
}
