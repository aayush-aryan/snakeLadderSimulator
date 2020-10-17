package org.snakeladdersimulator;

import java.util.Random;

public class SnakeLadderLogic {
    int player1=0;

    public int rollDice()
    {
        int dice = 0;
        Random random = new Random();
        dice=random.nextInt(7);
        return (dice==0?1:dice);
    }
}
