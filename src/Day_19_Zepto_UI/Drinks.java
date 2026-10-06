package Day_19_Zepto_UI;

public class  Drinks extends ProductTable {
    boolean isAlcoholic;
    public Drinks(String name , double price , int qty , boolean isAlcoholic){
        super(name , price , qty , "Ltr");
        this.isAlcoholic = isAlcoholic;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Alcoholic? :\t\t" + isAlcoholic );
    }

}
