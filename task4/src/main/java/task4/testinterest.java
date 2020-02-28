package task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testinterest {

	@Test
	public void test() {
		simplecompound S=new simplecompound();

		assertEquals(500.0,S.simpleInterest(5, 1, 10000),0);
		
	}

}
