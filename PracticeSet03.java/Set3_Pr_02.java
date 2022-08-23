import java.util.Scanner;
public class Set3_Pr_02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String modifiedStr = str.replace(" ", "_");
        System.out.printf("The modified string is: %s", modifiedStr);
    }
}
