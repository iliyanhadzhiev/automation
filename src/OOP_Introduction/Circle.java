package OOP_Introduction;

public class Circle extends Shape{

    @Override
    double getArea(double number) {
        double area = Math.PI * number * number;
        return area;
    }

    @Override
    double getPerimeter(double number) {
        double perimeter = 2 * Math.PI * number;
        return perimeter;
    }
}
