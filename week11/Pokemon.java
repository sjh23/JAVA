package week11;

public abstract class Pokemon {
	public void introduce() {
		name();
		attact();
		passive();
	}
	abstract void name();
	abstract void attact();
	abstract void passive();
}
