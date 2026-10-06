package Day_Payment;
import java.util.Scanner;

public class Payment_Menu_Driven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment payment = null;
        int choice;

        while (true) {
            System.out.println("\n=== Payment System Menu ===");
            System.out.println("1. UPI");
            System.out.println("2. Credit Card");
            System.out.println("3. Debit Card");
            System.out.println("4. NetBanking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Payment System. Thank you!");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (choice == 1) {
                System.out.println("Choose UPI Provider: 1.GPay  2.PhonePe  3.Paytm");
                int upiChoice = sc.nextInt();
                if (upiChoice == 1) payment = new GPay();
                else if (upiChoice == 2) payment = new PhonePe();
                else if (upiChoice == 3) payment = new Paytm();
                else System.out.println("Invalid UPI choice!");
            }
            else if (choice == 2) {
                System.out.println("Choose Credit Card: 1.ICICI  2.Axis  3.SBI");
                int ccChoice = sc.nextInt();
                if (ccChoice == 1) payment = new ICICI_CreditCard();
                else if (ccChoice == 2) payment = new Axis_CreditCard();
                else if (ccChoice == 3) payment = new SBI_CreditCard();
                else System.out.println("Invalid Credit Card choice!");
            }
            else if (choice == 3) {
                System.out.println("Choose Debit Card: 1.ICICI  2.Axis  3.SBI");
                int dcChoice = sc.nextInt();
                if (dcChoice == 1) payment = new ICICI_DebitCard();
                else if (dcChoice == 2) payment = new Axis_DebitCard();
                else if (dcChoice == 3) payment = new SBI_DebitCard();
                else System.out.println("Invalid Debit Card choice!");
            }
            else if (choice == 4) {
                payment = new NetBanking();
            }
            else {
                System.out.println("Invalid choice!");
            }

            if (payment != null) {
                payment.pay(amount);
            }
        }

        sc.close();
    }
}


//PaymentSystem/
//        ├── Payment.java
// ├── GPay.java
// ├── PhonePe.java
// ├── Paytm.java
// ├── ICICI_CreditCard.java
// ├── Axis_CreditCard.java
// ├── SBI_CreditCard.java
// ├── ICICI_DebitCard.java
// ├── Axis_DebitCard.java
// ├── SBI_DebitCard.java
// ├── NetBanking.java
// └── Main.java
//we have one payment system which allow users to make payment by using different method and  method
// 1 can be UPI , debit card , credit card and Netbanking here in UPI supported companys are gpay ,
//  phonepay and  paytm in credit card supportd bank cards are ICCI , axis , SBI same in debit card in the above
// program use interface concept to built complete application in java language

