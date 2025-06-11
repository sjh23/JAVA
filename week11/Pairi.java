package week11;

public class Pairi extends Pokemon {

	@Override
	void name() {
		System.out.println("이름: 파이리, 속성: 불");
	}

	@Override
	void attact() {
		System.out.println("공격 스킬: 불꽃");
	}

	@Override
	void passive() {
		System.out.println("패시브 스킬: 방어");
	}

}
