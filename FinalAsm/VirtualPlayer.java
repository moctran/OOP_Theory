import java.util.Random;

public class VirtualPlayer extends Player{
    private Random random;
    private String defeatExpression;

    public VirtualPlayer(String name)
    {
        super(name);
        this.random = new Random();
        randomDefeatExpression();
    }

    public void expressDefeat()
    {
        System.out.println(defeatExpression);
    }

    public void randomDefeatExpression()
    {
        int randomValue = random.nextInt(100) + 1;

        if (randomValue <= 20) this.defeatExpression = "I'm a loser!";
        else if (randomValue <= 40) this.defeatExpression = "You're just being lucky";
        else if (randomValue <= 60) this.defeatExpression = "This game is unfair";
        else this.defeatExpression = "Not fun";
    }
}
