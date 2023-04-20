import java.util.Scanner;

/**
 * sum_of_matrix
 */
public class sum_of_matrix {
    static void sumOfArrays(int a[][],int b[][],int n,int m){
        int[][] sum = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<m;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of columns: ");
        n = sc.nextInt();
        System.out.println("Enter the number of rows: ");
        m = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        
        System.out.println("Enter the elements of first array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j] = sc.nextInt();
            }
        }
        sumOfArrays(a, b, n, m);
        System.out.println();
        sc.close();
    }
    }
    
