/**
 * 
 */
package sixNationsRugby;

/**
 * Class to collect information about performance of a rugby team
 * @author Ciaran
 *
 */
public class RugbyTeam extends Team {
	
	/**
	 * instance vars containing info regarding 
	 * the teams performances 
	 */
	private int winCount;
	private int drawCount;
	private int defeatCount;

	/**
	 * default constructor
	 */
	public RugbyTeam() {
	}

	/**
	 * constructor with args
	 * @param name
	 * @param gamesPlayed
	 * @param pointsScored
	 * @param pointsConceded
	 * @param triesScored
	 * @param triesConceeded
	 * @param tryDifference
	 * @param bonusPoints
	 * @param totalPoints
	 */
	public RugbyTeam(String name, String capitalCity, int gamesPlayed, int pointsScored, 
			int pointsConceded, int pointsDifference, int triesScored, int triesConceeded, int tryDifference,
			int bonusPoints, int totalPoints) {
		super(name, capitalCity, gamesPlayed, pointsScored, pointsConceded, pointsDifference, triesScored, triesConceeded, 
				tryDifference, bonusPoints, totalPoints);
	}

	/**
	 * @return the winCount
	 */
	public int getWinCount() {
		return winCount;
	}

	/**
	 * @param winCount the winCount to set
	 */
	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	/**
	 * @return the drawCount
	 */
	public int getDrawCount() {
		return drawCount;
	}

	/**
	 * @param drawCount the drawCount to set
	 */
	public void setDrawCount(int drawCount) {
		this.drawCount = drawCount;
	}

	/**
	 * @return the defeatCount
	 */
	public int getDefeatCount() {
		return defeatCount;
	}

	/**
	 * @param defeatCount the defeatCount to set
	 */
	public void setDefeatCount(int defeatCount) {
		this.defeatCount = defeatCount;
	}

	
}
