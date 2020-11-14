package BallProject;

import java.util.ArrayList;
import java.util.Random;

/**Problem 9:  You  have  20  black  balls  and  16  white  balls  in  a  bag.
 * You  repeat  the  following operation until
 a single ball is left in the bag. You remove two balls at a time. If they are of the same color,
 you add a black ball to the bag; if they are of different colors, you add a white ball to the bag.
 Outline an algorithm that predicts the color of the last ball left in the bag.
*/

public class Bag {


    public static void main(String[] args) {
        Balls whiteBalls = new Balls("White");
        Balls blackBalls = new Balls("Black");
        whiteBalls.setAmount(16);
        blackBalls.setAmount(20);
        int totalBalls = whiteBalls.getAmount() + blackBalls.getAmount();
        //Create two arrays that hold white and black balls together.
        // Adding white balls into array "white".
        ArrayList<Balls> white = new ArrayList<>();
        for (int i = 0; i < whiteBalls.getAmount(); i++) {
            white.add(whiteBalls);
            //System.out.println(i);
        }       // Adding black balls into array "black".
        ArrayList<Balls> black = new ArrayList<>();
        for (int i = 0; i < blackBalls.getAmount(); i++) {
            black.add(blackBalls);
            //System.out.println(i);
        }    // New Array which has all contents of arrays white and black.
        ArrayList<Balls> bag = new ArrayList<>(totalBalls);
        bag.addAll(0, white);
        bag.addAll(15, black);

/*        System.out.println("Printing contents of bag.");
        for (Balls i : bag) {
            System.out.println("ball: " + i);
        }*/

        int count = 0;
// Depending on what colour the balls are either black ball is placed or white.
        while (bag.size() > 1) {
            Random rnd = new Random();
            int select1 = rnd.nextInt(bag.size());
            int select2 = rnd.nextInt(bag.size());
            System.out.println(select1);
            System.out.println(select2);
            Balls indexPos1 = bag.get(select1);
            Balls indexPos2 = bag.get(select2);
            count++;
            if (bag.size() != 1) {
                if (bag.get(select1).equals(blackBalls) && indexPos2.equals(blackBalls)) {
                    System.out.println("Both balls are black.");
                    bag.remove(indexPos1);
                    continue;
                }if (indexPos1.equals(whiteBalls) && indexPos2.equals(whiteBalls)) {
                    System.out.println("both Balls are white");
                    bag.remove(indexPos1);
                    bag.remove(indexPos1);
                    bag.add(blackBalls);
                }if (indexPos1.equals(whiteBalls) && indexPos2.equals(blackBalls) || indexPos1.equals(blackBalls) && indexPos2.equals(whiteBalls)) {
                    bag.remove(indexPos2);
                    System.out.println("Both balls are different.");
                }
            }
        }
        System.out.println("The last remaining ball is: " + bag);
        System.out.println("Count is : " + count);
    }
}




