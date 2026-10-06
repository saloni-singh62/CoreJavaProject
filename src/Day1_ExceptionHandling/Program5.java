package Day1_ExceptionHandling;

public class Program5 {
    public static void main(String[] args) {
        System.out.println("--Start--");

        String str = "1234a";
        int num = Integer.parseInt(str);
        System.out.println(str + 2);
        System.out.println(num + 2);
        System.out.println("--End--");
    }
}
//OUTPUT
//--Start--
//Exception in thread "main" java.lang.NumberFormatException: For input string: "1234a"
//	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//	at java.base/java.lang.Integer.parseInt(Integer.java:564)
//	at java.base/java.lang.Integer.parseInt(Integer.java:661)
//	at Day1_ExceptionHandling.Program5.main(Program5.java:8)