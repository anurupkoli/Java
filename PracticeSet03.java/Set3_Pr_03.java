import java.util.Scanner;
public class Set3_Pr_03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String letter = "Hello <|name|>, Thanks a lot!";
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        letter  = letter.replace("<|name|>",name);
        System.out.println(letter);
        s.close();
    }
}
