/**
 * 
 */
package sixNationsRugby;

/**
 * @author Ciaran
 *
 */
public abstract class Team {
	
	/**
	 *instance vars related to teams
	 */
	private String name; 
	private String capitalCity;
	private int gamesPlayed;
	private int pointsScored;
	private int pointsConceded;
	private int pointsDifference;
	private int triesScored;
	private int triesConceeded;
	private int tryDifference;
	private int bonusPoints;
	private int totalPoints;
	 
	/**
	 * Default constructor
	 */
	public Team() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param capitalCity
	 * @param gamesPlayed
	 * @param pointsScored
	 * @param pointsConceded
	 * @param pointsDifference;
	 * @param triesScored
	 * @param triesConceeded
	 * @param tryDifference
	 * @param bonusPoints
	 * @param totalPoints
	 */
	public Team(String name, String capitalCity, int gamesPlayed, int pointsScored, int pointsConceded, int pointsDifference,
			int triesScored, int triesConceeded, int tryDifference, int bonusPoints, int totalPoints) {
		this.name = name;
		this.capitalCity = capitalCity;
		this.gamesPlayed = gamesPlayed;
		this.pointsScored = pointsScored;
		this.pointsConceded = pointsConceded;
		this.setPointsDifference(pointsDifference);
		this.triesScored = triesScored;
		this.triesConceeded = triesConceeded;
		this.tryDifference = tryDifference;
		this.bonusPoints = bonusPoints;
		this.totalPoints = totalPoints;
	}

	/**
	 * @return the capitalCity
	 */
	public String getCapitalCity() {
		return capitalCity;
	}

	/**
	 * @param capitalCity the capitalCity to set
	 */
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gamesPlayed
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * @param gamesPlayed the gamesPlayed to set
	 */
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	/**
	 * @return the pointsScored
	 */
	public int getPointsScored() {
		return pointsScored;
	}

	/**
	 * @param pointsScored the pointsScored to set
	 */
	public void setPointsScored(int pointsScored) {
		this.pointsScored = pointsScored;
	}

	/**
	 * @return the pointsConceded
	 */
	public int getPointsConceded() {
		return pointsConceded;
	}

	/**
	 * @param pointsConceded the pointsConceded to set
	 */
	public void setPointsConceded(int pointsConceded) {
		this.pointsConceded = pointsConceded;
	}

	/**
	 * @return the pointsDifference
	 */
	public int getPointsDifference() {
		return pointsDifference;
	}

	/**
	 * @param pointsDifference the pointsDifference to set
	 */
	public void setPointsDifference(int pointsDifference) {
		this.pointsDifference = pointsScored - pointsConceded;
	}

	/**
	 * @return the triesScored
	 */
	public int getTriesScored() {
		return triesScored;
	}

	/**
	 * @param triesScored the triesScored to set
	 */
	public void setTriesScored(int triesScored) {
		triesScored*=3;
		this.triesScored = triesScored;
	}
	
	/**
	 * @return the triesConceeded
	 */
	public int getTriesConceeded() {
		return triesConceeded;
	}

	/**
	 * @param triesConceeded the triesConceeded to set
	 */
	public void setTriesConceeded(int triesConceeded) {
		triesConceeded*=3;
		this.triesConceeded = triesConceeded;
	}

	/**
	 * @return the tryDifference
	 */
	public int getTryDifference() {
		return tryDifference;
	}

	/**
	 * @param tryDifference the tryDifference to set
	 */
	public void setTryDifference(int tryDifference) {
		
		this.tryDifference = triesScored - triesConceeded;
	}

	/**
	 * @return the bonusPoints
	 */
	public int getBonusPoints() {
		return bonusPoints;
	}

	/**
	 * @param bonusPoints the bonusPoints to set
	 */
	public void setBonusPoints(int bonusPoints) {
		this.bonusPoints = bonusPoints;
	}

	/**
	 * @return the totalPoints
	 */
	public int getTotalPoints() {
		return totalPoints;
	}

	/**
	 * @param totalPoints the totalPoints to set
	 */
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

}
