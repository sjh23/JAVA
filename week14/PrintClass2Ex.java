package week14;

public class PrintClass2Ex {
	public static void main(String[] args) {
		//제네릭 타입 파라미터 => 구체적인 클래스 타입으로 지정
		//<> 안에는 무조건 클래스 타입이어야함
		PrintClass2<Integer> pc2 = new PrintClass2<Integer>();
		pc2.printValue(100);
		
		PrintClass2<String> pc3 = new PrintClass2<String>();
		pc3.printValue("홍길동");
		
		//제네릭을 사용할 떄 선언 부분은 타입을 선언하지 않아도 됨
		PrintClass2<Boolean> pc4 = new PrintClass2<>();
		pc4.printValue(true);
	}
}
