package FileHandling;

import java.io.File;

//create the following directory structure using java code :
            //  JSP ----> jfsd ----> coreJava
public class Ques7 {
    public static void main(String[] args) {

        File f = new File("JSP/jfsd/coreJava");
        f.mkdirs();
    }
}
