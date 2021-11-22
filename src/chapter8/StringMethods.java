package chapter8;

public class StringMethods {
    public static void main(String args[]) {
    countWords("I love Test Automation University");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Count words and prints them
     * @param text Full string to be split
     */

    public static void countWords(String text) {
        //con Split dividimos el STRING en palabras, separándolo mediante espacio "". Nos devolvería un array.
        var words= text.split( " ");
        int numberOfWords = words.length;

        //con .format podemos concatenar variables en nuestro string
        String message = String.format("Your text contains %d words: ", numberOfWords);

        for (int i= 0; i<numberOfWords; i++) {
             System.out.println(words[i]);
        }
    }

}
