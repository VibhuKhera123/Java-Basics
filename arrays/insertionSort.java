import java.util.Scanner;

public class insertionSort {
    static void insertSort(int[] a,int n){
        int b[] = new int[n];
        int i;
        b[0] = a[0];
        for(i=1;i<=n;i++){
            int key = a[i];
            int j = i-1;
            while (key<b[j] && j>=0) {
                b[j+1] = b[j];
                j--;
            }
            b[j] = key;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("unsorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        insertSort(a, n);
        System.out.print("sorted array: ");
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
 
        System.out.println();
    }
}
