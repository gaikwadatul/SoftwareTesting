package javamethods;

class A1{
	{
	System.out.println("Hellozero");
	}
	A1(){
		System.out.println("Hello double");
		}
	A1(int x){
		System.out.println("Hello int"+x);
		}
	
}
public class ThisStatement {

	public static void main(String[] args) {
		A1 a1 = new A1(0);
		A1 a2 = new A1(10);
		A1 a3 = new A1(12);
	}

}
