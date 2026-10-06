package Day_Payment;

public class ICICI_DebitCard implements Payment{
    public void pay (double amount){
        System.out.println("Paid ₹" + amount + " using ICICI DebitCard .");
    }
}
