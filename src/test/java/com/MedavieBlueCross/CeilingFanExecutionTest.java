package test.java.com.MedavieBlueCross;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.MedavieBlueCross.CeilingFanExecution;
import main.java.com.MedavieBlueCross.FanDirection;

class CeilingFanExecutionTest {

	@Test
	void testPullFirstCord() {
		CeilingFanExecution ceilingFan = new CeilingFanExecution();
		ceilingFan.pullFirstCord();
		assertEquals(1, ceilingFan.getCurrentSpeed());
		ceilingFan.pullFirstCord();
		assertEquals(2, ceilingFan.getCurrentSpeed());
		ceilingFan.pullFirstCord();
		assertEquals(3, ceilingFan.getCurrentSpeed());
		ceilingFan.pullFirstCord();
		assertEquals(0, ceilingFan.getCurrentSpeed());
	}

	@Test
	final void testPullSecondCord() {
		CeilingFanExecution ceilingFan = new CeilingFanExecution();
		ceilingFan.pullSecondCord();
		assertEquals(FanDirection.BACKWARD, ceilingFan.getCurrentDirection());
		ceilingFan.pullSecondCord();
		assertEquals(FanDirection.FORWARD, ceilingFan.getCurrentDirection());
	}

}
