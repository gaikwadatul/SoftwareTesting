package javamethods;

public class IfElse_Demo2 {

	public static void main(String[] args) {
		int marks = 55;
		if(marks<50) {
			System.out.println("Fail");
		}else if(marks>=50 && marks<=60) {
			System.out.println("C grade");
			
		}
		else if(marks>=60 && marks<=70) {
			System.out.println("B grade");
			
		}
		else if(marks>=70 && marks<=80) {
			System.out.println("A grade");
			
		}else if(marks>35) {
			System.out.println("Fail");
			
		}
		
		else {
			System.out.println("Invalid");
		}

	}

}
