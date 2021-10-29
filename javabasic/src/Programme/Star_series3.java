package Programme;

public class Star_series3 {

	public static void main(String[] args) {
		int rows=10;
		for (int i=1; i<=rows; i++) 
        { 
            // Print star in decreasing order 
            for (int k=rows; k>=i; k--)
            {
                System.out.print("*");
            }
            // Print space in increasing order
            for (int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }

	}

}
