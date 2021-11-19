package chapter2;

import java.util.Scanner;

public class Seasons {
    public static void main(String arg[]) {
        //1. Get the user's fav season
        System.out.println("Enter a season of the year");
        Scanner scanner= new Scanner(System.in);
        String season= scanner.next();

        //2. Get the user's fav number
        System.out.println("Enter a number:");
        int number= scanner.nextInt();

        //3. Get the user's adjective
        System.out.println("Enter an adjective:");
        String adjective= scanner.next();
        scanner.close();

        //4. Create sentence
        String sentence= "On a " + adjective + " " + season +  " day, I drink a minimum of " + number + " cups of coffee.";

        //5. Display result
        System.out.println((sentence));
    }
}
