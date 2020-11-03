package practice9;

import java.util.Arrays; 

public class MinMax {
	static class Pair {
		public int a, b;
		
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public String toString() { return "min:" + a + " " + " max:" + b; }
	}
	
	public static Pair minmax(int values[]) {
		Arrays.sort(values);

		return new Pair(values[0], values[values.length - 1]);
	}
}
