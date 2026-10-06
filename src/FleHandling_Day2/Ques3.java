package FleHandling_Day2;

import java.io.File;

// 10. Find the largest file in a directory based on file size.
// 11. Find the smallest file in a directory based on file size.
public class Ques3 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\SURAJ SINGH\\OneDrive\\Desktop\\Core Java\\PreJava3pm");
        File[] obj = f.listFiles();

        long max = Long.MIN_VALUE;
        File maxFile = null;

        for(File file : obj ){
            if(file.isFile()){
                if(max < file.length()){
                    maxFile = file;
                }
            }
        }
        System.out.println(maxFile);
    }
}

