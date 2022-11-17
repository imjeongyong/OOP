package methodOverloading;

public class Calculator { // 같은 이름의 메서드(plus) 지만 파라메터의 형태가 다름 -> 다른 메서드로 인정 -> 메서드 오버로딩
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double plus(double x, double y) {
		double result = x * y;
		return result;
	}

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		int res1 = myCalc.plus(5, 10);
		double res2 = myCalc.plus(10.5, 20.3);

		System.out.println(res1);
		System.out.println(res2);
	}
}
