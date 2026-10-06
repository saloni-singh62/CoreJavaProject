package Day_Payment;

public class NetBanking implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using NetBanking .");
    }
}
