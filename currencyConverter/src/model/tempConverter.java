/**
 * @author Derek Gibson- ddgibson
 * CIS175 - Fall 2021
 * September 23, 2021
 */

package model;

public class tempConverter {
	private double temp;
	private double celsius;
	
	public tempConverter(double temp) {
		super();
		this.temp = temp;
		convertTemp(temp);
	}
	
	public void convertTemp(double temp) {
		convertCelsius(temp);
	}

	private void convertCelsius(double temp2) {
		// TODO Auto-generated method stub
		celsius = (temp2 - 32.0) * (5.0/9.0);
	}
	
	public double getTemp() {
		return celsius;
	}
	
	public String toString() {
		return "Your temp in degrees Celsius: " + celsius;
	}
}
