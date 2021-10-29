package Loop;

public class SwitchCase_demo2 {

	public static void main(String[] args) {
		int res = 2, num1 = 5, num2=10;
		 switch (res) {
		 case '-' : {
			 res = num1 - num2 ;
			 System.out.println("num1- num2:" +res);
		     break;	 
		 }
		 case '+' : {
			 res = num1 + num2 ;
			 System.out.println("num1+ num2:" +res);
		     break;		 
		 }
		 default : {
			 System.out.println("Sorry plz enter correct detail...");
		 break;	 
		 }
	 }
  }
}
