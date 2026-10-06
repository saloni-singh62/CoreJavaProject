package Day_18;
//real world entity
public class Rectangle {
    //INSTANT VARIABLE OR NON STATIC VARIABLE
    String shapeName;
    String color;
    double length;
    double width;


    public Rectangle(String shapeName , String color , double length , double width){
        //CONSTRUCTOR
        this.shapeName = shapeName;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void displayInfo(){
        //METHOD
        System.out.println("Shape :" + shapeName);
        System.out.println("Color :" + color);
        System.out.println("Length : " + length + " " + "Breadth :" + width);
    }

    public double getArea(){
        double area =length * width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * ( length + width);
        return perimeter;
    }

}
