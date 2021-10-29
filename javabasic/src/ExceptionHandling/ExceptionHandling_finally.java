package ExceptionHandling;

public class ExceptionHandling_finally {

	public static void main(String[] args) {
		try {
			int data=25/0;
			System.out.println(data);
		}catch(ArithmeticException e) {
		System.out.println("Exception handeled,.."+e);	
		}
		finally {
			int k=10/0;
			System.out.println("finaly block exceuted");
		}
		System.out.println("Rest of the code ");

	}

}
