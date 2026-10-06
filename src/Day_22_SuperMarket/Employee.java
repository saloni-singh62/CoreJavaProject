package Day_22_SuperMarket;

public class Employee extends PersonClass{
    int id;
    String ename;
    long pno;
    int sal;
    public Employee(String dept , int id ,  String ename , long pno , int sal){
        super( "s1" );
        this.id = id;
        this.ename = ename;
        this.pno = pno;
        this.sal = sal;

    }
}
