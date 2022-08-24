import java.util.Scanner;
public class Set6_Pr_02 {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check weather it is present in array or not: ");
        int no = s.nextInt();
        int checkArray = 0;
        for(int i=0; i<array.length; i++){
            if(no == array[i]){
                checkArray = 1;
                break;
            }
            else{
                checkArray = 0;
            }
        }
        if(checkArray == 1){
            System.out.printf("%d is present in the array", no);
        }
        else{
            System.out.printf("%d is not present in the array", no);
        }
    }
}
