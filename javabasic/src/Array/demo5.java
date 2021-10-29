package Array;


class testarry{
	static void min(int arr[] ) {
		int min=  arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min=arr[i];
			}
			System.out.println("minimum no : "+min);
		}

	}
	static void max(int arr[] ) {
		int max=  arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
			System.out.println("maximun no: "+max);
		}

	}
	
}

public class demo5 {

	public static void main(String[] args) {
		
     int a[]= {33,13,4,50,15,1};
     testarry.min(a);
     testarry.max(a);
	}
}

