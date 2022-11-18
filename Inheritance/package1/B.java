package package1;

public class B { // A클래스 상속은 아니지만 같은 패키지에 있는 클래스여서 A클래스 접근 가능, 인스턴스 생성 가능, 
	public void method() {
		A a = new A();
		a.field = "Value"; // 멤버변수 직접 접근 가능
		a.method();
	}
}