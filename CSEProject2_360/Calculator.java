package CSEProject2_360;

public class Calculator {
	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () // Returns the total of the Calculation
	{
		return total;
	}
	
	public void add (int value) { //adds the value of the parameter to the total 
		total = total + value;
	}
	
	public void subtract (int value) {//subtracts the value of the parameter to the total 
		total = total - value;
	}
	
	public void multiply (int value) {//multiplies the value of the parameter to the total 
		total = total * value;
	}
	
	public void divide (int value) {//divides the value of the parameter to the total 
		total = total / value;
	}
	
	public String getHistory () {
		return "";
	}
}
