import java.util.Scanner;
public class Set5_pr_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        int n = s.nextInt();
        int i = 0;
        int sum = 0;
        while(i<n){
            sum += 2*i;
            i++;
        }
        System.out.printf("Sum = %d\n", sum);
        s.close();
    }
}
