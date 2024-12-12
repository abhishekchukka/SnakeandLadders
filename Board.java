import java.util.*;

public class Board {
    // size , snakes ,ladder, nextmoveSafeorNOt
    // player has the method for the person to move but b4 updating it , has to be
    // checked if thats a cnake or ladder or none?
    // vanakkam 1,2
    int size;
    private Map<Integer, Integer> snakes;
    private Map<Integer, Integer> ladders;


    public Board(int size, Map<Integer, Integer> s, Map<Integer, Integer> l) {
        snakes = s;
        ladders = l;
        this.size = size;
    }

    public Map<Integer, Integer> getSnakes() {
        System.out.println("getting snakes;")
        return snakes;

    }

    public Map<Integer, Integer> getLadders() {
        return ladders;
    }

    public int checkMove(int position) {
        if (snakes.containsKey(position)) {
            System.out.println(
                    " Alas! You got bitten by a snake from " + position + " to " + snakes.get(position) + ".");
            return snakes.get(position);
        }
        if (ladders.containsKey(position)) {
            System.out
                    .println(" Hurray! You climbed a ladder from " + position + " to " + ladders.get(position) + ".");
            return ladders.get(position);
        }
        return position;
    }

}
