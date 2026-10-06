package FileHandling;
//5  create a file object for a directory named java. check whether it is a directory

import java.io.File;
import java.io.IOException;

public class Ques5  {
    public static void main(String[] args) {
        File f = new File("Java.");

        if(f.isDirectory()){
            System.out.println("It's a directory");
        }else{
            System.out.println("Not a directory");
        }
    }

}
