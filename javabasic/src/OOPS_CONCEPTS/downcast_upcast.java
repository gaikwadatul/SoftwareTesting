package OOPS_CONCEPTS;

class jd{
	public void printme1 () {
		System.out.println("journal dev print metohd");
	}
	void display() {
		System.out.println("journal dev disp metohd");

	}
}
//inheritance class
class java extends jd{
	public void printme2 () {
		System.out.println(" java print metohd");
	}
	void disp() {
		System.out.println(" java print metohd");

	}
	}
//inheritance class
class android extends java{
	public void printme3 () {
		System.out.println(" Android print metohd");
	}
	void disp() {
		System.out.println(" Android print metohd");

	}
}

public class downcast_upcast {

	public static void main(String[] args) {
		jd j1 = new android(); //implicit upcasting
		j1.printme1();
		j1.display();
		System.out.println("********************8***********");
        @SuppressWarnings("unused")
		java j2=(java)j1;  // downcast
        j1.printme1();
		j1.display();
		System.out.println("********************************");
        android a1=(android)j1;  //downcast
        a1.printme1();
        a1.printme2();
        a1.printme3();
		a1.disp();
	}

}
