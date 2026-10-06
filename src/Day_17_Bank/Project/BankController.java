package Day_17_Bank.Project;

public class BankController {
    public static void main(String[] args) {
        System.out.println("****** Account Opening Logic ******");
        Banking b = new Banking();
        b.setBankName("State Bank Of India");
        b.setCustomerName("Saloni Singh");
        b.setPhone(987643210L);
        b.setPin(15253);
        b.setBankBalance(95000.0);

        System.out.println("=====Welcome to State Bank of India====");

        System.out.println("Bank Name : " + b.getBankName());
        System.out.println("Customer Name : " + b.getCustomerName());
        System.out.println("Phone No : " +  b.getPhone());
        System.out.println("Pin : " + b.getPin());
        System.out.println("Bank Balance is : " + b.getBankBalance());
    }
}