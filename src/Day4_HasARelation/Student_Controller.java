package Day4_HasARelation;

public class Student_Controller {
    public static void main(String[] args) {
        Marksheet mrk = new Marksheet(91 , 98 , 89 , 93 , 96);
        Student s1 = new Student("shreya " , 22 , 1234 , mrk);
//        mrk.display();
//        mrk.getPercentage();
//        mrk.getFinalGrade();
        s1.displayInfo();
    }

}
