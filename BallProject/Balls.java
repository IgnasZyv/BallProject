package BallProject;

public class Balls {
    private String colour;
    private int amount;

    public Balls(String type) {
        colour = type;
    }

    public String getColour() {
        return colour;
    }
    public void changeAmount(int num){
        this.setAmount(num);
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String toString() {
        return colour;
    }
}
