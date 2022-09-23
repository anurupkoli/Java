import java.util.Scanner;
public class Set7_Pr_02 {
    static void star1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of lines of stars you want to print: ");
        int no = s.nextInt();
        s.close();
        star1(no);
    }    
}
