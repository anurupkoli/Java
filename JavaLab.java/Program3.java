// To compute a square root of any positive number a, start with an initial guess x=x1 for √a; then calculate 
// successive approximations x2,x3...,√a using the formula:
// Develop a JAVA application that implements the above SQRT function to compute the square root of any 
// positive
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double a = sc.nextDouble();
        double eps = 1.0e-15;
        double x = a;
        while(Math.abs(x - a/x) > eps*x){
            x = (x + a/x)/2.0;
        }
        System.out.println(x);
        sc.close();
    }
}
