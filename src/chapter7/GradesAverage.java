package chapter7;

import java.util.Scanner;

public class GradesAverage {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?");
        grades= new int[scanner.nextInt()];

        getGrades();
        sumGrades();
    }

    public static void getGrades(){
        for (int i= 0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum= 0;
        for (int grade:grades){
            sum += grade;
        }

        return sum;
    }

}
