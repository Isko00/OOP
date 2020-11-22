package lab3.Task1;

public class Steamer extends Ship {
	boolean ovenMelted = false;

	public Steamer(int speed) {
		super(speed);
	}

	public Steamer() {
		super();
	}

	@Override
	public void fullSpeedAhead() {
		ovenMelted = true;
	}

	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "OvenMelted [" + ovenMelted + "]";
	}
}
