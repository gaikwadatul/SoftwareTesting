package javamethods;

public class IFElse_Leap_Year {

	public static void main(String[] args) {
		int year=2008;
		
		if(((year %4 == 0) && (year % 100 !=0)) || (year % 400 ==0)) {
			System.out.println("Leap year");
		}else
		{
			System.out.println("Common year");
		}

	}

}
