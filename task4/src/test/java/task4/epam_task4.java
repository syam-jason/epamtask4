package task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class epam_task4 {

	@Test
	public void test() {
		simplecompound co=new simplecompound();
		assertEquals(500.0,co.CompoundInterest(5, 1, 10000, "Annually"),0);
	
	}

}
