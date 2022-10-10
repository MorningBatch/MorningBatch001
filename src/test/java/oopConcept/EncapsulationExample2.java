package oopConcept;

public class EncapsulationExample2 {

	private String email;
	private long pno;
	private String gender;

	public String getEmail() {
		this.email = "test@gmail.com";
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println(email);
	}

	public long getPno() {
		this.pno = 9111422291l;
		return pno;
	}

	public void setPno(long pno) {
		this.pno = pno;
		System.out.println(pno);
	}

	public String getGender() {
		this.gender = "male";
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		System.out.println(gender);
	}

}
