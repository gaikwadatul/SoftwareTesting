package Method_Overloading;

public class Memory {
	static int salary;
	int empId;
	
	void display() {
		System.out.println("i am dispaly...");
	}

	static void print() {
		System.out.println("i am print....");
	}

	public static void main(String[] args) {
		// access static member ---> static variable and method
		System.out.println("static variable salry "+Memory.salary); //0
        Memory.print();
     // access non static member ---> non static variable and method
		Memory m1 = new Memory();
		System.out.println("Non static veraible empId:" +m1.empId);
		m1.display();
	//update static member
		Memory.salary=25000;
		System.out.println("update salary is :" +salary);
	
	//update non static member
		m1.empId=205;
		System.out.println("non static member"+m1.empId);
	Memory m2= new Memory();
	System.out.println("non staticvariable is :"+m2.empId); //0
	m2.display();
		
	}

}
