import java.util.Random;

public class Dice {
    private Random random;
    public Dice()
    {
        this.random = new Random();
    }
    public char chooseDice()
    {
        int randomValue = random.nextInt(100) + 1;

        if (randomValue <= 25) return 'A';
        else if (randomValue <= 50) return 'B';
        else if (randomValue <= 75) return 'C';
        else return 'D';
    }

    public int roll()
    {
        if (chooseDice() == 'A')
        {
            int randomValue = random.nextInt(100) + 1;
            if (randomValue <= 20) return 1;
            else if (randomValue <= 36) return 2;
            else if (randomValue <= 52) return 3;
            else if (randomValue <= 68) return 4;
            else if (randomValue <= 84) return 5;
            else return 6;
        }
        else if (chooseDice() == 'B')
        {
            int randomValue = random.nextInt(100) + 1;
            if (randomValue <= 16) return 1;
            else if (randomValue <= 36) return 2;
            else if (randomValue <= 52) return 3;
            else if (randomValue <= 68) return 4;
            else if (randomValue <= 84) return 5;
            else return 6;
        }
        else if (chooseDice() == 'C')
        {
            int randomValue = random.nextInt(100) + 1;
            if (randomValue <= 16) return 1;
            else if (randomValue <= 32) return 2;
            else if (randomValue <= 52) return 3;
            else if (randomValue <= 68) return 4;
            else if (randomValue <= 84) return 5;
            else return 6;
        }
        else
        {
            int randomValue = random.nextInt(100) + 1;
            if (randomValue <= 16) return 1;
            else if (randomValue <= 32) return 2;
            else if (randomValue <= 48) return 3;
            else if (randomValue <= 68) return 4;
            else if (randomValue <= 84) return 5;
            else return 6;
        }
    }
}
