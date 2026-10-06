package Day_19_Zepto_UI;

public class ProductTable {
    String name;
    double price;
    float qty;
    String unit;

    public ProductTable( String name ,  double price , int qty , String unit) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.unit = unit;
    }
    public void displayInfo(){
        System.out.println("\t\t=====Product Details====");
        System.out.println("Name :\t\t" + name);
        System.out.println("Price :\t\t" + price);
        System.out.println("Quantity :\t\t" + qty);
    }
    public void getMsg(){
        System.out.println(name + "/"+ price + "per" + unit + "\tX\t"  + qty +"\t" + (price *qty) );

    }
}
