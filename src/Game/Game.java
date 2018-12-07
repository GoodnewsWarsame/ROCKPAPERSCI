package Game;

import Login.Login;
import Login.UserInfo;

public class Game {
	;
	private String Result;
	private int computerScore;
	private int playerScore;

	
	

	
	public Game( String result, int computerScore, int playerScore) {
		super();
		
		Result = result;
		this.computerScore = computerScore;
		this.playerScore = playerScore;
	
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Result=" + Result + " computerScore=" + computerScore + ", playerScore=" + playerScore ;
	}
	

	
	
	
	
}
