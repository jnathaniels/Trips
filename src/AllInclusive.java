/********************************************
 * Name: Jimmy N Smith
 * Date: 02/21/21
 * Instructor: Krishna Nandanoor
 * Class: CIT 24919Z1
 * Purpose: to learn about polymorphism
 * Known Issues: no known issues
 ******************************************** 
 */
public class AllInclusive extends Vacation {
	
	String brand;
	int starRating;
	double price;
	
	/**********************
	 * default constructor
	 **********************
	 */

	AllInclusive() {
		
	}
	
	/*************************
	 * overloaded constructor
	 *************************
	 */

	AllInclusive(String destination, String departureDate, String returnDate, String brand) {
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.brand = brand;
	}
	
	/**************************
	 * Mutators and Accessors
	 **************************
	 */

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/***************************************
	 * creates a String of all useful data
	 ***************************************
	 */
	
	@Override
	public String toString() {
		return "AllInclusive [destionation=" + destination + ", departureDate=" + departureDate + ", returnDate="
				+ returnDate + " + brand=" + brand + ", starRating=" + starRating + ", price=" + price + "]";
	}
	
	/************************
	 * returns the total cost
	 ************************
	 */
	
	public double getTotalCost() {
		return price;
		
	}
}
