package Day_17_Bank.Project;

public class Banking {
    private String bankName;
    private String customerName;
    private long phone;
    private int pin;
    private double bankBalance;
    //setter
    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
   public void setPhone(long phone)
   {
       this.phone = phone;
   }
    public void setPin(int pin)
    {
        this.pin = pin;
    }
    public void setBankBalance(double bankBalance)
    {
        this.bankBalance = bankBalance;
    }
    // getters
    public String getBankName()
    {
        return bankName;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public long getPhone()
    {
        return phone;
    }
    public int getPin()
    {
        return pin;
    }
    public double getBankBalance()
    {
        return bankBalance;
    }

}
