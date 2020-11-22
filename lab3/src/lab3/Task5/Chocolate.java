package lab3.Task5;

public class Chocolate implements Comparable<Object> {												
	private int weight;
	private final String name;
	
	public Chocolate(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}

	public Chocolate() {
		this(0, "");
	}

	public int getWeight() { return weight; }
	
	public String getName() { return name; }
	
	public void setWeight(int weight) { this.weight = weight; }
	
	@Override
	public String toString() {
		return "Weight [" + weight + "]"
				+ ", Name [" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Chocolate c = (Chocolate) o;
		return (int) Math.signum(weight - c.getWeight());
	}
}
