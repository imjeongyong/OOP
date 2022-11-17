package staticc;

public class Calculator { // static 변수 -> 프로그램 시작과 동시에 메모리 할당
	static double pi = 3.14159;

	static int plus(int x, int y) {
		return x * y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
