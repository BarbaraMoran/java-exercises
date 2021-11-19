package chapter4;

import java.util.Scanner;

public class SearchLetter {
    public static void main(String arg[]) {

        System.out.println("Enter a word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search letter A
        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;

            }
        }

        if (letterFound) {
            System.out.println(word + " has an A/a");

        } else {
            System.out.println( word + " hasn't an A/a");

        }


    }
}