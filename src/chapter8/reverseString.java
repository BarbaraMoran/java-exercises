package chapter8;

public class reverseString {

    public static void main(String args[]) {
        reverseString("Hello TAU!");
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */

    public static void reverseString(String text) {
        //Haremos un loop a la inversa, del final hacia delante. Text es un String, es decir, un objeto, por lo que  usaremos .charAt(index) para localizar los caracteres correspondientes
       for (int i= text.length() - 1; i>= 0; i--) {
           System.out.print(text.charAt(i));

       }

    }
}
