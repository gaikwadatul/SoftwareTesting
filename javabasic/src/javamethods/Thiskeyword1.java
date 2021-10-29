package javamethods;

public class Thiskeyword1 {
//global variable
	int rollno;  //0--> 111 ---> 112
	float fees;  //0.0 --> 5000 ---> 6000
	
	Thiskeyword1(int rollno,float fees){
	//global var = local var;
		this.rollno = rollno;
	 this.fees = fees;
	}
	
	void display() {
		System.out.println(rollno +""+fees);
	}
class ThisKeyword11{	
	public static void main(String[] args) {
		Thiskeyword1 t1 = new Thiskeyword1(111, 5000f);
	    t1.display(); 
	    Thiskeyword1 t2 = new Thiskeyword1(111, 5000f);
	    t2.display(); 
	}
}

}
