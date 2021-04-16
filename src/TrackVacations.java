/********************************************
 * Name: Jimmy N Smith
 * Date: 02/21/21
 * Instructor: Krishna Nandanoor
 * Class: CIT 24919Z1
 * Purpose: to learn about polymorphism
 * Known Issues: no known issues
 ******************************************** 
 */
public class TrackVacations {

	public static void main(String[] args) {
		
		/*******************************************
		 * creates a new empty array with 12 spots
		 *******************************************
		 */

		Vacation vacation[] = new Vacation[12];
		
		/********************************
		 * populates the array with data
		 ********************************
		 */

		vacation[0] = new AllInclusive("Cancoon", "February", "March", "Delta");
		vacation[1] = new AllInclusive("Malibu", "March", "April", "American");
		vacation[2] = new AllInclusive("Canada", "April", "May", "Allegiant");
		vacation[3] = new AllInclusive("Hawaii", "May", "June", "JetBlue");
		vacation[4] = new AllInclusive("Mexico", "June", "July", "Southwest");
		vacation[5] = new AllInclusive("Brazil", "July", "August", "Delta");
		vacation[6] = new Detailed("Cancoon", "February", "March", 200, 600, 300, 140);
		vacation[7] = new Detailed("Malibu", "March", "April", 300, 500, 400, 240);
		vacation[8] = new Detailed("Canada", "April", "May", 200, 600, 300, 100);
		vacation[9] = new Detailed("Hawaii", "May", "June", 100, 200, 400, 110);
		vacation[10] = new Detailed("Mexico", "June", "July", 400, 500, 500, 40);
		vacation[11] = new Detailed("Brazil", "July", "August", 500, 100, 200, 95);
		
		/***************************************************
		 * prints out the data in order from top to bottom
		 ***************************************************
		 */

		for (int i = 0; i < 12; i++) {
			System.out.println(vacation[i]);
		}

	}

}
