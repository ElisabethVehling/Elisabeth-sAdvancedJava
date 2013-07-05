import java.util.ArrayList;


public class TicTacToeMove {
	TicTacToeGame game;
	ArrayList <TicTacToeMove> moves;
	int moveX;
	int moveY;


	public TicTacToeMove getMove(){
		return new TicTacToeMove(game,0,0);
	}

	//the game after the move has been made

	public TicTacToeMove(TicTacToeGame g, int x, int y) {
		game = g.copy();
		moveX=x;
		moveY=y;
		game.placePieceAt(x, y);
		moves= new ArrayList <TicTacToeMove>();


		//game.placePieceAt(x, y);
	}
	/*public void addmove(TicTacToe move) {
		moves.add(move);
	}*/
}
