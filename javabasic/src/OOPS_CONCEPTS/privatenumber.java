package OOPS_CONCEPTS;

public class privatenumber {

	private int accNum=12345;
	private void displayAccNum() {
		System.out.println("Account number"+accNum);
	}
	public static void main(String[] args) {
		privatenumber p1= new privatenumber();
		p1.displayAccNum();

	}

}
