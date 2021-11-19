package chapter3;

import java.util.Scanner;

public class SalesIf {

    public static void main(String arg[]) {
        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int salesQuota = 10;

        //Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesNumber = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (salesNumber > salesQuota) {
            salary += bonus;
        }

        //Output
        System.out.println("Your salary is $"+ salary);
    }
}
