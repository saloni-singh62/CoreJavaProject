package DoubtClass_01Aug;
//Write a java program to design a method which takes two employees objects and return the employee having max salary
public class Employee {
    int id;
    String name;
    double sal;
    int age;

    public Employee(int id, String name, double sal, int age) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee ID : " + id + "\n" + "Employee Name :" + name + "\n" + "Salary :" + sal +"\n" + "Age :" + age;
    }

}