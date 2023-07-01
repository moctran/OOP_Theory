import java.util.Random;

public class Dice {
    private Random random;
    public Dice()
    {
        this.random = new Random();
    }
    public int roll()
    {
        int randomValue = random.nextInt(100) + 1;

        if (randomValue <= 20) return 1;
        else if (randomValue <= 40) return 2;
        else if (randomValue <= 60) return 3;
        else return 4;
    }
}
