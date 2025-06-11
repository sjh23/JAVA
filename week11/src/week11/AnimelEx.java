package week11;

public class AnimelEx {
	public static void main(String[] args) {
		//추상클래스는 객체 생성이 불가능
		//대신, 상속은 가능
		//Animel animel = new Animel();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("------");
		
		Animel animel = dog;	//자동타입 변환
		animel.sound();
		animel = cat;
		animel.sound();
		
		System.out.println("-- 매개변수의 다형성 --");
		animelSound(new Dog());
		animelSound(new Cat());
	}
	
	//부모는 못말들지만 변수 설정은 가능
	private static void animelSound(Animel animel) {
		animel.sound();
		animel.breathe();
		//animel.DogLife();
		
		//자식 클래스에만 정의된 필드나 메소드는
		//강제타입 변환을 해야 접근이 가능
		if (animel instanceof Dog) {
			System.out.println("Dog 객제로 변환 가능");
			Dog dog = (Dog)animel;
			dog.dogLife();
		}else if (animel instanceof Cat){
			System.out.println("Cat 객체로 변환 가능");
			Cat cat = (Cat)animel;
			cat.CatLife();
		}
	}
}
