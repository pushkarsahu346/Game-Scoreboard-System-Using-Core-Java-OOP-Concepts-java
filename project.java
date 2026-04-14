import java.util.*;

class Player {
    private String playerName;
    private int score;

    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}

public class project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter player name: ");
            String name = sc.nextLine();

            System.out.print("Enter score: ");
            int score = sc.nextInt();
            sc.nextLine();

            players[i] = new Player(name, score);
        }

        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {
                if (players[j].getScore() < players[j + 1].getScore()) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }

        System.out.println("\nGame Scoreboard");
        System.out.println("Rank\tPlayer Name\tScore");

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + "\t" +
                    players[i].getPlayerName() + "\t\t" +
                    players[i].getScore());
        }

        System.out.println("\nTop Player: " + players[0].getPlayerName());

        sc.close();
    }
}