package Day_16;

public class Employee {
    int eid;//global variable
    String ename;
    double salary;
    long phoneNo;
    String comp;

    public Employee(int eid , String ename , double salary ,long phoneNo ,  String comp){
        this.eid = eid;//parameterized constructor
        this.ename = ename;
        this.salary = salary;
        this.phoneNo = phoneNo;
        this.comp = comp;
    }
    public void display(){//method
        System.out.println("Employee ID : " + eid);
        System.out.println("Name : " + ename);
        System.out.println("Salary : " + salary);
        System.out.println("Phone No : " + phoneNo);
        System.out.println("Comapny : " + comp);
    }
    public void updatePhNo(long pn){
        phoneNo = pn;
        System.out.println("Updated Phone No. " + pn);
    }
}
