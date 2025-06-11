package week14;

public class PrintClass2<T> {
	// 제네릭 타입 이용 => 결정되지 않은 타입을 파라미터로 지정
	public void printValue(T value) {
		System.out.println("value = " + value);
	}
}
