package FileHandling_Day2FileReader_And_FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DestinationFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Source.txt");
        FileOutputStream fos = new FileOutputStream("Destination.txt");

        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }

    }
}
