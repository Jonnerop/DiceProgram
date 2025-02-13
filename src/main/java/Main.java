import DiceProgram.Dice;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int attempts = 0;

        System.out.println("Rolling the dice...");
        do {
            dice.roll();
            attempts++;
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());
        } while (!dice.isDouble());

        System.out.println("You rolled a double!");
        System.out.println("After " + attempts + " try both reach the same value.");
    }
}
