package OOPS_CONCEPTS;
//parent class
class fourwheeler {
	//default cons.
	public void wheels() {
		System.out.println("Hi I have 4 wheels");
	}
}

class car extends fourwheeler{
	public void type() {
		System.out.println("I m a Car");
	}
}
class maruti extends car{
	public void company() {
		System.out.println("I m a maruti");
	}
}

public class inheritance2 {

	public static void main(String[] args) {
	maruti f1 = new maruti();
    f1.wheels();
    f1.type();
    f1.company();
	}

}
