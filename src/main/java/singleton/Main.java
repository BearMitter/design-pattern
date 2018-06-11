package singleton;

public class Main {

	public static void main(String[] args) {

		A a = A.getA();
		a.printSth();
		
		System.out.println(a);

		A b = A.getA();
		System.out.println(b);
		
		System.out.println(a==b);
	}

}
