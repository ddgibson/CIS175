package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import model.rentPropertyLogic;
import model.rentalProperty;

public class testLogic2 {

	
	rentalProperty castle = new rentalProperty("999 Real Island Drive", 193, 1500);
	
	rentPropertyLogic rpl = new rentPropertyLogic();
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testFreeUtilities() {
		castle.setFreeUtilities(true);
		
		assertFalse(castle.getFreeUtilities());
	}
		
	@Test
	public void testCalculateYearlyRent() {
		double yearlyRent = rpl.calculateYearlyRent(castle);
		
		assertEquals(18000, yearlyRent, 0.0);
	}
	
	@Test
	public void hasAddressTest() {
		assertNotNull(castle.getAddress());
	}

}
