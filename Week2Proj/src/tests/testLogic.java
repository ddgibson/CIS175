package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.rentPropertyLogic;
import model.rentalProperty;

public class testLogic {
	
	rentalProperty house = new rentalProperty("123 Fake Street", 8, 750);
	
	rentPropertyLogic rpl = new rentPropertyLogic();
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testFreeUtilities() {
		house.setFreeUtilities(false);
		
		assertFalse(house.getFreeUtilities());
	}
		
	@Test
	public void testCalculateYearlyRent() {
		double yearlyRent = rpl.calculateYearlyRent(house);
		
		assertEquals(9000, yearlyRent, 0.0);
	}
	
	@Test
	public void hasAddressTest() {
		assertNotNull(house.getAddress());
	}

}
