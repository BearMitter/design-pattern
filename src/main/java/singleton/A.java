package singleton;

//Early Instantiation
public class A {
	private static A a=new A();
	private A() {}
	
	public static A getA() {
		return a;
	}
	
	public void printSth() {
		System.out.println("That's Okay");
	}

}
