package chapter4;

import java.util.Scanner;

public class AverageTestScoresNestedLoops {

    public static void main(String arg[]) {

        int numberOfStudents = 3;
        int numberOfTests= 2;

        Scanner scanner = new Scanner(System.in);

        for (int i= 0; i< numberOfStudents; i++) {
            double total= 0;

            for (int j= 0; j< numberOfTests; j++){
                System.out.println("Enter your score for test # " + (j + 1));
                double score= scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student # " + (i +1) +" is " + average);

        }

        scanner.close();
    }

    }
