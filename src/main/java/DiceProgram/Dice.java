package DiceProgram;

import java.util.Random;

public class Dice {
    private int die1;
    private int die2;
    private Random random;

    public Dice() {
        random = new Random();
        roll();
    }

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }
}

