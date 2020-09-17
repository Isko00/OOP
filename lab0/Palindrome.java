import java.util.Scanner;

public class Palindrome {
	static boolean isPalindrome(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (!(a.charAt(i) == a.charAt(a.length() - 1 - i))) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();

		if (isPalindrome(a)) {
			System.out.println("YES, it is.");
		} else {
			System.out.println("NO, sorry.");
		}
	}
}