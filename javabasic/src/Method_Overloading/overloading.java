package Method_Overloading;

public class overloading {
  
	static public void square() {
		System.out.println("No parameter method calles");
	}
	
	static public void square(int number) {
		int square = number * number;
		System.out.println("method with argumeny " +square);
	}
	
	static public void square(double number) {
		double square = number * number;
		System.out.println("method float argument " +square);
		
	}
	public static void main(String[] args) {
		overloading. square();
		overloading. square(5);
		overloading. square(25.5f);

	}

}
