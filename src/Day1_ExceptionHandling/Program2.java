package Day1_ExceptionHandling;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Start");

        Student s1 = new Student();

        System.out.println(s1);
        System.out.println(s1.name);
        s1.display();
        System.out.println("Hello " + s1.name );


        System.out.println(s1.name.length());//Exception


        System.out.println("END");
    }

}

//OUTPUT
//Start
//Day1_ExceptionHandling.Student@8efb846
//null
//Name :null
//Age :0
//Hello null
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s1.name" is null
//	at Day1_ExceptionHandling.Program2.main(Program2.java:13)