import java.util.Scanner;
import java.util.Random;

class Game{
    private int compNo;
    private int guesses=0;
    private int playerNo;
    public Game(){
        Random r = new Random();
        compNo = r.nextInt(0,101);
    }

    public void setPlayerNo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        playerNo = s.nextInt();
        s.close();
    }

    public void isCorrectNo(){
        while(true){
            guesses++;
            setPlayerNo();
            if(compNo == playerNo){
                System.out.printf("You guessed correct number: %d!!\n", playerNo);
                break;
            }
            else if(playerNo > compNo){
                System.out.printf("%d? (Try smaller)\n", playerNo);
            }
            else if(playerNo < compNo){
                System.out.printf("%d? (Try bigger)\n", playerNo);
            }
        }
    }

    public int noOfGuesses(){
        return guesses;
    }
    
}

public class GuessTheNo {
    public static void main(String[] args) {
        Game player = new Game();
        player.isCorrectNo();
        int guesses = player.noOfGuesses();
        System.out.printf("You gessed it in %d trials\n",guesses);
    }
}
