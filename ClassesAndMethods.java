public class ClassesAndMethods {
    public static void main(String[] args) {
        StringDisplay mathCalculator = new StringDisplay();
        mathCalculator.displayStringOne("This is a method");
        int difference = mathCalculator.differenceBetween(10, 20);
        System.out.println("Difference between numbers is: " + difference);
    }
}
class StringDisplay{
    void displayStringOne(String a){
        System.out.println(a);
    }
    int differenceBetween(int a,int b){
        return a-b;
    }
}
