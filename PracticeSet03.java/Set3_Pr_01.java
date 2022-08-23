import java.util.Scanner;
public class Set3_Pr_01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String modifiedStr = str.toLowerCase();
        System.out.printf("The original string \'%s\' is converted to lower case: %s", str, modifiedStr);
    }
}
