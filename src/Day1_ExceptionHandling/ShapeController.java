package Day1_ExceptionHandling;
import java.util.Scanner;

public class ShapeController {
    public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            System.out.println("----Select any shape----");

            System.out.println("Press 1 to select CIRCLE");
            System.out.println("Press 2 to select SQUARE");
            int input = sc.nextInt();

            // Upcasting..
            Shape obj ;

            if(input == 1)
            {
                obj = new Circle();
            }else if (input == 2)
            {
                obj = new Square();
            }
            else {
                obj = null;
            }
            System.out.println(obj);
            System.out.println(obj.name);

            // We want to access child object details

//  if user select 2  --> means Sqaure object
            Circle c =   (Circle)obj;  // new Sqaure() ---> Circle

            // throw new ClassCastException()
            System.out.println(c.radius);
            System.out.println("=======================");
        }
    }
    class Shape {
        String name;
    }
    class Circle extends Shape
    {
        double radius;
    }
    class Square extends Shape {
        double side;
}
