package collectionframework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		
		l.add(10);
		l.add(10.5f);
		l.add("Shareef");
		l.add('P');
		l.add('P');
		
		System.out.println(l);
		System.out.println(l.size());
		l.remove(4);
		l.add("Shareef");
		System.out.println(l.get(0));
		System.out.println(l);
		System.out.println(l.size());
		
		
	}
	
	
	
}
