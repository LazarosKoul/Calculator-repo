
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");

		Calculator mycal = new Calculator();
		
		int x = 3;
		int y = 4;
		System.out.println(mycal.add(x, y));
		System.out.println(mycal.multiply(x, y));
	}

}
