package Dice;

public class Dice {
    private int[] a = new int[] { 6 };

    public Dice(int[] arr) {
        a = arr;
        for (int i = 0; i <= 6; i++) {
            a = new int[i];
        }
    }

    public int[] sideValues;
    public double[] fairness;

    public int roll() {
        int index = (int) (Math.random() * sideValues.length);
        return sideValues[index];
    }

    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6 };
        DiceCheat d = new DiceCheat();
        d.sideValues = x;

        for (int i = 0; i < 10; i++) {
            System.out.println(d.roll(true));
        }

    }
}
