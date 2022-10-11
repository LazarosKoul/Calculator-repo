package main;

public class Calculator {

	public int add(int one, int two) {
		return one + two;
	}
	public int subtract(int one, int two) {
		return one - two;
	}
	
	public int multiply(int one, int two) {
		return one * two;
	}
	
	public float divide(int one, int two) {
		if (two == 0) {
			System.out.println("Error");
			return 0;
		}
		return one/two;
	}
}
