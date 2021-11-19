package chapter6;
/* Write a class that creates instances of the Rectangle Class to find the total area of two rooms in a house.

 */
public class HomeAreaCalculator {

    public static void main(String args[]) {

        //RECTANGLE 1
        //Create an instance of the rectangle class
        //Estamos usando el default constructor al no indicar argumentos
        RectangleClassesObjects room1 = new RectangleClassesObjects();

        //Give values to the rectangle
        room1.setWidth(25);
        room1.setLength(50);

        //CalculateArea
        double areaOfRoom1 = room1.CalculateArea();


        //RECTANGLE 2
        //Estamos usando el otro constructor donde directamente pasamos los argumentos del ancho y largo
        RectangleClassesObjects room2 = new RectangleClassesObjects(30, 75);
        //Ya no necesitamos los setters al haber añadido los valores desde el constructor.
        double areaOfRoom2 = room2.CalculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms is "+ totalArea);



    }
}
