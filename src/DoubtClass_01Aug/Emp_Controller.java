package DoubtClass_01Aug;
import java.util.Scanner;
public class Emp_Controller {
    public static Employee getMaxSalary(Employee e1 , Employee e2){
        if(e1.sal > e2.sal){
            return e1;
        }
        else{
            return e2;
        }
    }

    public static Employee getYoungestOne(Employee e1 , Employee e2){
        if(e1.age < e2.age){
            return e1;
        }
        else{
            return e2;
        }
    }
    public static void main(String[] args) {
           Employee e1 = new Employee(102 , "Shreya" , 65000 , 23);
           Employee e2 = new Employee(103 , "Shikha" , 55000 , 20);

           Employee result = Emp_Controller.getMaxSalary(e1 , e2);
           Employee result2 = Emp_Controller.getYoungestOne(e1 , e2);

           System.out.println("Maximum Salary of Employee........");
        System.out.println();
           System.out.println(result);
           System.out.println();
           System.out.println("Youngest One..........");
        System.out.println();
           System.out.println(result2);
        }
}














//            Scanner sc = new Scanner(System.in);
//            System.out.println("---Enter First Employee Details---");
//            System.out.print("Id: ");
//            int id1 = sc.nextInt();
//            System.out.print("Name: ");
//            String name1 = sc.next();
//            System.out.print("Salary: ");
//            double sal1 = sc.nextDouble();
//            System.out.println();
//            System.out.println("---Enter Second Employee Details---");
//            System.out.print("Id: ");
//            int id2 = sc.nextInt();
//            System.out.print("Name: ");
//            String name2 = sc.next();
//            System.out.print("Salary: ");
//            double sal2 = sc.nextDouble();
//            Employee e1 = new Employee(id1, name1, sal1);
//            Employee e2 = new Employee(id2, name2, sal2);