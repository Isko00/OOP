package lab3.Task1;

public class Sailboat extends Ship {
	boolean sailsRaised = false;

	public Sailboat(int speed) {
		super(speed);
	}

	public Sailboat() {
		super();
	}

	@Override
	public void fullSpeedAhead() {
		sailsRaised = true;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "SailsRaised [" + sailsRaised + "]";
	}
}
