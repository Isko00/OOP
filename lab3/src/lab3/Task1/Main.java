package lab3.Task1;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Launchable> v = new Vector<Launchable>();

		v.add(new Student("Islam"));
		v.add(new Sailboat(2));
		v.add(new Steamer(5));

		for (Launchable l : v) {
			l.fullSpeedAhead();

			if (l instanceof Ship) {
				Ship s = (Ship) l;
				System.out.println(s.getTimeOfTravel(10));
			}
		}
	}
}
