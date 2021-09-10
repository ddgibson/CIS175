package model;

import org.junit.Test;

public class rentPropertyLogic {
	
	public rentPropertyLogic(){
		
	}

	public double calculateYearlyRent(rentalProperty property) {
		double yearlyRent = 0;
		yearlyRent = property.getMonthlyRent() * 12;
		return yearlyRent;
	}
	
	public boolean isOld(rentalProperty property) {
		if (property.getYearsOld() > 10) {
			return true;
		} else {
			return false;
		}
	}
}
