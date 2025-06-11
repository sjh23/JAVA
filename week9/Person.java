package week9;

public class Person {
	static final double FEET_CONSTANT = 30.48;
	
	//인스턴스 필스 => 모은 객체가 가지는 속성
	final String nation = "Korea";
	final String ssn;
	String name;
	double heigth;
	
	public Person(String ssn, String name, double heigth) {
		this.ssn = ssn;
		this.name = name;
		this.heigth = heigth;
	}
}
