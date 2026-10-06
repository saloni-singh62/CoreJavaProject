package Day2_ExceptionHandling;

public class User {
    private String username;
    private String upiid;
    private long phone;
    private double bankBalance;
    private double pin;

    public User(String username, String upiid, long phone , double pin) {
        this.username = username;
        this.upiid = upiid;
        this.phone = phone;
        this.pin = pin;
        this.bankBalance = 0.0;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpiid() {
        return upiid;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void addMoneyToWallet(double amount , int inputPin)
    {
        if(this.pin == inputPin)
        {
            if(amount > 0)
            {
                this.bankBalance = this.bankBalance + amount;
                System.out.println("Amount added sucessfully...");
            }
        }
        else{
           // System.out.println("Invalid pin");
            throw new InvalidPinException("Incorrect Pin....");
        }
    }

    public void withdrawMoneyfromWallet(double amount , int inputPin)
    {
        if(amount < this.bankBalance)
        {
            if(amount > 0)
            {
                this.bankBalance = this.bankBalance - amount;

            }
        }
    }

}