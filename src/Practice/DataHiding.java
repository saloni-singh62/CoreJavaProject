package Practice;

public class DataHiding {

    private int eid;
    private String name;
    private double sal;
    private String dept;

    public void setData(int eid , String name , double sal , String dept){
        this.eid = eid;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }
    public void getData(){
        System.out.println("Employee ID :" + eid);
        System.out.println("Employee Name :" + name);
        System.out.println("Salary :" + sal);
        System.out.println("Department :" + dept);
    }
    public static void main(String[] args){
        DataHiding dh = new DataHiding();
        dh.setData(101 , "Shreya" , 10000.0 , "CS");
        dh.getData();
    }
}

