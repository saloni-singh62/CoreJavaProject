package FileHandlingAndObjects;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class StudentController {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("====Start====");
        Student std = new Student(102 ,"Shreya" ,new Marksheet());

        FileOutputStream fos = new FileOutputStream("Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(std);

        FileInputStream fis = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();

        System.out.println(s.rollNo);
        System.out.println(s.name);

        System.out.println("====End====");
    }
}
