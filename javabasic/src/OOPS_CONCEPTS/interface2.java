package OOPS_CONCEPTS;

interface printable{
	int age = 30;
	void print();
}
interface showable{
 void print();
}


class interface2 implements printable,showable  {
public void print() {
	System.out.println("hello");
}
	public static void main(String[] args) {
		interface2 obj = new interface2();
		obj.print();
		showable obj1 = new interface2();
		obj1.print();
		printable obj2 = new interface2();
		obj2.print();
	}

}
