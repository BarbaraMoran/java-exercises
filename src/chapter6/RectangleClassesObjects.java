package chapter6;

public class RectangleClassesObjects {

    private double length;
    private double width;

    //Constructor inicializador o default. Para iniciar un objeto sin darle propiedades le damos propiedades por defecto.
    public RectangleClassesObjects() {
        length =0;
        width= 0;
    }

    public RectangleClassesObjects(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length= length;
    }

    public double getLength() {
       return length;
    }

    public double getWidth() {
        return width;
    }

    public double CalculateArea() {
        return width * length;
    }

    public double CalculatePerimeter() {
        return (width * 2) + (length * 2);
    }




}

