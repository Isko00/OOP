import java.util.Scanner;

public class PrintMyName {
	static int area(int a) {
		return a * a;
	}

	static int perimeter(int a) {
		return a * 4;
	}

	static int lengthOfDiagonal(int a) {
		return Math.sqrt(area(a) * 2);
	}

	static void printResults() {
		System.out.println("Area = " + area(a));
		System.out.println("Perimeter = " + perimeter(a));
		System.out.println("Length of diagonal = " + lengthOfDiagonal(a));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		printResults();
	}
}