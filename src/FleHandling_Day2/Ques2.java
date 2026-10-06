package FleHandling_Day2;


import java.io.File;

// 1. Display only .txt files from a directory.
// 2. Display only .java files from a directory.
// 3. Display all files whose names start with "Test".
// 4. Display all files whose names end with .pdf .
public class Ques2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\SURAJ SINGH\\OneDrive\\Desktop\\Core Java\\PreJava3pm");
        File[] obj = f.listFiles();

//        if(obj != null) {
//            for (File file : obj) {
//                if (file.isFile() && file.getName().endsWith(".txt")) {
//                    System.out.println(file.getName());
//                }
//            }
//        }
        //2nd method
        for (File e : obj) {
            if (e.isFile()) {
                String nameOfFile = e.getName();
                if (nameOfFile.endsWith(".txt")) {
                    System.out.println(e.getName());
                }
            }
        }


//            if(obj != null) {
//                for (File file : obj) {
//                    if (file.isFile() && file.getName().endsWith(".java")) {
//                        System.out.println(file.getName());
//                    }else{
//                        System.out.println("There is no any .java file is present ");
//                    }
//                }
 //       }

        //2nd method
        for (File e : obj){
            if(e.isFile()){
                String nameOfFile = e.getName();
                if(nameOfFile.endsWith(".java")){
                    System.out.println(e);
                }
            }
        }
        //3.
        for (File e : obj){
            if(e.isFile()){
                String nameOfFile = e.getName();
                if(nameOfFile.startsWith("Test")){
                    System.out.println(e);
                }
            }
        }
        //4.
        for (File e : obj){
            if(e.isFile()){
                String nameOfFile = e.getName();
                if(nameOfFile.endsWith(".pdf")){
                    System.out.println(e);
                }
            }
        }
    }
}
