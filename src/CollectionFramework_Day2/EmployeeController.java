package CollectionFramework_Day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeController {
    //Task 1 ---> create static ArrayList to store employee objects
    static ArrayList<Employee> employees = new ArrayList<>();

    //Task 2 ---> Design a method which can add an employee to the list
    static void addEmployee(Employee emp){
        employees.add(emp);
        System.out.println("Employee added successfully");
    }
//    public static void addEmployee(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter id " );
//        int id = sc.nextInt();
//        System.out.println("Enter name");
//        String name = sc.nextLine();
//        System.out.println("Enter sal");
//        double sal = sc.nextDouble();
//    }

    //Task 3 ---> Design a method which can check whether given employee is present or not in the ArrayList
    static void isPresentEmployee(int id){
        Iterator<Employee> itr = employees.iterator();
        boolean found = false;
        while (itr.hasNext()){
            Employee emp = itr.next();
            if(emp.id == id){
                System.out.println("Employee is Present");
                emp.displayInfo();
                found = true;
                break;
            }
        }
            if(!found){
                System.out.println("Employee is NOT Present");
            }
    }
    //Task 4 ---> Search employee by their name and find out all possible employees list with the given list
//    static void searchByName(String name) {
//        Iterator<Employee> itr = new employees.iterator();
//        boolean found = false;
//        while (itr.hasNext()){
//            Employee emp = itr.next();
//            if(emp.name.equalsIsIgnoreCase(name)){
//                emp.displayInfo();
//                found = true;
//            }
//        }
//        if(!found){
//            System.out.println("No employee found with name : \t" + name);
//        }
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        addEmployee(new Employee(101 , "Shreya" , 60000));
        addEmployee(new Employee(102 , "Shikha" , 95000));
        addEmployee(new Employee(103 , "Anjali" , 89000));
        System.out.println("\nCheck the Employee is present or not by ID:");
        System.out.println("Enter id :");
        int id = sc.nextInt();
        isPresentEmployee(id);
        sc.nextLine();
    }
}
