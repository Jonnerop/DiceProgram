package DiceProgram;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiceTest {
    private Dice dice;

    @BeforeEach
    public void setUp() {
        dice = new Dice();
    }

    @Test
    public void testInitialValues() {
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();
        assertTrue(die1 >= 1 && die1 <= 6, "Die 1 should be between 1 and 6 after initialization.");
        assertTrue(die2 >= 1 && die2 <= 6, "Die 2 should be between 1 and 6 after initialization.");
    }

    @Test
    public void testRollChangesValues() {
        int initialDie1 = dice.getDie1();
        int initialDie2 = dice.getDie2();
        boolean hasChanged = false;
        for (int i = 0; i < 100; i++) {
            dice.roll();
            if (dice.getDie1() != initialDie1 || dice.getDie2() != initialDie2) {
                hasChanged = true;
                break;
            }
        }
        assertTrue(hasChanged, "After multiple rolls at least one die should change.");
    }


    @Test
    public void testRollRange() {
        for (int i = 0; i < 100; i++) {
            dice.roll();
            int die1 = dice.getDie1();
            int die2 = dice.getDie2();
            assertTrue(die1 >= 1 && die1 <= 6, "Die 1 should be between 1 and 6");
            assertTrue(die2 >= 1 && die2 <= 6, "Die 2 should be between 1 and 6");
        }
    }

    @Test
    public void testIsDouble() {
        boolean foundDouble = false;
        for (int i = 0; i < 100; i++) {
            dice.roll();
            if (dice.isDouble()) {
                foundDouble = true;
                break;
            }
        }
        assertTrue(foundDouble, "Should at some point roll a double");
    }
}
