package OOPS_CONCEPTS;

class hillstation{
	void location() {
		System.out.println("Location is:");
	}
	void famousfor() {
		System.out.println("famousfor for :");
	}
}
class manali extends hillstation {
	 void location() {
		System.out.println("Manali is himalchal pradesh ");
	}
	 void famousfor() {
			System.out.println("It is famous for temple");
		}
}

class mussoorie extends hillstation {
	 void location() {
			System.out.println("Manali is uttarkhand ");
		}
		 void famousfor() {
				System.out.println("It is famous for education ninstitute");
			}
}

class gulmarg extends hillstation{
	void location() {
		System.out.println("gulmarg is in j&amp:k ");
	}
	 void famousfor() {
			System.out.println("It is famous for skitting");
		}
}
public class polymorphism {

	public static void main(String[] args) {
		hillstation a = new hillstation();
		a.location();
		a.famousfor();
		hillstation m = new manali();
		m.location();
		m.famousfor();
		hillstation mu = new mussoorie();
		mu.location();
		mu.famousfor();
		hillstation g = new gulmarg();
		g.location();
		g.famousfor();
		
	}

}
