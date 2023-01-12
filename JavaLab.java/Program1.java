// The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n when n is smaller 
// than 10 million. Given a number n, use JAVA to print all primes smaller than or equal to n.
import java.util.*;


public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number until which you want to find prime numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=1; i<=n; i++){
            arr[i-1] = i;
        }
        for(int i=1; i<n; i++){
            if(arr[i] != 0){
                for(int j=i+arr[i]; j<n; j+=arr[i]){
                    arr[j] = 0;
                }
            }
        }

        for(int i=1; i<n; i++){
            if(arr[i]!=0){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}