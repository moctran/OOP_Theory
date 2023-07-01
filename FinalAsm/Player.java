public class Player {
    private String name;
    private int score;
    public static final int NUMBERS_OF_PLAYERS = 4;

    public Player(String name)
    {
        this.name = name;
        this.score = 0;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score)
    {
        this.score += score;
    }

    public void resetScore()
    {
        this.score = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
