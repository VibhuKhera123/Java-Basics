package recurssion;
/**
 * stringPermutation
 */
public class stringPermutation {

    public static void printPrem(String str,String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
        }
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPrem(newStr, permutation+currentChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPrem(str, "");
    }
}