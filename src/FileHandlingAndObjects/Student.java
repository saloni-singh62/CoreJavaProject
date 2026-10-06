package FileHandlingAndObjects;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNo;
    String name;
    Marksheet marksheet;
    public Student(int rollNo , String name , Marksheet marksheet){
        this.rollNo = rollNo;
        this.name = name;
        this.marksheet = marksheet;
    }
}
