import java.util.Scanner;
public class Set5_pr_03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
        s.close();
    }
}
