package week11;

public class Purin extends Pokemon{

	@Override
	void name() {
		System.out.println("이름: 푸린, 속성: 노멀");
	}

	@Override
	void attact() {
		System.out.println("공격 스킬: 노래하기");
	}

	@Override
	void passive() {
		System.out.println("패시브 스킬: 회피");
	}

}
