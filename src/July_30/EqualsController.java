package July_30;
import java.util.Scanner;
public class EqualsController {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********  WELCOME TO CODE  *********");

        while (true) {
            System.out.println("Press 1 to continue or press any other number for Exit");
            int menuInput = sc.nextInt();
            sc.nextLine();
            if (menuInput != 1) {
                break;
            }

            System.out.println("----Enter First Customer Details----");
            System.out.println("Enter id : ");
            int id = sc.nextInt();
            System.out.println("Enter Name : ");
            String name = sc.next();
            System.out.println("Enter age :");
            int age = sc.nextInt();
            System.out.println("Enter Phone no. :");
            long phone = sc.nextLong();
            Customer c1 = new Customer(id, name, age, phone);

            System.out.println("Customer created Successfully.....");

            System.out.println("----Enter Second Customer Details----");
            System.out.println("Enter id : ");
            int id2 = sc.nextInt();
            System.out.println("Enter Name : ");
            String name2 = sc.next();
            System.out.println("Enter age :");
            int age2 = sc.nextInt();
            System.out.println("Enter Phone no. :");
            long phone2 = sc.nextLong();
            Customer c2 = new Customer(id2, name2, age2, phone2);

            System.out.println("Customer created Successfully.....");

            while (true) {
                System.out.println("====Menu Driven===");
                System.out.println("Press 1 to Select Task 1 compare address");
                System.out.println("Press 2 to Select Task 2 compare content");
                System.out.println("Press 3 to Back to the Main menu......");

                int taskInput = sc.nextInt();
                if (taskInput == 3) {
                    break;
                } else if (taskInput == 1) {
                    if (c1 == c2) {
                        System.out.println("They have same object address ");
                    } else {
                        System.out.println("They don't have same object address");
                    }
                } else if (taskInput == 2) {
                    if (c1.equals(c2)) {
                        System.out.println("They have same id and phone number");
                    } else {
                        System.out.println("They don't have same id and phone number");
                    }
                }
            }
        }
    }
}
