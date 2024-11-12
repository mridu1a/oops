import java.util.Scanner;

class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative numbers are not allowed");
        }
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative number entered for addition");
        }
        return num1 + num2;
    }

    public int subtract() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Negative number entered for subtraction");
        }
        return num1 - num2;
    }

    public int multiply() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Multiplication by zero is not allowed");
        }
        return num1 * num2;
    }

    public int divide() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
}


public class Exceptionhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        try {
           
            System.out.println("Enter first number:");
            String input1 = sc.next(); 
            num1 = Integer.parseInt(input1); 

            System.out.println("Enter second number:");
            String input2 = sc.next(); 
            num2 = Integer.parseInt(input2); 

           
            Calculator calc = null;

          
            System.out.println("Addition: " + calc.add());
            System.out.println("Subtraction: " + calc.subtract());
            System.out.println("Multiplication: " + calc.multiply());
            System.out.println("Division: " + calc.divide());

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input! Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (Exception e) {
          
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        
        finally {
            System.out.println("Inside finally");
        }
        
    }
}
