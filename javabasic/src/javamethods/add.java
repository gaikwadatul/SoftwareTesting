package javamethods;

public class add {
	
	int age;	
	void display(){
	System.out.println("age is :"+age);
	}
	
	void dispaly(int a){
	age=a;
	System.out.println("I am display in my age method :"+age);
	}
	
	
	public static void main(String[] args) {
		add a2= new add();
	    System.out.println("age is:"+a2.age);
        a2.display();
        a2.dispaly(25);
	}
}
