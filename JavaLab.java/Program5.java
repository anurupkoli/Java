// Given the following functional interface:
// interface MathOperation {
// int operation(int a, int b);
// }
// Develop an application that would implement the above interface using lambda expressions as to perform the
// addition, subtraction, multiplication and division operations.
import java.util.*;

interface MathOperation{
    int operation(int a, int b);
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        MathOperation add = (int a, int b) -> {return a+b;};
        MathOperation subtract = (int a, int b) -> {return a-b;};
        MathOperation multiply = (int a, int b) -> {return a*b;};
        MathOperation divide = (int a, int b) -> {return a/b;};
        System.out.println("Addition = " + add.operation(x,y));
        System.out.println("Subtraction = " + subtract.operation(x,y));
        System.out.println("Multiplication = " + multiply.operation(x,y));
        System.out.println("Division = " + divide.operation(x,y));
        sc.close();
    }    
}
