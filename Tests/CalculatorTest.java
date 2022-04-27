//JUnit testing
/*
 * This unit testing works one by one, when you want to test you have to test each by each
 * add: is for testing addition
 * sub: is for substraction
 * mult: is for multiplication
 * div: is for division
 * so test one by one by commenting the unwanted part
 * */

public class CalculatorTest {
	
	public record IlligalArgumentException() {

	}

	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}
	
	public static int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}
	
	public static int mult(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}
	
	public static int div(int i, int j) throws Exception {
		// TODO Auto-generated method stub
		if (j == 0) {
			throw new Exception("number divide by zero equal infinity");
		}
		return i / j;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
