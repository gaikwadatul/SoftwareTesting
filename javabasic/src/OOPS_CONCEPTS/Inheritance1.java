package OOPS_CONCEPTS;

//parent class of fruit
class fruit{
	fruit(){
	System.out.println("fruits class const..");
	}
	public void taste() {
		System.out.println("fruit are sweet");
	}
}
//child class of fruit
class apple extends fruit{
	apple(){
		System.out.println("apple class const..");
		}	
	public void shape() {
		System.out.println("Apple is round");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		apple fr = new apple();  //object of child class
		fr.taste();  // class method of parent class
		fr.shape();   // class method of child class
		

	}

}
