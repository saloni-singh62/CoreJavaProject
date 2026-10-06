package Day_Payment;

public class SBI_CreditCard implements Payment{
    public void pay (double amount){
        System.out.println("Paid ₹" + amount + " using SBI CreditCard .");
    }
}
