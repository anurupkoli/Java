class GameClass{
    public void startGame(){
        class Player{
            String name;
            int score;
            Player(String name, int score){
                this.name = name;
                this.score = score;
            }
            
            public void printDetail(){
                System.out.println("Name: " + name + " Score: " + score );
            }
        }  

        Player player = new Player("Player1", 100);
        player.printDetail();
    }
}

public class Game {
    public static void main(String[] args) {
        GameClass game = new GameClass();
        game.startGame();
    }
}
