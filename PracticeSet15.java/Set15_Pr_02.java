import java.util.HashSet;
import java.util.Scanner;

public class Set15_Pr_02 {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            st.add(sc.nextInt());
        }
        System.out.println(st);
        sc.close();
    }
}
