package week11;

public class Cat extends Animel {
	public Cat() {
		this.Kind = "포유류";	
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~!");
		
	}

	public void CatLife() {
		System.out.println("Cat 평균 수명은 약 12~15년입니다.");
	}
}
