package OOPS_CONCEPTS;

class demo{
	private int empID= 1000;
	private double salary =55000;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		demo d1 = new demo();
		System.out.println(d1.getEmpID());
		System.out.println(d1.getSalary());

	}

}
