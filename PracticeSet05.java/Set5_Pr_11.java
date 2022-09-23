import java.util.Scanner;
public class Set5_Pr_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i*2;
        }
        System.out.printf("Sum of first %d even numbers = %d", n, sum);
        s.close();
    }
}
