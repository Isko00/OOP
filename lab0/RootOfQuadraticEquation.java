import java.util.Scanner;

public class RootOfQuadraticEquation {
    static int descriminantOf(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    static int[] rootsOf(int a, int b, int c) {
        int[] answer = new int[2];
        int descriminant = descriminantOf(a, b, c);
        
        answer[0] = (0 - b - (int)Math.sqrt(descriminantOf(a, b, c))) / (2 * a);
        answer[1] = (0 - b + (int)Math.sqrt(descriminantOf(a, b, c))) / (2 * a);

        return answer;
    }

    static String rootsToString(int a, int b, int c) {
        String answer;

        if (descriminantOf(a, b, c) < 0) {
            answer = "Negative Descriminant Error!";
        } else if (descriminantOf(a, b, c) == 0) {
            answer = "[" + rootsOf(a, b, c)[0] + "]";
        } else {
            answer = "[" + rootsOf(a, b, c)[0] + "] & [" + rootsOf(a, b, c)[1] + "]";
        }

        return answer;
    }

    static void printRoots(int a, int b, int c) {
        System.out.println("Roots are: " + rootsToString(a, b, c));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        printRoots(a, b, c);
    }
}