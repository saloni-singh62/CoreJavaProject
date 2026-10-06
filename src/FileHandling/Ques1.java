package FileHandling;
//create a file object for a file named qsp.txt.check whether the file exists.
//difference between getName and getPah Method
import java.io.File;
import java.io.IOException;
public class Ques1 {
    public static void main(String[] args) throws IOException {
        System.out.println("---Start---");
        File obj = new File("qsp.txt");
        obj.createNewFile();
        //2 .Create a file object for jsp.txt
//Print:
//    File name
//    FilePath
//    AbsolutePath
        System.out.println(obj.getName());
        System.out.println(obj.getPath());
        System.out.println(obj.getAbsolutePath());
//3. to check whether qsp.txt is a file or directory

        if(obj.isFile()) {
            System.out.println("It's a file");
        } else if (obj.isDirectory()) {
            System.out.println("It's a directory");
        }else {
            System.out.println("Such file or directory not exist");
        }
        //4. to check whether a given path exists

        if(obj.exists()){
            System.out.println("Given path is existing");
        }
        else {
            System.out.println("Given path is not existing");
        }
    }
}
