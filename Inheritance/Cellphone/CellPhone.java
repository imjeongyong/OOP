package Cellphone;

public class CellPhone {
	String model;
	String color;

	void powerOn() {
		System.out.println("Power On");
	}

	void powerOff() {
		System.out.println("power Off");
	}

	void bell() {
		System.out.println("Bell ring");
	}

	void sendVoice(String message) {
		System.out.println("send Message : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("receive Message : " + message);
	}

	void hangUp() {
		System.out.println("Hang Up");
	}
}
