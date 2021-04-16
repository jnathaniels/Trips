/********************************************
 * Name: Jimmy N Smith
 * Date: 02/21/21
 * Instructor: Krishna Nandanoor
 * Class: CIT 24919Z1
 * Purpose: to learn about polymorphism
 * Known Issues: no known issues
 ******************************************** 
 */
abstract class Vacation {

	protected String destination, departureDate, returnDate;
	
	/**********************
	 * default constructor
	 **********************
	 */

	Vacation() {

	}
	
	/*************************
	 * overloaded constructor
	 *************************
	 */

	public Vacation(String destination, String departureDate, String returnDate) {

	}
	
	/**************************
	 * Mutators and Accessors
	 **************************
	 */

	public String getDestionation() {
		return destination;
	}

	public void setDestionation(String destionation) {
		this.destination = destionation;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	/***************************************
	 * creates a String of all useful data
	 ***************************************
	 */

	@Override
	public String toString() {
		return "Vacation [destionation=" + destination + ", departureDate=" + departureDate + ", returnDate="
				+ returnDate + "]";
	}
	
	/***********************************************
	 * creates an abstract method to get total cost
	 ***********************************************
	 */

	public abstract double getTotalCost();
}
