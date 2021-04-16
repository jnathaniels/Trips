/********************************************
 * Name: Jimmy N Smith
 * Date: 02/21/21
 * Instructor: Krishna Nandanoor
 * Class: CIT 24919Z1
 * Purpose: to learn about polymorphism
 * Known Issues: no known issues
 ******************************************** 
 */
public class Detailed extends Vacation {

	double hotel, airfare, meals, transfers;
	
	/**********************
	 * default constructor
	 **********************
	 */

	Detailed() {

	}
	
	/*************************
	 * overloaded constructor
	 *************************
	 */

	Detailed(String destination, String departureDate, String returnDate, double hotel, double airfare, double meals,
			double transfers) {
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.hotel = hotel;
		this.airfare = airfare;
		this.meals = meals;
		this.transfers = transfers;

	}

	/**************************
	 * Mutators and Accessors
	 **************************
	 */
	
	public double getHotel() {
		return hotel;
	}

	public void setHotel(double hotel) {
		this.hotel = hotel;
	}

	public double getAirfare() {
		return airfare;
	}

	public void setAirfare(double airfare) {
		this.airfare = airfare;
	}

	public double getMeals() {
		return meals;
	}

	public void setMeals(double meals) {
		this.meals = meals;
	}

	public double getTransfers() {
		return transfers;
	}

	public void setTransfers(double transfers) {
		this.transfers = transfers;
	}
	
	/***************************************
	 * creates a String of all useful data
	 ***************************************
	 */

	@Override
	public String toString() {
		return "Detailed [destionation=" + destination + ", departureDate=" + departureDate + ", returnDate="
				+ returnDate + "hotel=" + hotel + ", airfare=" + airfare + ", meals=" + meals + ", transfers="
				+ transfers + "]";
	}
	
	/************************
	 * returns the total cost
	 ************************
	 */

	@Override
	public double getTotalCost() {
		return hotel + airfare + meals + transfers;
	}

}
