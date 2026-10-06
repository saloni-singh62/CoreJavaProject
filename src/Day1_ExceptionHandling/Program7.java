package Day1_ExceptionHandling;
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Start----");
        System.out.println("Enter a String");
        String s = sc.next(); //Program


        System.out.println("s = " + s);
        try{
            System.out.println(s); // throw new exception
            System.out.println(s.charAt(5));
            System.out.println(s + " Java");
        }
        catch (ArithmeticException exp){
            System.out.println("Handling Code 1");
        }
        catch (NullPointerException exp){
            System.out.println("Handling Code 2");
        }
        catch (StringIndexOutOfBoundsException exp){
            System.out.println("Handling Code 2");
        }
        System.out.println("important code");
        System.out.println("Rest logic");
        System.out.println("---End---");
    }
}
//----Start----
//Enter a String
//hello
//s = hello
//hello
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out
// of bounds for length 5