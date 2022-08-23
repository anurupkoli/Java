import java.util.Scanner;
public class TakingInputs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // for intiger numbers 
        int a = s.nextInt();
        
        // for floating numbers5
        float b = s.nextFloat();

        // for character line inputs
        String str = s.nextLine();
        System.out.println(str);
    }
    
}
