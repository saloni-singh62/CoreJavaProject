package Day_18;

public class Circle {
    String shapeName;
    String color;
    double radius;

    public Circle(String shapeName , String color , double radius){
        this.shapeName = shapeName;
        this.color = color;
        this.radius = radius;
    }


    public void displayInfo(){
        System.out.println("Shape :" + shapeName);
        System.out.println("Color :" + color);
        System.out.println("Radius : " + radius);

    }

    public double getArea(){
//        double area = Math.PI * this.radius * this.radius;
//        return area;
       return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        //double perimeter = 2 * Math.PI * this.radius;
        //return perimeter;
        return 2 * Math.PI * this.radius;
    }
}
