package javamethods;

public class Unarl_demo {
///// unary operator for this program
	public static void main(String[] args) {
		
		int a=0, b;
		System.out.println("*************");
		
	  a= 21;	
	  b = a-- + a + ++a + a++ + ++a + a++ +a;
     System.out.println(a);
     System.out.println(b);
     
     a= -2;
     b = a-- + a + ++a + a++ + ++a + a++ +a;
     System.out.println(a);    //1
     System.out.println(b);   //-8
	}

}
