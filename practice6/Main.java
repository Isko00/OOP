package practice6;

import practice6.*;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Shape> v = new Vector<Shape>();

		v.add(new Circle(Color.RED, 2));
		v.add(new Triangle());
		v.add(new Rectangle());
		v.add(new Rectangle(Color.RED, 1, 4));

		for (Shape s : v) {
			if (s instanceof Circle) {
				Circle c = (Circle)(s);
				c.draw(2);
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle)(s);
				System.out.print(r.getWidth());
				r.draw();
			} else {
				s.draw();
			}
		}
	}
}