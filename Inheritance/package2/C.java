package package2;

import package1.A;

public class C { // 클래스 A의 접근제한자가 protected, 다른패키지는 접근 제한 -> 에러
	A a = new A; // 생성자 protected, 인스턴스 생성 불가 -> public 으로 변경하면 에러 해결
	a.field = "Value";
	a.method();
}
