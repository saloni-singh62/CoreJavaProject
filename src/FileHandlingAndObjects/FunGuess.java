package FileHandlingAndObjects;

public class FunGuess {
    public static I get(){
        return new C();}
    public static void main(String[] args) {
        I p = FunGuess.get();
        I q = FunGuess.get();
        I r = FunGuess.get();
        System.out.println(I.i);
        System.out.println(A.a);
        System.out.println(B.b);
        System.out.println(C.c);
        System.out.println(X.count);
    }
}