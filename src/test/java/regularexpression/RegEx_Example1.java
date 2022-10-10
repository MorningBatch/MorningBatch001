package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Example1 {

	public static void main(String[] args) {

		int count = 0;

		String s1 = "hgghasadyy5we8ijhass87d9q2";

		String s2 = "Shareef$67shar98%#";

		String s3 = "your order has placed with order number 123456";

		Pattern p = Pattern.compile("order");
//		Pattern p = Pattern.compile("[0-9]+"); // to match only numbers
//		Pattern p = Pattern.compile("\\W"); // to match only special chars
//		Pattern p = Pattern.compile("[a-zA-Z]+"); // to match only chars

	 	Matcher m = p.matcher(s3);

		while (m.find()) {
			count = count + 1;
			System.out.println(m.group());

		}
		System.out.println(count);

	}

}
