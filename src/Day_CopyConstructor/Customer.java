package Day_CopyConstructor;

//Design a customer entity having copy constructor. Here customer must have id , name , age , phone

public class Customer {
    int id;
    String name;
    int age;
    long phone;
    Address ads;

    Customer(int id , String name , int age , long phone , Address ads){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.ads = ads;
    }
    public Customer (Customer c){   //COPY CONSTRUCTOR
        this.id = c.id;
        this.name = c.name;
        this.age = c.age;
        this.phone = c.phone;
        //this.ads = c.ads; //Shallow copy
        //deep copy
        this.ads = new Address(c.ads.houseno , c.ads.street ,c.ads.pincode ,c.ads.city , c.ads.state);
    }
}
