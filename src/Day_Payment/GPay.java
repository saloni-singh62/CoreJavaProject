package Day_Payment;

public class GPay implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using GPay (UPI).");
    }
}
