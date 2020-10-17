package org.snakeladdersimulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeLadderLogic {
    int player1=0;

    static Map<Integer,Integer> snakeposition = new HashMap<Integer,Integer>();
    static Map<Integer,Integer> ladderposition = new HashMap<Integer,Integer>();

    {
        snakeposition.put(97,34);
        snakeposition.put(92,65);
        snakeposition.put(68,42);
        snakeposition.put(28,8);
        snakeposition.put(83,71);

        ladderposition.put(6,25);
        ladderposition.put(11,40);
        ladderposition.put(60,85);
        ladderposition.put(46,90);
        ladderposition.put(17,69);
    }

    public int rollDice()
    {
        int dice = 0;
        Random random = new Random();
        dice=random.nextInt(7);
        return (dice==0?1:dice);
    }
}
