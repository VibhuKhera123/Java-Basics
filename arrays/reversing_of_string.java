/**
 * reversing_of_string
 */
import java.util.Scanner;  
public class reversing_of_string {

    public static void printrev(String str,int indx){
        if(indx == 0){
            System.out.print(str.charAt(indx)+"\n");
            return;
        }
        System.out.print(str.charAt(indx));
        printrev(str, indx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        
        printrev(word,word.length()-1);
        sc.close();
    }
} 