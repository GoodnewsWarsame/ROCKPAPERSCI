package Game;

import Login.Login;
import Login.UserInfo;

public class Game {
//instance variables
	private String Result;
	private int computerScore;
	private int playerScore;

	
	

	//constructor
	public Game( String result, int computerScore, int playerScore) {
		super();
		
		Result = result;
		this.computerScore = computerScore;
		this.playerScore = playerScore;
	
	}




	//toString method
	@Override
	public String toString() {
		return "Result=" + Result + " computerScore=" + computerScore + ", playerScore=" + playerScore ;
	}
	

	
	
	
	
}
