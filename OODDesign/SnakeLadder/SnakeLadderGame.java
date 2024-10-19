package OODDesign.SnakeLadder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnakeLadderGame {
    public static void main(String[] args){

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("abhishek"));
        playerList.add(new Player("shirisha"));
        int size = 100;

        List<Snake> snakeList = Arrays.asList(new Snake(14, 7),
                new Snake(8, 3),
                new Snake(52, 28), new Snake(95, 73),
                new Snake(97, 79));
        List<Ladder> ladderList = Arrays.asList(new Ladder(2, 15),
                new Ladder(22, 41),
                new Ladder(30, 77), new Ladder(45, 66),
                new Ladder(60, 92));



        Dice dice = new Dice();
        Board board = new Board(size, snakeList, ladderList);
        Game game = new Game(board, playerList, dice);

        game.start();

    }
}
