import java.util.Scanner;
public class Set5_pr_05 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int factorial = 1;
        for(int i=n; i!=0; i--){
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
        s.close();
    }
}
