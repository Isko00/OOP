package lab3.Task4;

public class Person {
	private String name;
	
	public Person(String name) { this.name = name; }
	
	public Person() { this(""); }

	public String getName() { return name; }
	
	public void setName(String newName) {
		name = newName;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name.equals(other.getName()))
			return true;
		return false;
	}

	@Override
	public String toString() { return "Name [" + name + "]"; }
}
