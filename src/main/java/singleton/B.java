package singleton;

//Lazy Instantiation
public class B {
	private static B b;

	private B() {
	}

	public static B getA() {
		if (b == null) {
			synchronized (B.class) {
				b = new B();
			}
		}
		return b;
	}

	public void printSth() {
		System.out.println("That's Okay");
	}

}
