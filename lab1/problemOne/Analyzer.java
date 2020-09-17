package problemOne;

import problemOne.Data;
import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Data myData = new Data();
		Scanner in = new Scanner(System.in);
		int number;

		while (true) {
			try {
				System.out.print("Enter number (Q to quit): ");
				number = in.nextInt();
			} catch (Exception e) {
				break;
			}

			myData.add(number);
		}

		System.out.println("Average = " + myData.getAverage());
		System.out.println("Maximum = " + myData.getLargest());
	}
}