package OODDesign.SnakeLadder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer, Integer> snakes;

    private Map<Integer, Integer> ladders;

    public Board(int size, List<Snake> snakes, List<Ladder> ladders){
        this.size = size;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
        for(Snake snake: snakes){
            this.snakes.put(snake.getHead(), snake.getTail());
        }

        for(Ladder ladder: ladders){
            this.ladders.put((ladder.getBottom()), ladder.getTop());
        }
    }

    public int getSize(){
        return size;
    }

    public int getNewPosition(int position){
        if(snakes.containsKey(position)){
            return snakes.get(position);
        }
        if(ladders.containsKey(position)){
            return ladders.get(position);
        }
        return position;
    }
}
