package problemOne;

public class Data {
	private double sum, max;
	private int length;

	public Data() {
		this.sum = 0.0;
		this.max = 0.0;
		this.length = 0;
	}

	public void add(int number) {
		sum += (double)number;

		if (max < (double)number) { max = (double)number; }

		length++;
	}

	public double getAverage() { return sum / length; }

	public double getLargest() { return max; }
}