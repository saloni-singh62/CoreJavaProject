package FleHandling_Day2;
// 1. Count how many files are present inside a directory.
import java.io.File;

public class Ques1 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\SURAJ SINGH\\OneDrive\\Desktop\\Core Java\\PreJava3pm");
        File[] ObjList1 = f.listFiles();
        for(File element : ObjList1) {
            //System.out.println("Files : " + element); // return all the path of the files
              System.out.println("Files Name :" + element.getName());
        }
        // 2. Count how many directories are present inside a directory.


        System.out.println("=====");
        int countDir = 0;
        for (File element : ObjList1){
            System.out.println(countDir);
        }
            //System.out.println(ObjList1); // return the address where file is stored

        // 3. Display only the files from a directory.

        System.out.println("Ques 3 ========");
        for (File element : ObjList1) {
            if (element.isFile()) {
                System.out.println(element.getName());
            }
            // 4. Display only the directories from a directory.
            System.out.println("Ques 4 =======");
            for (File e : ObjList1) {
                if (element.isDirectory()) {
                    System.out.println(e.getName());
                }
            }

            // 4. Display only the directories from a directory.
        }

    }
}
