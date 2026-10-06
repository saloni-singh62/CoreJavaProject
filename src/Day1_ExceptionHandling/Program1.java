package Day1_ExceptionHandling;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("---Start---");
        int i = 3;
        int j = 9;
        System.out.println(j++ / i--);  // 9 / 3 ---> 3
        System.out.println(--i / i--);  // 1 / 1 ---> 1
        System.out.println(j / i);// 10 / 0 ----> Exception

        //throw now AE();
        // Now JVM will search for Handling Code
        // If code is not present  , "STOP" , it will handover the exception object
        // handler , now default handler print the msg


        System.out.println(j + i);
        System.out.println("Imp code");
        System.out.println("---end---");
    }
}

//*******OUTPUT*******
      //---Start---
      //3
      //1
      //Exception in thread "main" java.lang.ArithmeticException: / by zero
      //	at Day1_ExceptionHandling.Program1.main(Program1.java:10)