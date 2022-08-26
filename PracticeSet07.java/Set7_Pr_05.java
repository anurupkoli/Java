import java.util.Scanner;
public class Set7_Pr_05 {
    static int fiboNo(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fiboNo(n-1) + fiboNo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = s.nextInt();
        int fibNo = fiboNo(no);
        System.out.printf("%dth number of fibonacci series is: %d", no, fibNo);
    }
    
}
