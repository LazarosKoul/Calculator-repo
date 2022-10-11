package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.Calculator;

class AdderTest {
	
	Calculator mycal = new Calculator();
	
	@Test
	void testAdd() {
		int res = mycal.add(3, 4);
		assertEquals( res, 7);
	}
	
	@Test
	void testMul() {
		int res = mycal.multiply(3, 4);
		assertEquals(res, 12);
	}
}
