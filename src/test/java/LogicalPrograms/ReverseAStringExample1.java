package LogicalPrograms;

public class ReverseAStringExample1 {

	public static void main(String[] args) {

		String s1 = "Selenium4321java";
		String s2 = "";
		int l = s1.length();
		System.out.println(s1);
		System.out.println("given stringf length is : "+l);

		for (int i = l - 1; i >= 0; i--) {
			s2 = s2+s1.charAt(i);
		}
		
		System.out.println(s2);
	}

}
