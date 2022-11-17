package finall;

public class EarthExample { // final <- 상수, 고정되있는 값, 보통 대문자 표기
	public static void main(String[] args) {
		System.out.println("지구의 반지름 :" + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 :" + Earth.EARTH_SURFACE_AREA + "km^2");
	}
}
