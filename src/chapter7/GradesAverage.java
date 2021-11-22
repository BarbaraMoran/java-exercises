package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class GradesAverage {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?");
        grades= new int[scanner.nextInt()];

        getGrades();
        scanner.close();
        System.out.println("Average: "+ String.format("%.2f", calculateAverage()));
        System.out.println("Lowest number: "+ getLowest());
        System.out.println("Highest number: "+ getHighest());


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

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getLowest(){
        Arrays.sort(grades);
        return grades[0];

        //otro algoritmo para sacarlo

        /* int lowest= grades[0];
        for (int grade:grades){
        if (grade < highest) {
        lowest = grade;
        }
        return lowest;
         */
    }

    public static int getHighest(){
        Arrays.sort(grades);
        return grades[grades.length -1];

        //otro algoritmo para sacarlo

        /* int highest = grades[0];
        for (int grade:grades){
        if (grade > highest) {
        highest = grade;
        }
        return highest;
         */
    }

}
