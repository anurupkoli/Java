import java.util.Scanner;

public class Set14_Pr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,9,0};
        int trys = 1;
        while(true && trys<6){
            try{
                System.out.println("\nEnter the index");
                int ind = sc.nextInt();
                System.out.printf("Value at index[%d] is %d\n", ind, arr[ind]);
                break;
            }
            catch(Exception e){
                System.out.println("Enter valid index");
                trys++;
            }
        }
        if(trys>=6){
            System.out.println("Error");
        }
        sc.close();
    }
}
