package Day_18;

public class Square {

        String shapeName;
        String color;
        double side;

        public Square(String shapeName , String color , double side){
            this.shapeName = shapeName;
            this.color = color;
            this.side = side;
        }

        public void displayInfo(){
        System.out.println("Shape :" + shapeName);
        System.out.println("Color :" + color);
        System.out.println("Radius : " + side);
        }

        public double getArea(){
            double area = side * side;
            return area;
        }
        public double getPerimeter(){
            double perimeter = 4 * side;
            return perimeter;
        }
}
