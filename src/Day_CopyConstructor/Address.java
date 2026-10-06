package Day_CopyConstructor;

// Now create an address class having states house no , street , pincode , city , state , and pass the reference of
// address to customer entity
public class Address {
    int houseno;
    String street;
    int pincode;
    String city;
    String state;

    public Address(int houseno , String street , int pincode , String city , String state){
        this.houseno = houseno;
        this.street = street;
        this.pincode = pincode;
        this.state = state;
    }

}
