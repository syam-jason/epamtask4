package task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcontructcode {

	@Test
	public void test() {
		constructcode C=new constructcode();

		assertEquals(100000.0,C.Cost("HighStandardMaterialsAndFullAutomatedHome", 4),0);
		
	}

}
