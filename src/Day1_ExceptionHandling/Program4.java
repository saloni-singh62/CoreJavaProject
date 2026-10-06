package Day1_ExceptionHandling;
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Start");
        System.out.println("Enter input :");
        byte num = sc.nextByte();
            // throw new InputMismatchException()
        System.out.println("Num :" + num);
        System.out.println("END");
    }
}
//OUTPUT
//Start
//Enter input :
//128
//Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"128" Radix:10
//	at java.base/java.util.Scanner.nextByte(Scanner.java:2034)
//	at java.base/java.util.Scanner.nextByte(Scanner.java:1982)
//	at Day1_ExceptionHandling.Program4.main(Program4.java:8)