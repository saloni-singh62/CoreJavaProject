package Day_16;

public class EmployeeController {
    public static void main(String[] args) {
        Employee e1 = new Employee(102 , "Saloni" , 60000 , 1028476546 , "TCS");
        Employee e2 = new Employee(103 , "Shreya" , 55000 , 1228476546 , "HCL");

        System.out.println("-----------Employee 1-----------");
        e1.display();

        System.out.println("-----------Employee 2-----------");
        e2.display();

        
    }
}
