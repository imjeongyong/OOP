package staticc;

public class CalculatorExample {
	public static void main(String[] args) { // 스태틱 클래스를 사용하기때문에 인스턴스 생성없이 바로 사용 가능
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
