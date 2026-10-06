package Day_19_Zepto_UI;

public class Fruits extends ProductTable{
  boolean isSeasonal;
    public Fruits(String name , double price , int qty  , int unit ,  boolean isSeasonal){
        super(name , price , qty , "Kg");
        this.isSeasonal = isSeasonal;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seasonal? " + isSeasonal);
    }
}
