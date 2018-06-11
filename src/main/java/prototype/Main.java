package prototype;

public class Main {
	public static void main(String[] args) {
		Shape s=new Shape();
		s.setType("Rectangle");
		System.out.println(s.getType());
		Shape s2=(Shape) s.clone();
		System.out.println(s2.getType());
	}

}
