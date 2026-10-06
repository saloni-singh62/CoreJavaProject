package Day_Payment;

public class Paytm implements Payment{
    public void pay (double amount){
        System.out.println("Paid ₹" + amount + " using Paytm (UPI).");
    }
}
