/* 
Name: Mark Christodoulou
Class ID:349
Description: This program contains six methods, these methods are to add, subtract, multiply,
divide, display total, and display the history of operations.
*/
package CSEProject2_360;

public class Calculator {
	private int total;
	private String history;
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; // initilaze the history string
	}
	
	public int getTotal () // Returns the total of the Calculation
	{
		return total;
	}
	
	public void add (int value) { //adds the value of the parameter to the total and updates history
		total = total + value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {//subtracts the value of the parameter to the total and updates history
		total = total - value;
		history = history + " – " + value;
	}
	
	public void multiply (int value) {//multiplies the value of the parameter to the total and updates history
		total = total * value;
		history = history + " * " + value;
	}
	
	public void divide (int value) {//divides the value of the parameter to the total and updates history
		if(value == 0){
			total = 0;
			history = history + " / 0";
		}
		else{
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	public String getHistory () {// returns the history
		return history;
	}
}
