import java.util.Scanner;

class MaxTryException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Max trys reached!!";
    }
}

public class Set14_Pr_05 {
    public static void accessArray(int[] arr) throws MaxTryException{
        Scanner sc = new Scanner(System.in);
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
                throw new MaxTryException();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try{
            accessArray(arr);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
