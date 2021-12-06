package chapter11;

//Al extender de una clase abstracta tiene que implementar su método o métodos abstractos o bien declararse también como abstracta
public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width * length;
    }
}
