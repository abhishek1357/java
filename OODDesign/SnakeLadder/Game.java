package OODDesign.SnakeLadder;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private int currentPlayer;

    private Dice dice;

    public Game(Board board, List<Player> players, Dice dice){
        this.board = board;
        this.players = players;
        this.currentPlayer = 0;
        this.dice = dice;
    }

    public boolean takeTurn(){

        Player player = players.get(currentPlayer);
        int diceValue = dice.roll();
        player.move(diceValue);
        if(player.getPosition() > board.getSize()){
            player.setPosition(board.getSize());
        }
        int newPosition = board.getNewPosition(player.getPosition());
        player.setPosition(newPosition);

        if(player.getPosition() == board.getSize()){
            System.out.println(player.getName() + " wins the game");
            return true;
        }

        this.currentPlayer = (this.currentPlayer + 1) % players.size();
        return false;


    }

    public void start(){
        boolean gameOver = false;
        while(!gameOver){
            gameOver = takeTurn();
        }
    }

}
