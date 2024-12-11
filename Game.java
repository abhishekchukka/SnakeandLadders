import java.util.*;

public class Game {

    static void setPandL(Map<Integer, Integer> snakes, Map<Integer, Integer> ladders) {
        snakes.put(25, 5);
        snakes.put(32, 4);
        snakes.put(55, 20);
        snakes.put(68, 15);
        snakes.put(98, 10);
        ladders.put(7, 35);
        ladders.put(30, 67);
        ladders.put(18, 58);
        ladders.put(66, 88);
        ladders.put(84, 96);
    }

    public static void main(String[] args) {
        Queue<Player> players = new LinkedList<>();
        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladders = new HashMap<>();
        setPandL(snakes, ladders);
        Board b = new Board(100, snakes, ladders);
        Dice d = new NDice();
        players.add(new Player("Player1"));
        players.add(new Player("Player2"));
        players.add(new Player("Player3"));
        players.add(new Player("Player4"));
        // int winning = 1;
        while (true) {
            Player current = players.poll();
            System.out.println("Name : " + current.getName() + " Position: " + current.getPosition());
            int diceno = d.rollDice();
            System.out.println("Dice :" + diceno);
            int playernextpos = current.getPosition() + diceno;

            if (playernextpos > b.size) {
                players.offer(current);
                continue;
            }
            if (playernextpos == b.size) {
                System.out.println("Name : " + current.getName() + " won the game");
                break;
            }
            int checkPos = b.checkMove(playernextpos);
            current.setPosition(checkPos);
            System.out.println("Name : " + current.getName() + " New Position: " + current.getPosition());
            System.out.println("------------------------------------------------");
            players.offer(current);

        }
    }

}
