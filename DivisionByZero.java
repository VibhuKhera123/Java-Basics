public class DivisionByZero {

    public static void main(String[] args) {
    
      int numerator = 5;
      int denominator = 0;
      
      try {
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
      } catch (ArithmeticException e) {
        System.out.println("An Error Occured: " + e.getMessage());
      }
      
    }
  }
  