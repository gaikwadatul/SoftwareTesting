package OOPS_CONCEPTS;

public class privateMember {

	private int accNum=5246;
	private void displayAccNum1() {
		System.out.println("Account number"+accNum);
	}
	public static void main(String[] args) {
		privateMember p1= new privateMember();
		p1.displayAccNum1();

	}

}
