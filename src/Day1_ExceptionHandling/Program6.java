package Day1_ExceptionHandling;
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Start----");
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a + "," + " b = " + b );
        try{
            System.out.println(a/b); // throw new exception
        }
        catch (ArithmeticException exp){
            System.out.println("Handling Code 1");
        }
        System.out.println("important code");
        System.out.println("Rest logic");
        System.out.println("---End---");
    }
}
