import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalTest {

	@SuppressWarnings("deprecation")
	@Test
	public void calTestAddPass() {
		assertEquals("error in add()", 3, CalculatorTest.add(1, 2));
		assertEquals("error in add()", -3, CalculatorTest.add(-1, -2));
		assertEquals("error in add()", 7, CalculatorTest.add(7, 0));
		
	}
	public void calcTestAddFail() {
		assertEquals("error in add()", -1, CalculatorTest.add(1, 2));
	}
	public void calcTestSubPass() {
		assertEquals("error in sub()", -1, CalculatorTest.sub(1, 2));
		assertEquals("error in sub()", 1, CalculatorTest.sub(-1, -2));
		assertEquals("error in sub()", 6, CalculatorTest.sub(8, 2));
	}
	
	public void calcTestSubFail() {
		assertEquals("error in sub()", 3, CalculatorTest.sub(1, 2));
	}
	
	public void calcTestMultPass() {
		assertEquals("error in mult()", 2, CalculatorTest.mult(1, 2));
		assertEquals("error in mult()", 2, CalculatorTest.mult(-1, -2));
		assertEquals("error in mult()", 0, CalculatorTest.mult(8, 0));
	}
	
	public void calcTestMultFail() {
		assertEquals("error in mult()", 5, CalculatorTest.mult(1, 2));
	}
	
	public void calcTestDivPass() throws Exception {
		assertEquals("error in div()", 1, CalculatorTest.div(2, 2));
		assertEquals("error in div()", 1, CalculatorTest.div(-2, -2));
	}
	
	public void calcTestDivFail() throws Exception {
		assertEquals("error in div()", -1, CalculatorTest.div(1, 2));
	}

}
