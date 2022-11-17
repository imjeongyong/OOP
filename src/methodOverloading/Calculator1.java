package methodOverloading;

public class Calculator1 {

	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}

	public static void main(String[] args) {
		Calculator1 cal = new Calculator1();

		double result1 = cal.areaRectangle(4.0);
		double result2 = cal.areaRectangle(4.0, 6.0);

		System.out.println(result1);
		System.out.println(result2);
	}
}
