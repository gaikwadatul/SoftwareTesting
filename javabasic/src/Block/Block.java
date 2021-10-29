package Block;

public class Block {

	static {
	// static block or SIB(non static initialization block) or class block
	System.out.println("******this is  static bock of class block");
	}
	{
	//non static block or NSIB((non static initialization block) or instance block
	System.out.println("this is non static block");	
	 }
	
	public static void main(String[] args) {	
	System.out.println("main() starts");
	System.out.println(" I am main() block class ");
	System.out.println("main() Ends");
		
	}
	static {
		// static block or SIB(non static initialization block) or class block
		System.out.println("******this is  static block***");
		}
}

// body or definition or block   