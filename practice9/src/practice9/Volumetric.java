package practice9;

public class Volumetric extends Polygon {
	private int height;
	
	public Volumetric(int anglesAmount, String name, int height) {
		super(anglesAmount, name);
		this.height = height;
	}

	public Volumetric(int anglesAmount, String name) {
		this(anglesAmount, name, 0);
	}
	
	public Volumetric() {
		super();
		height = 0;
	}
	
	public int getHeight() { return height; }

	@Override
    public int compareTo(Polygon p) {
		if (super.compareTo(p) == 0 && p instanceof Volumetric) {
			Volumetric v = (Volumetric) p;
			return height - v.getHeight();
		}
		return super.compareTo(p);
    }	
}
