package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add("Shareef");
		s.add(10);
		s.add(10.5f);
		s.add(10); 
		s.add('p');
		System.out.println(s);
		System.out.println(s.size());
		s.remove(0);
		System.out.println(s.size());
		System.out.println(s);

	}

}
