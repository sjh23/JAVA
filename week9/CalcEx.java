package week9;

public class CalcEx {
	public static void main(String[] args) {
		Calculator cl = new Calculator("white", "small");
		
	System.out.println(cl.color + ", " + cl.size);
	
	int result1 = cl.plus(10, 20);
	System.out.println("plus(10, 20) = " + result1);
	
	double result2 = cl.divide(10, 20);
	System.out.println("divide(10, 20) = " + result2);
	
	byte b1 = 10;
	byte b2 = 20;
	result2 = cl.divide(b1, b2);
	System.out.println("divide(10, 20) = " + result2);
	
	double result3 = cl.avg(10, 7);
	System.out.println("avg(10, 7) = " + result3);
	
	int sum1 = cl.sum1(new int[] {1,2,3,4,5});
	System.out.println("{1,2,3,4,5} = " + sum1);
	
	int sum2 = cl.sum2(1,2,3,4,5);
	System.out.println("{1,2,3,4,5} = " + sum2);
	}
}
