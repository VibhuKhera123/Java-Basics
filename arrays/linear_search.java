import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the length of array: ");
        n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be found: ");
        int key = sc.nextInt();
        int j = 0;
        while(array[j] != key){
            j++;
        }
        System.out.print("Element found at index "+j+"\n");
        sc.close();
    }
}
