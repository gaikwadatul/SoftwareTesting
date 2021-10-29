package javamethods;

public class ThisKeyword {

	int salary;
	int empId;
	void display(int salary) {
		System.out.println("Salary:"+salary);
		@SuppressWarnings("unused")
		ThisKeyword t1 = new ThisKeyword();
		System.out.println("Salary:"+salary);
		
	}
	public static void main(String[] args) {
		int salary = 2000;
		int empId=250;
		System.out.println("Salary:"+salary);
		System.out.println("Salary:"+empId);
		ThisKeyword t1 = new ThisKeyword();
        System.out.println("Global EmpId:"+t1.empId);
	    t1.display(2000);
	}
	 
}
