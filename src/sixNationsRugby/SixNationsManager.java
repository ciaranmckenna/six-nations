package sixNationsRugby;

/**
 * Class to allow user input to be selected, based on the menu options
 * below.
 * @author Ciaran
 *
 */

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class SixNationsManager implements ChampionshipManager {

	private final int numberOfTeams;
	
	private final ArrayList<RugbyTeam> championship;
	private final Scanner scanner;
	private final ArrayList<Match> matches;
	
	public SixNationsManager (int numberOfTeams) {
		
		this.numberOfTeams = numberOfTeams;
		scanner = new Scanner(System.in);
		championship = new ArrayList<>();
		matches = new ArrayList<>();
		displayMenu();
	}
	
	private void displayMenu() {
		
		while (true) {
			System.out.println("\nSix Nations Championship Menu.");
			System.out.println("Add country, press 1");
			System.out.println("Generate fixtures, press 2");
			System.out.println("Upload scores, press 3");
			System.out.println("Display the championship table, press 4");
			System.out.println("Display statistics for a team, press 5");
			System.out.println("Add games played, press 6");
			// allowing the user information to be read from the console
			String line = scanner.nextLine();
			int command = 0;
			//parse the user input
			try {
				command = Integer.parseInt(line);
			}catch (Exception e) {
				
			}
			switch (command) {
			case 1 :
				addCountry();
			break;
			case 2: 
				generateFixtures();
			break;
			case 3: 
				uploadScores();
			break;
			case 4: 
				displayChampionshipTable();
			break;
			case 5: 
				displayStatistics();
			break;
			case 6: 
				AddGamesPlayed(); 
			break;
			default:
				System.out.println("Wrong command");
			}
			
		}
	}

	private void AddGamesPlayed() {

		System.out.println("Enter home team: ");
		String line = scanner.nextLine();
		RugbyTeam home = null;
			for (RugbyTeam rugbyTeam : championship) {
				if(rugbyTeam.getName().equals(line))
					home = rugbyTeam;
			}
			if(home == null) {
				System.out.println("This team is not in the Six Nations Championship");
				return;
			}
			System.out.println("Enter away team: ");
			line = scanner.nextLine();
			RugbyTeam away = null;
				for (RugbyTeam rugbyTeam : championship) {
					if(rugbyTeam.getName().equals(line))
						away = rugbyTeam;
				}
				if(away == null) {
					System.out.println("This team is not in the Six Nations Championship");
					return;
				}
				
				System.out.println("Enter home team points: ");
				line = scanner.nextLine();
				int homePoints = -1;
				//catching input errors for number of points 
				try {
					homePoints = Integer.parseInt(line);
				}catch (Exception e) {
					
				}
				if (homePoints == -1) {
					System.out.println("You have to enter the number of points the home team have scored");
					return;
				}
				
				System.out.println("Enter away team points: ");
				line = scanner.nextLine();
				int awayPoints = -1;
				//catching input errors for number of points 
				try {
					awayPoints = Integer.parseInt(line);
				}catch (Exception e) {
					
				}
				if (awayPoints == -1) {
					System.out.println("You have to enter the number of points the away team have scored");
					return;
				}
				
				System.out.println("Enter home team number of tries");
				line = scanner.nextLine();
				int homeTries = -1;
				try {
					homeTries = Integer.parseInt(line);
				}catch (Exception e) {
					
				}
				if (homeTries == -1) {
					System.out.println("You have to enter the number of tries the home team have scored");
				}
				
				System.out.println("Enter away team number of tries");
				line = scanner.nextLine();
				int awayTries = -1;
				try {
					awayTries = Integer.parseInt(line);
				}catch (Exception e) {
					
				}
				if (awayTries == -1) {
					System.out.println("You have to enter the number of tries the away team have scored");
				}
				
				//using the constructor with arguments to initialise match variables 
				Match match = new Match(home, away, awayPoints, homePoints, awayTries, homeTries);
				matches.add(match);
				home.setPointsScored(home.getPointsScored() + homePoints);
				home.setTryDifference(home.getTriesScored()+ homeTries);
				away.setPointsScored(away.getPointsScored() + awayPoints);
				away.setTriesScored(away.getTriesScored() + awayTries);
				home.setPointsConceded(home.getPointsConceded() + home.getTriesConceeded() + awayPoints);
				away.setPointsConceded(away.getPointsConceded() + away.getTriesConceeded() + homePoints);
				home.setGamesPlayed(home.getGamesPlayed() + 1);
				away.setGamesPlayed(away.getGamesPlayed() + 1);
				
				if(homePoints > awayPoints) {
					home.setTotalPoints(home.getTotalPoints()+4);
					home.setWinCount(home.getWinCount()+1);
					away.setDefeatCount(away.getDefeatCount()+1);
				}
				else if(homePoints < awayPoints) {
					away.setTotalPoints(away.getTotalPoints()+4);
					away.setWinCount(away.getWinCount()+1);
					home.setDefeatCount(home.getDefeatCount()+1);
				}else {
					home.setTotalPoints(home.getTotalPoints()+4);
					away.setTotalPoints(away.getTotalPoints()+2);
					home.setDrawCount(home.getDrawCount()+1);
					away.setDrawCount(away.getDrawCount()+1);
					
				}
	}

	private void displayStatistics() {

		System.out.println("Insert team name: ");
		String line = scanner.nextLine();
		
		for (RugbyTeam rugbyTeam : championship) {
			if(rugbyTeam.getName().equals(line) ) {
				System.out.println("Team: " + rugbyTeam.getName() + " capital city: \t" + rugbyTeam.getCapitalCity());
				System.out.println("Team: " + rugbyTeam.getName() + " total points: \t" + rugbyTeam.getTotalPoints());
				System.out.println("Team: " + rugbyTeam.getName() + " games played: \t" + rugbyTeam.getGamesPlayed());
				System.out.println("Team: " + rugbyTeam.getName() + " matches won: \t" + rugbyTeam.getWinCount());
				System.out.println("Team: " + rugbyTeam.getName() + " matches lost: \t" + rugbyTeam.getDefeatCount());
				System.out.println("Team: " + rugbyTeam.getName() + " matches drawn: \t" + rugbyTeam.getDrawCount());
				System.out.println("Team: " + rugbyTeam.getName() + " tries scored: \t" + rugbyTeam.getTriesScored());
				System.out.println("Team: " + rugbyTeam.getName() + " tries conceeded: \t" + rugbyTeam.getTriesConceeded());
				System.out.println("Team: " + rugbyTeam.getName() + " tries difference: " + rugbyTeam.getTryDifference());
				System.out.println("Team: " + rugbyTeam.getName() + " points scored: \t" + rugbyTeam.getPointsScored());
				System.out.println("Team: " + rugbyTeam.getName() + " points conceeded: " + rugbyTeam.getPointsConceded());
				System.out.println("Team: " + rugbyTeam.getName() + " points difference:" + rugbyTeam.getPointsDifference());
				return;
			}
		}
		System.out.println("There is no such team in the championship");
	}

	private void displayChampionshipTable() {

		Collections.sort(championship, new TableComparator());
		for (RugbyTeam rugbyTeam : championship) {
			System.out.println(rugbyTeam.getName() + " Total points: " + rugbyTeam.getTotalPoints() + " \tTry difference: " + rugbyTeam.getTryDifference());
		}
	}

	private void uploadScores() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * method to generate fixtures for Six Nations Championship
	 */
	private void generateFixtures() {
		// TODO Auto-generated method stub
		
	}
	
	private void addCountry() {

		if(championship.size()== numberOfTeams) {
			System.out.println("Cant add anymore countries to the champship.");
			return;
		}
		RugbyTeam country = new RugbyTeam();
		System.out.println("Insert country name: ");
		String line = scanner.nextLine();
		country.setName(line);
		
		//preventing duplicate entries
		if(championship.contains(country)) {
			System.out.println("This country is already included in the championship");
			return;
		}
		System.out.println("Insert capital city: ");
		line = scanner.nextLine();
		country.setCapitalCity(line);
		championship.add(country);
	}
	
}
