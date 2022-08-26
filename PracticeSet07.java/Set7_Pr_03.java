import  java.util.Scanner;
public class Set7_Pr_03 {
    static int recursiveSum(int n){
        if(n==0){
            return 0;
        }
        return n + recursiveSum(n-1);
    }
    public  static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = s.nextInt();
        int sum = recursiveSum(no);
        System.out.println(sum);
    }    
}
