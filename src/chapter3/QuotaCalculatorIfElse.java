package chapter3;

import java.util.Scanner;

public class QuotaCalculatorIfElse {

    public static void main(String arg[]) {

        //Initialize values we know
        int salesQuota= 10;

        //Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesNumber = scanner.nextInt();
        scanner.close();

        //Make a decision
        if (salesNumber >= salesQuota)
            System.out.println("Congrats! you've met your quota");
        else {
            int salesShort = salesQuota - salesNumber;
            System.out.println("You did " + salesNumber + ". You need to make " + salesShort + " more sales");
        }

    }
}
