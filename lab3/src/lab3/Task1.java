package lab3;

import java.util.Vector;

interface Launchable {
	void fullSpeedAhead();
}

class Student implements Launchable {
	boolean enteredClass = false;
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student() {
		this("");
	}
	
	public void fullSpeedAhead() {
		enteredClass = true;
	}
}

abstract class Ship implements Launchable {
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
}

class Sailboat extends Ship {
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
}

class Steamer extends Ship {
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
}

public class Task1 {
	public static void main(String[] args) {
		Vector<Launchable> v = new Vector<Launchable>();
		
		v.add(new Student("Islam"));
		v.add(new Sailboat(2));
		v.add(new Steamer(5));
		
		for (Launchable l : v) {
			l.fullSpeedAhead();
			
			if (l instanceof Ship) {
				Ship s = (Ship) l;
				s.getTimeOfTravel(10);
			}
		}
	}
}