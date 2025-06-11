package week9;

public class AreaEx {
	public static void main(String[] args) {
		//areaObj <- 인스턴스
		//인스턴스 멤버는 반드시 객체가 필요함
		Area areaObj = new Area();
		
		//원
		double result1 = areaObj.areaCal(10.5);
		System.out.println("원의 넓이 = " + result1);
		
		//정사각형
		double result2 = areaObj.areaCal(12);
		System.out.println("정사각형의 넓이 = " + result2);
		
		//직사각형
		double result3 = areaObj.areaCal(6,7);
		System.out.println("직사각형의 넓이 = " + result3);
	}
}
