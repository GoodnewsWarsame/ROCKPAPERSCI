package Game;

public class Tracker extends Game {
	private Game[] track;
	private int count =0;
	
	

	public Tracker(String result, int computerScore, int playerScore) {
		super(result, computerScore, playerScore);
		// TODO Auto-generated constructor stub
	}
	public void addScore(String result, int cmScore, int pScore) {
		Game gm = new Game(result, cmScore, cmScore);
		addScore(gm);
		
	}
	public void addScore(Game Track) {
		 this.track[count] = Track ;
		count++;
	}
	
	
	

}
