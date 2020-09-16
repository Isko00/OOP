import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int percent = in.nextInt();
		System.out.println(((percent < 0) || (percent > 100)) ? "Incorrect input!" 
			: (percent < 50) ? 'F'
			: (char)(71 - Math.floor(percent / 15)) + " " 
				+ (((char)(45 - Math.floor((percent % 15) / 5)) == ',') ? ' ' 
					: (char)(45 - Math.floor((percent % 15) / 5))));
	}
}