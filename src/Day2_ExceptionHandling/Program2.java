package Day2_ExceptionHandling;

import java.io.FileInputStream;

public class Program2 {
    public static void task() throws Exception{
        FileInputStream obj = new FileInputStream("Hello.txt");
        System.out.println(obj);
    }
    public static void run() throws Exception{
        task();
    }
    public static void main(String[] args) throws Exception
    {
        run();
    }
}
