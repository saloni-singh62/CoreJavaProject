package Day_22_SuperMarket;

public class Fruit {
    String name;
    double price;
    String color;
    public Fruit(String name , double price , String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }
    public void display(){
        System.out.println("Name:\t\t" + name);
        System.out.println("Price:\t\t" + price );
        System.out.println("Color:\t\t" + color);
    }
}
