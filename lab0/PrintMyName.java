import java.util.Scanner;

public class PrintMyName {
	static void print(String name) {
		String lines = "+" + ("-".repeat(name.length())) + "+";
		lines += "\n|" + name + "|\n" + lines;
		System.out.println(lines);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		print(name);
	}
}