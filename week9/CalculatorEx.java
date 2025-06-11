package week9;

public class CalculatorEx {
	public static void main(String[] args) {
		//정적(static) 필드는 객체를 생성하지 않아도 접근이 가능하다.
		int radius = 8;
		double circleArea = Calculator.pi * radius * radius;
		System.out.printf("반지름이 %d인 원의 면적 = %.2f\n", radius, circleArea);
		
		
		int x = 8;
		int y = 7;
		//정적(static) 메소드도 객체를 생성하지 않아도 접근이 가능하다
		System.out.printf("(%d,%d)의 합 = %d\n", x, y, Calculator.plus(x, y));
		System.out.printf("(%d,%d)의 차 = %d\n", x, y, Calculator.minus(x, y));
	}
}
