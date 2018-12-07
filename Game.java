package Game;
import java.util.Random;

import Login.Login;

public class Game extends PlayerInfo{
	
	private String Result;
	private int computerScore;
	private int playerScore;
	private Login log;
	
	public Game( String result, int computerScore, int playerScore) {
		super();
		
		Result = result;
		this.computerScore = computerScore;
		this.playerScore = playerScore;
	}
	public void addScore(String result, int cmScore, int pScore) {

		Game gm = new Game(Result, computerScore, playerScore);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Game [Result=" + Result + ", computerScore=" + computerScore
				+ ", playerScore=" + playerScore + "]";
	}
	
	
}

