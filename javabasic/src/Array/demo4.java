package Array;

public class demo4 {

	public static void main(String[] args) {
		int [] numbers= {12,4,54,74,-25,36,20};
		int sum=0;
		double average;
		for(int number : numbers) {
			sum=sum+number;
			
		}
		//get the total of element
		int arrayLength = numbers.length;
		average = sum/arrayLength;
		System.out.println("sum = "+sum);
		System.out.println("average = "+average);

	}

}
