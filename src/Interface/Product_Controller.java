package Interface;

public class Product_Controller {
    public static void main(String[] args) {
        Product p1 = new Product(10, "Chips", 5, 700);
        Product p2 = new Product(20 , "Kurkure" , 6 , 600);

        System.out.println("Comparision result :" + p1.compareTo(p2));
    }
}
