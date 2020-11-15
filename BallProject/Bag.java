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

//CREATING 2 OBJECTS, WHITE & BLACK
        Balls whiteBalls = new Balls("White", 16);
        Balls blackBalls = new Balls("Black", 20);

//ADDING THE VALUES OF BLACK-BALL AND WHITE-BALL TO AN INT CALLED "TOTALBALLS"
        int totalBalls = whiteBalls.getAmount() + blackBalls.getAmount();

//ASSIGNING THE VALUE OF WHITE-BALL TO AN ARRAYLIST CALLED "WHITE-BALL"
        ArrayList<Balls> white = new ArrayList<>();
        for (int i = 0; i < whiteBalls.getAmount(); i++) {
            white.add(whiteBalls);
        }

//ASSIGNING THE VALUE OF BLACK-BALL TO AN ARRAYLIST CALLED "BLACK-BALL"
        ArrayList<Balls> black = new ArrayList<>();
        for (int i = 0; i < blackBalls.getAmount(); i++) {
            black.add(blackBalls);
        }

//CREATING NEW "BAG" ARRAYLIST AND ASSIGNING THE VALUES OF "INT TOTALBALLS"
        ArrayList<Balls> bag = new ArrayList<>(totalBalls);

//INDEX 0 = WHITE-BALL, INDEX 16 = BLACK-BALL
        bag.addAll(0, white);
        bag.addAll(16, black);

//COUNT TOTAL BALLS
        int count = 0;

//DECLARING A RANDOM OBJECT
        Random rnd = new Random();

//IF THE BAG-ARRAY IS MORE THAN 1, "INT COUNT" WILL INCREMENT
        while (bag.size() > 1) {
            count++;
//SELECTING 2 RANDOM BALLS FROM THE BAG
            int select1 = rnd.nextInt(bag.size());
            int select2 = rnd.nextInt(bag.size());
            while (select2 == select1) {
                select2 = rnd.nextInt(bag.size());
            }

//IF THE BAG DOES NOT EQUAL 1: DO THIS
            if (bag.size() != 1) {
                System.out.println("Amount of Balls left: " + bag.size());

//IF - SELECT 1 & 2 ARE BOTH BLACK-BALLS: DO THIS
                if (bag.get(select1).equals(blackBalls) && bag.get(select2).equals(blackBalls)) {
                    System.out.println("You got 2 Blackballs.");
                    bag.remove(blackBalls);
                    bag.remove(blackBalls);
                    bag.add(blackBalls);
                    System.out.println("Removing 2 Blackballs, Adding Blackball");
                    System.out.println("");
                    continue;
                }

//IF - SELECT 1 & 2 ARE BOTH WHITE-BALLS: DO THIS
                if (bag.get(select1).equals(whiteBalls) && bag.get(select2).equals(whiteBalls)) {
                    System.out.println("You got 2 Whiteballs");
                    bag.remove(whiteBalls);
                    bag.remove(whiteBalls);
                    bag.add(blackBalls);
                    System.out.println("Removing 2 Whiteballs. Adding Blackball.");
                    System.out.println("");
                    continue;
                }

//IF - SELECT 1 & 2 ARE WHITE AND BLACK OR BLACK AND WHITE: DO THIS
                if (bag.get(select1).equals(whiteBalls) && bag.get(select2).equals(blackBalls)
                        || bag.get(select1).equals(blackBalls) && bag.get(select2).equals(whiteBalls)) {
                    bag.remove(whiteBalls);
                    bag.remove(blackBalls);
                    bag.add(whiteBalls);
                    System.out.println("Both balls are different.");
                    System.out.println("Removing White and Black balls. Adding White");
                    System.out.println("");

                }
            }
        }
        System.out.println("BAG SIZE: " + bag.size());
        System.out.println("The last remaining ball is: " + bag);
        System.out.println("Count is : " + count);
    }
}



