package package2;

import package1.A;

public class D extends A { // A클래스는 protect지만 상속되어서 접근 가능
	public D() {
		super(); // <- 부모 클래스 생성자 호출
		this.field = "Value";
		this.method();
	}
}