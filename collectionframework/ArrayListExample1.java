package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(25);
		l.add(10);
		l.add(10.5f);
		l.add("Shareef");
		l.add('P');
		l.add("Shareef");

		System.out.println(l.isEmpty());
		System.out.println(l);
		System.out.println(l.size());
		l.remove(5);
		System.out.println(l.get(0));
		System.out.println(l);
		System.out.println(l.contains("Shareef"));
		System.out.println(l.size());

	}

}
