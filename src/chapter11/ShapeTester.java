package chapter11;

public class ShapeTester {

    public static void main(String[] args) {

        //podemos usar Shape como un tipo pero no instanciarla porque es ABSTRACT
        Shape rectangle = new Rectangle(5, 7);

        //print hereda de Shape;
        rectangle.print();
        //calculateArea es de Shape pero implementada por Rectangle
        System.out.println(rectangle.calculateArea());

    }

}
