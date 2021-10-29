package javamethods;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnref = new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean valid;
		System.out.println("Get age value");
		age=scnref.nextInt();
		System.out.println("Get a salary ");
		salary=scnref.nextInt();
		System.out.println("Get name  value");
		name=scnref.next();
		System.out.println("Get valid value from console (true or false)1");
		valid=scnref.nextBoolean();
		
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		System.out.println("name: "+name);
		System.out.println("valid: "+valid);
		System.out.println("************************");
		
		
	}

}
