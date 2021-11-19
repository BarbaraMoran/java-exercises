package chapter3;

import java.util.Scanner;

public class LoanNestedIf {
    public static void main(String arg[]) {

        //Initialize values we know
        int yearsQuota = 2;
        int salaryQuota = 30000;

        //Get values we don't know
        System.out.println("How many years have you been working on your current job?");
        Scanner scanner = new Scanner(System.in);
        int yearsWorked = scanner.nextInt();

        System.out.println("What is your current salary?");
        double currentSalary = scanner.nextDouble();
        scanner.close();

        //Decision
        if (yearsWorked >= yearsQuota) {
            if (currentSalary >= salaryQuota) {
                System.out.println("You can get the loan");
            } else {
                System.out.println("Sorry, you need to earn " + salaryQuota + " $ to get the loan");
            }
        }
        else {
            System.out.println("Sorry, you have to work for " + yearsQuota + " years in a company");
        }

    }

    }
