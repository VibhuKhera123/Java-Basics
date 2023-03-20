import java.util.Scanner;

public class binary_search {

    
    public static int BinarySearch(int array[],int fi,int li,int key){
        int middle;
        if(fi<=li){
            middle = (fi+li)/2;
            if(array[middle] == key){
                return middle;
            }
            if(array[middle]>key){
                return BinarySearch(array,fi,middle-1,key);
            }
            return BinarySearch(array,middle+1,li,key);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int fi = 0,li = n-1; 
        int array[] = new int[n];
        System.out.println("Enter the elements of the array in sorted manner: ");
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be found: ");
        int key = sc.nextInt();
        int keyIndex = BinarySearch(array,fi,li,key);
        if (keyIndex == -1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+keyIndex);
        }
        sc.close();
    }
}
