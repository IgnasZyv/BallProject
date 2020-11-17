package Dice;

/**
 * DiceCheat
 */
public class DiceCheat {

    public int[] sideValues;
    public double[] fairness;

    public int roll(boolean cheat) {
        if (cheat == true) {
            return sideValues[sideValues.length - 1];
        } else {
            int index = (int) (Math.random() * sideValues.length);
            return sideValues[index];
        }
    }

}