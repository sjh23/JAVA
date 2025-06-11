package week9;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftgas() {
		if (gas == 0) {
			return false;
		}
		return true;
	}
	
	void run() {
		while(gas > 0) {
			System.out.println("달립니다. (gas잔량:"+gas+") ");
			gas -= 1;
		}
		System.out.println("멈춤니다. (gas잔량:"+gas+")");
	}
		
}
