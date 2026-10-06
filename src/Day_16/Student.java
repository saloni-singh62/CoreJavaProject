package Day_16;
//WAJP to create a student entity having 5 subjects Marks create two student object and initialize them by
// using Constructor Now perform following task
//Task 1 : Print details of each students
//Task 2 : Calculate percentage of both the student and display it
//Task 3 : Display who has highest percentage

public class Student {
    int rollno;
    String sname;
    float sub1 , sub2 , sub3 , sub4 , sub5 ;
    public Student(int r , String n , float s1 , float s2 , float s3 , float s4 , float s5 ) {
        rollno = r;
        sname = n;
        sub1 = s1 ;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
        sub5 = s5;
    }
    public void display(){
        System.out.println("-----Student Details-----");
        System.out.println("SId : " + rollno);
        System.out.println("Name : " + sname);
        System.out.println("----Marks Details----");
        System.out.println("Hindi : " +sub1);
        System.out.println("English : " + sub2);
        System.out.println("Maths : " + sub3);
        System.out.println("Physics : " + sub4);
        System.out.println("Chemistry : " + sub5);
    }
    public float getPercent(){
        float totalmarks = 500.0f;
        float obtainMarks = sub1 + sub2 + sub3 + sub4 + sub5;

        float percent= ( obtainMarks / totalmarks) * 100;

        return percent;
    }
}