import java.util.*;

public class overloading_method {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parameters: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        ac.area(a,b);
        ac.area(a);
        ac.area();
        sc.close();
    }
}


