package Day_16;

public class  StudentDetail {
    public static void main(String[] args) {
        Student s1 = new Student(101 , "Shreya" , 89 , 90 , 70 , 84 , 95);
        Student s2 = new Student(102 , "Riya" , 90 , 78 , 89 , 96 , 98);

        System.out.println("-----------Student 1 details-----------");
        s1.display();

        System.out.println("-----------Student 2 details-----------");
        s2.display();

        System.out.println("-----------Student 1 percentage-----------");
        System.out.println(s1.sname+ " : " + s1.getPercent());

        System.out.println("-----------Student 2 percentage-----------");
        System.out.println(s2.sname+ " : " + s2.getPercent());


        System.out.println("------who has grater perecntage-------");
        if (s1.getPercent()> s2.getPercent()){
            System.out.println(s1.sname+" : " + s1.getPercent());
        } else if (s2.getPercent()> s1.getPercent()) {
            System.out.println(s2.sname+" : " + s2.getPercent());
        }
        else{
            System.out.println(s1.sname + "and" + s2.sname + "have same percentage");
        }
    }
}
