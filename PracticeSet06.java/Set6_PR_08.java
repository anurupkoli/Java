import java.util.Scanner;
public class Set6_PR_08 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total no. of numbers in array: ");
        int n = s.nextInt();
        int []array = new int[n];
        System.out.println("Enter the numbers one-by-one");
        for(int i=0; i<array.length; i++){
            array[i] = s.nextInt();
        }
        boolean isSorted = true;
        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Your array is sorted");
        }
        else{
            System.out.println("Your array is not sorted");
        }
    }
}
