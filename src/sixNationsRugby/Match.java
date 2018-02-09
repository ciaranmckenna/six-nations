package sixNationsRugby;

import java.util.Date;

/**
 * importing the java date library
 * @author Ciaran
 *
 */
public class Match {
	
	/**
	 * instance vars for matches
	 */

	private RugbyTeam teamA;
	private RugbyTeam teamB;
	private int teamAPointsScore;
	private int teamBPointsScore;
	private int teamATriesScore;
	private int teamBTriesScore;
	
	/**
	 * 
	 * default constructor
	 */
	public Match() {
	}
	
	/**
	 * constr
	 * @param teamA
	 * @param teamB
	 * @param teamAPointsScore
	 * @param teamBPointsScore
	 */
	public Match(RugbyTeam teamA, RugbyTeam teamB, int teamAPointsScore, int teamBPointsScore, int teamATriesScore, int teamBTriesScore) {
		super();
		this.teamA = teamA;
		this.teamB = teamB;
		this.teamAPointsScore = teamAPointsScore;
		this.teamBPointsScore = teamBPointsScore;
		this.teamATriesScore = teamATriesScore;
		this.teamBTriesScore = teamBTriesScore;
	}

	/**
	 * @return the teamA
	 */
	public RugbyTeam getTeamA() {
		return teamA;
	}
	/**
	 * @param teamA the teamA to set
	 */
	public void setTeamA(RugbyTeam teamA) {
		this.teamA = teamA;
	}
	/**
	 * @return the teamB
	 */
	public RugbyTeam getTeamB() {
		return teamB;
	}
	/**
	 * @param teamB the teamB to set
	 */
	public void setTeamB(RugbyTeam teamB) {
		this.teamB = teamB;
	}

	/**
	 * @return the teamAPointsScore
	 */
	public int getTeamAPointsScore() {
		return teamAPointsScore;
	}

	/**
	 * @param teamAPointsScore the teamAPointsScore to set
	 */
	public void setTeamAPointsScore(int teamAPointsScore) {
		this.teamAPointsScore = teamAPointsScore;
	}

	/**
	 * @return the teamBPointsScore
	 */
	public int getTeamBPointsScore() {
		return teamBPointsScore;
	}

	/**
	 * @param teamBPointsScore the teamBPointsScore to set
	 */
	public void setTeamBPointsScore(int teamBPointsScore) {
		this.teamBPointsScore = teamBPointsScore;
	}

	/**
	 * @return the teamATriesScore
	 */
	public int getTeamATriesScore() {
		return teamATriesScore;
	}

	/**
	 * @param teamATriesScore the teamATriesScore to set
	 */
	public void setTeamATriesScore(int teamATriesScore) {
		this.teamATriesScore = teamATriesScore;
	}

	/**
	 * @return the teamBTriesScore
	 */
	public int getTeamBTriesScore() {
		return teamBTriesScore;
	}

	/**
	 * @param teamBTriesScore the teamBTriesScore to set
	 */
	public void setTeamBTriesScore(int teamBTriesScore) {
		this.teamBTriesScore = teamBTriesScore;
	}
	
	
}
