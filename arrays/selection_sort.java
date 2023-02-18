import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        int i,j,n,loc,min,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
    
 
    for(i=0;i<n-1;i++)
    {
        min=a[i];
        loc=i;
        for(j=i+1;j<n;j++)
        {
            if(min>a[j])
            {
                min=a[j];
                loc=j;
            }
        }
 
        temp=a[i];
        a[i]=a[loc];
        a[loc]=temp;
    }
    System.out.println("sorted array: ");
    for(i = 0;i<n;i++){
        System.out.println(a[i]);
    }
    }
}
