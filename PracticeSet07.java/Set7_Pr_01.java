import java.util.Scanner;
public class Set7_Pr_01 {
    static void multi(int n){
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to get it's multiplication table: ");
        int no = s.nextInt();
        s.close();
        multi(no);
    }
}
