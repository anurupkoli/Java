import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor{
    public static void main(String[] args){
        Random r = new Random();
        int rounds = 0;
        int compResult = 0;
        int playerResult = 0;
        int tie = 0;  
        while(rounds<5){
            rounds++;
            // Selecting computer,s choice:
            int compNo = r.nextInt(1,4);
            String compChoice = null;
            switch(compNo){
                case 1 -> compChoice = "Rock";
                case 2 -> compChoice = "Paper";
                case 3 -> compChoice = "Scissor";
            }

            // selecting Player's choice:
            Scanner s = new Scanner(System.in);
            System.out.printf("Please select your choice:  (Round: %d)\n", rounds);
            System.out.println("1:(Rock), 2:(Paper), 3:(Scissor)");
            int playerNo = s.nextInt();
            String playerChoice = null;
            switch(playerNo){
                case 1 -> playerChoice = "Rock";
                case 2 -> playerChoice = "Paper";
                case 3 -> playerChoice = "Scissor";
            }

            // Result declaration:
           if(playerChoice == compChoice){
            System.out.println("Round was a tie!!");
            tie++;
            }
            else if(playerChoice == "Rock" && compChoice == "Paper"){
                System.out.println("You lost this Round!");
                compResult++;
            }
            else if(playerChoice == "Rock" && compChoice == "Scissor"){
                System.out.println("You won this Round!");
                playerResult++;
            }
            else if(playerChoice == "Paper" && compChoice == "Rock"){
                System.out.println("You Won this Round!");
                playerResult++;
            }
            else if(playerChoice == "Paper" && compChoice == "Scissor"){
                System.out.println("You lost this Round!");
                compResult++;
            }
            else if(playerChoice == "Scissor" && compChoice == "Paper"){
                System.out.println("You won this Round!");
                playerResult++;
            }
            else if(playerChoice == "Scissor" && compChoice == "Rock"){
                System.out.println("You lost this Round!");
                compResult++;
            }
        }
        if(playerResult > compResult){
            System.out.printf("\nPlayer Won: %d\nComputer Won: %d\nTies: %d", playerResult, compResult,tie);
            System.out.printf("\nYou Won the match!!");
        }
        else if(playerResult < compResult){
            System.out.printf("\nPlayer Won: %d\nComputer Won: %d\nTies: %d", playerResult, compResult, tie);
            System.out.printf("\nYou Lost the match!!");
        }
    }
}