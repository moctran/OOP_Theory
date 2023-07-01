import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of real players: ");
        int cnt = sc.nextInt();
        sc.nextLine();
        if (cnt < Player.NUMBERS_OF_PLAYERS)
        {
            for (int i = 1; i <= cnt; i++)
            {
                System.out.print("Player " + i + ": ");
                String name = sc.nextLine();
                players.add(new Player(name));
            }
            for (int i = cnt + 1; i <= Player.NUMBERS_OF_PLAYERS; i++)
            {
                players.add(new VirtualPlayer("Virtual Player " + i));
            }
        }
        else if (cnt == Player.NUMBERS_OF_PLAYERS)
        {
            for (int i = 1; i <= cnt; i++)
            {
                System.out.print("Player " + i + ": ");
                String name = sc.nextLine();
                players.add(new Player(name));
            }
        }

        Referee referee = new Referee(players);
        referee.playGame();
    }
}
