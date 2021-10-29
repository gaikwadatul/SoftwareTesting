package Array;

public class demo3 {

	public static void main(String[] args) {
		int [] age= {12,4,54,74,36,20};
		
  System.out.println("array eleemnt count ");
  System.out.println("first element: "+age[0]);
  System.out.println("first element: "+age[1]);
  System.out.println("first element: "+age[2]);
  System.out.println("first element: "+age[3]);
  System.out.println("first element: "+age[4]);
  System.out.println("first element: "+age[5]);
  
  for(int i=0; i<age.length; i++) {
	  System.out.println(age[i]);
  		}
  System.out.println("*****using for each****");
for(int a: age) {
	System.out.println(a);
}
	}


	}
