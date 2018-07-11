package javabasic;

public class FootballPlayer {
	private String playerName;
	private int playerAge;
	private String fieldPosition;
	private String clubName;
	public FootballPlayer(String playerName, int playerAge) {
		super();
		this.playerName = playerName;
		this.playerAge = playerAge;
	}
	public FootballPlayer(String playerName, int playerAge,
			String fieldPosition, String clubName) {
		super();
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.fieldPosition = fieldPosition;
		this.clubName = clubName;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public String getFieldPosition() {
		return fieldPosition;
	}
	public void setFieldPosition(String fieldPosition) {
		this.fieldPosition = fieldPosition;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	@Override
	public String toString() {
		return "FootballPlayer [playerName=" + playerName + ", playerAge="
				+ playerAge + ", fieldPosition=" + fieldPosition
				+ ", clubName=" + clubName + "]";
	}
	
	
}
