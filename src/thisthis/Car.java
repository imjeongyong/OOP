package thisthis;

public class Car {
	String model; // <- 멤버변수 model
	int speed;

	Car(String model) { // <- 지역변수 model
		this.model = model; // <- 위에있는 멤버변수와 지역변수를 구분하기 위해서 this 사용, 변수명을 다르게 사용하면 this문 안써도됨!
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}

	public static void main(String[] args) {
		Car car1 = new Car("Hyundai"); // Car 클래스 2개 생성 -> heap 영역에 2개의 Car인스턴스 생성
		Car car2 = new Car("BMW");

		car1.run();
		car2.run();
	}
}
