package Day_Payment;

public class SBI_DebitCard implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using SBI DebitCard .");
    }
}
