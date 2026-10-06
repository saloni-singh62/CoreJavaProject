package Day4_HasARelation;

public class Student {
    String name;
    int age;
    int rollno;
    Marksheet marksheet;
    public Student(String name , int age , int rollno , Marksheet marksheet){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.marksheet = marksheet;
    }
    public void displayInfo(){
        System.out.println("-----Student Details----");
        System.out.println("Name\t\t :" + name);
        System.out.println("Age\t\t :" + age);
        System.out.println("Roll No\t\t :" + rollno);
        System.out.println("Marksheet\t\t :" + marksheet);

        System.out.println("----Student percentage----");
        this.marksheet.getPercentage();

        System.out.println("----Student grade----");
        this.marksheet.getFinalGrade();
    }

}