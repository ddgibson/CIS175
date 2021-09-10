package model;

public class rentalProperty {
	private String address;
	private int yearsOld;
	private double monthlyRent;
	private boolean freeUtilities = false;
	
	public rentalProperty(String str, int age, int rent) {
		address = str;
		yearsOld = age;
		monthlyRent = rent;
	}

	public rentalProperty(String str) {
		address = str;
	}
	
	public rentalProperty() {
		
	}
	
	public void setAddress(String str) {
		address = str;
	}
	
	public void setYearsOld(int age) {
		yearsOld = age;
	}
	
	public void setMonthlyRent(double rent) {
		monthlyRent = rent;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getYearsOld() {
		return yearsOld;
	}
	
	public double getMonthlyRent() {
		return monthlyRent;
	}
	
	public void setFreeUtilities(boolean utilities) {
		freeUtilities = utilities;
	}
	
	public boolean getFreeUtilities() {
		return freeUtilities;
	}
}
