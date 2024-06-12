import java.util.Random;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (loop) {
            System.out.println("Guess a number from 0-100");
            int num = sc.nextInt();
            int generatedNo = random.nextInt(0,100);
            if(num == generatedNo){
                System.out.println("You guessed it right");
                loop = false;
            }
            else if(num > generatedNo){
                System.out.println("Guess lower no.");
            }
            else if(num < generatedNo){
                System.out.println("Guess higher no.");
            }
        }
        sc.close();
    }
}
