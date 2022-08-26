import java.util.Scanner;
public class Set6_pr_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to check for: ");
        int n = s.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the numbers");
        for(int i=0; i<n; i++){
            array[i] = s.nextInt();
        }

        int maxNo = 0;

        for(int i=0; i<n; i++){
            if(array[i]>maxNo){
                maxNo = array[i];
            }
        }
        System.out.print("Largest no. b/w:  ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + ",");
        }
        
        System.out.printf("is %d",maxNo);
    }    
}
