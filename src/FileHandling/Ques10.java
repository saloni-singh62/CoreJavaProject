package FileHandling;

import java.io.File;

public class Ques10 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\SURAJ SINGH\\OneDrive\\Desktop\\Core Java\\PreJava3pm");

        String[] List1 = f.list();

        for(String element : List1){
            System.out.println(element);
        }
    }
}
