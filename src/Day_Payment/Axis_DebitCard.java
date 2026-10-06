package Day_Payment;

public class Axis_DebitCard implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using Axis DebitCard .");
    }
}
