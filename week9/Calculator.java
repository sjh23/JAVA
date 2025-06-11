package week9;

public class Calculator {
	String color;
	String size;
	
	public Calculator(String color, String size) {
		this.color = color;
		this.size = size;
	}
	//전원켜기
	//리턴값이 없는 경우
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	//전원끄기
	//리턴타입이 없는 셩우
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//int plus(int x, int y) {
	//	int result = x+y;
	//	return result;
		//식이 간단한 경우에는 return 에 연산식을 처리해도 상관없음
		//return x+y;
	//}
	
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	int sum1(int[] values) {
		//누적변수 초기화
		int sum = 0;
		//향상된 for 문
		//for(int i : values)
		//	sum += i;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		return sum;
		}
	int sum2(int... values) {
		//누적변수 초기화
		int sum = 0;
		//for(int i : values)
		//	sum += i;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		return sum;
	}
	
	static double pi = 3.14;
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
