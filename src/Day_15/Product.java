package Day_15;

public class Product {
    int id;
    String name;
    double price;
    String brand;
    double pQty;

    public Product(int i , String n , double p , String b , double q){
         id = i;
         name = n;
         price = p;
         brand = b;
         pQty = q;
    }
    public void display (){
        System.out.println("Product id"+id);
        System.out.println("Product name"+name);
        System.out.println("Product price"+price);
        System.out.println("Product Brand"+brand);
        System.out.println("Product Quantity"+pQty);
    }


}
