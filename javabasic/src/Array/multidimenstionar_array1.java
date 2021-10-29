package Array;

public class multidimenstionar_array1 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
		
		char[]charArr= {'a','b','c','d'};
		for(char c1: charArr) {
			System.out.println(c1);
		}

	}

}
