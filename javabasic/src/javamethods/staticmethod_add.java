package javamethods;

public class staticmethod_add {
	float a=10.56f;
	int add(int num1, int num2) {
		return (num1+num2);
	}

	public static void main(String[] args) {
		staticmethod_add m1 = new staticmethod_add();
		System.out.println(m1.a);
        int sum = m1.add(12, 12) ;
        System.out.println("sum is :"+sum);
      
	}

}
