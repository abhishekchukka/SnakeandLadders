public class NDice implements Dice {
    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

}
