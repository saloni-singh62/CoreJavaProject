package Day2_ExceptionHandling;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Start");
        throw new NullPointerException("reason");
        //System.out.println("END"); // Unreachable code -----> Compile time error is occur here

        // Because throw is going to propagate an exception object and compiler is already aware about this thing
    }
}
