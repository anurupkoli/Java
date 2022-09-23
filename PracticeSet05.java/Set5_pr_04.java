import java.util.Scanner;
public class Set5_pr_04 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        for(int i=10; i!=0; i--){
            System.out.println(i*n);
        }
        s.close();
    }
}
