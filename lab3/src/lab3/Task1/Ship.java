package lab3.Task1;

public abstract class Ship implements Launchable {
	int speed;

	public Ship(int speed) {
		this.speed = speed;
	}
	
	public Ship() {
		this(0);
	}
	
	public int getTimeOfTravel(int distance) {
		return distance / speed;
	}
	
	@Override
	public String toString() {
		return "Speed [" + speed + "]";
	}
}
