package chapter3;

import java.util.Scanner;

public class GradeMessageSwitch {

    public static void main(String arg[]) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String letterGrade = scanner.next();
        scanner.close();

        String message;

        switch (letterGrade) {
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great Job";
                break;
            case "C":
                message = "Good work!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;

        }

        System.out.println(message);

    }


    }
