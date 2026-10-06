package Interface;
//design a product class whose objects must be comparable by using compareTo method
public class Product implements Comparable {
    int pid;
    String name;
    int qty;
    double price;

    public Product(int pid , String name , int qty , double price){
        this.pid = pid;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    @Override
    public int compareTo(Object o) {
        Product p = (Product) o; //Down casting
        if (this.price > p.price) {
            return 1;
        } else if (this.price < p.price) {
            return -1;
        } else {
            return 0;
        }

//        if (this.qty > p.qty) {
//            return 1;
//        } else if (this.qty < p.qty) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
