
public class StringManipulation {
    public static void main(String[] args) {
        String myString = "Hello, World!";
        int length = myString.length();
        System.out.println("The length of the string is: " + length);
        String uppercaseString = myString.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);
        String replacedString = myString.replace("Hello", "Hi");
        System.out.println("Replaced string: " + replacedString);
        String substring = myString.substring(7, 12);
        System.out.println("Substring: " + substring);
        char[] charArray = myString.toCharArray();
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
