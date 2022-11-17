package ParentCall;

public class Child extends Parent {
	public int ChildNo;

	Child(String name, String ssn, int childNo) {
		super(name, ssn); // <- super 는 부모클래스 생성자를 호출하겠다
		this.ChildNo = childNo;
	}
}