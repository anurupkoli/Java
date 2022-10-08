import java.util.Scanner;
import java.util.Set;

class MyException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Max trys reached!!";
    }
}

public class Set14_Pr_04 {
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
        sc.close();
        
        if(trys>=6){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }    
}
