package kazybekProject;

public class Hexagon implements Comparable<Object>{

private double side;

/*Construct a Hexagon with the specified side*/

public Hexagon(double side) {

// Implement it

//(1)1pts
	
	this.side = side;

}

/*Implement the abstract method findArea in GeometricObject */

public double findArea() {

// Implement it

//(2)3pts

	return 1.5 * Math.sqrt(3) * side * side;

}

/*Implement the abstract method findPerimeter in GeometricObject */

public double findPerimeter() {

// Implement it

//(3)3pts

	return 6 * side;

}

/*Implement the compareTo method in the Comparable interface*/

public int compareTo(Object obj) throws ClassCastException {

// Implement it (compare two Hexagons based on their areas)

//(4)5pts

	Hexagon hex = (Hexagon) obj;
	return (int) Math.signum(findArea() - hex.findArea());

}
}