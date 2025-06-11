package week11;

public class Pikachu extends Pokemon {

	@Override
	void name() {
		System.out.println("이름: 피카츄, 속성: 전기");
	}

	@Override
	void attact() {
		System.out.println("공격 스킬: 백만 볼트");
	}

	@Override
	void passive() {
		System.out.println("패시브 스킬: 스피드");
	}
	
}
