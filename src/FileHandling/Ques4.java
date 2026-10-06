package FileHandling;

import java.io.File;

//4. to check whether a given path exists
public class Ques4 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\SURAJ SINGH\\OneDrive\\Desktop\\Core Java\\PreJava3pm");

        if(f.exists()){
            System.out.println("Given path is existing");
        }
        else {
            System.out.println("Given path is not existing");
        }
    }
}
