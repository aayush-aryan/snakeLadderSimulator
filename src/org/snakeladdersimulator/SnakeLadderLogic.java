package org.snakeladdersimulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeLadderLogic {
    final static int WINPOSITION = 100;
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
    public int findPlayerPosition(int player, int diceValue)
    {
        player = player + diceValue;

        if(player > WINPOSITION)
        {
            player = player - diceValue;
            return player;
        }
        //checking player postion is snake
        if(snakeposition.get(player)!=null)
        {
            System.out.println("swallowed by snake");
            player= snakeposition.get(player);
        }

        if(ladderposition.get(player)!=null)
        {
            System.out.println("climb up the ladder");
            player= ladderposition.get(player);
        }
        return player;
    }


    public void startGame()
    {
        int count=0;
        int player1 =0;

        Scanner s = new Scanner(System.in);
        String userinput;
        int diceValue =0;
        do {
            System.out.println("Press r to roll Dice");
            userinput = s.next();
            diceValue = rollDice();
            if (!"r".equalsIgnoreCase(userinput))
                System.err.println("Sorry your input is not correct and Please press r");
            else {
                count++;
                    player1 = findPlayerPosition(player1, diceValue);
                    System.out.println(" Player :: " + player1);
                    System.out.println("------------------");
                    if (isWin(player1)) {
                        System.out.println("player wins");
                        System.out.println("number of times rolling the dice : "+count);
                        return;
                    }
                }
        }
        while (true) ;

    }

    public boolean isWin(int player)
    {
        return WINPOSITION == player;
    }
}
