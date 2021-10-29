package ExceptionHandling;

public class throw_demo2 {

	static void method() {
		System.out.println("Inside the method()");
		throw new ArithmeticException("throwing ArithmeticException");
	}

	public static void main(String[] args) {
		
		try {
			method();
			
		}catch(ArithmeticException e) {
			
			System.out.println("caught thr code()");
		}
		System.out.println("reset the code ");
	}

}
