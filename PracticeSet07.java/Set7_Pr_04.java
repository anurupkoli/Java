import java.util.Scanner;
public class Set7_Pr_04 {
    static void starPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines of stars you want: ");
        int no = s.nextInt();
        s.close();
        starPattern(no);
    }
}
