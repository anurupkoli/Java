import java.util.Scanner;
public class Set7_Pr_06 {
    static float arrayAve(float ...array){
        float result = 0;
        for(float no: array){
            result += no;
        }
        return result/array.length;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total number of elements you want to add: ");
        int no = s.nextInt();
        float []arr = new float[no];
        System.out.println("Enter the elements one-by-one");
        for(int i=0; i<no; i++){
            arr[i] = s.nextInt();
        }
        float sum = arrayAve(arr);
        System.out.println(sum);
    }
    
}
