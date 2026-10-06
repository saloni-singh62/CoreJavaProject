package Day_22_SuperMarket;

public class Student extends PersonClass{
    int sid;
    String sname;
    String clgName;
    public Student(String dept , int sid , String sname , String clgName){
        super(dept);
        this.sid = sid;
        this.sname = sname;
        this.clgName = clgName;
    }
}
