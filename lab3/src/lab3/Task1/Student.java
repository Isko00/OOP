package lab3.Task1;

public class Student implements Launchable {
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
	
	@Override
	public String toString() {
		return "Name [" + name + "]\n"
				+ "EnteredClass [" + enteredClass + "]";
	}
}
