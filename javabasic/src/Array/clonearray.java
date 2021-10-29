package Array;

import java.util.Arrays;

public class clonearray {

	public static void main(String[] args) {
		int arr[]= {10,65,42};
		System.out.println("printong original array");
      for(int i: arr) {
    	  System.out.println(i);
      }
     System.out.println("printong original array....");
     int carr[] = arr.clone();
     for(int i : carr) {
    	 System.out.println(i);
     }
     System.out.println("are both equal");
     System.out.println(Arrays.equals(arr, carr));
     System.out.println("*******************************");
     int copyArrs[]= Arrays.copyOfRange(carr, 0, 3);
     for(int i : copyArrs) {
    	 System.out.println(i);
     }
     
     System.out.println("***********************");
	Arrays.sort(arr);
	System.out.println("sort arrays is ");
	for(int i : arr) {
   	 System.out.println(i);
    }
	}

}
