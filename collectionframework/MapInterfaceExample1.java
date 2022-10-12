package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample1 {

	public static void main(String[] args) {

		Map m1 = new HashMap();

		m1.put("080011209", "Shareef");
		m1.put("11UPIA0230", "Vanaja");
		m1.put("15S05A0415", "Prem");
		m1.put("15S05A0415", "Prem2");

		System.out.println(m1);
		System.out.println(m1.size());
//		m1.remove("15S05A0415", "Prem2");

		System.out.println(m1);
		System.out.println(m1.size());

		Map m2 = new HashMap();
		m2.put("080011209", "Shareef");
		m2.put("11UPIA0230", "Vanaja");
		m2.put("15S05A0415", "Prem");
		m2.put("15S05A0415", "Prem2");

		System.out.println(m1.equals(m2));

	}

}
