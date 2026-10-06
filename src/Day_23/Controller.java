package Day_23;

public class Controller {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.de);

        Demo.Task t = new Demo.Task();
        System.out.println(t.ta);

        Demo.Test tt = d.new Test();
        System.out.println(tt.te);

        //new Demo().new Test()
    }
}
