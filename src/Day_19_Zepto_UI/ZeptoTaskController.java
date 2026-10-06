package Day_19_Zepto_UI;
import java.util.Scanner;
public class ZeptoTaskController {
    public static void main(String[] args) {

        double totalPrice = 0;
        int cartItemCount = 0;

        while (true) {

            System.out.println("------Main Menu-------------");
            System.out.println("press 1 for Vegetables");
            System.out.println("press 2 for Fruits");
            System.out.println("press 3 for Drinks");
            System.out.println("press 9 to View Bill");
            System.out.println("PRESS 0 FOR EXIT");

            Scanner sc = new Scanner(System.in);

            int input = sc.nextInt();


            if (input == 0) {
                System.out.println("----Exiting-----");
                System.out.println("--Thank you-----");
                break;
            }


            if (input == 1) {
                // task
                System.out.println("Press 1 for Peas\t 90/kg");
                System.out.println("press 2 for chillies\t 50/kg");
                int choice = sc.nextInt();
                if (choice == 1) {
                    // object of apple
                    System.out.println("Enter quantity in kgs : ");
                    int qty = sc.nextInt();
                    Peas item = new Peas(qty);

                    item.getMsg();
                    cartItemCount = cartItemCount + 1;
                    totalPrice = totalPrice + (item.price * item.qty);

                    // itemName/price per kg X qty : total price

                } else if (choice == 2) {
                    // object of chillies
                    System.out.println("Enter quantity in kgs : ");
                    int qty = sc.nextInt();
                    Chillies item = new Chillies(qty);

                    item.getMsg();
                    cartItemCount = cartItemCount + 1;
                    totalPrice = totalPrice + (item.price * item.qty);
                } else {
                    System.out.println("Such item not found!!");
                }

            } else if (input == 2) {
                // task
                System.out.println("Press 1 for Apple\t 240/kg");
                System.out.println("press 2 for Mango\t 150/kg");
                int choice = sc.nextInt();
                if (choice == 1) {

                    System.out.println("Enter quantity in kgs : ");
                    int qty = sc.nextInt();
                    Apple item = new Apple(qty);

                    item.getMsg();
                    cartItemCount = cartItemCount + 1;
                    totalPrice = totalPrice + (item.price * item.qty);
                    // itemName/price per kg X qty : total price

                } else if (choice == 2) {
                    // object of chillies
                    System.out.println("Enter quantity in kgs : ");
                    int qty = sc.nextInt();
                    Mango item = new Mango(qty);

                    item.getMsg();
                    cartItemCount = cartItemCount + 1;
                    totalPrice = totalPrice + (item.price * item.qty);
                } else {
                    System.out.println("Such item not found!!");
                }
            } else if (input == 3) {
                // task
                System.out.println("Press 1 for AppyFizz\t 60/Ltr");
                System.out.println("press 2 for Sprite\t 40/kg");
                int choice = sc.nextInt();
                if (choice == 1) {
                    // object of peas
                    System.out.println("Enter quantity in Liters : ");
                    int qty = sc.nextInt();
                    AppyFizz item = new AppyFizz(qty);

                    item.getMsg();
                    cartItemCount = cartItemCount + 1;
                    totalPrice = totalPrice + (item.price * item.qty);
                    // itemName/price per kg X qty : total price

                } else if (choice == 2) {
                    // object of chillies
                    System.out.println("Enter quantity in Liters : ");
                    int qty = sc.nextInt();
                    Sprite item = new Sprite(qty);

                    item.getMsg();
                    cartItemCount = cartItemCount + 1;
                    totalPrice = totalPrice + (item.price * item.qty);
                } else {
                    System.out.println("Such item not found!!");
                }

            } else if (input == 9) {
                System.out.println("Tota Items : " + cartItemCount);
                System.out.println("Total Bill  : " + totalPrice);
            } else {
                System.out.println("Invalid input..");

            }

        }
    }
}