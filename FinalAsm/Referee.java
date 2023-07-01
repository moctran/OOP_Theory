import java.util.List;

public class Referee {
    private List<Player> players;
    private Dice dice;

    public Referee(List<Player> players)
    {
        this.players = players;
        this.dice = new Dice();
    }

    public void playGame()
    {
        while(true)
        {
            for (Player player : players)
            {
                System.out.println("Player " + player.getName() + "'s turn.");
                int tmp = dice.roll();
                System.out.println("Dice rolled: " + tmp);
                player.addScore(tmp);
                System.out.println(player.toString());
                if (player.getScore() == 21)
                {
                    announceWinner(player);
                    return;
                }
                else if (player.getScore() > 21)
                {
                    player.resetScore();
                    System.out.println("Player " + player.getName() + "'s score has been reset");
                }
            }
        }
    }

    private void announceWinner(Player winner)
    {
        System.out.println("Player " + winner.getName() + " wins!");
        for (Player player : players)
        {
            if (player instanceof VirtualPlayer && player != winner)
            {
                System.out.print(player.getName() + ": ");
                ((VirtualPlayer) player).expressDefeat();
            }
        }
    }
}
