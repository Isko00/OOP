package practice9;

import java.lang.Comparable;

public class Polygon implements Comparable<Polygon> {
	private int anglesAmount;
	private String name;
	
	public Polygon(int anglesAmount, String name) {
		this.anglesAmount = anglesAmount;
		this.name = name;
	}
	
	public Polygon() {
		this(0, "");
	}
	
	public int getAnglesAmount() { return anglesAmount; }
	public String getName() { return name; }
	
	@Override
    public int compareTo(Polygon p) {
		 return anglesAmount - p.getAnglesAmount();
    }
}