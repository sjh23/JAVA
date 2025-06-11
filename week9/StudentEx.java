package week9;

public class StudentEx {
	public static void main(String[] args) {
		Student st = new Student("홍길동", 87, 87, 88);
		
		int total = st.getTotal(); 
		double Ave = st.getAve();
		System.out.printf("%s : 총점 %d점, 평균 %.1f점", st.name, total, Ave);
	}
}
