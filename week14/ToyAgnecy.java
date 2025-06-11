package week14;

public class ToyAgnecy implements Rentable<Toy>{

	@Override
	public Toy rent() {
		return new Toy();
	}
	
}
