package OOP_Introduction;

public class Square extends Shape{
    @Override
    double getArea(double number) {
        double area = number * number;
        return area;
    }

    @Override
    double getPerimeter(double number) {
        double perimeter = number * 4;
        return perimeter;
    }
}
