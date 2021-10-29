package OOPS_CONCEPTS;

public class DefaultMember {

int accnum=1235;
void displayAccNum() {
	System.out.println("account number:"+accnum);
}
	public static void main(String[] args) {
		DefaultMember d1 = new DefaultMember();
		d1.displayAccNum();
	}

}
