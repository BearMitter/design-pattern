package site.notfound;

import org.junit.Test;

public class MyTest {
	@Test
	public void testA() throws Exception {
		System.out.println();
		Person p = new Person();
		p.id = "df";
		Person p2 = (Person) p.clone();
		System.out.println(p2.id);

	}

}

class Person implements Cloneable {
	Object o;
	String id;

	public Object clone() {
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return o;
	}

}