package CollectionFramework_Day2;

public class Employee {
    int id;
    String name;
    double sal;

    Employee(int id , String name , double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    void displayInfo(){
        System.out.println("Id :\t" + id);
        System.out.println("Name :\t" + name);
        System.out.println("Salary :\t" + sal);
    }
}
