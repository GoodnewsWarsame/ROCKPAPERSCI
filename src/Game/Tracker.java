package Game;

import java.util.ArrayList;

public class Tracker extends Game {
	private ArrayList<Tracker> track = new ArrayList<Tracker>();
	private int count =0;
	private Game gm;
	
	
	
	public Tracker(String result, int computerScore, int playerScore) {
		super(result, computerScore, playerScore);
		count++;
		this.gm = gm;
	}
	public void addScore(String result, int cmScore, int pScore) {
	 Tracker games = new Tracker(result, cmScore, cmScore);
		track.add(games);
		this.gm =games;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Game: " + count  + " " + super.toString() + "\n";
		
	}

	
	
	
}


	
	
