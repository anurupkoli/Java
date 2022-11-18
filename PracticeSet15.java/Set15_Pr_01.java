import java.util.ArrayList;
import java.util.Scanner;

public class Set15_Pr_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Enter the names: ");
        for(int i=0; i<10; i++){
            arr.add(sc.nextLine());
        }

        for(Object ob: arr){
            System.out.println("Hello "+ob);
        }
        sc.close();
    }
    
}