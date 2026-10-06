package FileHandling;

import java.io.File;

public class Ques11 {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\SURAJ SINGH\\OneDrive\\Desktop\\Core Java\\PreJava3pm");

      File[] List1 = f.listFiles();

        for(File element : List1){
            System.out.println(element);
           // System.out.println(element.getName());
        }
    }
}
