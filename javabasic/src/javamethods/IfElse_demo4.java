package javamethods;

public class IfElse_demo4 {

	public static void main(String[] args) {
		int sub=89;
		if(sub<=40)
		{
			System.out.println("please select course ART....");
			
		}else if(sub>40 && sub<60){
			
			System.out.println("please select your course Commerse...");
			
		}else if(sub>60 && sub<70){
			
			System.out.println("please select your course Science...");
			
		}else if(sub>70 && sub<90){
			
			System.out.println("please select your course diploma or engineering...");
			
		} 
		else {
			System.out.println("you are not qualifies...");
		}

	}

}
