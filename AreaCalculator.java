import java.util.Scanner;

public class AreaCalculator {
    void area(int a,int b){
        int areaOfRectange = a*b;
        System.out.println("Area of rectangle is: "+areaOfRectange); 
    }
    void area(int a){
        int areaOfSquare = a*a;
        System.out.println("Area of square is: "+areaOfSquare);
    }
    void area(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double areaOfCircle = 3.14*r*r;
        System.out.println("area of circle is: "+areaOfCircle);
        sc.close();
    }
}
