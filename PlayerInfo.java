package Game;

public class PlayerInfo {
	private String playerID;
	private String Bio;
	public int count;

	/**
	 * @return the playerID
	 */
	public String getPlayerID() {
		return playerID;
	}

	/**
	 * @param playerID the playerID to set
	 */
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return Bio;
	}

	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio, int count) {
		Bio = bio;
		getCount();
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PlayerInfo [playerID=" + playerID + ", Bio=" + Bio + ", count=" + count + "]";
	}

}
