import java.util.Scanner;

class MusicPlayer{
    static class Song{
        String title;
        String author;
        Song(String title, String author){
            this.title = title;
            this.author = author;
        }
    }

    Song[] songs;
    public void addSongs(){
        System.out.println("Enter no of songs ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        sc.nextLine();
        songs = new Song[no];
        for (int i = 0; i < no; i++) {
            System.out.println("Song: ");
            String song = sc.nextLine();
            System.out.println("Author: ");
            String au = sc.nextLine();
            songs[i] = new Song(song, au);
        }
    }

    public void printSongs(){
        for (int i = 0; i < songs.length; i++) {
            System.out.println("Song: " + songs[i].title + " Author: " + songs[i].author);
        }
    }
}

public class MusicPlayerProblem {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addSongs();
        player.printSongs();
    }
}
