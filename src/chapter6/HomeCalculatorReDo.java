package chapter6;

import java.util.Scanner;

public class HomeCalculatorReDo {
    private Scanner scanner= new Scanner(System.in);

    public static void main(String args[]) {


        HomeCalculatorReDo calculator = new HomeCalculatorReDo();
        RectangleClassesObjects kitchen = calculator.getRoom();
        RectangleClassesObjects bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is..." + area);
        calculator.scanner.close();

    }


    public RectangleClassesObjects getRoom() {

        System.out.println("Enter the length of your room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room");
        double width = scanner.nextDouble();


        return new RectangleClassesObjects(length, width);
    }

    public double calculateTotalArea(RectangleClassesObjects rectangle1, RectangleClassesObjects rectangle2) {

        return rectangle1.CalculateArea() + rectangle2.CalculateArea();
    }
}
