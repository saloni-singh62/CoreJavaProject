package Day1_ExceptionHandling;
import java.util.Scanner;
public class ShapeController2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("----Select any shape----");
            System.out.println("Press 1 to select CIRCLE");
            System.out.println("Press 2 to select SQUARE");
            int input = sc.nextInt();

            // Upcasting..
            Shape obj;
            if (input == 1) {
                obj = new Circle();
            } else if (input == 2) {
                obj = new Square();
            } else {
                obj = null;
            }
            System.out.println(obj);
            System.out.println(obj.name);

            // We want to access child object details

            if (obj instanceof Circle ) {
                Circle c = (Circle) obj; // new Square() ---> Circle
                System.out.println(c.radius);
            }
            else {
                Square s = (Square) obj;
            }
            System.out.println("=======================");
        }
}
