package Day_15;
import java.util.Scanner;
public class ClassTask {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a String: ");
            String str = sc.nextLine();

            System.out.println("\nSelect Task:");
            System.out.println("1. Find Length of String");
            System.out.println("2. Print First Character");
            System.out.println("3. Print Last Character");
            System.out.println("4. Check String starts with Number or not");
            System.out.println("5. Check First Character is Uppercase or not");
            System.out.println("6. Check First Character is Lowercase or not");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Length = " + str.length());
            }

            else if (choice == 2) {
                System.out.println("First Character = " + str.charAt(0));
            }

            else if (choice == 3) {
                System.out.println("Last Character = " + str.charAt(str.length() - 1));
            }

            else if (choice == 4) {
                char ch = str.charAt(0);

                if (ch >= '0' && ch <= '9')
                    System.out.println("String starts with a Number.");
                else
                    System.out.println("String does not start with a Number.");
            }

            else if (choice == 5) {
                char ch = str.charAt(0);

                if (ch >= 'A' && ch <= 'Z')
                    System.out.println("First Character is Uppercase.");
                else
                    System.out.println("First Character is not Uppercase.");
            }

            else if (choice == 6) {
                char ch = str.charAt(0);

                if (ch >= 'a' && ch <= 'z')
                    System.out.println("First Character is Lowercase.");
                else
                    System.out.println("First Character is not Lowercase.");
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }
}
