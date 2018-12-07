package Game;

import java.util.ArrayList;
//
public class Tracker extends Game {
	private ArrayList<Tracker> track = new ArrayList<Tracker>(); //instance variables
	private int count =0;
	private Game gm;
	
	//constructor
	
	public Tracker(String result, int computerScore, int playerScore, int count) {
		super(result, computerScore, playerScore);
		this.gm = gm;
		this.count = count;
	}
	
	//method that addsResults
	public void addScore(String result, int cmScore, int pScore, int count) {
	 Tracker games = new Tracker(result, cmScore, cmScore, count);
		track.add(games);
		this.gm =games;
	}
	
	
	
	//toString method
	@Override
	public String toString() {
		return "Game: " + count  + " " + super.toString() + "\n";
		
	}

	
	
	
}


	
	
