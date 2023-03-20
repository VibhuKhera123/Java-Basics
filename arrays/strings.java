import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine(); // nextLine is for complete sentence
        System.out.println("enter full name");
        String name = sc.next();
        System.out.println(name+sentence);
        //length of string
        System.out.println("lenght of name: "+name.length());

        //charAt
        for(int i = 0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        sc.close();
    }
}
