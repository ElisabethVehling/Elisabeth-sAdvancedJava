import java.awt.Point;

//computer is playing as O
public class TicTacToePlayer {
	TicTacToeGame game;
	private final char opponent= 'X';
	public TicTacToePlayer(TicTacToeGame g) {
		game = g;
	}
	public TicTacToeMove getMove() {
		return getFirstMoveFound();
	}

	public TicTacToeMove getGameSaver() {
		for(int x=0;x<3;x++){
			for(int y=0; y<3 ; y++){
			if(game.getPieceAt(x,0)== opponent && game.getPieceAt(x, 1)== opponent && game.canPlacePieceAt(x,2)){
				return new TicTacToeMove(game,x,2);
			}
			if(game.getPieceAt(x,1)== opponent && game.getPieceAt(x, 2)== opponent && game.canPlacePieceAt(x,0)){
				return new TicTacToeMove(game,x,0);
			}
			if(game.getPieceAt(x,2)== opponent && game.getPieceAt(x, 1)== opponent && game.canPlacePieceAt(x,0)){
				return new TicTacToeMove(game,x,1);
				
			}
			if(game.getPieceAt(y,2)== opponent && game.getPieceAt(y, 1)== opponent && game.canPlacePieceAt(y,0)){
				return new TicTacToeMove(game,y,1);
			}
			if(game.getPieceAt(y,1)== opponent && game.getPieceAt(y, 2)== opponent && game.canPlacePieceAt(y,0)){
				return new TicTacToeMove(game,y,1);
			}
			if(game.getPieceAt(y,0)== opponent && game.getPieceAt(y, 1)== opponent && game.canPlacePieceAt(y,2)){
				return new TicTacToeMove(game,y,1);
			
			
			}
			if(game.getPieceAt(y,2)== opponent && game.getPieceAt(x, 1)== opponent && game.canPlacePieceAt(x,2)){
				return new TicTacToeMove(game,y,1);
		
				
	}
		return null;
		}
		return null;

	 }
		return null;
	}
	public TicTacToeMove getFirstMoveFound() {
		for(int x=0; x< 3 ; x++){
			for(int y=0; y<3; y++){
				if(game.canPlacePieceAt(x,y)) {
					return new TicTacToeMove(game,x,y);
				}else{



				}
			}
		}
		return null; 
	}

}
