package Method_Overloading;

public class Ifelse_condition {

	public static void main(String[] args) {
		int num1=10, num2=30;
		
/**		if(num1>num2) {
		System.out.println("number 1 is greater number 2");  //false
		}else
		{
			System.out.println("number 2 is greater number 1");
		}
**/		
		if(num1==num2) {
			System.out.println("number 1 is equal to number 2");  //false
			}else if(num1>num2){
			System.out.println("number  1 is greater than no.2");
			}else
			{
				System.out.println("number 1 is smaller than no.2");
			}

/*		if(num1==num2 && num1>num2) {
			System.out.println("number 1 is either to no 2 or greater than 2 ");  //false
			}else
			{
				System.out.println("number 1 is smaller than 2");
			}
*/
	}

}
