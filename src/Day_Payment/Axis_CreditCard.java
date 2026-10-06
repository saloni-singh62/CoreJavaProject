package Day_Payment;

public class Axis_CreditCard implements  Payment{
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using Axis CreditCard .");
    }
}
