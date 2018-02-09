package sixNationsRugby;

import java.util.Comparator;

/**
 * Class to compare teams in the fixture's table
 * @author Ciaran
 *
 */
public class TableComparator implements Comparator<RugbyTeam> {

	@Override
	public int compare(RugbyTeam t1, RugbyTeam t2) {

		if(t1.getTotalPoints() > t2.getTotalPoints()) {
			return -1;
		}else if(t1.getTotalPoints() < t2.getTotalPoints()) {
			return 1;
		}else {
			int tryDifference1 = t1.getTryDifference(); 
			int tryDifference2 = t2.getTryDifference(); 
			if(tryDifference1 > tryDifference2) {
				return -1;
			}else if(tryDifference1 < tryDifference2) {
				return 1;
			}else {
				return 0;
			}
		}
		
		
	}
	
	

}
