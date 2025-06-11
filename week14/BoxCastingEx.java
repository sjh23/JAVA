package week14;

public class BoxCastingEx {
	public static void main(String[] args) {
		BoxCasting box = new BoxCasting();
		
		box.setObj("Hello");
		String sval = (String)box.getObj();
		
		box.setObj(100);
		int ival = (int)box.getObj();
	}
}
