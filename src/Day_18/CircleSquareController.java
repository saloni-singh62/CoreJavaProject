package Day_18;
import java.util.Scanner;
public class CircleSquareController {
    public static void showTaskMenu(){
        System.out.println("Press a or A to get area ");
        System.out.println("Press p or P to get perimeter ");
        System.out.println("Press d or D to get all info of shape");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======Welcome App=====");
        System.out.println("Please press c or C to select circle \r\n"
        +"Please press s or S to select square\r\n"
        +"Please press r or R to select rectangle");

        char ch = sc.next().charAt(0);

        if (ch == 'c' || ch == 'C') {
            System.out.println("Enter color : ");
            String color = sc.next();
            System.out.println("Enter radius : ");
            double radius = sc.nextDouble();

            Circle C = new Circle("CIRCLE", color, radius);
            System.out.println(C.shapeName + " has created successfully with radius  " + C.radius );
            showTaskMenu();

            char taskInput = sc.next().charAt(0);

            if(taskInput == 'a' || taskInput == 'A'){
                System.out.println("Area of given Shape " + C.shapeName + "is :" + C.getArea());
            } else if (taskInput == 'p' || taskInput == 'P') {
                System.out.println("Perimeter of given Shape " + C.shapeName + "is :" + C.getPerimeter());
            }
                else if(taskInput == 'd' || taskInput == 'D'){
                    C.displayInfo();
            }
            else{
                System.out.println("No such tasks Perform");
            }
        }


        else if (ch == 's' || ch == 'S') {
            System.out.println("Enter color : ");
            String color = sc.next();
            System.out.println("Enter side : ");
            double side= sc.nextDouble();

            Square S = new Square("SQUARE", color, side);
            System.out.println(S.shapeName + "has created successfully with side " + S.side );
            showTaskMenu();
            char taskInput = sc.next().charAt(0);

            if(taskInput == 'a' || taskInput == 'A'){
                System.out.println("Area of given Shape " + S.shapeName + "is :" + S.getArea());
            } else if (taskInput == 'p' || taskInput == 'P') {
                System.out.println("Perimeter of given Shape " + S.shapeName + "is :" + S.getPerimeter());
            }
            else if(taskInput == 'd' || taskInput == 'D'){
                S.displayInfo();
            }
            else{
                System.out.println("No such tasks Perform");
            }
        }

        else if(ch == 'r' || ch == 'R') {
            System.out.println("Enter color : ");
            String color = sc.next();
            System.out.println("Enter Length : ");
            double length= sc.nextDouble();
            System.out.println("Enter Width : ");
            double width= sc.nextDouble();

            Rectangle R = new Rectangle("Rectangle", color, length , width);
            System.out.println(R.shapeName + " has created successfully with length " + R.length + " width " + R.width );
            showTaskMenu();

            char taskInput = sc.next().charAt(0);

            if(taskInput == 'a' || taskInput == 'A'){
                System.out.println("Area of given Shape " + R.shapeName + " is :" + R.getArea());
            } else if (taskInput == 'p' || taskInput == 'P') {
                System.out.println("Perimeter of given Shape " + R.shapeName + " is :" + R.getPerimeter());
            }
            else if(taskInput == 'd' || taskInput == 'D'){
                R.displayInfo();
            }
            else{
                System.out.println("No such tasks Perform");
            }
        }
    }
}
