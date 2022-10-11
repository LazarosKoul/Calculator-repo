package tests;
import static org.junit.jupiter.api.Assertions.*;
import main.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	void testAdder() {
		assertEquals(10,calc.add(5,5));
	}
	
	@Test
	void testSub() {
		assertEquals(0,calc.subtract(5,5));
	}
	
	@Test
	void testMultiply() {
		assertEquals(25,calc.multiply(5,5));
	}

	@Test
	void testDivision() {
		assertEquals(1,calc.divide(5,5));
	}
	
	@Test
	void testDivisionWithZero() {
		assertEquals(0,calc.divide(5,0));
	}
}
