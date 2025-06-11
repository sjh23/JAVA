package week9;

import java.util.Scanner;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		Scanner sc = new Scanner(System.in);
		int gasVal;
		
		mycar.setGas(5);
		
		//if (mycar.isLeftgas())
		//	System.out.println("출발합니다");
		
		//mycar.run();
		
		while(mycar.isLeftgas()) {
			System.out.println("출발합니다.");
			mycar.run();
			
			System.out.print("gas를 주입하세요 >> ");
			gasVal = sc.nextInt();
			
			if (gasVal == 0) {
				break;
			}
			mycar.setGas(gasVal);
		}
		
		System.out.println("프로그램 종료"); 
		sc.close();
	}
}
