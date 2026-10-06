package FileHandlingAndObjects;

public class A implements I
{
    X obj;
    static int a;

    A() {
        a++;
    }
}
class B extends A {
    static int b;
    B() {
        b++;
    }

}
class C extends B {
    static int c;
    C() {
        c++;
    }

}