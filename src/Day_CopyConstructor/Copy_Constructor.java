package Day_CopyConstructor;

//Design a customer entity having copy constructor. Here customer must have id , name , age , phone

public class Copy_Constructor {
    public static void main(String[] args) {
        Address a1 = new Address(104 , "gola" ,273306 , "Noida" , "UP");
        Customer cs1 = new Customer(1005 ,"Shreya" , 22 , 5632147896l , a1);
        Customer copy = new Customer(cs1);

        System.out.println(cs1.name);
        System.out.println("------------");
        System.out.println(copy.name);
        System.out.println(cs1.age);
        System.out.println("-----------");
        System.out.println(copy.age);
        System.out.println(cs1.phone);
        System.out.println(copy.phone);

        System.out.println(copy.ads.houseno);
        System.out.println(cs1.ads.houseno);
    }
}
